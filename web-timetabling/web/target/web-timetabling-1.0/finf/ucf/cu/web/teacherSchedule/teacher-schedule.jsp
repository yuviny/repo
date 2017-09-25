<%@ include file="/taglib-imports.jspf" %>

<tiles:insert definition="main.layout">

    <tiles:put name="title" type="string">
        <bean:message key="teacher.schedule.teacher.schedule.title"/>
    </tiles:put>

    <tiles:put name="style" type="string">
        <link rel="stylesheet" type="text/css" media="screen" href="<html:rewrite page="/finf/ucf/cu/web/teacherSchedule/teacher-schedule.css"/>"></link>
         <link rel="stylesheet" type="text/css" media="all" href="<html:rewrite page="/layout/default-calendar.css"/>"/>
    </tiles:put>

    <%@ include file="/finf/ucf/cu/web/teacherSchedule/teacher-schedule-javascript.jspf" %>

    <tiles:put name="body" type="string">

        <div>
            <h1><bean:message key="teacher.schedule.teacher.schedule.title"/></h1>
        </div>

        <%@ include file="/finf/ucf/cu/web/teacherSchedule/teacher-schedule-vars.jspf" %>

        <%@ include file="/finf/ucf/cu/web/teacherSchedule/teacher-schedule-buscar.jspf" %>
         <div id="pageHelpSection">
            <blockquote>
                <a href="" id="pageHelp" style="display:inline;" onclick="openWindow('<html:rewrite action="/finf/ucf/cu/web/teacherSchedule/TeacherScheduleHelp"/>','onlinehelp',true,false,760,540); return false;">
                    <bean:message key="online.help.href"/>
                </a>
                <html:img page="/layout/help.gif" style="display:inline;"/>
            </blockquote>
        </div>

        <%@ include file="/finf/ucf/cu/web/teacherSchedule/teacher-schedule-par.jspf" %>
		
		
        
    </tiles:put>

</tiles:insert>
