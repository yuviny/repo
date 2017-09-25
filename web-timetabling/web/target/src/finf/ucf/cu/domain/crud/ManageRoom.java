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

public final class ManageRoom extends DispatchAction
{
    public ActionForward execute(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        request.getSession().setAttribute("manageableForm", actionForm);
        return super.execute(mapping, actionForm, request, response);
    }

    public ActionForward create(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final finf.ucf.cu.domain.crud.RoomForm form = (finf.ucf.cu.domain.crud.RoomForm)actionForm;

        finf.ucf.cu.ManageableServiceLocator.instance().getRoomManageableService().create(
            (StringUtils.isBlank(request.getParameter("name"))) ? null : form.getName()
            , (StringUtils.isBlank(request.getParameter("size"))) ? null : form.getSize()
            , (StringUtils.isBlank(request.getParameter("abbreviation"))) ? null : form.getAbbreviation()
            , (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("resources"))) ? null : form.getResources()
            , (StringUtils.isBlank(request.getParameter("buildingId"))) ? null : form.getBuildingId()
        );

        return preload(mapping, actionForm, request, response);
    }

    public ActionForward read(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final finf.ucf.cu.domain.crud.RoomForm form = (finf.ucf.cu.domain.crud.RoomForm)actionForm;

        final java.util.List list = finf.ucf.cu.ManageableServiceLocator.instance().getRoomManageableService().read(
            (StringUtils.isBlank(request.getParameter("name"))) ? null : form.getName()
            , (StringUtils.isBlank(request.getParameter("size"))) ? null : form.getSize()
            , (StringUtils.isBlank(request.getParameter("abbreviation"))) ? null : form.getAbbreviation()
            , (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("resources"))) ? null : form.getResources()
            , (StringUtils.isBlank(request.getParameter("buildingId"))) ? null : form.getBuildingId()
        );
        form.setManageableList(list);

        if (list.size() >= 250)
        {
            saveMaxResultsWarning(request);
        }

        final java.util.Map backingLists = finf.ucf.cu.ManageableServiceLocator.instance().getRoomManageableService().readBackingLists();
        form.setResourcesBackingList((java.util.List)backingLists.get("resources"));
        form.setBuildingIdBackingList((java.util.List)backingLists.get("buildingId"));

        return mapping.getInputForward();
    }

    public ActionForward preload(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final finf.ucf.cu.domain.crud.RoomForm form = (finf.ucf.cu.domain.crud.RoomForm)actionForm;

        final java.util.List list = finf.ucf.cu.ManageableServiceLocator.instance().getRoomManageableService().readAll();
        form.setManageableList(list);


        if (list.size() >= 250)
        {
            saveMaxResultsWarning(request);
        }

        final java.util.Map backingLists = finf.ucf.cu.ManageableServiceLocator.instance().getRoomManageableService().readBackingLists();
        if (StringUtils.isNotBlank(request.getParameter("ref_Resource")))
        {
            final java.lang.Long[] array = new java.lang.Long[1];
            array[0] = new java.lang.Long(request.getParameter("ref_Resource"));
            form.setResources(array);
        }
        form.setResourcesBackingList((java.util.List)backingLists.get("resources"));
        if (StringUtils.isNotBlank(request.getParameter("ref_Building")))
        {
            form.setBuildingId(new java.lang.Long(request.getParameter("ref_Building")));
        }
        form.setBuildingIdBackingList((java.util.List)backingLists.get("buildingId"));

        return mapping.getInputForward();
    }

    protected ActionForward unspecified(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        return preload(mapping, actionForm, request, response);
    }

    public ActionForward update(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final finf.ucf.cu.domain.crud.RoomForm form = (finf.ucf.cu.domain.crud.RoomForm) actionForm;

        finf.ucf.cu.ManageableServiceLocator.instance().getRoomManageableService().update(
            (StringUtils.isBlank(request.getParameter("name"))) ? null : form.getName()
            , (StringUtils.isBlank(request.getParameter("size"))) ? null : form.getSize()
            , (StringUtils.isBlank(request.getParameter("abbreviation"))) ? null : form.getAbbreviation()
            , (StringUtils.isBlank(request.getParameter("id"))) ? null : form.getId()
            , (StringUtils.isBlank(request.getParameter("resources"))) ? null : form.getResources()
            , (StringUtils.isBlank(request.getParameter("buildingId"))) ? null : form.getBuildingId()
        );

        return preload(mapping, actionForm, request, response);
    }

    public ActionForward delete(ActionMapping mapping, ActionForm actionForm, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        final finf.ucf.cu.domain.crud.RoomForm form = (finf.ucf.cu.domain.crud.RoomForm) actionForm;

        final java.lang.Long[] selectedRows = form.getSelectedRows();
        if (selectedRows != null && selectedRows.length > 0)
        {
            finf.ucf.cu.ManageableServiceLocator.instance().getRoomManageableService().delete(selectedRows);
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
