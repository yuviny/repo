// license-header java merge-point
package finf.ucf.cu.web.groupschedule;

/**
 * 
 */
public final class GroupSchedule extends org.apache.struts.action.Action
{
    public org.apache.struts.action.ActionForward execute(org.apache.struts.action.ActionMapping mapping, org.apache.struts.action.ActionForm form, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.lang.Exception
    {
        final GroupScheduleFormImpl specificForm = (GroupScheduleFormImpl)form;

        final Object previousFormObject = request.getSession().getAttribute("form");

        org.apache.struts.action.ActionForward forward = null;

        try
        {
            forward = _loadSchedule(mapping, form, request, response);
        }
        catch (java.lang.Exception exception)
        {
            // we populate the current form with only the request parameters
            Object currentForm = request.getSession().getAttribute("form");
            // if we can't get the 'form' from the session, try from the request
            if (currentForm == null)
            {
                currentForm = request.getAttribute("form");
            }
            if (currentForm != null)
            {
                final java.util.Map parameters = new java.util.HashMap();
                for (final java.util.Enumeration names = request.getParameterNames(); names.hasMoreElements();)
                {
                    final String name = String.valueOf(names.nextElement());
                    final String[] values = request.getParameterValues(name);

                    if (values.length == 1)
                    {
                        parameters.put(name, values[0]);
                    }
                    else
                    {
                        parameters.put(name, values);
                    }
                }
                try
                {
                    org.apache.commons.beanutils.BeanUtils.populate(currentForm, parameters);
                }
                catch (java.lang.Exception populateException)
                {
                    // ignore if we have an exception here (we just don't populate).
                }
            }
            throw exception;
        }

        request.getSession().setAttribute("form", form);


        return forward;
    }

    /**
     * 
     */
    private org.apache.struts.action.ActionForward _loadSchedule(org.apache.struts.action.ActionMapping mapping, org.apache.struts.action.ActionForm form, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.lang.Exception
    {
        org.apache.struts.action.ActionForward forward = null;

        finf.ucf.cu.web.groupschedule.GroupScheduleControllerFactory.getGroupScheduleControllerInstance().loadSchedule(mapping, (GroupScheduleFormImpl)form, request, response);
        forward = mapping.findForward("gschedule");


        return forward;
    }

}
