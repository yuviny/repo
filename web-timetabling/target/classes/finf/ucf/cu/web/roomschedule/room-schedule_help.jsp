<%@ include file="/taglib-imports.jspf" %>

<tiles:insert definition="help.layout">

    <tiles:put name="title" type="string">
        <bean:message key="online.help.title"/>
        <bean:message key="room.schedule.room.schedule"/>
    </tiles:put>

    <tiles:put name="body" type="string">
        <h1><bean:message key="room.schedule.room.schedule"/></h1>
        <p>
            <bean:message key="room.schedule.room.schedule.online.help"/>
        </p>
        <h2><bean:message key="room.schedule.room.schedule.buscar"/></h2>
        <p>
            <bean:message key="room.schedule.room.schedule.buscar.online.help"/>
        </p>
        <br/>
            <table>
                <tr class="even">
                    <th><bean:message key="online.help.inputfield"/></th>
                    <th><bean:message key="online.help.description"/></th>
                </tr>
                <tr class="odd">
                    <td><bean:message key="room.schedule.room.schedule.buscar.param.my.room"/></td>
                    <td><bean:message key="room.schedule.room.schedule.buscar.param.my.room.online.help"/></td>
                </tr>
                <tr class="even">
                    <td><bean:message key="room.schedule.room.schedule.buscar.param.date"/></td>
                    <td><bean:message key="room.schedule.room.schedule.buscar.param.date.online.help"/></td>
                </tr>
                <tr class="odd">
                    <td><bean:message key="room.schedule.room.schedule.buscar.param.exportl"/></td>
                    <td><bean:message key="room.schedule.room.schedule.buscar.param.exportl.online.help"/></td>
                </tr>
            </table>
    </tiles:put>

</tiles:insert>

