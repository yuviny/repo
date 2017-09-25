<%@ include file="/taglib-imports.jspf" %>

<tiles:insert definition="help.layout">

    <tiles:put name="title" type="string">
        <bean:message key="online.help.title"/>
        <bean:message key="class.type"/>
    </tiles:put>

    <tiles:put name="body" type="string">
        <h1><bean:message key="class.type"/></h1>
        <p>
            <bean:message key="class.type.online.help"/>
        </p>
        <h2><bean:message key="class.type.name"/></h2>
        <p>
            <bean:message key="class.type.name.online.help"/>
        </p>
    </tiles:put>

</tiles:insert>

