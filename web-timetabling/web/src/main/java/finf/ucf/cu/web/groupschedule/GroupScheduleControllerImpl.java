// license-header java merge-point
package finf.ucf.cu.web.groupschedule;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.apache.struts.action.ActionMapping;

import finf.ucf.cu.domain.crud.GroupValueObject;
import finf.ucf.cu.web.groupschedule.GroupScheduleController;

import finf.ucf.cu.ManageableServiceLocator;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRPdfExporter;

/**
 * @see timetabling.ucf.cu.web.groupschedule.GroupScheduleController
 */
public class GroupScheduleControllerImpl extends GroupScheduleController {

    private ArrayList<Integer> as ;

//*************************************************************************************************************
    //devuelve true si se encontro si en contro un archivo n en un arreglo m
    public boolean verificar(ArrayList<Integer> m, int n) {
        boolean enc = false;
        int i = 0;
        while (!enc && i < m.size()) {
            if (m.get(i) == n) {
                enc = true;
            }
            i++;
        }
        return enc;
    }
    // ordena una lista

    public void ordenar() {
        int mayor = 0;
        for (int i = 0; i < as.size(); i++) {
            for (int j = i + 1; j < as.size(); j++) {
                if (as.get(i) < as.get(j)) {
                    mayor = as.get(j);

                    as.set(j, as.get(i));
                    as.set(i, mayor);
                }
            }
        }
    }
    //Elimina los elementos repetidos de una lista que se le pasa por parametro

    private ArrayList EliminaRepetidos(ArrayList<String> abb) {

        for (int i = 0; i < abb.size()-1 ; i++) {
            for (int j = i + 1; j < abb.size(); j++) {
                if (abb.get(i).equals(abb.get(j))) {
                    if (!verificar(as, j)) {
                        as.add(j);
                    }
                }
            }
        }
        ordenar();
        for (int i = 0; i < as.size(); i++) {
            int s = as.get(i);
            abb.remove(s);
        }
        return abb;
    }
//******************************************************************************************************************

    /**
     * @see timetabling.ucf.cu.web.groupschedule.GroupScheduleController#loadSchedule(org.apache.struts.action.ActionMapping, timetabling.ucf.cu.web.groupschedule.LoadScheduleForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    public final void loadSchedule(ActionMapping mapping, finf.ucf.cu.web.groupschedule.LoadScheduleForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        //esta debe ser la causa del error
        ManageableServiceLocator locator = finf.ucf.cu.ManageableServiceLocator.instance();
        List groupLabels = locator.getGroupManageableService().readAll();
        //Collections.sort
        
        
        form.setMygroupBackingList(groupLabels, "id", "name"); 
        
        if (form.getDay() == null){
        	form.setDayAsDate( new Date());
        }
        
        List clases = new ArrayList();
        request.getSession().setAttribute("schedule", clases);
        
        
                
        if (form.getMygroup() != null) {
            if (form.getExport() != null) {
        	
            	
                finf.ucf.cu.ServiceLocator locator1 = finf.ucf.cu.ServiceLocator.instance();
                finf.ucf.cu.vo.ScheduleGroupVO scheduleGroupVO = new finf.ucf.cu.vo.ScheduleGroupVO();
                //listado auxiliar
                as = new ArrayList<Integer>();
                //listado de las fehas
                ArrayList<String> f = new ArrayList<String>();
                ArrayList<String> asignatura = new ArrayList<String>();
                ArrayList<String> profesores = new ArrayList<String>();
                ArrayList<String> simb = new ArrayList<String>();
                
                
                //horario de un grupo en esta fecha
                Date fecha = ((GroupValueObject)locator.getGroupManageableService().readById(Long.valueOf(form.getMygroup().toString()) )).getDateBegin2Semester();
                Date finicSemestre = new Date();
                finicSemestre.setMonth(((GroupValueObject)locator.getGroupManageableService().readById( Long.valueOf(form.getMygroup().toString()) )).getDateBegin1Semester().getMonth());
                finicSemestre.setDate(((GroupValueObject)locator.getGroupManageableService().readById( Long.valueOf(form.getMygroup().toString()) )).getDateBegin1Semester().getDate());
                
                Map parametro = new HashMap();
                Map semana = new HashMap();
                Map datasemana = new HashMap();
                // la tabla de referencia *otros* hace agrupa los parametros sueltos del reporte 
                Map otros = new HashMap();
                //la tabla de referencia *uno_nueve* agrupa los parametros de la leyenda del reporte q son del 1 al 9 cada uno
                Map uno_nueve = new HashMap();

                int contaux = 1;
                //este for es para las 21 semanas de un horario
                for (int i = 1; i < 21; i++) {

                    datasemana.put("datsemana_" + i, " ");
                    //este for es para los 7 dias de una semana
                    for (int j = 1; j < 7; j++) {

                        contaux = 1;
                        //este while 
                        while (contaux < 7) {
                            semana.put("semana" + i + j + contaux, " ");
                            contaux++;

                        }
                    }
                }


                for (int i = 1; i < 10; i++) {
                    uno_nueve.put("simb" + i, " ");
                    uno_nueve.put("asig" + i, " ");
                    uno_nueve.put("prof" + i, " ");
                    uno_nueve.put("simbact" + i, " ");
                    uno_nueve.put("act" + i, " ");
                    uno_nueve.put("simbeval" + i, " ");
                    uno_nueve.put("eval" + i, " ");
                }

                otros.put("conferencia1", " ");
                otros.put("Jefe de colectivo de a�o", " ");
                otros.put("Facultad", " ");
                otros.put("A�o", " ");
                otros.put("Curso", " ");
                otros.put("Semestre", " ");
                otros.put("Especialidad", " ");

//**********Hasta aqui llega el llenado en blanco de los parametros del reporte ****************************************************************************************************

//**********Aqui empieza el codigo pa llenar todos los parametros con datos de la BD************************************************************************************************

                for (int i = 1; i < 21; i++) {
                    //seguarda la consulta que devuelve el el obj locator con la semana del grupo en una fecha dada y se  parsea a una lista para poder trabajar con esta
                    ArrayList aux = (ArrayList) (locator1.getGroupScheduleService().getGroupSchedule(Long.valueOf(form.getMygroup().toString()), finicSemestre));
                    
                    String sem =  String.valueOf(finicSemestre).substring(0, 10) ;
                           sem += "  al  "; 
                           finicSemestre.setDate(finicSemestre.getDate() + 5);
                           sem +=  String.valueOf( finicSemestre ).substring(0, 10);
                    datasemana.put("datsemana_" + i, sem );
                    finicSemestre.setDate(finicSemestre.getDate() + 2);
                    
                    
                    if (!aux.isEmpty()) {                        

                        //j es la representacion del dia
                        for (int j = 0; j < aux.size(); j++) {

                            scheduleGroupVO = (finf.ucf.cu.vo.ScheduleGroupVO) aux.get(j);
                            //Este es el arreglo q tiene todas las fechas de las semanas ejemplo 2012-01-01 al 2012-01-06
                            f.add(scheduleGroupVO.getDay().toString());
                            simb.add(scheduleGroupVO.getActivityAbbreviation());
                            asignatura.add(scheduleGroupVO.getActivityName());
                            profesores.add(scheduleGroupVO.getTeacherName());
                            semana.put("semana" + i + ((scheduleGroupVO.getDay().getDay())) + scheduleGroupVO.getTime().intValue(), scheduleGroupVO.getActivityAbbreviation());

                        }

                       
                        

                    }
                }

                otros.put("Grupo", scheduleGroupVO.getGroupName());
                otros.put("Curso", "");
                otros.put("Semestre", "");
                otros.put("Facultad", "");
                otros.put("Especialidad", "");
                otros.put("A�o", "");
                
                //EliminaRepetidos es un metodo q pasandole una lista elimina los elementos repetidos en ella//////////////////////////pq hay que eliminar los repetidos
                simb = EliminaRepetidos(simb);
                asignatura = EliminaRepetidos(asignatura);
                profesores = EliminaRepetidos(profesores);

                for (int i = 0; i < profesores.size(); i++) {
                    uno_nueve.put("simb" + (i + 1), simb.get(i));
                    uno_nueve.put("asig" + (i + 1), asignatura.get(i));
                    uno_nueve.put("prof" + (i + 1), profesores.get(i));/////////////////////////////////////////////////////////arreglar que se va de rango de los profes

                }
                //Parametro es
                parametro.putAll(semana);
                parametro.putAll(datasemana);
                parametro.putAll(otros);
                parametro.putAll(uno_nueve);


                response.setHeader("Content-disposition", "attachment; filename=Horario_del_Grupo_"+ scheduleGroupVO.getGroupName() +".pdf");
                response.setContentType("application/pdf");
                String uri = request.getRealPath(  request.getContextPath());                
                String path = uri.substring( 0 , uri.length()-19   )  +"layout/Reporte/Prueba.jasper";
                                
                
                JasperPrint jasperPrint = JasperFillManager.fillReport(path, parametro);

                

                OutputStream ouputStream = response.getOutputStream();

                JRExporter exporter = null;
                exporter = new JRPdfExporter();
                exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
                exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, ouputStream);


                //JasperExportManager.exportReportToPdfFile(jasperPrint, "Horario Docente del Grupo.pdf");

                try {
                    exporter.exportReport();

                } catch (JRException e) {
                } finally {
                    if (ouputStream != null) {
                        try {
                            ouputStream.close();
                        } catch (IOException ex) {
                        }
                    }
                }
            } else {
                clases = getUno().getGroupSchedule(Long.valueOf(form.getMygroup().toString()), form.getDayAsDate());
                request.getSession().setAttribute("schedule", clases);               
            }
        }
    }
}