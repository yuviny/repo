<%@ include file="/taglib-imports.jspf" %>
<tiles:insert definition="main.layout">

    <tiles:put name="title" type="string">
        <bean:message key="activity.page.title"/>
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

            function setAction(crud) { document.forms['manageActivityForm'].elements['crud'].value = crud; }

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
                setFields("","","","","","","[]","",form);
            }

            function setFields(number,name,hour_cant,week,id,classTypeId,resources,themeId,form)
            {
                form.elements["number"].value = number;
                form.elements["name"].value = name;
                form.elements["hour_cant"].value = hour_cant;
                form.elements["week"].value = week;
                form.elements["id"].value = id;
                setSelect(false,form,"classTypeId",classTypeId);
                setSelect(true,form,"resources",resources.substring(1,resources.length-1).split(", "));
                setSelect(false,form,"themeId",themeId);
            }
        //-->
        </script>
    </tiles:put>

    <tiles:put name="body" type="string">

        <div>
            <h1><bean:message key="activity.page.title"/></h1>
        </div>

        <html:form styleId="manageActivityForm" action="/Activity/Manage" method="post">
            <input type="hidden" name="crud" value=""/>
            <div id="criteria">
                <c:if test="${!empty manageableForm}">
                    <table>
                        <tr>
                            <td><nobr><bean:message key="activity.number"/> <div class="important">*</div></nobr></td>
                            <td>
                                <html:text name="manageableForm" property="number" styleClass="criteriaField" styleId="number"/>
                            </td>
                        </tr>
                        <tr>
                            <td><nobr><bean:message key="activity.name"/> <div class="important">*</div></nobr></td>
                            <td>
                                <html:text name="manageableForm" property="name" styleClass="criteriaField" styleId="name"/>
                            </td>
                        </tr>
                        <tr>
                            <td><nobr><bean:message key="activity.hour.cant"/> <div class="important">*</div></nobr></td>
                            <td>
                                <html:text name="manageableForm" property="hour_cant" styleClass="criteriaField" styleId="hour_cant"/>
                            </td>
                        </tr>
                        <tr>
                            <td><nobr><bean:message key="activity.week"/> <div class="important">*</div></nobr></td>
                            <td>
                                <html:text name="manageableForm" property="week" styleClass="criteriaField" styleId="week"/>
                            </td>
                        </tr>
                    <html:hidden name="manageableForm" property="id"/>
                        <tr>
                            <td>
                                <logic:present role="administrador">
                                    <nobr><html:link action="/ClassType/Manage"><bean:message key="activity.class.type.id"/></html:link> <div class="important">*</div></nobr>
                                </logic:present>
                                <logic:notPresent role="administrador">
                                    <nobr><bean:message key="activity.class.type.id"/> <div class="important">*</div></nobr>
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
                                    <html:link action="/Resource/Manage"><bean:message key="activity.resources"/></html:link>
                                </logic:present>
                                <logic:notPresent role="administrador">
                                    <bean:message key="activity.resources"/>
                                </logic:notPresent>
                            </td>
                            <td>
                                <c:choose>
                                    <c:when test="${empty manageableForm.resourcesBackingList}">
                                        <select name="resources" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="resources" multiple="multiple">
                                            <c:forEach var="valueLabel" items="${manageableForm.resourcesBackingList}">
                        <option value="${valueLabel[0]}"<collections:contains item="${valueLabel}" array="${manageableForm.resources}"> selected="selected"</collections:contains>>${valueLabel[1]}</option>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <logic:present role="administrador">
                                    <nobr><html:link action="/Theme/Manage"><bean:message key="activity.theme.id"/></html:link> <div class="important">*</div></nobr>
                                </logic:present>
                                <logic:notPresent role="administrador">
                                    <nobr><bean:message key="activity.theme.id"/> <div class="important">*</div></nobr>
                                </logic:notPresent>
                            </td>
                            <td>
                                <c:choose>
                                    <c:when test="${empty manageableForm.themeIdBackingList}">
                                        <select name="themeId" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="themeId">
                                            <option value=""><bean:message key="select.option.blank"/></option>
                                            <c:forEach var="valueLabel" items="${manageableForm.themeIdBackingList}">
                                                <c:choose>
                                                    <c:when test="${valueLabel[0] eq manageableForm.themeId}">
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
        <select onchange="document.location=this.options[this.selectedIndex].value+'?ref_Activity='+this.form.elements['id'].value;">
        <logic:present role="administrador">
            <option selected="selected" value="<html:rewrite page="/Activity/Manage.do"/>"><bean:message key="activity"/></option>
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
                                <input type="radio" name="_copy" onclick="enableUpdate(true);setFields('<formatting:escape language="javascript">${row.number}</formatting:escape>','<formatting:escape language="javascript">${row.name}</formatting:escape>','<formatting:escape language="javascript">${row.hour_cant}</formatting:escape>','<formatting:escape language="javascript">${row.week}</formatting:escape>','<formatting:escape language="javascript">${row.id}</formatting:escape>','<formatting:escape language="javascript">${row.classTypeId}</formatting:escape>','<formatting:escape language="javascript">${row.resources}</formatting:escape>','<formatting:escape language="javascript">${row.themeId}</formatting:escape>',this.form);"/>
                                <input type="checkbox" name="selectedRows" value="${row.id}" onclick="verifyEnableDelete(this);"/>
                            </nobr>
                        </display:column>
                        <display:column media="xml csv excel pdf"
                            property="number"
                            titleKey="activity.number"/>
                        <display:column media="html"
                            headerClass="number" paramId="number" maxLength="36"
                            sortProperty="number" sortable="true"
                            titleKey="activity.number"><nobr><formatting:escape language="javascript,html">${row.number}</formatting:escape></nobr></display:column>
                        <display:column media="xml csv excel pdf"
                            property="name"
                            titleKey="activity.name"/>
                        <display:column media="html"
                            headerClass="name" paramId="name" maxLength="36"
                            sortProperty="name" sortable="true"
                            titleKey="activity.name"><nobr><formatting:escape language="javascript,html">${row.name}</formatting:escape></nobr></display:column>
                        <display:column media="xml csv excel pdf"
                            property="hour_cant"
                            titleKey="activity.hour.cant"/>
                        <display:column media="html"
                            headerClass="hour_cant" paramId="hour_cant" maxLength="36"
                            sortProperty="hour_cant" sortable="true"
                            titleKey="activity.hour.cant"><nobr><formatting:escape language="javascript,html">${row.hour_cant}</formatting:escape></nobr></display:column>
                        <display:column media="xml csv excel pdf"
                            property="week"
                            titleKey="activity.week"/>
                        <display:column media="html"
                            headerClass="week" paramId="week" maxLength="36"
                            sortProperty="week" sortable="true"
                            titleKey="activity.week"><nobr><formatting:escape language="javascript,html">${row.week}</formatting:escape></nobr></display:column>
                        <display:column media="xml csv excel pdf"
                            property="classTypeIdLabel"
                            titleKey="activity.class.type.id"/>
                        <display:column media="html"
                            headerClass="classTypeId" paramId="classTypeId" maxLength="36"
                            sortProperty="classTypeIdLabel" sortable="true"
                            titleKey="activity.class.type.id"><nobr><formatting:escape language="javascript,html">${row.classTypeIdLabel}</formatting:escape></nobr></display:column>
                        <display:column media="xml csv excel pdf"
                            property="resourcesLabels"
                            titleKey="activity.resources"/>
                        <display:column media="html"
                            headerClass="resources" paramId="resources" maxLength="36"
                            sortProperty="resourcesLabels" sortable="true"
                            titleKey="activity.resources"><nobr><formatting:escape language="javascript,html">${row.resourcesLabels}</formatting:escape></nobr></display:column>
                        <display:column media="xml csv excel pdf"
                            property="themeIdLabel"
                            titleKey="activity.theme.id"/>
                        <display:column media="html"
                            headerClass="themeId" paramId="themeId" maxLength="36"
                            sortProperty="themeIdLabel" sortable="true"
                            titleKey="activity.theme.id"><nobr><formatting:escape language="javascript,html">${row.themeIdLabel}</formatting:escape></nobr></display:column>
                    </display:table>
                </c:if>
            </div>

        </html:form>

        <div id="pageHelpSection">
            <blockquote>
                <a href="" id="pageHelp" style="display:inline;" onclick="openWindow('<html:rewrite action="/Activity/ManageHelp"/>','onlinehelp',true,false,760,540); return false;">
                    <bean:message key="online.help.href"/>
                </a>
                <html:img page="/layout/help.gif" style="display:inline;"/>
            </blockquote>
        </div>

    </tiles:put>

</tiles:insert>

