// license-header java merge-point
package finf.ucf.cu.web.roomschedule;

/**
 * <p>
 * Busca el Horario
 * </p>
 */
public final class RoomScheduleBuscar extends org.apache.struts.action.Action
{
    public org.apache.struts.action.ActionForward execute(org.apache.struts.action.ActionMapping mapping, org.apache.struts.action.ActionForm form, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.lang.Exception
    {
        final RoomScheduleBuscarFormImpl specificForm = (RoomScheduleBuscarFormImpl)form;

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

                // reset all checkbox fields
                final java.util.Map resetMethods = new java.util.HashMap();
                final Class currentFormClass = currentForm.getClass();
                try
                {
                    resetMethods.put("resetExportl", currentFormClass.getMethod("resetExportl", null));
                    for (final java.util.Iterator iterator = resetMethods.keySet().iterator(); iterator.hasNext();)
                    {
                        final java.lang.reflect.Method method =
                            (java.lang.reflect.Method)resetMethods.get((String)iterator.next());
                        method.invoke(currentForm, null);
                    }
                }
                catch (java.lang.Exception reflectionException)
                {
                     // ignore if we have a reflection exception (the form doesn't contain desired checkbox fields)
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

        finf.ucf.cu.web.roomschedule.RoomControllerFactory.getRoomControllerInstance().loadRoomSchedule(mapping, (RoomScheduleBuscarFormImpl)form, request, response);
        forward = mapping.findForward("algo");


        return forward;
    }

}
