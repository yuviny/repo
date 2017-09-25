<%@ include file="/taglib-imports.jspf" %>

<tiles:insert definition="help.layout">

    <tiles:put name="title" type="string">
        <bean:message key="online.help.title"/>
        <bean:message key="building"/>
    </tiles:put>

    <tiles:put name="body" type="string">
        <h1><bean:message key="building"/></h1>
        <p>
            <bean:message key="building.online.help"/>
        </p>
        <h2><bean:message key="building.name"/></h2>
        <p>
            <bean:message key="building.name.online.help"/>
        </p>
        <h2><bean:message key="building.address"/></h2>
        <p>
            <bean:message key="building.address.online.help"/>
        </p>
    </tiles:put>

</tiles:insert>

