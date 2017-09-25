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

public final class ManageClassTime extends DispatchAction
{
    public ActionForward execute(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        request.getSession().setAttribute("manageableForm", actionForm);
        return super.execute(mapping, actionForm, request, response);
    }

    public ActionForward create(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final finf.ucf.cu.domain.crud.ClassTimeForm form = (finf.ucf.cu.domain.crud.ClassTimeForm)actionForm;

        if (StringUtils.isNotBlank(request.getParameter("time")) && !finf.ucf.cu.domain.cTime.literals().contains(form.getTime()))
        {
            throw new IllegalArgumentException("time must be  one of " + finf.ucf.cu.domain.cTime.literals());
        }

        finf.ucf.cu.ManageableServiceLocator.instance().getClassTimeManageableService().create(
            (StringUtils.isBlank(request.getParameter("dayAsString"))) ? null : form.getDay()
            , (StringUtils.isBlank(request.getParameter("time"))) ? null : finf.ucf.cu.domain.cTime.fromInteger(form.getTime())
            , (StringUtils.isBlank(request.getParameter("duration"))) ? null : form.getDuration()
            , (StringUtils.isBlank(request.getParameter("fixed"))) ? false : form.isFixed()
            , (StringUtils.isBlank(request.getParameter("tipic"))) ? false : form.isTipic()
            , (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("groupId"))) ? null : form.getGroupId()
            , (StringUtils.isBlank(request.getParameter("teacherId"))) ? null : form.getTeacherId()
            , (StringUtils.isBlank(request.getParameter("subjectId"))) ? null : form.getSubjectId()
            , (StringUtils.isBlank(request.getParameter("roomId"))) ? null : form.getRoomId()
            , (StringUtils.isBlank(request.getParameter("solution"))) ? null : form.getSolution()
            , (StringUtils.isBlank(request.getParameter("classTypeID"))) ? null : form.getClassTypeID()
        );

        return preload(mapping, actionForm, request, response);
    }

    public ActionForward read(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final finf.ucf.cu.domain.crud.ClassTimeForm form = (finf.ucf.cu.domain.crud.ClassTimeForm)actionForm;

        final java.util.List list = finf.ucf.cu.ManageableServiceLocator.instance().getClassTimeManageableService().read(
            (StringUtils.isBlank(request.getParameter("dayAsString"))) ? null : form.getDay()
            , (StringUtils.isBlank(request.getParameter("time"))) ? null : finf.ucf.cu.domain.cTime.fromInteger(form.getTime())
            , (StringUtils.isBlank(request.getParameter("duration"))) ? null : form.getDuration()
            , (StringUtils.isBlank(request.getParameter("fixed"))) ? false : form.isFixed()
            , (StringUtils.isBlank(request.getParameter("tipic"))) ? false : form.isTipic()
            , (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("groupId"))) ? null : form.getGroupId()
            , (StringUtils.isBlank(request.getParameter("teacherId"))) ? null : form.getTeacherId()
            , (StringUtils.isBlank(request.getParameter("subjectId"))) ? null : form.getSubjectId()
            , (StringUtils.isBlank(request.getParameter("roomId"))) ? null : form.getRoomId()
            , (StringUtils.isBlank(request.getParameter("solution"))) ? null : form.getSolution()
            , (StringUtils.isBlank(request.getParameter("classTypeID"))) ? null : form.getClassTypeID()
        );
        form.setManageableList(list);

        if (list.size() >= 250)
        {
            saveMaxResultsWarning(request);
        }

        final java.util.Map backingLists = finf.ucf.cu.ManageableServiceLocator.instance().getClassTimeManageableService().readBackingLists();
        form.setGroupIdBackingList((java.util.List)backingLists.get("groupId"));
        form.setTeacherIdBackingList((java.util.List)backingLists.get("teacherId"));
        form.setSubjectIdBackingList((java.util.List)backingLists.get("subjectId"));
        form.setRoomIdBackingList((java.util.List)backingLists.get("roomId"));
        form.setSolutionBackingList((java.util.List)backingLists.get("solution"));
        form.setClassTypeIDBackingList((java.util.List)backingLists.get("classTypeID"));

        return mapping.getInputForward();
    }

    public ActionForward preload(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final finf.ucf.cu.domain.crud.ClassTimeForm form = (finf.ucf.cu.domain.crud.ClassTimeForm)actionForm;

        final java.util.List list = finf.ucf.cu.ManageableServiceLocator.instance().getClassTimeManageableService().readAll();
        form.setManageableList(list);


        if (list.size() >= 250)
        {
            saveMaxResultsWarning(request);
        }

        final java.util.Map backingLists = finf.ucf.cu.ManageableServiceLocator.instance().getClassTimeManageableService().readBackingLists();
        if (StringUtils.isNotBlank(request.getParameter("ref_Group")))
        {
            form.setGroupId(new java.lang.Long(request.getParameter("ref_Group")));
        }
        form.setGroupIdBackingList((java.util.List)backingLists.get("groupId"));
        if (StringUtils.isNotBlank(request.getParameter("ref_Teacher")))
        {
            form.setTeacherId(new java.lang.Long(request.getParameter("ref_Teacher")));
        }
        form.setTeacherIdBackingList((java.util.List)backingLists.get("teacherId"));
        if (StringUtils.isNotBlank(request.getParameter("ref_Subject")))
        {
            form.setSubjectId(new java.lang.Long(request.getParameter("ref_Subject")));
        }
        form.setSubjectIdBackingList((java.util.List)backingLists.get("subjectId"));
        if (StringUtils.isNotBlank(request.getParameter("ref_Room")))
        {
            form.setRoomId(new java.lang.Long(request.getParameter("ref_Room")));
        }
        form.setRoomIdBackingList((java.util.List)backingLists.get("roomId"));
        if (StringUtils.isNotBlank(request.getParameter("ref_Semester")))
        {
            form.setSolution(new java.lang.Long(request.getParameter("ref_Semester")));
        }
        form.setSolutionBackingList((java.util.List)backingLists.get("solution"));
        if (StringUtils.isNotBlank(request.getParameter("ref_ClassType")))
        {
            form.setClassTypeID(new java.lang.Long(request.getParameter("ref_ClassType")));
        }
        form.setClassTypeIDBackingList((java.util.List)backingLists.get("classTypeID"));

        return mapping.getInputForward();
    }

    protected ActionForward unspecified(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        return preload(mapping, actionForm, request, response);
    }

    public ActionForward update(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final finf.ucf.cu.domain.crud.ClassTimeForm form = (finf.ucf.cu.domain.crud.ClassTimeForm) actionForm;

        if (StringUtils.isNotBlank(request.getParameter("time")) && !finf.ucf.cu.domain.cTime.literals().contains(form.getTime()))
        {
            throw new IllegalArgumentException("time must be  one of " + finf.ucf.cu.domain.cTime.literals());
        }

        finf.ucf.cu.ManageableServiceLocator.instance().getClassTimeManageableService().update(
            (StringUtils.isBlank(request.getParameter("dayAsString"))) ? null : form.getDay()
            , (StringUtils.isBlank(request.getParameter("time"))) ? null : finf.ucf.cu.domain.cTime.fromInteger(form.getTime())
            , (StringUtils.isBlank(request.getParameter("duration"))) ? null : form.getDuration()
            , (StringUtils.isBlank(request.getParameter("fixed"))) ? false : form.isFixed()
            , (StringUtils.isBlank(request.getParameter("tipic"))) ? false : form.isTipic()
            , (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("groupId"))) ? null : form.getGroupId()
            , (StringUtils.isBlank(request.getParameter("teacherId"))) ? null : form.getTeacherId()
            , (StringUtils.isBlank(request.getParameter("subjectId"))) ? null : form.getSubjectId()
            , (StringUtils.isBlank(request.getParameter("roomId"))) ? null : form.getRoomId()
            , (StringUtils.isBlank(request.getParameter("solution"))) ? null : form.getSolution()
            , (StringUtils.isBlank(request.getParameter("classTypeID"))) ? null : form.getClassTypeID()
        );

        return preload(mapping, actionForm, request, response);
    }

    public ActionForward delete(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final finf.ucf.cu.domain.crud.ClassTimeForm form = (finf.ucf.cu.domain.crud.ClassTimeForm) actionForm;

        final java.lang.Long[] selectedRows = form.getSelectedRows();
        if (selectedRows != null && selectedRows.length > 0)
        {
            finf.ucf.cu.ManageableServiceLocator.instance().getClassTimeManageableService().delete(selectedRows);
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
