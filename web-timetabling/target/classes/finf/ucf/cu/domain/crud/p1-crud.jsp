<%@ include file="/taglib-imports.jspf" %>
<tiles:insert definition="main.layout">

    <tiles:put name="title" type="string">
        <bean:message key="p1.page.title"/>
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

            function setAction(crud) { document.forms['manageP1Form'].elements['crud'].value = crud; }

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
                setFields("","","","","","",form);
            }

            function setFields(name,endDate,approved_by,id,subjectId,teacher,form)
            {
                form.elements["name"].value = name;
                form.elements["endDateAsString"].value = endDate;
                form.elements["approved_by"].value = approved_by;
                form.elements["id"].value = id;
                setSelect(false,form,"subjectId",subjectId);
                setSelect(false,form,"teacher",teacher);
            }
        //-->
        </script>
    </tiles:put>

    <tiles:put name="body" type="string">

        <div>
            <h1><bean:message key="p1.page.title"/></h1>
        </div>

        <html:form styleId="manageP1Form" action="/P1/Manage" method="post">
            <input type="hidden" name="crud" value=""/>
            <div id="criteria">
                <c:if test="${!empty manageableForm}">
                    <table>
                        <tr>
                            <td><nobr><bean:message key="p1.name"/> <div class="important">*</div></nobr></td>
                            <td>
                                <html:text name="manageableForm" property="name" styleClass="criteriaField" styleId="name"/>
                            </td>
                        </tr>
                        <tr>
                            <td><nobr><bean:message key="p1.end.date"/> <div class="important">*</div></nobr></td>
                            <td>
                                <html:text name="manageableForm" property="endDateAsString" styleClass="criteriaField" styleId="endDate"/>
                                <html:img page="/layout/calendar/calendar.gif" styleId="endDate_trigger" styleClass="calendar"/>
                                <script type="text/javascript">
                                //<!--
                                    Calendar.setup({
                                        inputField     :    "endDate",
                                        ifFormat       :    "%d/%m/%Y",
                                        daFormat       :    "%d/%m/%Y",
                                        showsTime      :    false,
                                        button         :    "endDate_trigger",
                                        singleClick    :    true
                                    });
                                //-->
                                </script>
                            </td>
                        </tr>
                        <tr>
                            <td><nobr><bean:message key="p1.approved.by"/> <div class="important">*</div></nobr></td>
                            <td>
                                <html:text name="manageableForm" property="approved_by" styleClass="criteriaField" styleId="approved_by"/>
                            </td>
                        </tr>
                    <html:hidden name="manageableForm" property="id"/>
                        <tr>
                            <td>
                                <logic:present role="administrador">
                                    <nobr><html:link action="/Subject/Manage"><bean:message key="p1.subject.id"/></html:link> <div class="important">*</div></nobr>
                                </logic:present>
                                <logic:notPresent role="administrador">
                                    <nobr><bean:message key="p1.subject.id"/> <div class="important">*</div></nobr>
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
                                    <html:link action="/Teacher/Manage"><bean:message key="p1.teacher"/></html:link>
                                </logic:present>
                                <logic:notPresent role="administrador">
                                    <bean:message key="p1.teacher"/>
                                </logic:notPresent>
                            </td>
                            <td>
                                <c:choose>
                                    <c:when test="${empty manageableForm.teacherBackingList}">
                                        <select name="teacher" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="teacher">
                                            <option value=""><bean:message key="select.option.blank"/></option>
                                            <c:forEach var="valueLabel" items="${manageableForm.teacherBackingList}">
                                                <c:choose>
                                                    <c:when test="${valueLabel[0] eq manageableForm.teacher}">
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
        <select onchange="document.location=this.options[this.selectedIndex].value+'?ref_P1='+this.form.elements['id'].value;">
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
            <option value="<html:rewrite page="/ImpartitionPlan/Manage.do"/>"><bean:message key="impartition.plan"/></option>
        </logic:present>
        <logic:present role="administrador">
            <option value="<html:rewrite page="/NotAvalability/Manage.do"/>"><bean:message key="not.avalability"/></option>
        </logic:present>
        <logic:present role="administrador">
            <option selected="selected" value="<html:rewrite page="/P1/Manage.do"/>"><bean:message key="p1"/></option>
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
                            <fmt:formatDate var="endDateFormatted" value="${row.endDate}" pattern="dd/MM/yyyy"/>
                            <nobr>
                                <input type="radio" name="_copy" onclick="enableUpdate(true);setFields('<formatting:escape language="javascript">${row.name}</formatting:escape>','<formatting:escape language="javascript">${endDateFormatted}</formatting:escape>','<formatting:escape language="javascript">${row.approved_by}</formatting:escape>','<formatting:escape language="javascript">${row.id}</formatting:escape>','<formatting:escape language="javascript">${row.subjectId}</formatting:escape>','<formatting:escape language="javascript">${row.teacher}</formatting:escape>',this.form);"/>
                                <input type="checkbox" name="selectedRows" value="${row.id}" onclick="verifyEnableDelete(this);"/>
                            </nobr>
                        </display:column>
                        <display:column media="xml csv excel pdf"
                            property="name"
                            titleKey="p1.name"/>
                        <display:column media="html"
                            headerClass="name" paramId="name" maxLength="36"
                            sortProperty="name" sortable="true"
                            titleKey="p1.name"><nobr><formatting:escape language="javascript,html">${row.name}</formatting:escape></nobr></display:column>
                        <display:column media="xml csv excel pdf" titleKey="p1.end.date">${endDateFormatted}</display:column>
                        <display:column media="html"
                            headerClass="endDate" paramId="endDate" maxLength="36"
                            sortProperty="endDate" sortable="true"
                            titleKey="p1.end.date"><nobr>${endDateFormatted}</nobr></display:column>
                        <display:column media="xml csv excel pdf"
                            property="approved_by"
                            titleKey="p1.approved.by"/>
                        <display:column media="html"
                            headerClass="approved_by" paramId="approved_by" maxLength="36"
                            sortProperty="approved_by" sortable="true"
                            titleKey="p1.approved.by"><nobr><formatting:escape language="javascript,html">${row.approved_by}</formatting:escape></nobr></display:column>
                        <display:column media="xml csv excel pdf"
                            property="subjectIdLabel"
                            titleKey="p1.subject.id"/>
                        <display:column media="html"
                            headerClass="subjectId" paramId="subjectId" maxLength="36"
                            sortProperty="subjectIdLabel" sortable="true"
                            titleKey="p1.subject.id"><nobr><formatting:escape language="javascript,html">${row.subjectIdLabel}</formatting:escape></nobr></display:column>
                        <display:column media="xml csv excel pdf"
                            property="teacherLabel"
                            titleKey="p1.teacher"/>
                        <display:column media="html"
                            headerClass="teacher" paramId="teacher" maxLength="36"
                            sortProperty="teacherLabel" sortable="true"
                            titleKey="p1.teacher"><nobr><formatting:escape language="javascript,html">${row.teacherLabel}</formatting:escape></nobr></display:column>
                    </display:table>
                </c:if>
            </div>

        </html:form>

        <div id="pageHelpSection">
            <blockquote>
                <a href="" id="pageHelp" style="display:inline;" onclick="openWindow('<html:rewrite action="/P1/ManageHelp"/>','onlinehelp',true,false,760,540); return false;">
                    <bean:message key="online.help.href"/>
                </a>
                <html:img page="/layout/help.gif" style="display:inline;"/>
            </blockquote>
        </div>

    </tiles:put>

</tiles:insert>

