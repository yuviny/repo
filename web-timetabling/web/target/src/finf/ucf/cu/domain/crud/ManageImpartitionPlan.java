// license-header java merge-point
package finf.ucf.cu.domain.crud;

import org.apache.struts.actions.DispatchAction;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;

public final class ManageImpartitionPlan extends DispatchAction
{
    public ActionForward execute(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        request.getSession().setAttribute("manageableForm", actionForm);
        return super.execute(mapping, actionForm, request, response);
    }

    public ActionForward create(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final finf.ucf.cu.domain.crud.ImpartitionPlanForm form = (finf.ucf.cu.domain.crud.ImpartitionPlanForm)actionForm;

        finf.ucf.cu.ManageableServiceLocator.instance().getImpartitionPlanManageableService().create(
            (StringUtils.isBlank(request.getParameter("teacherallclasetype"))) ? null : form.getTeacherallclasetype()
            , (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("subjectId"))) ? null : form.getSubjectId()
            , (StringUtils.isBlank(request.getParameter("teacherId"))) ? null : form.getTeacherId()
            , (StringUtils.isBlank(request.getParameter("classTypeId"))) ? null : form.getClassTypeId()
            , (StringUtils.isBlank(request.getParameter("groupId"))) ? null : form.getGroupId()
            , (StringUtils.isBlank(request.getParameter("semesterId"))) ? null : form.getSemesterId()
        );

        return preload(mapping, actionForm, request, response);
    }

    public ActionForward read(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final finf.ucf.cu.domain.crud.ImpartitionPlanForm form = (finf.ucf.cu.domain.crud.ImpartitionPlanForm)actionForm;

        final java.util.List list = finf.ucf.cu.ManageableServiceLocator.instance().getImpartitionPlanManageableService().read(
            (StringUtils.isBlank(request.getParameter("teacherallclasetype"))) ? null : form.getTeacherallclasetype()
            , (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("subjectId"))) ? null : form.getSubjectId()
            , (StringUtils.isBlank(request.getParameter("teacherId"))) ? null : form.getTeacherId()
            , (StringUtils.isBlank(request.getParameter("classTypeId"))) ? null : form.getClassTypeId()
            , (StringUtils.isBlank(request.getParameter("groupId"))) ? null : form.getGroupId()
            , (StringUtils.isBlank(request.getParameter("semesterId"))) ? null : form.getSemesterId()
        );
        form.setManageableList(list);

        if (list.size() >= 250)
        {
            saveMaxResultsWarning(request);
        }

        final java.util.Map backingLists = finf.ucf.cu.ManageableServiceLocator.instance().getImpartitionPlanManageableService().readBackingLists();
        form.setSubjectIdBackingList((java.util.List)backingLists.get("subjectId"));
        form.setTeacherIdBackingList((java.util.List)backingLists.get("teacherId"));
        form.setClassTypeIdBackingList((java.util.List)backingLists.get("classTypeId"));
        form.setGroupIdBackingList((java.util.List)backingLists.get("groupId"));
        form.setSemesterIdBackingList((java.util.List)backingLists.get("semesterId"));

        return mapping.getInputForward();
    }

    public ActionForward preload(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final finf.ucf.cu.domain.crud.ImpartitionPlanForm form = (finf.ucf.cu.domain.crud.ImpartitionPlanForm)actionForm;

        final java.util.List list = finf.ucf.cu.ManageableServiceLocator.instance().getImpartitionPlanManageableService().readAll();
        form.setManageableList(list);


        if (list.size() >= 250)
        {
            saveMaxResultsWarning(request);
        }

        final java.util.Map backingLists = finf.ucf.cu.ManageableServiceLocator.instance().getImpartitionPlanManageableService().readBackingLists();
        if (StringUtils.isNotBlank(request.getParameter("ref_Subject")))
        {
            form.setSubjectId(new java.lang.Long(request.getParameter("ref_Subject")));
        }
        form.setSubjectIdBackingList((java.util.List)backingLists.get("subjectId"));
        if (StringUtils.isNotBlank(request.getParameter("ref_Teacher")))
        {
            form.setTeacherId(new java.lang.Long(request.getParameter("ref_Teacher")));
        }
        form.setTeacherIdBackingList((java.util.List)backingLists.get("teacherId"));
        if (StringUtils.isNotBlank(request.getParameter("ref_ClassType")))
        {
            form.setClassTypeId(new java.lang.Long(request.getParameter("ref_ClassType")));
        }
        form.setClassTypeIdBackingList((java.util.List)backingLists.get("classTypeId"));
        if (StringUtils.isNotBlank(request.getParameter("ref_Group")))
        {
            form.setGroupId(new java.lang.Long(request.getParameter("ref_Group")));
        }
        form.setGroupIdBackingList((java.util.List)backingLists.get("groupId"));
        if (StringUtils.isNotBlank(request.getParameter("ref_Semester")))
        {
            form.setSemesterId(new java.lang.Long(request.getParameter("ref_Semester")));
        }
        form.setSemesterIdBackingList((java.util.List)backingLists.get("semesterId"));

        return mapping.getInputForward();
    }

    protected ActionForward unspecified(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        return preload(mapping, actionForm, request, response);
    }

    public ActionForward update(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final finf.ucf.cu.domain.crud.ImpartitionPlanForm form = (finf.ucf.cu.domain.crud.ImpartitionPlanForm) actionForm;

        finf.ucf.cu.ManageableServiceLocator.instance().getImpartitionPlanManageableService().update(
            (StringUtils.isBlank(request.getParameter("teacherallclasetype"))) ? null : form.getTeacherallclasetype()
            , (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("subjectId"))) ? null : form.getSubjectId()
            , (StringUtils.isBlank(request.getParameter("teacherId"))) ? null : form.getTeacherId()
            , (StringUtils.isBlank(request.getParameter("classTypeId"))) ? null : form.getClassTypeId()
            , (StringUtils.isBlank(request.getParameter("groupId"))) ? null : form.getGroupId()
            , (StringUtils.isBlank(request.getParameter("semesterId"))) ? null : form.getSemesterId()
        );

        return preload(mapping, actionForm, request, response);
    }

    public ActionForward delete(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final finf.ucf.cu.domain.crud.ImpartitionPlanForm form = (finf.ucf.cu.domain.crud.ImpartitionPlanForm) actionForm;

        final java.lang.Long[] selectedRows = form.getSelectedRows();
        if (selectedRows != null && selectedRows.length > 0)
        {
            finf.ucf.cu.ManageableServiceLocator.instance().getImpartitionPlanManageableService().delete(selectedRows);
        }

        return preload(mapping, actionForm, request, response);
    }

    private void saveMaxResultsWarning(HttpServletRequest request)
    {
        final HttpSession session = request.getSession();

        ActionMessages messages = (ActionMessages)session.getAttribute(org.apache.struts.Globals.MESSAGE_KEY);
        if (messages == null)
        {
            messages = new ActionMessages();
            session.setAttribute(org.apache.struts.Globals.MESSAGE_KEY, messages);
        }
        messages.add("org.andromda.bpm4struts.warningmessages", new ActionMessage("maximum.results.fetched.warning", "250"));
    }

}
