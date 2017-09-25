<%@ include file="/taglib-imports.jspf" %>

<tiles:insert definition="help.layout">

    <tiles:put name="title" type="string">
        <bean:message key="online.help.title"/>
        <bean:message key="make.p1.load"/>
    </tiles:put>

    <tiles:put name="body" type="string">
        <h1><bean:message key="make.p1.load"/></h1>
        <p>
            <bean:message key="make.p1.load.online.help"/>
        </p>
    </tiles:put>

</tiles:insert>

