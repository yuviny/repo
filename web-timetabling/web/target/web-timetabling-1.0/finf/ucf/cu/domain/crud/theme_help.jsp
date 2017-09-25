<%@ include file="/taglib-imports.jspf" %>

<tiles:insert definition="help.layout">

    <tiles:put name="title" type="string">
        <bean:message key="online.help.title"/>
        <bean:message key="theme"/>
    </tiles:put>

    <tiles:put name="body" type="string">
        <h1><bean:message key="theme"/></h1>
        <p>
            <bean:message key="theme.online.help"/>
        </p>
        <h2><bean:message key="theme.name"/></h2>
        <p>
            <bean:message key="theme.name.online.help"/>
        </p>
        <h2><bean:message key="theme.puno.id"/></h2>
        <p>
            <bean:message key="theme.puno.id.online.help"/>
        </p>
    </tiles:put>

</tiles:insert>

