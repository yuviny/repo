<%@ include file="/taglib-imports.jspf" %>

<tiles:insert definition="help.layout">

    <tiles:put name="title" type="string">
        <bean:message key="online.help.title"/>
        <bean:message key="p1"/>
    </tiles:put>

    <tiles:put name="body" type="string">
        <h1><bean:message key="p1"/></h1>
        <p>
            <bean:message key="p1.online.help"/>
        </p>
        <h2><bean:message key="p1.name"/></h2>
        <p>
            <bean:message key="p1.name.online.help"/>
        </p>
        <h2><bean:message key="p1.end.date"/></h2>
        <p>
            <bean:message key="p1.end.date.online.help"/>
        </p>
        <h2><bean:message key="p1.approved.by"/></h2>
        <p>
            <bean:message key="p1.approved.by.online.help"/>
        </p>
        <h2><bean:message key="p1.subject.id"/></h2>
        <p>
            <bean:message key="p1.subject.id.online.help"/>
        </p>
        <h2><bean:message key="p1.teacher"/></h2>
        <p>
            <bean:message key="p1.teacher.online.help"/>
        </p>
    </tiles:put>

</tiles:insert>

