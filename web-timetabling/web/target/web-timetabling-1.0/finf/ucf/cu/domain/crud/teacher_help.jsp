<%@ include file="/taglib-imports.jspf" %>

<tiles:insert definition="help.layout">

    <tiles:put name="title" type="string">
        <bean:message key="online.help.title"/>
        <bean:message key="teacher"/>
    </tiles:put>

    <tiles:put name="body" type="string">
        <h1><bean:message key="teacher"/></h1>
        <p>
            <bean:message key="teacher.online.help"/>
        </p>
        <h2><bean:message key="teacher.email"/></h2>
        <p>
            <bean:message key="teacher.email.online.help"/>
        </p>
        <h2><bean:message key="teacher.name"/></h2>
        <p>
            <bean:message key="teacher.name.online.help"/>
        </p>
        <h2><bean:message key="teacher.first.name"/></h2>
        <p>
            <bean:message key="teacher.first.name.online.help"/>
        </p>
        <h2><bean:message key="teacher.last.name"/></h2>
        <p>
            <bean:message key="teacher.last.name.online.help"/>
        </p>
        <h2><bean:message key="teacher.grade"/></h2>
        <p>
            <bean:message key="teacher.grade.online.help"/>
        </p>
        <h2><bean:message key="teacher.department.id"/></h2>
        <p>
            <bean:message key="teacher.department.id.online.help"/>
        </p>
    </tiles:put>

</tiles:insert>

