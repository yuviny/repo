<%@ include file="/taglib-imports.jspf" %>

<tiles:insert definition="help.layout">

    <tiles:put name="title" type="string">
        <bean:message key="online.help.title"/>
        <bean:message key="group.schedule.group.schedule"/>
    </tiles:put>

    <tiles:put name="body" type="string">
        <h1><bean:message key="group.schedule.group.schedule"/></h1>
        <p>
            <bean:message key="group.schedule.group.schedule.online.help"/>
        </p>
        <h2><bean:message key="group.schedule.group.schedule.buscar"/></h2>
        <p>
            <bean:message key="group.schedule.group.schedule.buscar.online.help"/>
        </p>
        <br/>
            <table>
                <tr class="even">
                    <th><bean:message key="online.help.inputfield"/></th>
                    <th><bean:message key="online.help.description"/></th>
                </tr>
                <tr class="odd">
                    <td><bean:message key="group.schedule.group.schedule.buscar.param.mygroup"/></td>
                    <td><bean:message key="group.schedule.group.schedule.buscar.param.mygroup.online.help"/></td>
                </tr>
                <tr class="even">
                    <td><bean:message key="group.schedule.group.schedule.buscar.param.day"/></td>
                    <td><bean:message key="group.schedule.group.schedule.buscar.param.day.online.help"/></td>
                </tr>
                <tr class="odd">
                    <td><bean:message key="group.schedule.group.schedule.buscar.param.export"/></td>
                    <td><bean:message key="group.schedule.group.schedule.buscar.param.export.online.help"/></td>
                </tr>
            </table>
    </tiles:put>

</tiles:insert>

