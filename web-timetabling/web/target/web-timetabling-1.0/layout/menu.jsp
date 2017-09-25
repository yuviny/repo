<%@ include file="/taglib-imports.jspf" %>

<div class="box2">
    <h2>Horarios</h2>
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
    
    <h2><bean:message key="menu.usecases.sol"/></h2>
    	<ul> 
    		
    		<li>
                <a href="<html:rewrite page="/ClassTime/Manage.do"/>"> 
                 <bean:message key="class.time"/>
                </a>               
            </li>             
    </ul>    
     	
    <h2>Recursos</h2>
    <ul>       		
            <li>
                <a href="<html:rewrite page="/Subject/Manage.do"/>"> 
                 <bean:message key="subject"/>
                </a>               
            </li>  
            <li>
                <a href="<html:rewrite page="/Group/Manage.do"/>"> 
                	 <bean:message key="group"/>
                </a>               
            </li> 
            <li>
                <a href="<html:rewrite page="/Teacher/Manage.do"/>"> 
                	 <bean:message key="teacher"/>
                </a>               
            </li>   
            <li>
                <a href="<html:rewrite page="/Room/Manage.do"/>"> 
                	 <bean:message key="room"/>
                </a>               
            </li>   
            <li>
                <a href="<html:rewrite page="/Semester/Manage.do"/>"> 
                 <bean:message key="semester"/>
                </a>               
            </li> 
            
    </ul>
<br><br>
</div>

<p class="spacer"></p>



