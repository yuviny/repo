<%@ include file="/taglib-imports.jspf" %>

<tiles:insert definition="help.layout">

    <tiles:put name="title" type="string">
        <bean:message key="online.help.title"/>
        <bean:message key="group"/>
    </tiles:put>

    <tiles:put name="body" type="string">
        <h1><bean:message key="group"/></h1>
        <p>
            <bean:message key="group.online.help"/>
        </p>
        <h2><bean:message key="group.name"/></h2>
        <p>
            <bean:message key="group.name.online.help"/>
        </p>
        <h2><bean:message key="group.size"/></h2>
        <p>
            <bean:message key="group.size.online.help"/>
        </p>
        <h2><bean:message key="group.abbreviation"/></h2>
        <p>
            <bean:message key="group.abbreviation.online.help"/>
        </p>
        <h2><bean:message key="group.date.begin1.semester"/></h2>
        <p>
            <bean:message key="group.date.begin1.semester.online.help"/>
        </p>
        <h2><bean:message key="group.date.begin2.semester"/></h2>
        <p>
            <bean:message key="group.date.begin2.semester.online.help"/>
        </p>
        <h2><bean:message key="group.sub.group.id"/></h2>
        <p>
            <bean:message key="group.sub.group.id.online.help"/>
        </p>
    </tiles:put>

</tiles:insert>

