<%@ include file="/taglib-imports.jspf" %>

<tiles:insert definition="help.layout">

    <tiles:put name="title" type="string">
        <bean:message key="online.help.title"/>
        <bean:message key="not.avalability"/>
    </tiles:put>

    <tiles:put name="body" type="string">
        <h1><bean:message key="not.avalability"/></h1>
        <p>
            <bean:message key="not.avalability.online.help"/>
        </p>
        <h2><bean:message key="not.avalability.date"/></h2>
        <p>
            <bean:message key="not.avalability.date.online.help"/>
        </p>
        <h2><bean:message key="not.avalability.not.time"/></h2>
        <p>
            <bean:message key="not.avalability.not.time.online.help"/>
        </p>
        <h2><bean:message key="not.avalability.teacher.id"/></h2>
        <p>
            <bean:message key="not.avalability.teacher.id.online.help"/>
        </p>
        <h2><bean:message key="not.avalability.group.id"/></h2>
        <p>
            <bean:message key="not.avalability.group.id.online.help"/>
        </p>
        <h2><bean:message key="not.avalability.subject.id"/></h2>
        <p>
            <bean:message key="not.avalability.subject.id.online.help"/>
        </p>
    </tiles:put>

</tiles:insert>

