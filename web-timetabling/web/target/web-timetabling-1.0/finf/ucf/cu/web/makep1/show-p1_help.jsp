<%@ include file="/taglib-imports.jspf" %>

<tiles:insert definition="help.layout">

    <tiles:put name="title" type="string">
        <bean:message key="online.help.title"/>
        <bean:message key="make.p1.show.p1"/>
    </tiles:put>

    <tiles:put name="body" type="string">
        <h1><bean:message key="make.p1.show.p1"/></h1>
        <p>
            <bean:message key="make.p1.show.p1.online.help"/>
        </p>
    </tiles:put>

</tiles:insert>

