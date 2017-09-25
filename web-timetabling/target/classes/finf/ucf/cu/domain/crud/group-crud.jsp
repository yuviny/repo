<%@ include file="/taglib-imports.jspf" %>
<tiles:insert definition="main.layout">

    <tiles:put name="title" type="string">
        <bean:message key="group.page.title"/>
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

            function setAction(crud) { document.forms['manageGroupForm'].elements['crud'].value = crud; }

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
                setFields("","","","","","","",form);
            }

            function setFields(name,size,abbreviation,dateBegin1Semester,dateBegin2Semester,id,subGroupId,form)
            {
                form.elements["name"].value = name;
                form.elements["size"].value = size;
                form.elements["abbreviation"].value = abbreviation;
                form.elements["dateBegin1SemesterAsString"].value = dateBegin1Semester;
                form.elements["dateBegin2SemesterAsString"].value = dateBegin2Semester;
                form.elements["id"].value = id;
                setSelect(false,form,"subGroupId",subGroupId);
            }
        //-->
        </script>
    </tiles:put>

    <tiles:put name="body" type="string">

        <div>
            <h1><bean:message key="group.page.title"/></h1>
        </div>

        <html:form styleId="manageGroupForm" action="/Group/Manage" method="post">
            <input type="hidden" name="crud" value=""/>
            <div id="criteria">
                <c:if test="${!empty manageableForm}">
                    <table>
                        <tr>
                            <td><nobr><bean:message key="group.name"/> <div class="important">*</div></nobr></td>
                            <td>
                                <html:text name="manageableForm" property="name" styleClass="criteriaField" styleId="name"/>
                            </td>
                        </tr>
                        <tr>
                            <td><nobr><bean:message key="group.size"/> <div class="important">*</div></nobr></td>
                            <td>
                                <html:text name="manageableForm" property="size" styleClass="criteriaField" styleId="size"/>
                            </td>
                        </tr>
                        <tr>
                            <td><nobr><bean:message key="group.abbreviation"/> <div class="important">*</div></nobr></td>
                            <td>
                                <html:text name="manageableForm" property="abbreviation" styleClass="criteriaField" styleId="abbreviation"/>
                            </td>
                        </tr>
                        <tr>
                            <td><nobr><bean:message key="group.date.begin1.semester"/> <div class="important">*</div></nobr></td>
                            <td>
                                <html:text name="manageableForm" property="dateBegin1SemesterAsString" styleClass="criteriaField" styleId="dateBegin1Semester"/>
                                <html:img page="/layout/calendar/calendar.gif" styleId="dateBegin1Semester_trigger" styleClass="calendar"/>
                                <script type="text/javascript">
                                //<!--
                                    Calendar.setup({
                                        inputField     :    "dateBegin1Semester",
                                        ifFormat       :    "%d/%m/%Y",
                                        daFormat       :    "%d/%m/%Y",
                                        showsTime      :    false,
                                        button         :    "dateBegin1Semester_trigger",
                                        singleClick    :    true
                                    });
                                //-->
                                </script>
                            </td>
                        </tr>
                        <tr>
                            <td><nobr><bean:message key="group.date.begin2.semester"/> <div class="important">*</div></nobr></td>
                            <td>
                                <html:text name="manageableForm" property="dateBegin2SemesterAsString" styleClass="criteriaField" styleId="dateBegin2Semester"/>
                                <html:img page="/layout/calendar/calendar.gif" styleId="dateBegin2Semester_trigger" styleClass="calendar"/>
                                <script type="text/javascript">
                                //<!--
                                    Calendar.setup({
                                        inputField     :    "dateBegin2Semester",
                                        ifFormat       :    "%d/%m/%Y",
                                        daFormat       :    "%d/%m/%Y",
                                        showsTime      :    false,
                                        button         :    "dateBegin2Semester_trigger",
                                        singleClick    :    true
                                    });
                                //-->
                                </script>
                            </td>
                        </tr>
                    <html:hidden name="manageableForm" property="id"/>
                        <tr>
                            <td>
                                <logic:present role="administrador">
                                    <html:link action="/Group/Manage"><bean:message key="group.sub.group.id"/></html:link>
                                </logic:present>
                                <logic:notPresent role="administrador">
                                    <bean:message key="group.sub.group.id"/>
                                </logic:notPresent>
                            </td>
                            <td>
                                <c:choose>
                                    <c:when test="${empty manageableForm.subGroupIdBackingList}">
                                        <select name="subGroupId" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="subGroupId">
                                            <option value=""><bean:message key="select.option.blank"/></option>
                                            <c:forEach var="valueLabel" items="${manageableForm.subGroupIdBackingList}">
                                                <c:choose>
                                                    <c:when test="${valueLabel[0] eq manageableForm.subGroupId}">
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
        <select onchange="document.location=this.options[this.selectedIndex].value+'?ref_Group='+this.form.elements['id'].value;">
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
            <option selected="selected" value="<html:rewrite page="/Group/Manage.do"/>"><bean:message key="group"/></option>
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
                            <fmt:formatDate var="dateBegin1SemesterFormatted" value="${row.dateBegin1Semester}" pattern="dd/MM/yyyy"/>
                            <fmt:formatDate var="dateBegin2SemesterFormatted" value="${row.dateBegin2Semester}" pattern="dd/MM/yyyy"/>
                            <nobr>
                                <input type="radio" name="_copy" onclick="enableUpdate(true);setFields('<formatting:escape language="javascript">${row.name}</formatting:escape>','<formatting:escape language="javascript">${row.size}</formatting:escape>','<formatting:escape language="javascript">${row.abbreviation}</formatting:escape>','<formatting:escape language="javascript">${dateBegin1SemesterFormatted}</formatting:escape>','<formatting:escape language="javascript">${dateBegin2SemesterFormatted}</formatting:escape>','<formatting:escape language="javascript">${row.id}</formatting:escape>','<formatting:escape language="javascript">${row.subGroupId}</formatting:escape>',this.form);"/>
                                <input type="checkbox" name="selectedRows" value="${row.id}" onclick="verifyEnableDelete(this);"/>
                            </nobr>
                        </display:column>
                        <display:column media="xml csv excel pdf"
                            property="name"
                            titleKey="group.name"/>
                        <display:column media="html"
                            headerClass="name" paramId="name" maxLength="36"
                            sortProperty="name" sortable="true"
                            titleKey="group.name"><nobr><formatting:escape language="javascript,html">${row.name}</formatting:escape></nobr></display:column>
                        <display:column media="xml csv excel pdf"
                            property="size"
                            titleKey="group.size"/>
                        <display:column media="html"
                            headerClass="size" paramId="size" maxLength="36"
                            sortProperty="size" sortable="true"
                            titleKey="group.size"><nobr><formatting:escape language="javascript,html">${row.size}</formatting:escape></nobr></display:column>
                        <display:column media="xml csv excel pdf"
                            property="abbreviation"
                            titleKey="group.abbreviation"/>
                        <display:column media="html"
                            headerClass="abbreviation" paramId="abbreviation" maxLength="36"
                            sortProperty="abbreviation" sortable="true"
                            titleKey="group.abbreviation"><nobr><formatting:escape language="javascript,html">${row.abbreviation}</formatting:escape></nobr></display:column>
                        <display:column media="xml csv excel pdf" titleKey="group.date.begin1.semester">${dateBegin1SemesterFormatted}</display:column>
                        <display:column media="html"
                            headerClass="dateBegin1Semester" paramId="dateBegin1Semester" maxLength="36"
                            sortProperty="dateBegin1Semester" sortable="true"
                            titleKey="group.date.begin1.semester"><nobr>${dateBegin1SemesterFormatted}</nobr></display:column>
                        <display:column media="xml csv excel pdf" titleKey="group.date.begin2.semester">${dateBegin2SemesterFormatted}</display:column>
                        <display:column media="html"
                            headerClass="dateBegin2Semester" paramId="dateBegin2Semester" maxLength="36"
                            sortProperty="dateBegin2Semester" sortable="true"
                            titleKey="group.date.begin2.semester"><nobr>${dateBegin2SemesterFormatted}</nobr></display:column>
                        <display:column media="xml csv excel pdf"
                            property="subGroupIdLabel"
                            titleKey="group.sub.group.id"/>
                        <display:column media="html"
                            headerClass="subGroupId" paramId="subGroupId" maxLength="36"
                            sortProperty="subGroupIdLabel" sortable="true"
                            titleKey="group.sub.group.id"><nobr><formatting:escape language="javascript,html">${row.subGroupIdLabel}</formatting:escape></nobr></display:column>
                    </display:table>
                </c:if>
            </div>

        </html:form>

        <div id="pageHelpSection">
            <blockquote>
                <a href="" id="pageHelp" style="display:inline;" onclick="openWindow('<html:rewrite action="/Group/ManageHelp"/>','onlinehelp',true,false,760,540); return false;">
                    <bean:message key="online.help.href"/>
                </a>
                <html:img page="/layout/help.gif" style="display:inline;"/>
            </blockquote>
        </div>

    </tiles:put>

</tiles:insert>

