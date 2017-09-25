<%@ include file="/taglib-imports.jspf" %>

<breadcrumbs:resize size="5"/>
<breadcrumbs:add value="room.schedule.room.schedule.title"/>

<tiles:insert definition="main.layout">

    <tiles:put name="title" type="string">
        <bean:message key="room.schedule.room.schedule.title"/>
    </tiles:put>

    <tiles:put name="style" type="string">
        <link rel="stylesheet" type="text/css" media="screen" href="<html:rewrite page="/finf/ucf/cu/web/roomschedule/room-schedule.css"/>"></link>
        <link rel="stylesheet" type="text/css" media="all" href="<html:rewrite page="/layout/default-calendar.css"/>"/>
    </tiles:put>

    <%@ include file="/finf/ucf/cu/web/roomschedule/room-schedule-javascript.jspf" %>

    <tiles:put name="body" type="string">

        <div>
            <tiles:insert definition="breadcrumbs.tile" flush="false">
                <tiles:put name="current.page.title" type="string" value="room.schedule.room.schedule.title"/>
            </tiles:insert>
            <h1><bean:message key="room.schedule.room.schedule.title"/></h1>
        </div>

        <%@ include file="/finf/ucf/cu/web/roomschedule/room-schedule-vars.jspf" %>

        <%@ include file="/finf/ucf/cu/web/roomschedule/room-schedule-buscar.jspf" %>
        
         <div id="pageHelpSection">
            <blockquote>
                
                <a href="" id="pageHelp" style="display:inline;" onclick="openWindow('<html:rewrite action="/finf/ucf/cu/web/roomschedule/RoomScheduleHelp"/>','onlinehelp',true,false,760,540); return false;">
                    <bean:message key="online.help.href"/>
                </a>
                <html:img page="/layout/help.gif" style="display:inline;"/>
            </blockquote>
        </div>

        <%@ include file="/finf/ucf/cu/web/roomschedule/room-schedule-par.jspf" %>

       

    </tiles:put>

</tiles:insert>
