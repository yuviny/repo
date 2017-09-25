<%@ include file="/taglib-imports.jspf" %>
<div>
    <blockquote id="header">
        <html:img page="/layout/main.jpg" style="display:inline;"/>
        <bean:message key="header.title"/>
    </blockquote>  					 	


    <div class="art-nav">
     <div class="art-nav-center">
       <ul class="art-menu">
            <li>
                <html:link action="/Home/Home">
                    <span class="l"></span><span class="r"></span><span class="t">
                        Inicio
                    </span>                		              	
                </html:link>
            </li>
<!--*****************************Mostrar Horario***************************************************************************************************************-->           
            <li>
                <a href="#"><span class="l"></span><span class="r"></span><span class="t">Horario</span></a>
                <ul>
                    <li>
                        <html:link action="/GroupSchedule/GroupSchedule" titleKey="group.schedule.title">
                            <bean:message key="group.schedule.title"/>
                        </html:link>
                    </li>
                    <li>
                        <html:link action="/TeacherSchedule/TeacherSchedule" titleKey="teacher.schedule.title">
                            <bean:message key="teacher.schedule.title"/>
                        </html:link>
                    </li>
                    <li>
                        <html:link action="/RoomSchedule/RoomSchedule" titleKey="room.schedule.title">
                            <bean:message key="room.schedule.title"/>                            
                        </html:link>
                    </li>
                </ul>
            </li>

			
			
			
			
    <li>
      <a href="#"><span class="l"></span><span class="r"></span><span class="t">Gestionar </span></a>
        <ul>
<!--*****************************Gestiona Recursos***************************************************************************************************************-->           

            <li>
                <a href="#">Espacios</a>
                <ul>
                    <li>
                        <a href="<html:rewrite page="/Building/Manage.do"/>"> 
                            <bean:message key="building"/>
                        </a>               
                    </li>   

                    <li>
                        <a href="<html:rewrite page="/Room/Manage.do"/>"> 
                            <bean:message key="room"/>
                        </a>               
                    </li>
                    
                    <li>
                        <a href="<html:rewrite page="/Resource/Manage.do"/>"> 
                            <bean:message key="resource"/>
                        </a>               
                    </li>
					
		     <li>
                        <a href="<html:rewrite page="/Departamento/Manage.do"/>"> 
                            <bean:message key="department"/>
                        </a>               
                    </li>         
					
                </ul>
            </li>
<!--*****************************Plan Calendario P1***************************************************************************************************************-->           
          <li>
                <a href="#">Plan Calendario P1</a>
                <ul>
                    <li>
                        <a href="<html:rewrite page="/P1/Manage.do"/>"> 
                            <bean:message key="p1"/>
                        </a>               
                    </li>  
                    <li>
                        <a href="<html:rewrite page="/Theme/Manage.do"/>"> 
                            <bean:message key="theme"/>
                        </a>               
                    </li> 
                    <li>
                        <a href="<html:rewrite page="/Activity/Manage.do"/>"> 
                            <bean:message key="activity"/>
                        </a>               
                    </li>   
                   	<li>
                        <a href="<html:rewrite page="/Subject/Manage.do"/>"> 
                            <bean:message key="subject"/>
                        </a>               
                    </li>    					
					
                </ul>
            </li>

 <!--*****************************Gestiona Plan de Imparticion***************************************************************************************************************-->           

          <li>
	      <a href="<html:rewrite page="/ImpartitionPlan/Manage.do"/>"> 
               <bean:message key="plan.imparticion"/>
              </a>
          </li>
          
          <li>
	      <a href="<html:rewrite page="/NotAvalability/Manage.do"/>"> 
               <bean:message key="not.avalability"/>
              </a>
          </li>

<!--*****************************Gestiona Balance de Carga***************************************************************************************************************-->           
  
          
 <!--*****************************Gestiona Fondo de Tiempo***************************************************************************************************************-->           

   


 <!--*****************************FIN de los gestionar***************************************************************************************************************-->           
		</ul>
    </li>
            <li>
                <a href="#"><span class="l"></span><span class="r"></span><span class="t">Planificar</span></a>
                <ul>
                    <li>
                        <a href="<html:rewrite page="/Semester/Manage.do"/>"> 
                            <bean:message key="semester"/>
                        </a>               
                    </li> 
                    <li>
                        <a href="<html:rewrite page="/ClassTime/Manage.do"/>"> 
                            <bean:message key="class.time"/>
                        </a>               
                    </li>
                </ul>
            </li>	    

            <li>
                <a href="http://horarios.ucf.edu.cu/pentaho/Pivot?solution=UCF&path=&action=Reporte%20de%20horas%20clase.xaction" ><span class="l"></span><span class="r"></span><span class="t">An&aacute;lisis de Datos</span></a>

            </li>	   

        </ul>
        </div>
    </div>
</div>

