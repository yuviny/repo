<%@ include file="/taglib-imports.jspf" %>

<tiles:insert definition="help.layout">

    <tiles:put name="title" type="string">
        <bean:message key="online.help.title"/>
        <bean:message key="subject"/>
    </tiles:put>

    <tiles:put name="body" type="string">
        <h1><bean:message key="subject"/></h1>
        <p>
            <bean:message key="subject.online.help"/>
        </p>
        <h2><bean:message key="subject.name"/></h2>
        <p>
            <bean:message key="subject.name.online.help"/>
        </p>
        <h2><bean:message key="subject.abbreviation"/></h2>
        <p>
            <bean:message key="subject.abbreviation.online.help"/>
        </p>
    </tiles:put>

</tiles:insert>

