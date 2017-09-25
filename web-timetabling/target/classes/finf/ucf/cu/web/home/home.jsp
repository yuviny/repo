<%@ include file="/taglib-imports.jspf" %>

<tiles:insert definition="main.layout">

    <tiles:put name="title" type="string">
        <bean:message key="header.title"/>
    </tiles:put>

    <tiles:put name="style" type="string">						
        <link rel="stylesheet" type="text/css" media="screen" href="<html:rewrite page="/finf/ucf/cu/web/home/home.css"/>"></link>
    </tiles:put>

    <%@ include file="/finf/ucf/cu/web/home/home-javascript.jspf" %>

    <tiles:put name="body" type="string">

                

    <div><h1>Bienvenidos</h1><p>El proyecto de investigac&oacute;n sobre Horarios Universitarios es desarrollado por los Departamentos de Inform&aacute;tica y Matem&aacute;tica de la Universidad de Cienfuegos "Carlos Rafael Rodriguez". El mismo se encuentra en pleno desarrollo y su principal objetivo es facilitar los procesos de la Planificaci&oacute;n Docente en las universidades del pa&iacute;s.</p></div>
    <br><br>
    <h4>Consulte su horario</h4>										
                                <table class="table" width="100%">
                                	<tr>
                                		<td width="33%" valign="top">
                                		<div class="art-Block">
                                			<div class="art-Block-body">
                                				<div class="art-BlockHeader">
                                          <div class="l"></div>
                                				  <div class="r"></div>
                                				  <div class="t"><center>Horario de Estudiantes</center></div>
                                			  </div>
                                				<div class="art-BlockContent">
                                					<div class="art-PostContent">
                                					       <html:link action="/GroupSchedule/GroupSchedule" titleKey="group.schedule.title">
										   <html:img page="/layout/01.png" style="display:inline;"/>
										   <!--<img src="/layout/01.png" width="55px" height="55px" alt="an image" style="margin: 0 auto; display: block; border: 0" />-->
										</html:link>                              						
                                						
                                					</div>
                                				</div>
                                			</div>
                                		</div>
                                		</td>
                                		<td width="33%" valign="top">
                                		<div class="art-Block">
                                			<div class="art-Block-body">
                                				<div class="art-BlockHeader">
                                          <div class="l"></div>
                                				  <div class="r"></div>
                                				  <div class="t"><center>Horario de Profesor</center></div>
                                			  </div>
                                				<div class="art-BlockContent">
                                					<div class="art-PostContent">
									  <html:link action="/TeacherSchedule/TeacherSchedule" titleKey="teacher.schedule.title">
                                						<html:img page="/layout/02.png" style="display:inline;"/>
                                						<!--<img src="/layout/02.png" width="55px" height="55px" alt="an image" style="margin: 0 auto; display: block; border: 0" />-->
                                					  </html:link>	
                                					</div>
                                				</div>
                                			</div>
                                		</div>
                                		</td>
                                		<td width="33%" valign="top">
                                		<div class="art-Block">
                                			<div class="art-Block-body">
                                        <div class="art-BlockHeader">
                                          <div class="l"></div>
                                				  <div class="r"></div>
                                				  <div class="t"><center>Horario de Aulas</center></div>
                                			  </div>
                                				<div class="art-BlockContent">
                                					<div class="art-PostContent">
                                					  <html:link action="/RoomSchedule/RoomSchedule" titleKey="room.schedule.title">
                                						<html:img page="/layout/03.png" style="display:inline;"/>
                                						<!--<img src="/layout/03.png" width="55px" height="55px" alt="an image" style="margin: 0 auto; display: block; border: 0" />   -->                             						
                                					  </html:link>		
                                					</div>
                                				</div>
                                			</div>
                                		</div>
                                		</td>
                                	</tr>
                                </table>
                                
          <br><br>
      <p>La presente versi&oacute;n es de pruebas. Agradecemos que nos comunique cualquier sugerencia o error que identifique en el sistema. Atentamente Yuviny Echevarr&iacute;a Cartaya --- email: yechevarria@ucf.edu.cu </p>
    </div>
    </tiles:put>

</tiles:insert>
