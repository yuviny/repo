<%@ include file="/taglib-imports.jspf" %>

<tiles:insert definition="help.layout">

    <tiles:put name="title" type="string">
        <bean:message key="online.help.title"/>
        <bean:message key="impartition.plan"/>
    </tiles:put>

    <tiles:put name="body" type="string">
        <h1><bean:message key="impartition.plan"/></h1>
        <p>
            <bean:message key="impartition.plan.online.help"/>
        </p>
        <h2><bean:message key="impartition.plan.teacherallclasetype"/></h2>
        <p>
            <bean:message key="impartition.plan.teacherallclasetype.online.help"/>
        </p>
        <h2><bean:message key="impartition.plan.subject.id"/></h2>
        <p>
            <bean:message key="impartition.plan.subject.id.online.help"/>
        </p>
        <h2><bean:message key="impartition.plan.teacher.id"/></h2>
        <p>
            <bean:message key="impartition.plan.teacher.id.online.help"/>
        </p>
        <h2><bean:message key="impartition.plan.class.type.id"/></h2>
        <p>
            <bean:message key="impartition.plan.class.type.id.online.help"/>
        </p>
        <h2><bean:message key="impartition.plan.group.id"/></h2>
        <p>
            <bean:message key="impartition.plan.group.id.online.help"/>
        </p>
        <h2><bean:message key="impartition.plan.semester.id"/></h2>
        <p>
            <bean:message key="impartition.plan.semester.id.online.help"/>
        </p>
    </tiles:put>

</tiles:insert>

