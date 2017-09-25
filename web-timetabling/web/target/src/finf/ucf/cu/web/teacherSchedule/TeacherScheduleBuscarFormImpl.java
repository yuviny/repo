// license-header java merge-point
package finf.ucf.cu.web.teacherSchedule;

public class TeacherScheduleBuscarFormImpl
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
        , finf.ucf.cu.web.teacherSchedule.LoadTeacherForm
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = 3212228851L;

    private java.util.List par = null;
    private java.lang.Object[] parValueList;
    private java.lang.Object[] parLabelList;
    private java.lang.Boolean exportt;
    private java.lang.Object[] exporttValueList;
    private java.lang.Object[] exporttLabelList;
    private java.util.Date date;
    private final static java.text.DateFormat dateDateFormatter = new java.text.SimpleDateFormat("dd/MM/yyyy");
    private java.lang.Object[] dateValueList;
    private java.lang.Object[] dateLabelList;
    private java.lang.Object myTeacher;
    private java.lang.Object[] myTeacherValueList;
    private java.lang.Object[] myTeacherLabelList;

    public TeacherScheduleBuscarFormImpl()
    {
        dateDateFormatter.setLenient(true);
    }

    /**
     * Resets the given <code>par</code>.
     */
    public void resetPar()
    {
        this.par = null;
    }

    public void setPar(java.util.List par)
    {
        this.par = par;
    }

    /**
     * 
     */
    public java.util.List getPar()
    {
        return this.par;
    }

    public void setParAsArray(Object[] par)
    {
        this.par = (par == null) ? null : java.util.Arrays.asList(par);
    }

    /**
     * Returns this collection as an array, if the collection itself would be <code>null</code> this method
     * will also return <code>null</code>.
     *
     * @see finf.ucf.cu.web.teacherSchedule.TeacherScheduleBuscarFormImpl#getPar
     */
    public java.lang.Object[] getParAsArray()
    {
        return (par == null) ? null : par.toArray();
    }
    
    public java.lang.Object[] getParBackingList()
    {
        java.lang.Object[] values = this.parValueList;
        java.lang.Object[] labels = this.parLabelList;

        if (values == null || values.length == 0)
        {
            return values;
        }

        if (labels == null || labels.length == 0)
        {
            labels = values;
        }

        final int length = java.lang.Math.min(labels.length, values.length);
        java.lang.Object[] backingList = new java.lang.Object[length];

        for (int i=0; i<length; i++)
        {
            backingList[i] = new LabelValue(labels[i], values[i]);
        }

        return backingList;
    }

    public java.lang.Object[] getParValueList()
    {
        return this.parValueList;
    }

    public void setParValueList(java.lang.Object[] parValueList)
    {
        this.parValueList = parValueList;
    }

    public java.lang.Object[] getParLabelList()
    {
        return this.parLabelList;
    }

    public void setParLabelList(java.lang.Object[] parLabelList)
    {
        this.parLabelList = parLabelList;
    }

    public void setParBackingList(java.util.Collection items, java.lang.String valueProperty, java.lang.String labelProperty)
    {
        if (valueProperty == null || labelProperty == null)
        {
            throw new IllegalArgumentException("TeacherScheduleBuscarFormImpl.setParBackingList requires non-null property arguments");
        }

        this.parValueList = null;
        this.parLabelList = null;

        if (items != null)
        {
            this.parValueList = new java.lang.Object[items.size()];
            this.parLabelList = new java.lang.Object[items.size()];

            try
            {
                int i = 0;
                for (java.util.Iterator iterator = items.iterator(); iterator.hasNext(); i++)
                {
                    final java.lang.Object item = iterator.next();

                    this.parValueList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, valueProperty);
                    this.parLabelList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, labelProperty);
                }
            }
            catch (Exception ex)
            {
                throw new java.lang.RuntimeException("TeacherScheduleBuscarFormImpl.setParBackingList encountered an exception", ex);
            }
        }
    }

    /**
     * Resets the given <code>exportt</code>.
     */
    public void resetExportt()
    {
        this.exportt = null;
    }

    public void setExportt(java.lang.Boolean exportt)
    {
        this.exportt = exportt;
    }

    /**
     * 
     */
    public java.lang.Boolean getExportt()
    {
        return this.exportt;
    }
    
    public java.lang.Object[] getExporttBackingList()
    {
        java.lang.Object[] values = this.exporttValueList;
        java.lang.Object[] labels = this.exporttLabelList;

        if (values == null || values.length == 0)
        {
            return values;
        }

        if (labels == null || labels.length == 0)
        {
            labels = values;
        }

        final int length = java.lang.Math.min(labels.length, values.length);
        java.lang.Object[] backingList = new java.lang.Object[length];

        for (int i=0; i<length; i++)
        {
            backingList[i] = new LabelValue(labels[i], values[i]);
        }

        return backingList;
    }

    public java.lang.Object[] getExporttValueList()
    {
        return this.exporttValueList;
    }

    public void setExporttValueList(java.lang.Object[] exporttValueList)
    {
        this.exporttValueList = exporttValueList;
    }

    public java.lang.Object[] getExporttLabelList()
    {
        return this.exporttLabelList;
    }

    public void setExporttLabelList(java.lang.Object[] exporttLabelList)
    {
        this.exporttLabelList = exporttLabelList;
    }

    public void setExporttBackingList(java.util.Collection items, java.lang.String valueProperty, java.lang.String labelProperty)
    {
        if (valueProperty == null || labelProperty == null)
        {
            throw new IllegalArgumentException("TeacherScheduleBuscarFormImpl.setExporttBackingList requires non-null property arguments");
        }

        this.exporttValueList = null;
        this.exporttLabelList = null;

        if (items != null)
        {
            this.exporttValueList = new java.lang.Object[items.size()];
            this.exporttLabelList = new java.lang.Object[items.size()];

            try
            {
                int i = 0;
                for (java.util.Iterator iterator = items.iterator(); iterator.hasNext(); i++)
                {
                    final java.lang.Object item = iterator.next();

                    this.exporttValueList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, valueProperty);
                    this.exporttLabelList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, labelProperty);
                }
            }
            catch (Exception ex)
            {
                throw new java.lang.RuntimeException("TeacherScheduleBuscarFormImpl.setExporttBackingList encountered an exception", ex);
            }
        }
    }

    /**
     * Resets the given <code>date</code>.
     */
    public void resetDate()
    {
        this.date = null;
    }

    public void setDateAsDate(java.util.Date date)
    {
        this.date = date;
    }

    /**
     * Returns the Date instance representing the <code>date</code> field.
     *
     * @see finf.ucf.cu.web.teacherSchedule.TeacherScheduleBuscarFormImpl#getDate
     * @see finf.ucf.cu.web.teacherSchedule.TeacherScheduleBuscarFormImpl#dateDateFormatter
     */
    public java.util.Date getDateAsDate()
    {
        return this.date;
    }

    public void setDate(java.lang.String date)
    {
        if (date == null || date.trim().length() == 0)
        {
            this.date = null;
        }
        else
        {
            try
            {
                this.date = dateDateFormatter.parse(date);
            }
            catch(java.text.ParseException e)
            {
                // we are not throwing an exception, let the validator handle these cases
                this.date = null;
            }
        }
    }

    /**
     * 
     *
     * This method returns a <code>java.lang.String</code> instance, in order to get the
     * <code>java.util.Date</code> instance see the <code>getDateAsDate()</code>
     * method.
     * <p>
     * The conversion from Date to String (and vice-versa) is done by means of a date formatter, which
     * can be accessed here: <code>getDateDateFormatter()</code>.
     *
     * @see finf.ucf.cu.web.teacherSchedule.TeacherScheduleBuscarFormImpl#getDateAsDate
     * @see finf.ucf.cu.web.teacherSchedule.TeacherScheduleBuscarFormImpl#getDateDateFormatter
     */
    public java.lang.String getDate()
    {
        return (date == null) ? null : dateDateFormatter.format(date);
    }

    /**
     * Returns the date formatter used for the <code>date</code> property.
     *
     * @see finf.ucf.cu.web.teacherSchedule.TeacherScheduleBuscarFormImpl#getDate
     * @see finf.ucf.cu.web.teacherSchedule.TeacherScheduleBuscarFormImpl#getDateAsDate
     */
    public static java.text.DateFormat getDateDateFormatter()
    {
        return TeacherScheduleBuscarFormImpl.dateDateFormatter;
    }

    public java.lang.Object[] getDateBackingList()
    {
        java.lang.Object[] values = this.dateValueList;
        java.lang.Object[] labels = this.dateLabelList;

        if (values == null || values.length == 0)
        {
            return values;
        }

        if (labels == null || labels.length == 0)
        {
            labels = values;
        }

        final int length = java.lang.Math.min(labels.length, values.length);
        java.lang.Object[] backingList = new java.lang.Object[length];

        for (int i=0; i<length; i++)
        {
            backingList[i] = new LabelValue(labels[i], values[i]);
        }

        return backingList;
    }

    public java.lang.Object[] getDateValueList()
    {
        return this.dateValueList;
    }

    public void setDateValueList(java.lang.Object[] dateValueList)
    {
        this.dateValueList = dateValueList;
    }

    public java.lang.Object[] getDateLabelList()
    {
        return this.dateLabelList;
    }

    public void setDateLabelList(java.lang.Object[] dateLabelList)
    {
        this.dateLabelList = dateLabelList;
    }

    public void setDateBackingList(java.util.Collection items, java.lang.String valueProperty, java.lang.String labelProperty)
    {
        if (valueProperty == null || labelProperty == null)
        {
            throw new IllegalArgumentException("TeacherScheduleBuscarFormImpl.setDateBackingList requires non-null property arguments");
        }

        this.dateValueList = null;
        this.dateLabelList = null;

        if (items != null)
        {
            this.dateValueList = new java.lang.Object[items.size()];
            this.dateLabelList = new java.lang.Object[items.size()];

            try
            {
                int i = 0;
                for (java.util.Iterator iterator = items.iterator(); iterator.hasNext(); i++)
                {
                    final java.lang.Object item = iterator.next();

                    this.dateValueList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, valueProperty);
                    this.dateLabelList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, labelProperty);
                }
            }
            catch (Exception ex)
            {
                throw new java.lang.RuntimeException("TeacherScheduleBuscarFormImpl.setDateBackingList encountered an exception", ex);
            }
        }
    }

    /**
     * Resets the given <code>myTeacher</code>.
     */
    public void resetMyTeacher()
    {
        this.myTeacher = null;
    }

    public void setMyTeacher(java.lang.Object myTeacher)
    {
        this.myTeacher = myTeacher;
    }

    /**
     * <p>
     * Muestra todo los Profesores
     * </p>
     */
    public java.lang.Object getMyTeacher()
    {
        return this.myTeacher;
    }
    
    public java.lang.Object[] getMyTeacherBackingList()
    {
        java.lang.Object[] values = this.myTeacherValueList;
        java.lang.Object[] labels = this.myTeacherLabelList;

        if (values == null || values.length == 0)
        {
            return values;
        }

        if (labels == null || labels.length == 0)
        {
            labels = values;
        }

        final int length = java.lang.Math.min(labels.length, values.length);
        java.lang.Object[] backingList = new java.lang.Object[length];

        for (int i=0; i<length; i++)
        {
            backingList[i] = new LabelValue(labels[i], values[i]);
        }

        return backingList;
    }

    public java.lang.Object[] getMyTeacherValueList()
    {
        return this.myTeacherValueList;
    }

    public void setMyTeacherValueList(java.lang.Object[] myTeacherValueList)
    {
        this.myTeacherValueList = myTeacherValueList;
    }

    public java.lang.Object[] getMyTeacherLabelList()
    {
        return this.myTeacherLabelList;
    }

    public void setMyTeacherLabelList(java.lang.Object[] myTeacherLabelList)
    {
        this.myTeacherLabelList = myTeacherLabelList;
    }

    public void setMyTeacherBackingList(java.util.Collection items, java.lang.String valueProperty, java.lang.String labelProperty)
    {
        if (valueProperty == null || labelProperty == null)
        {
            throw new IllegalArgumentException("TeacherScheduleBuscarFormImpl.setMyTeacherBackingList requires non-null property arguments");
        }

        this.myTeacherValueList = null;
        this.myTeacherLabelList = null;

        if (items != null)
        {
            this.myTeacherValueList = new java.lang.Object[items.size()];
            this.myTeacherLabelList = new java.lang.Object[items.size()];

            try
            {
                int i = 0;
                for (java.util.Iterator iterator = items.iterator(); iterator.hasNext(); i++)
                {
                    final java.lang.Object item = iterator.next();

                    this.myTeacherValueList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, valueProperty);
                    this.myTeacherLabelList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, labelProperty);
                }
            }
            catch (Exception ex)
            {
                throw new java.lang.RuntimeException("TeacherScheduleBuscarFormImpl.setMyTeacherBackingList encountered an exception", ex);
            }
        }
    }

    /**
     * @see org.apache.struts.validator.ValidatorForm#reset(org.apache.struts.action.ActionMapping,javax.servlet.http.HttpServletRequest)
     */
    public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request)
    {
        this.exportt = null;
        this.myTeacher = null;
    }

    public java.lang.String toString()
    {
        org.apache.commons.lang.builder.ToStringBuilder builder =
            new org.apache.commons.lang.builder.ToStringBuilder(this);
        builder.append("par", this.par);
        builder.append("exportt", this.exportt);
        builder.append("date", this.date);
        builder.append("myTeacher", this.myTeacher);
        return builder.toString();
    }

    /**
     * Allows you to clean all values from this form. Objects will be set to <code>null</code>, numeric values will be
     * set to zero and boolean values will be set to <code>false</code>. Backinglists for selectable fields will
     * also be set to <code>null</code>.
     */
    public void clean()
    {
        this.par = null;
        this.parValueList = null;
        this.parLabelList = null;
        this.exportt = null;
        this.exporttValueList = null;
        this.exporttLabelList = null;
        this.date = null;
        this.dateValueList = null;
        this.dateLabelList = null;
        this.myTeacher = null;
        this.myTeacherValueList = null;
        this.myTeacherLabelList = null;
    }

    /**
     * Override to provide population of current form with request parameters when validation fails.
     *
     * @see org.apache.struts.action.ActionForm#validate(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
     */
    public org.apache.struts.action.ActionErrors validate(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request)
    {
        final org.apache.struts.action.ActionErrors errors = super.validate(mapping, request);
        if (errors != null && !errors.isEmpty())
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
                    resetMethods.put("resetExportt", currentFormClass.getMethod("resetExportt", null));
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
        }
        return errors;
    }

    public final static class LabelValue
    {
        private java.lang.Object label = null;
        private java.lang.Object value = null;

        public LabelValue(Object label, java.lang.Object value)
        {
            this.label = label;
            this.value = value;
        }

        public java.lang.Object getLabel()
        {
            return this.label;
        }

        public java.lang.Object getValue()
        {
            return this.value;
        }

        public java.lang.String toString()
        {
            return label + "=" + value;
        }
    }
}