<%@ include file="/taglib-imports.jspf" %>

<tiles:insert definition="help.layout">

    <tiles:put name="title" type="string">
        <bean:message key="online.help.title"/>
        <bean:message key="class.time"/>
    </tiles:put>

    <tiles:put name="body" type="string">
        <h1><bean:message key="class.time"/></h1>
        <p>
            <bean:message key="class.time.online.help"/>
        </p>
        <h2><bean:message key="class.time.day"/></h2>
        <p>
            <bean:message key="class.time.day.online.help"/>
        </p>
        <h2><bean:message key="class.time.time"/></h2>
        <p>
            <bean:message key="class.time.time.online.help"/>
        </p>
        <h2><bean:message key="class.time.duration"/></h2>
        <p>
            <bean:message key="class.time.duration.online.help"/>
        </p>
        <h2><bean:message key="class.time.fixed"/></h2>
        <p>
            <bean:message key="class.time.fixed.online.help"/>
        </p>
        <h2><bean:message key="class.time.tipic"/></h2>
        <p>
            <bean:message key="class.time.tipic.online.help"/>
        </p>
        <h2><bean:message key="class.time.group.id"/></h2>
        <p>
            <bean:message key="class.time.group.id.online.help"/>
        </p>
        <h2><bean:message key="class.time.teacher.id"/></h2>
        <p>
            <bean:message key="class.time.teacher.id.online.help"/>
        </p>
        <h2><bean:message key="class.time.subject.id"/></h2>
        <p>
            <bean:message key="class.time.subject.id.online.help"/>
        </p>
        <h2><bean:message key="class.time.room.id"/></h2>
        <p>
            <bean:message key="class.time.room.id.online.help"/>
        </p>
        <h2><bean:message key="class.time.solution"/></h2>
        <p>
            <bean:message key="class.time.solution.online.help"/>
        </p>
        <h2><bean:message key="class.time.class.type.id"/></h2>
        <p>
            <bean:message key="class.time.class.type.id.online.help"/>
        </p>
    </tiles:put>

</tiles:insert>

