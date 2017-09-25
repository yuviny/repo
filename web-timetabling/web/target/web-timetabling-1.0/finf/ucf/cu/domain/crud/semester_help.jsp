<%@ include file="/taglib-imports.jspf" %>

<tiles:insert definition="help.layout">

    <tiles:put name="title" type="string">
        <bean:message key="online.help.title"/>
        <bean:message key="semester"/>
    </tiles:put>

    <tiles:put name="body" type="string">
        <h1><bean:message key="semester"/></h1>
        <p>
            <bean:message key="semester.online.help"/>
        </p>
        <h2><bean:message key="semester.name"/></h2>
        <p>
            <bean:message key="semester.name.online.help"/>
        </p>
    </tiles:put>

</tiles:insert>

