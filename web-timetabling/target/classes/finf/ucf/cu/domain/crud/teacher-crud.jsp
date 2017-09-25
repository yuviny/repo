<%@ include file="/taglib-imports.jspf" %>
<tiles:insert definition="main.layout">

    <tiles:put name="title" type="string">
        <bean:message key="teacher.page.title"/>
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

            function setAction(crud) { document.forms['manageTeacherForm'].elements['crud'].value = crud; }

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

            function setFields(email,name,firstName,lastName,grade,id,departmentId,form)
            {
                form.elements["email"].value = email;
                form.elements["name"].value = name;
                form.elements["firstName"].value = firstName;
                form.elements["lastName"].value = lastName;
                form.elements["grade"].value = grade;
                form.elements["id"].value = id;
                setSelect(false,form,"departmentId",departmentId);
            }
        //-->
        </script>
    </tiles:put>

    <tiles:put name="body" type="string">

        <div>
            <h1><bean:message key="teacher.page.title"/></h1>
        </div>

        <html:form styleId="manageTeacherForm" action="/Teacher/Manage" method="post">
            <input type="hidden" name="crud" value=""/>
            <div id="criteria">
                <c:if test="${!empty manageableForm}">
                    <table>
                        <tr>
                            <td><nobr><bean:message key="teacher.email"/> <div class="important">*</div></nobr></td>
                            <td>
                                <html:text name="manageableForm" property="email" styleClass="criteriaField" styleId="email"/>
                            </td>
                        </tr>
                        <tr>
                            <td><nobr><bean:message key="teacher.name"/> <div class="important">*</div></nobr></td>
                            <td>
                                <html:text name="manageableForm" property="name" styleClass="criteriaField" styleId="name"/>
                            </td>
                        </tr>
                        <tr>
                            <td><bean:message key="teacher.first.name"/></td>
                            <td>
                                <html:text name="manageableForm" property="firstName" styleClass="criteriaField" styleId="firstName"/>
                            </td>
                        </tr>
                        <tr>
                            <td><bean:message key="teacher.last.name"/></td>
                            <td>
                                <html:text name="manageableForm" property="lastName" styleClass="criteriaField" styleId="lastName"/>
                            </td>
                        </tr>
                        <tr>
                            <td><bean:message key="teacher.grade"/></td>
                            <td>
                                <html:text name="manageableForm" property="grade" styleClass="criteriaField" styleId="grade"/>
                            </td>
                        </tr>
                    <html:hidden name="manageableForm" property="id"/>
                        <tr>
                            <td>
                                <logic:present role="administrador">
                                    <html:link action="/Department/Manage"><bean:message key="teacher.department.id"/></html:link>
                                </logic:present>
                                <logic:notPresent role="administrador">
                                    <bean:message key="teacher.department.id"/>
                                </logic:notPresent>
                            </td>
                            <td>
                                <c:choose>
                                    <c:when test="${empty manageableForm.departmentIdBackingList}">
                                        <select name="departmentId" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="departmentId">
                                            <option value=""><bean:message key="select.option.blank"/></option>
                                            <c:forEach var="valueLabel" items="${manageableForm.departmentIdBackingList}">
                                                <c:choose>
                                                    <c:when test="${valueLabel[0] eq manageableForm.departmentId}">
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
        <select onchange="document.location=this.options[this.selectedIndex].value+'?ref_Teacher='+this.form.elements['id'].value;">
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
            <option selected="selected" value="<html:rewrite page="/Teacher/Manage.do"/>"><bean:message key="teacher"/></option>
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
                                <input type="radio" name="_copy" onclick="enableUpdate(true);setFields('<formatting:escape language="javascript">${row.email}</formatting:escape>','<formatting:escape language="javascript">${row.name}</formatting:escape>','<formatting:escape language="javascript">${row.firstName}</formatting:escape>','<formatting:escape language="javascript">${row.lastName}</formatting:escape>','<formatting:escape language="javascript">${row.grade}</formatting:escape>','<formatting:escape language="javascript">${row.id}</formatting:escape>','<formatting:escape language="javascript">${row.departmentId}</formatting:escape>',this.form);"/>
                                <input type="checkbox" name="selectedRows" value="${row.id}" onclick="verifyEnableDelete(this);"/>
                            </nobr>
                        </display:column>
                        <display:column media="xml csv excel pdf"
                            property="email"
                            titleKey="teacher.email"/>
                        <display:column media="html"
                            headerClass="email" paramId="email" maxLength="36"
                            sortProperty="email" sortable="true"
                            titleKey="teacher.email"><nobr><formatting:escape language="javascript,html">${row.email}</formatting:escape></nobr></display:column>
                        <display:column media="xml csv excel pdf"
                            property="name"
                            titleKey="teacher.name"/>
                        <display:column media="html"
                            headerClass="name" paramId="name" maxLength="36"
                            sortProperty="name" sortable="true"
                            titleKey="teacher.name"><nobr><formatting:escape language="javascript,html">${row.name}</formatting:escape></nobr></display:column>
                        <display:column media="xml csv excel pdf"
                            property="firstName"
                            titleKey="teacher.first.name"/>
                        <display:column media="html"
                            headerClass="firstName" paramId="firstName" maxLength="36"
                            sortProperty="firstName" sortable="true"
                            titleKey="teacher.first.name"><nobr><formatting:escape language="javascript,html">${row.firstName}</formatting:escape></nobr></display:column>
                        <display:column media="xml csv excel pdf"
                            property="lastName"
                            titleKey="teacher.last.name"/>
                        <display:column media="html"
                            headerClass="lastName" paramId="lastName" maxLength="36"
                            sortProperty="lastName" sortable="true"
                            titleKey="teacher.last.name"><nobr><formatting:escape language="javascript,html">${row.lastName}</formatting:escape></nobr></display:column>
                        <display:column media="xml csv excel pdf"
                            property="grade"
                            titleKey="teacher.grade"/>
                        <display:column media="html"
                            headerClass="grade" paramId="grade" maxLength="36"
                            sortProperty="grade" sortable="true"
                            titleKey="teacher.grade"><nobr><formatting:escape language="javascript,html">${row.grade}</formatting:escape></nobr></display:column>
                        <display:column media="xml csv excel pdf"
                            property="departmentIdLabel"
                            titleKey="teacher.department.id"/>
                        <display:column media="html"
                            headerClass="departmentId" paramId="departmentId" maxLength="36"
                            sortProperty="departmentIdLabel" sortable="true"
                            titleKey="teacher.department.id"><nobr><formatting:escape language="javascript,html">${row.departmentIdLabel}</formatting:escape></nobr></display:column>
                    </display:table>
                </c:if>
            </div>

        </html:form>

        <div id="pageHelpSection">
            <blockquote>
                <a href="" id="pageHelp" style="display:inline;" onclick="openWindow('<html:rewrite action="/Teacher/ManageHelp"/>','onlinehelp',true,false,760,540); return false;">
                    <bean:message key="online.help.href"/>
                </a>
                <html:img page="/layout/help.gif" style="display:inline;"/>
            </blockquote>
        </div>

    </tiles:put>

</tiles:insert>

