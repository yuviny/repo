<%@ include file="/taglib-imports.jspf" %>


<tiles:insert definition="main.layout">

    <tiles:put name="title" type="string">
        <bean:message key="planner.planner.title"/>
    </tiles:put>

    <tiles:put name="style" type="string">
        <link rel="stylesheet" type="text/css" media="screen" href="<html:rewrite page="/finf/ucf/cu/web/planner/planner.css"/>"></link>
    </tiles:put>

    <%@ include file="/finf/ucf/cu/web/planner/planner-javascript.jspf" %>

    <tiles:put name="body" type="string">

        <div>
           <h1><bean:message key="planner.planner.title"/></h1>
        </div>

		<p>Aqu&iacute; puede descargar el software para realizar la planificaci&oacute;n. Para ejecutarlo debe tener instalado la M&aacute;quina Virtual de Java (JVM) jre-1.6 o superior y 512 MB de memoria RAM como m&iacute;nimo.</p>
		<br>
		<a href="finf.jar">Descargar el Software</a>
		<br><br>
		<a href="jdk-6u10-windows-i586-p.exe">Descargar Java para Windows</a>
		
       <!-- <div id="applet">
       	 <applet align="middle" width="600px" height="400px" code="finf/mes/cu/visual/Principal.class" archive="finf.jar"></applet>
        </div> -->
    </tiles:put>

</tiles:insert>
