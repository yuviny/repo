<%@ include file="/taglib-imports.jspf" %>
<tiles:insert definition="main.layout">

    <tiles:put name="title" type="string">
        <bean:message key="impartition.plan.page.title"/>
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

            function setAction(crud) { document.forms['manageImpartitionPlanForm'].elements['crud'].value = crud; }

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
                setFields(false,"","","","","","",form);
            }

            function setFields(teacherallclasetype,id,subjectId,teacherId,classTypeId,groupId,semesterId,form)
            {
                form.elements["teacherallclasetype"].checked = teacherallclasetype;
                form.elements["id"].value = id;
                setSelect(false,form,"subjectId",subjectId);
                setSelect(false,form,"teacherId",teacherId);
                setSelect(false,form,"classTypeId",classTypeId);
                setSelect(false,form,"groupId",groupId);
                setSelect(false,form,"semesterId",semesterId);
            }
        //-->
        </script>
    </tiles:put>

    <tiles:put name="body" type="string">

        <div>
            <h1><bean:message key="impartition.plan.page.title"/></h1>
        </div>

        <html:form styleId="manageImpartitionPlanForm" action="/ImpartitionPlan/Manage" method="post">
            <input type="hidden" name="crud" value=""/>
            <div id="criteria">
                <c:if test="${!empty manageableForm}">
                    <table>
                        <tr>
                            <td><bean:message key="impartition.plan.teacherallclasetype"/></td>
                            <td>
                                <html:checkbox name="manageableForm" property="teacherallclasetype" styleClass="criteriaField" styleId="teacherallclasetype"/>
                            </td>
                        </tr>
                    <html:hidden name="manageableForm" property="id"/>
                        <tr>
                            <td>
                                <logic:present role="administrador">
                                    <nobr><html:link action="/Subject/Manage"><bean:message key="impartition.plan.subject.id"/></html:link> <div class="important">*</div></nobr>
                                </logic:present>
                                <logic:notPresent role="administrador">
                                    <nobr><bean:message key="impartition.plan.subject.id"/> <div class="important">*</div></nobr>
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
                                    <nobr><html:link action="/Teacher/Manage"><bean:message key="impartition.plan.teacher.id"/></html:link> <div class="important">*</div></nobr>
                                </logic:present>
                                <logic:notPresent role="administrador">
                                    <nobr><bean:message key="impartition.plan.teacher.id"/> <div class="important">*</div></nobr>
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
                                    <html:link action="/ClassType/Manage"><bean:message key="impartition.plan.class.type.id"/></html:link>
                                </logic:present>
                                <logic:notPresent role="administrador">
                                    <bean:message key="impartition.plan.class.type.id"/>
                                </logic:notPresent>
                            </td>
                            <td>
                                <c:choose>
                                    <c:when test="${empty manageableForm.classTypeIdBackingList}">
                                        <select name="classTypeId" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="classTypeId">
                                            <option value=""><bean:message key="select.option.blank"/></option>
                                            <c:forEach var="valueLabel" items="${manageableForm.classTypeIdBackingList}">
                                                <c:choose>
                                                    <c:when test="${valueLabel[0] eq manageableForm.classTypeId}">
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
                                    <nobr><html:link action="/Group/Manage"><bean:message key="impartition.plan.group.id"/></html:link> <div class="important">*</div></nobr>
                                </logic:present>
                                <logic:notPresent role="administrador">
                                    <nobr><bean:message key="impartition.plan.group.id"/> <div class="important">*</div></nobr>
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
                                    <nobr><html:link action="/Semester/Manage"><bean:message key="impartition.plan.semester.id"/></html:link> <div class="important">*</div></nobr>
                                </logic:present>
                                <logic:notPresent role="administrador">
                                    <nobr><bean:message key="impartition.plan.semester.id"/> <div class="important">*</div></nobr>
                                </logic:notPresent>
                            </td>
                            <td>
                                <c:choose>
                                    <c:when test="${empty manageableForm.semesterIdBackingList}">
                                        <select name="semesterId" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="semesterId">
                                            <option value=""><bean:message key="select.option.blank"/></option>
                                            <c:forEach var="valueLabel" items="${manageableForm.semesterIdBackingList}">
                                                <c:choose>
                                                    <c:when test="${valueLabel[0] eq manageableForm.semesterId}">
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
        <select onchange="document.location=this.options[this.selectedIndex].value+'?ref_ImpartitionPlan='+this.form.elements['id'].value;">
        <logic:present role="administrador">
            <option value="<html:rewrite page="/Activity/Manage.do"/>"><bean:message key="activity"/></option>
        </logic:present>
        <logic:present role="administrador">
            <option value="<html:rewrite page="/Building/Manage.do"/>"><bean:message key="building"/></option>
        </logic:present>
        <logic:present role="administrador">
            <option value="<html:rewrite page="/ClassTime/Manage.do"/>"><bean:message key="class.time"/></option>
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
            <option selected="selected" value="<html:rewrite page="/ImpartitionPlan/Manage.do"/>"><bean:message key="impartition.plan"/></option>
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
                            <nobr>
                                <input type="radio" name="_copy" onclick="enableUpdate(true);setFields(${row.teacherallclasetype},'<formatting:escape language="javascript">${row.id}</formatting:escape>','<formatting:escape language="javascript">${row.subjectId}</formatting:escape>','<formatting:escape language="javascript">${row.teacherId}</formatting:escape>','<formatting:escape language="javascript">${row.classTypeId}</formatting:escape>','<formatting:escape language="javascript">${row.groupId}</formatting:escape>','<formatting:escape language="javascript">${row.semesterId}</formatting:escape>',this.form);"/>
                                <input type="checkbox" name="selectedRows" value="${row.id}" onclick="verifyEnableDelete(this);"/>
                            </nobr>
                        </display:column>
                        <display:column media="html" headerClass="teacherallclasetype" titleKey="impartition.plan.teacherallclasetype">
                            <c:choose>
                                <c:when test="${row.teacherallclasetype}"><input type="checkbox" checked="checked" disabled="disabled"/></c:when>
                                <c:otherwise><input type="checkbox" disabled="disabled"/></c:otherwise>
                            </c:choose>
                        </display:column>
                        <display:column media="xml csv excel pdf"
                            property="teacherallclasetype" titleKey="impartition.plan.teacherallclasetype"/>
                        <display:column media="xml csv excel pdf"
                            property="subjectIdLabel"
                            titleKey="impartition.plan.subject.id"/>
                        <display:column media="html"
                            headerClass="subjectId" paramId="subjectId" maxLength="36"
                            sortProperty="subjectIdLabel" sortable="true"
                            titleKey="impartition.plan.subject.id"><nobr><formatting:escape language="javascript,html">${row.subjectIdLabel}</formatting:escape></nobr></display:column>
                        <display:column media="xml csv excel pdf"
                            property="teacherIdLabel"
                            titleKey="impartition.plan.teacher.id"/>
                        <display:column media="html"
                            headerClass="teacherId" paramId="teacherId" maxLength="36"
                            sortProperty="teacherIdLabel" sortable="true"
                            titleKey="impartition.plan.teacher.id"><nobr><formatting:escape language="javascript,html">${row.teacherIdLabel}</formatting:escape></nobr></display:column>
                        <display:column media="xml csv excel pdf"
                            property="classTypeIdLabel"
                            titleKey="impartition.plan.class.type.id"/>
                        <display:column media="html"
                            headerClass="classTypeId" paramId="classTypeId" maxLength="36"
                            sortProperty="classTypeIdLabel" sortable="true"
                            titleKey="impartition.plan.class.type.id"><nobr><formatting:escape language="javascript,html">${row.classTypeIdLabel}</formatting:escape></nobr></display:column>
                        <display:column media="xml csv excel pdf"
                            property="groupIdLabel"
                            titleKey="impartition.plan.group.id"/>
                        <display:column media="html"
                            headerClass="groupId" paramId="groupId" maxLength="36"
                            sortProperty="groupIdLabel" sortable="true"
                            titleKey="impartition.plan.group.id"><nobr><formatting:escape language="javascript,html">${row.groupIdLabel}</formatting:escape></nobr></display:column>
                        <display:column media="xml csv excel pdf"
                            property="semesterIdLabel"
                            titleKey="impartition.plan.semester.id"/>
                        <display:column media="html"
                            headerClass="semesterId" paramId="semesterId" maxLength="36"
                            sortProperty="semesterIdLabel" sortable="true"
                            titleKey="impartition.plan.semester.id"><nobr><formatting:escape language="javascript,html">${row.semesterIdLabel}</formatting:escape></nobr></display:column>
                    </display:table>
                </c:if>
            </div>

        </html:form>

        <div id="pageHelpSection">
            <blockquote>
                <a href="" id="pageHelp" style="display:inline;" onclick="openWindow('<html:rewrite action="/ImpartitionPlan/ManageHelp"/>','onlinehelp',true,false,760,540); return false;">
                    <bean:message key="online.help.href"/>
                </a>
                <html:img page="/layout/help.gif" style="display:inline;"/>
            </blockquote>
        </div>

    </tiles:put>

</tiles:insert>

