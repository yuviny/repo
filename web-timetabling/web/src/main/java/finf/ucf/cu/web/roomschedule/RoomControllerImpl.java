// license-header java merge-point
package finf.ucf.cu.web.roomschedule;

import org.apache.struts.action.ActionMapping;

import finf.ucf.cu.web.roomschedule.RoomController;

import finf.ucf.cu.ManageableServiceLocator;

import java.io.IOException;
import java.io.OutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.*;

import javax.servlet.ServletException;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.FileBufferedOutputStream;
import org.omg.CORBA.Any;
import org.omg.CORBA.Object;
import org.omg.CORBA.TypeCode;
import org.omg.CORBA.portable.InputStream;

/**
 * @see timetabling.ucf.cu.web.roomschedule.RoomController
 */
public class RoomControllerImpl extends RoomController {

    private ArrayList<Integer> as;

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

        for (int i = 0; i < abb.size() - 1; i++) {
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
     * @see timetabling.ucf.cu.web.roomschedule.RoomController#loadRoomSchedule(org.apache.struts.action.ActionMapping, timetabling.ucf.cu.web.roomschedule.LoadRoomScheduleForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    public final void loadRoomSchedule(ActionMapping mapping, finf.ucf.cu.web.roomschedule.LoadRoomScheduleForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        ManageableServiceLocator locator = finf.ucf.cu.ManageableServiceLocator.instance();
        List RoomList = locator.getRoomManageableService().readAll();

        List clases = new ArrayList();
        request.getSession().setAttribute("RoomSchedule", clases);
        
        if (form.getDate() == null){
        	form.setDateAsDate( new Date());
        }

        if (form.getMyRoom() != null) {

            if (form.getExportl() != null) {

                // codigo para exportar aqui
            } else {
                System.out.print(form.getMyRoom().toString());
                clases = getGroupScheduleService().getRoomSchedule(Long.valueOf(form.getMyRoom().toString()), form.getDateAsDate());

                request.getSession().setAttribute("RoomSchedule", clases);
                System.out.print(clases.size());
            }
        }

        form.setMyRoomBackingList(RoomList, "id", "name");
    }
}
