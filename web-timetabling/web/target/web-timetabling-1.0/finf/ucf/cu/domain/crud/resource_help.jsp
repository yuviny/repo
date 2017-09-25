<%@ include file="/taglib-imports.jspf" %>

<tiles:insert definition="help.layout">

    <tiles:put name="title" type="string">
        <bean:message key="online.help.title"/>
        <bean:message key="resource"/>
    </tiles:put>

    <tiles:put name="body" type="string">
        <h1><bean:message key="resource"/></h1>
        <p>
            <bean:message key="resource.online.help"/>
        </p>
        <h2><bean:message key="resource.name"/></h2>
        <p>
            <bean:message key="resource.name.online.help"/>
        </p>
        <h2><bean:message key="resource.description"/></h2>
        <p>
            <bean:message key="resource.description.online.help"/>
        </p>
    </tiles:put>

</tiles:insert>

