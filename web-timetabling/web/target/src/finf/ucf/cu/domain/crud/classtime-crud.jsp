<%@ include file="/taglib-imports.jspf" %>
<tiles:insert definition="main.layout">

    <tiles:put name="title" type="string">
        <bean:message key="class.time.page.title"/>
    </tiles:put>

    <tiles:put name="style" type="string">
        <link rel="stylesheet" type="text/css" media="screen" href="<html:rewrite page="/layout/default-manageable.css"/>"></link>
        <link rel="stylesheet" type="text/css" media="all" href="<html:rewrite page="/layout/default-calendar.css"/>"/>
    </tiles:put>

    <tiles:put name="javascript" type="string">
        <script type="text/javascript" src="<html:rewrite action="/calendar"/>"></script>
        <script type="text/javascript">
        //<!--
            function setSelect(multi, form, name, value)
            {
                var select = form.elements[name];
                var options = select.options;

                // for browser compatibility's sake we go through the options ourselves
                for (var i=0; i<options.length; i++)
                {
                    if (multi)
                    {
                        // Array.indexOf is defined in Javascript 1.5, not before
                        options[i].selected = arrayContainsElement(value,options[i].value);
                    }
                    else
                    {
                        if (options[i].value == value)
                        {
                            select.selectedIndex = i;
                            break;
                        }
                    }

                }
            }

            function arrayContainsElement(array, element)
            {
              var containsElement = false;
              for (var i=0; i<array.length && !containsElement; i++) containsElement = (array[i] == element);
              return containsElement;
            }

            function setAction(crud) { document.forms['manageClassTimeForm'].elements['crud'].value = crud; }

            function enableUpdate(enabled) { document.getElementById("updateButton").disabled = !enabled; }

            var selectionCount = 0;

            function verifyEnableDelete(checkbox)
            {
                if (checkbox.checked) selectionCount++; else selectionCount--;
                document.getElementById("deleteButton").disabled = (selectionCount < 1);
            }

            function clearFields(form)
            {
                form.reset();
                enableUpdate(false);
                setFields("","","",false,false,"","","","","","","",form);
            }

            function setFields(day,time,duration,fixed,tipic,id,groupId,teacherId,subjectId,roomId,solution,classTypeID,form)
            {
                form.elements["dayAsString"].value = day;
                setSelect(false,form,"time",time);
                form.elements["duration"].value = duration;
                form.elements["fixed"].checked = fixed;
                form.elements["tipic"].checked = tipic;
                form.elements["id"].value = id;
                setSelect(false,form,"groupId",groupId);
                setSelect(false,form,"teacherId",teacherId);
                setSelect(false,form,"subjectId",subjectId);
                setSelect(false,form,"roomId",roomId);
                setSelect(false,form,"solution",solution);
                setSelect(false,form,"classTypeID",classTypeID);
            }
        //-->
        </script>
    </tiles:put>

    <tiles:put name="body" type="string">

        <div>
            <h1><bean:message key="class.time.page.title"/></h1>
        </div>

        <html:form styleId="manageClassTimeForm" action="/ClassTime/Manage" method="post">
            <input type="hidden" name="crud" value=""/>
            <div id="criteria">
                <c:if test="${!empty manageableForm}">
                    <table>
                        <tr>
                            <td><nobr><bean:message key="class.time.day"/> <div class="important">*</div></nobr></td>
                            <td>
                                <html:text name="manageableForm" property="dayAsString" styleClass="criteriaField" styleId="day"/>
                                <html:img page="/layout/calendar/calendar.gif" styleId="day_trigger" styleClass="calendar"/>
                                <script type="text/javascript">
                                //<!--
                                    Calendar.setup({
                                        inputField     :    "day",
                                        ifFormat       :    "%d/%m/%Y",
                                        daFormat       :    "%d/%m/%Y",
                                        showsTime      :    false,
                                        button         :    "day_trigger",
                                        singleClick    :    true
                                    });
                                //-->
                                </script>
                            </td>
                        </tr>
                        <tr>
                            <td><nobr><bean:message key="class.time.time"/> <div class="important">*</div></nobr></td>
                            <td>
                                <html:select name="manageableForm" property="time">
                                    <option value=""><bean:message key="select.option.blank"/></option>
                                    <html:option value="1">PRIMERO</html:option>
                                    <html:option value="2">SEGUNDO</html:option>
                                    <html:option value="3">TERCERO</html:option>
                                    <html:option value="4">CUARTO</html:option>
                                    <html:option value="5">QUINTO</html:option>
                                    <html:option value="6">SEXTO</html:option>
                                </html:select>
                            </td>
                        </tr>
                        <tr>
                            <td><bean:message key="class.time.duration"/></td>
                            <td>
                                <html:text name="manageableForm" property="duration" styleClass="criteriaField" styleId="duration"/>
                            </td>
                        </tr>
                        <tr>
                            <td><bean:message key="class.time.fixed"/></td>
                            <td>
                                <html:checkbox name="manageableForm" property="fixed" styleClass="criteriaField" styleId="fixed"/>
                            </td>
                        </tr>
                        <tr>
                            <td><bean:message key="class.time.tipic"/></td>
                            <td>
                                <html:checkbox name="manageableForm" property="tipic" styleClass="criteriaField" styleId="tipic"/>
                            </td>
                        </tr>
                    <html:hidden name="manageableForm" property="id"/>
                        <tr>
                            <td>
                                <logic:present role="administrador">
                                    <nobr><html:link action="/Group/Manage"><bean:message key="class.time.group.id"/></html:link> <div class="important">*</div></nobr>
                                </logic:present>
                                <logic:notPresent role="administrador">
                                    <nobr><bean:message key="class.time.group.id"/> <div class="important">*</div></nobr>
                                </logic:notPresent>
                            </td>
                            <td>
                                <c:choose>
                                    <c:when test="${empty manageableForm.groupIdBackingList}">
                                        <select name="groupId" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="groupId">
                                            <option value=""><bean:message key="select.option.blank"/></option>
                                            <c:forEach var="valueLabel" items="${manageableForm.groupIdBackingList}">
                                                <c:choose>
                                                    <c:when test="${valueLabel[0] eq manageableForm.groupId}">
                                                        <option value="${valueLabel[0]}" selected="selected">${valueLabel[1]}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel[0]}">${valueLabel[1]}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <logic:present role="administrador">
                                    <html:link action="/Teacher/Manage"><bean:message key="class.time.teacher.id"/></html:link>
                                </logic:present>
                                <logic:notPresent role="administrador">
                                    <bean:message key="class.time.teacher.id"/>
                                </logic:notPresent>
                            </td>
                            <td>
                                <c:choose>
                                    <c:when test="${empty manageableForm.teacherIdBackingList}">
                                        <select name="teacherId" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="teacherId">
                                            <option value=""><bean:message key="select.option.blank"/></option>
                                            <c:forEach var="valueLabel" items="${manageableForm.teacherIdBackingList}">
                                                <c:choose>
                                                    <c:when test="${valueLabel[0] eq manageableForm.teacherId}">
                                                        <option value="${valueLabel[0]}" selected="selected">${valueLabel[1]}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel[0]}">${valueLabel[1]}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <logic:present role="administrador">
                                    <nobr><html:link action="/Subject/Manage"><bean:message key="class.time.subject.id"/></html:link> <div class="important">*</div></nobr>
                                </logic:present>
                                <logic:notPresent role="administrador">
                                    <nobr><bean:message key="class.time.subject.id"/> <div class="important">*</div></nobr>
                                </logic:notPresent>
                            </td>
                            <td>
                                <c:choose>
                                    <c:when test="${empty manageableForm.subjectIdBackingList}">
                                        <select name="subjectId" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="subjectId">
                                            <option value=""><bean:message key="select.option.blank"/></option>
                                            <c:forEach var="valueLabel" items="${manageableForm.subjectIdBackingList}">
                                                <c:choose>
                                                    <c:when test="${valueLabel[0] eq manageableForm.subjectId}">
                                                        <option value="${valueLabel[0]}" selected="selected">${valueLabel[1]}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel[0]}">${valueLabel[1]}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <logic:present role="administrador">
                                    <html:link action="/Room/Manage"><bean:message key="class.time.room.id"/></html:link>
                                </logic:present>
                                <logic:notPresent role="administrador">
                                    <bean:message key="class.time.room.id"/>
                                </logic:notPresent>
                            </td>
                            <td>
                                <c:choose>
                                    <c:when test="${empty manageableForm.roomIdBackingList}">
                                        <select name="roomId" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="roomId">
                                            <option value=""><bean:message key="select.option.blank"/></option>
                                            <c:forEach var="valueLabel" items="${manageableForm.roomIdBackingList}">
                                                <c:choose>
                                                    <c:when test="${valueLabel[0] eq manageableForm.roomId}">
                                                        <option value="${valueLabel[0]}" selected="selected">${valueLabel[1]}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel[0]}">${valueLabel[1]}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <logic:present role="administrador">
                                    <nobr><html:link action="/Semester/Manage"><bean:message key="class.time.solution"/></html:link> <div class="important">*</div></nobr>
                                </logic:present>
                                <logic:notPresent role="administrador">
                                    <nobr><bean:message key="class.time.solution"/> <div class="important">*</div></nobr>
                                </logic:notPresent>
                            </td>
                            <td>
                                <c:choose>
                                    <c:when test="${empty manageableForm.solutionBackingList}">
                                        <select name="solution" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="solution">
                                            <option value=""><bean:message key="select.option.blank"/></option>
                                            <c:forEach var="valueLabel" items="${manageableForm.solutionBackingList}">
                                                <c:choose>
                                                    <c:when test="${valueLabel[0] eq manageableForm.solution}">
                                                        <option value="${valueLabel[0]}" selected="selected">${valueLabel[1]}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel[0]}">${valueLabel[1]}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <logic:present role="administrador">
                                    <html:link action="/ClassType/Manage"><bean:message key="class.time.class.type.id"/></html:link>
                                </logic:present>
                                <logic:notPresent role="administrador">
                                    <bean:message key="class.time.class.type.id"/>
                                </logic:notPresent>
                            </td>
                            <td>
                                <c:choose>
                                    <c:when test="${empty manageableForm.classTypeIDBackingList}">
                                        <select name="classTypeID" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="classTypeID">
                                            <option value=""><bean:message key="select.option.blank"/></option>
                                            <c:forEach var="valueLabel" items="${manageableForm.classTypeIDBackingList}">
                                                <c:choose>
                                                    <c:when test="${valueLabel[0] eq manageableForm.classTypeID}">
                                                        <option value="${valueLabel[0]}" selected="selected">${valueLabel[1]}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel[0]}">${valueLabel[1]}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose>
                            </td>
                        </tr>
                    </table>

                    <input type="submit" id="readButton" class="button" value="<bean:message key="button.read"/>" onclick="this.form.elements['id'].value='';setAction('read');"/>
                    <input type="submit" id="createButton" class="button" value="<bean:message key="button.create"/>" onclick="setAction('create');"/>
                    <input type="submit" id="deleteButton" class="button" value="<bean:message key="button.delete"/>" disabled="disabled" onclick="setAction('delete');"/>
                    <input type="submit" id="updateButton" class="button" value="<bean:message key="button.update"/>" disabled="disabled" onclick="setAction('update');return validateUpdate();"/>
                    <input type="button" id="clearButton" class="button" value="<bean:message key="button.clear"/>" onclick="clearFields(this.form);"/>
                </c:if>

<div id="entitySwitcher">
    <nobr>
        <bean:message key="select.other.entity"/>
        <select onchange="document.location=this.options[this.selectedIndex].value+'?ref_ClassTime='+this.form.elements['id'].value;">
        <logic:present role="administrador">
            <option value="<html:rewrite page="/Activity/Manage.do"/>"><bean:message key="activity"/></option>
        </logic:present>
        <logic:present role="administrador">
            <option value="<html:rewrite page="/Building/Manage.do"/>"><bean:message key="building"/></option>
        </logic:present>
        <logic:present role="administrador">
            <option selected="selected" value="<html:rewrite page="/ClassTime/Manage.do"/>"><bean:message key="class.time"/></option>
        </logic:present>
        <logic:present role="administrador">
            <option value="<html:rewrite page="/ClassType/Manage.do"/>"><bean:message key="class.type"/></option>
        </logic:present>
        <logic:present role="administrador">
            <option value="<html:rewrite page="/Department/Manage.do"/>"><bean:message key="department"/></option>
        </logic:present>
        <logic:present role="administrador">
            <option value="<html:rewrite page="/Group/Manage.do"/>"><bean:message key="group"/></option>
        </logic:present>
        <logic:present role="administrador">
            <option value="<html:rewrite page="/ImpartitionPlan/Manage.do"/>"><bean:message key="impartition.plan"/></option>
        </logic:present>
        <logic:present role="administrador">
            <option value="<html:rewrite page="/NotAvalability/Manage.do"/>"><bean:message key="not.avalability"/></option>
        </logic:present>
        <logic:present role="administrador">
            <option value="<html:rewrite page="/P1/Manage.do"/>"><bean:message key="p1"/></option>
        </logic:present>
        <logic:present role="administrador">
            <option value="<html:rewrite page="/Resource/Manage.do"/>"><bean:message key="resource"/></option>
        </logic:present>
        <logic:present role="administrador">
            <option value="<html:rewrite page="/Room/Manage.do"/>"><bean:message key="room"/></option>
        </logic:present>
        <logic:present role="administrador">
            <option value="<html:rewrite page="/Semester/Manage.do"/>"><bean:message key="semester"/></option>
        </logic:present>
        <logic:present role="administrador">
            <option value="<html:rewrite page="/Subject/Manage.do"/>"><bean:message key="subject"/></option>
        </logic:present>
        <logic:present role="administrador">
            <option value="<html:rewrite page="/Teacher/Manage.do"/>"><bean:message key="teacher"/></option>
        </logic:present>
        <logic:present role="administrador">
            <option value="<html:rewrite page="/Theme/Manage.do"/>"><bean:message key="theme"/></option>
        </logic:present>
        </select>
    </nobr>
</div>

            </div>

            <div id="manageableList" class="table">
                <c:if test="${!empty manageableForm.manageableList}">
                    <display:table name="${manageableForm.manageableList}" id="row" requestURI="${pageContext.request.requestURI}"
                            requestURIcontext="false"
                            export="true" pagesize="15" sort="list">
                        <display:column media="html" sortable="false">
                            <fmt:formatDate var="dayFormatted" value="${row.day}" pattern="dd/MM/yyyy"/>
                            <nobr>
                                <input type="radio" name="_copy" onclick="enableUpdate(true);setFields('<formatting:escape language="javascript">${dayFormatted}</formatting:escape>','<formatting:escape language="javascript">${row.time}</formatting:escape>','<formatting:escape language="javascript">${row.duration}</formatting:escape>',${row.fixed},${row.tipic},'<formatting:escape language="javascript">${row.id}</formatting:escape>','<formatting:escape language="javascript">${row.groupId}</formatting:escape>','<formatting:escape language="javascript">${row.teacherId}</formatting:escape>','<formatting:escape language="javascript">${row.subjectId}</formatting:escape>','<formatting:escape language="javascript">${row.roomId}</formatting:escape>','<formatting:escape language="javascript">${row.solution}</formatting:escape>','<formatting:escape language="javascript">${row.classTypeID}</formatting:escape>',this.form);"/>
                                <input type="checkbox" name="selectedRows" value="${row.id}" onclick="verifyEnableDelete(this);"/>
                            </nobr>
                        </display:column>
                        <display:column media="xml csv excel pdf" titleKey="class.time.day">${dayFormatted}</display:column>
                        <display:column media="html"
                            headerClass="day" paramId="day" maxLength="36"
                            sortProperty="day" sortable="true"
                            titleKey="class.time.day"><nobr>${dayFormatted}</nobr></display:column>
                        <display:column media="xml csv excel pdf"
                            property="time"
                            titleKey="class.time.time"/>
                        <display:column media="html"
                            headerClass="time" paramId="time" maxLength="36"
                            sortProperty="time" sortable="true"
                            titleKey="class.time.time"><nobr><formatting:escape language="javascript,html">${row.time}</formatting:escape></nobr></display:column>
                        <display:column media="xml csv excel pdf"
                            property="duration"
                            titleKey="class.time.duration"/>
                        <display:column media="html"
                            headerClass="duration" paramId="duration" maxLength="36"
                            sortProperty="duration" sortable="true"
                            titleKey="class.time.duration"><nobr><formatting:escape language="javascript,html">${row.duration}</formatting:escape></nobr></display:column>
                        <display:column media="html" headerClass="fixed" titleKey="class.time.fixed">
                            <c:choose>
                                <c:when test="${row.fixed}"><input type="checkbox" checked="checked" disabled="disabled"/></c:when>
                                <c:otherwise><input type="checkbox" disabled="disabled"/></c:otherwise>
                            </c:choose>
                        </display:column>
                        <display:column media="xml csv excel pdf"
                            property="fixed" titleKey="class.time.fixed"/>
                        <display:column media="html" headerClass="tipic" titleKey="class.time.tipic">
                            <c:choose>
                                <c:when test="${row.tipic}"><input type="checkbox" checked="checked" disabled="disabled"/></c:when>
                                <c:otherwise><input type="checkbox" disabled="disabled"/></c:otherwise>
                            </c:choose>
                        </display:column>
                        <display:column media="xml csv excel pdf"
                            property="tipic" titleKey="class.time.tipic"/>
                        <display:column media="xml csv excel pdf"
                            property="groupIdLabel"
                            titleKey="class.time.group.id"/>
                        <display:column media="html"
                            headerClass="groupId" paramId="groupId" maxLength="36"
                            sortProperty="groupIdLabel" sortable="true"
                            titleKey="class.time.group.id"><nobr><formatting:escape language="javascript,html">${row.groupIdLabel}</formatting:escape></nobr></display:column>
                        <display:column media="xml csv excel pdf"
                            property="teacherIdLabel"
                            titleKey="class.time.teacher.id"/>
                        <display:column media="html"
                            headerClass="teacherId" paramId="teacherId" maxLength="36"
                            sortProperty="teacherIdLabel" sortable="true"
                            titleKey="class.time.teacher.id"><nobr><formatting:escape language="javascript,html">${row.teacherIdLabel}</formatting:escape></nobr></display:column>
                        <display:column media="xml csv excel pdf"
                            property="subjectIdLabel"
                            titleKey="class.time.subject.id"/>
                        <display:column media="html"
                            headerClass="subjectId" paramId="subjectId" maxLength="36"
                            sortProperty="subjectIdLabel" sortable="true"
                            titleKey="class.time.subject.id"><nobr><formatting:escape language="javascript,html">${row.subjectIdLabel}</formatting:escape></nobr></display:column>
                        <display:column media="xml csv excel pdf"
                            property="roomIdLabel"
                            titleKey="class.time.room.id"/>
                        <display:column media="html"
                            headerClass="roomId" paramId="roomId" maxLength="36"
                            sortProperty="roomIdLabel" sortable="true"
                            titleKey="class.time.room.id"><nobr><formatting:escape language="javascript,html">${row.roomIdLabel}</formatting:escape></nobr></display:column>
                        <display:column media="xml csv excel pdf"
                            property="solutionLabel"
                            titleKey="class.time.solution"/>
                        <display:column media="html"
                            headerClass="solution" paramId="solution" maxLength="36"
                            sortProperty="solutionLabel" sortable="true"
                            titleKey="class.time.solution"><nobr><formatting:escape language="javascript,html">${row.solutionLabel}</formatting:escape></nobr></display:column>
                        <display:column media="xml csv excel pdf"
                            property="classTypeIDLabel"
                            titleKey="class.time.class.type.id"/>
                        <display:column media="html"
                            headerClass="classTypeID" paramId="classTypeID" maxLength="36"
                            sortProperty="classTypeIDLabel" sortable="true"
                            titleKey="class.time.class.type.id"><nobr><formatting:escape language="javascript,html">${row.classTypeIDLabel}</formatting:escape></nobr></display:column>
                    </display:table>
                </c:if>
            </div>

        </html:form>

        <div id="pageHelpSection">
            <blockquote>
                <a href="" id="pageHelp" style="display:inline;" onclick="openWindow('<html:rewrite action="/ClassTime/ManageHelp"/>','onlinehelp',true,false,760,540); return false;">
                    <bean:message key="online.help.href"/>
                </a>
                <html:img page="/layout/help.gif" style="display:inline;"/>
            </blockquote>
        </div>

    </tiles:put>

</tiles:insert>

