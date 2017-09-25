<%@ include file="/taglib-imports.jspf" %>

<tiles:insert definition="help.layout">

    <tiles:put name="title" type="string">
        <bean:message key="online.help.title"/>
        <bean:message key="room"/>
    </tiles:put>

    <tiles:put name="body" type="string">
        <h1><bean:message key="room"/></h1>
        <p>
            <bean:message key="room.online.help"/>
        </p>
        <h2><bean:message key="room.name"/></h2>
        <p>
            <bean:message key="room.name.online.help"/>
        </p>
        <h2><bean:message key="room.size"/></h2>
        <p>
            <bean:message key="room.size.online.help"/>
        </p>
        <h2><bean:message key="room.abbreviation"/></h2>
        <p>
            <bean:message key="room.abbreviation.online.help"/>
        </p>
        <h2><bean:message key="room.resources"/></h2>
        <p>
            <bean:message key="room.resources.online.help"/>
        </p>
        <h2><bean:message key="room.building.id"/></h2>
        <p>
            <bean:message key="room.building.id.online.help"/>
        </p>
    </tiles:put>

</tiles:insert>

