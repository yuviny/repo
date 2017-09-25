<%@ include file="/taglib-imports.jspf" %>

<tiles:insert definition="help.layout">

    <tiles:put name="title" type="string">
        <bean:message key="online.help.title"/>
        <bean:message key="teacher.schedule.teacher.schedule"/>
    </tiles:put>

    <tiles:put name="body" type="string">
        <h1><bean:message key="teacher.schedule.teacher.schedule"/></h1>
        <p>
            <bean:message key="teacher.schedule.teacher.schedule.online.help"/>
        </p>
        <h2><bean:message key="teacher.schedule.teacher.schedule.buscar"/></h2>
        <p>
            <bean:message key="teacher.schedule.teacher.schedule.buscar.online.help"/>
        </p>
        <br/>
            <table>
                <tr class="even">
                    <th><bean:message key="online.help.inputfield"/></th>
                    <th><bean:message key="online.help.description"/></th>
                </tr>
                <tr class="odd">
                    <td><bean:message key="teacher.schedule.teacher.schedule.buscar.param.my.teacher"/></td>
                    <td><bean:message key="teacher.schedule.teacher.schedule.buscar.param.my.teacher.online.help"/></td>
                </tr>
                <tr class="even">
                    <td><bean:message key="teacher.schedule.teacher.schedule.buscar.param.date"/></td>
                    <td><bean:message key="teacher.schedule.teacher.schedule.buscar.param.date.online.help"/></td>
                </tr>
                <tr class="odd">
                    <td><bean:message key="teacher.schedule.teacher.schedule.buscar.param.exportt"/></td>
                    <td><bean:message key="teacher.schedule.teacher.schedule.buscar.param.exportt.online.help"/></td>
                </tr>
            </table>
    </tiles:put>

</tiles:insert>

