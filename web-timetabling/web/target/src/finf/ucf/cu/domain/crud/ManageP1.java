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

public final class ManageP1 extends DispatchAction
{
    public ActionForward execute(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        request.getSession().setAttribute("manageableForm", actionForm);
        return super.execute(mapping, actionForm, request, response);
    }

    public ActionForward create(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final finf.ucf.cu.domain.crud.P1Form form = (finf.ucf.cu.domain.crud.P1Form)actionForm;

        finf.ucf.cu.ManageableServiceLocator.instance().getP1ManageableService().create(
            (StringUtils.isBlank(request.getParameter("name"))) ? null : form.getName()
            , (StringUtils.isBlank(request.getParameter("endDateAsString"))) ? null : form.getEndDate()
            , (StringUtils.isBlank(request.getParameter("approved_by"))) ? null : form.getApproved_by()
            , (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("subjectId"))) ? null : form.getSubjectId()
            , (StringUtils.isBlank(request.getParameter("teacher"))) ? null : form.getTeacher()
        );

        return preload(mapping, actionForm, request, response);
    }

    public ActionForward read(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final finf.ucf.cu.domain.crud.P1Form form = (finf.ucf.cu.domain.crud.P1Form)actionForm;

        final java.util.List list = finf.ucf.cu.ManageableServiceLocator.instance().getP1ManageableService().read(
            (StringUtils.isBlank(request.getParameter("name"))) ? null : form.getName()
            , (StringUtils.isBlank(request.getParameter("endDateAsString"))) ? null : form.getEndDate()
            , (StringUtils.isBlank(request.getParameter("approved_by"))) ? null : form.getApproved_by()
            , (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("subjectId"))) ? null : form.getSubjectId()
            , (StringUtils.isBlank(request.getParameter("teacher"))) ? null : form.getTeacher()
        );
        form.setManageableList(list);

        if (list.size() >= 250)
        {
            saveMaxResultsWarning(request);
        }

        final java.util.Map backingLists = finf.ucf.cu.ManageableServiceLocator.instance().getP1ManageableService().readBackingLists();
        form.setSubjectIdBackingList((java.util.List)backingLists.get("subjectId"));
        form.setTeacherBackingList((java.util.List)backingLists.get("teacher"));

        return mapping.getInputForward();
    }

    public ActionForward preload(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final finf.ucf.cu.domain.crud.P1Form form = (finf.ucf.cu.domain.crud.P1Form)actionForm;

        final java.util.List list = finf.ucf.cu.ManageableServiceLocator.instance().getP1ManageableService().readAll();
        form.setManageableList(list);


        if (list.size() >= 250)
        {
            saveMaxResultsWarning(request);
        }

        final java.util.Map backingLists = finf.ucf.cu.ManageableServiceLocator.instance().getP1ManageableService().readBackingLists();
        if (StringUtils.isNotBlank(request.getParameter("ref_Subject")))
        {
            form.setSubjectId(new java.lang.Long(request.getParameter("ref_Subject")));
        }
        form.setSubjectIdBackingList((java.util.List)backingLists.get("subjectId"));
        if (StringUtils.isNotBlank(request.getParameter("ref_Teacher")))
        {
            form.setTeacher(new java.lang.Long(request.getParameter("ref_Teacher")));
        }
        form.setTeacherBackingList((java.util.List)backingLists.get("teacher"));

        return mapping.getInputForward();
    }

    protected ActionForward unspecified(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        return preload(mapping, actionForm, request, response);
    }

    public ActionForward update(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final finf.ucf.cu.domain.crud.P1Form form = (finf.ucf.cu.domain.crud.P1Form) actionForm;

        finf.ucf.cu.ManageableServiceLocator.instance().getP1ManageableService().update(
            (StringUtils.isBlank(request.getParameter("name"))) ? null : form.getName()
            , (StringUtils.isBlank(request.getParameter("endDateAsString"))) ? null : form.getEndDate()
            , (StringUtils.isBlank(request.getParameter("approved_by"))) ? null : form.getApproved_by()
            , (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("subjectId"))) ? null : form.getSubjectId()
            , (StringUtils.isBlank(request.getParameter("teacher"))) ? null : form.getTeacher()
        );

        return preload(mapping, actionForm, request, response);
    }

    public ActionForward delete(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final finf.ucf.cu.domain.crud.P1Form form = (finf.ucf.cu.domain.crud.P1Form) actionForm;

        final java.lang.Long[] selectedRows = form.getSelectedRows();
        if (selectedRows != null && selectedRows.length > 0)
        {
            finf.ucf.cu.ManageableServiceLocator.instance().getP1ManageableService().delete(selectedRows);
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
