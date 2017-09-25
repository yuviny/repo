<%@ include file="/taglib-imports.jspf" %>

<tiles:insert definition="help.layout">

    <tiles:put name="title" type="string">
        <bean:message key="online.help.title"/>
        <bean:message key="department"/>
    </tiles:put>

    <tiles:put name="body" type="string">
        <h1><bean:message key="department"/></h1>
        <p>
            <bean:message key="department.online.help"/>
        </p>
        <h2><bean:message key="department.name"/></h2>
        <p>
            <bean:message key="department.name.online.help"/>
        </p>
        <h2><bean:message key="department.teacher"/></h2>
        <p>
            <bean:message key="department.teacher.online.help"/>
        </p>
    </tiles:put>

</tiles:insert>

