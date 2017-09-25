<%@ include file="/taglib-imports.jspf" %>

<tiles:insert definition="help.layout">

    <tiles:put name="title" type="string">
        <bean:message key="online.help.title"/>
        <bean:message key="home.title"/>
    </tiles:put>

    <tiles:put name="body" type="string">
        <h1><bean:message key="home.title"/></h1>
        <p>
            <bean:message key="home.online.help"/>
        </p>
        <h2><bean:message key="group.schedule.title"/></h2>
        <p>
            <bean:message key="group.schedule.online.help"/>
        </p>
        <h2><bean:message key="planner.title"/></h2>
        <p>
            <bean:message key="planner.online.help"/>
        </p>
        <h2><bean:message key="teacher.schedule.title"/></h2>
        <p>
            <bean:message key="teacher.schedule.online.help"/>
        </p>
        <h2><bean:message key="room.schedule.title"/></h2>
        <p>
            <bean:message key="room.schedule.online.help"/>
        </p>
        <h2><bean:message key="home.title"/></h2>
        <p>
            <bean:message key="home.online.help"/>
        </p>
        <h2><bean:message key="make.p1.title"/></h2>
        <p>
            <bean:message key="make.p1.online.help"/>
        </p>
    </tiles:put>

</tiles:insert>

