<%@ include file="/taglib-imports.jspf" %>

<tiles:insert definition="help.layout">

    <tiles:put name="title" type="string">
        <bean:message key="online.help.title"/>
        <bean:message key="activity"/>
    </tiles:put>

    <tiles:put name="body" type="string">
        <h1><bean:message key="activity"/></h1>
        <p>
            <bean:message key="activity.online.help"/>
        </p>
        <h2><bean:message key="activity.number"/></h2>
        <p>
            <bean:message key="activity.number.online.help"/>
        </p>
        <h2><bean:message key="activity.name"/></h2>
        <p>
            <bean:message key="activity.name.online.help"/>
        </p>
        <h2><bean:message key="activity.hour.cant"/></h2>
        <p>
            <bean:message key="activity.hour.cant.online.help"/>
        </p>
        <h2><bean:message key="activity.week"/></h2>
        <p>
            <bean:message key="activity.week.online.help"/>
        </p>
        <h2><bean:message key="activity.class.type.id"/></h2>
        <p>
            <bean:message key="activity.class.type.id.online.help"/>
        </p>
        <h2><bean:message key="activity.resources"/></h2>
        <p>
            <bean:message key="activity.resources.online.help"/>
        </p>
        <h2><bean:message key="activity.theme.id"/></h2>
        <p>
            <bean:message key="activity.theme.id.online.help"/>
        </p>
    </tiles:put>

</tiles:insert>

