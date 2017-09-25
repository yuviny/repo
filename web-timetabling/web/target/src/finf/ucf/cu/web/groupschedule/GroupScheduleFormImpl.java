// license-header java merge-point
package finf.ucf.cu.web.groupschedule;

public class GroupScheduleFormImpl
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
        , finf.ucf.cu.web.groupschedule.LoadScheduleForm
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = 15671263471L;

    private java.lang.Boolean export;
    private java.lang.Object[] exportValueList;
    private java.lang.Object[] exportLabelList;
    private java.util.Date day;
    private final static java.text.DateFormat dayDateFormatter = new java.text.SimpleDateFormat("dd/MM/yyyy");
    private java.lang.Object[] dayValueList;
    private java.lang.Object[] dayLabelList;
    private java.lang.Object mygroup;
    private java.lang.Object[] mygroupValueList;
    private java.lang.Object[] mygroupLabelList;
    private java.util.List groupSchedule = null;
    private java.lang.Object[] groupScheduleValueList;
    private java.lang.Object[] groupScheduleLabelList;

    public GroupScheduleFormImpl()
    {
        dayDateFormatter.setLenient(true);
    }

    /**
     * Resets the given <code>export</code>.
     */
    public void resetExport()
    {
        this.export = null;
    }

    public void setExport(java.lang.Boolean export)
    {
        this.export = export;
    }

    /**
     * 
     */
    public java.lang.Boolean getExport()
    {
        return this.export;
    }
    
    public java.lang.Object[] getExportBackingList()
    {
        java.lang.Object[] values = this.exportValueList;
        java.lang.Object[] labels = this.exportLabelList;

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

    public java.lang.Object[] getExportValueList()
    {
        return this.exportValueList;
    }

    public void setExportValueList(java.lang.Object[] exportValueList)
    {
        this.exportValueList = exportValueList;
    }

    public java.lang.Object[] getExportLabelList()
    {
        return this.exportLabelList;
    }

    public void setExportLabelList(java.lang.Object[] exportLabelList)
    {
        this.exportLabelList = exportLabelList;
    }

    public void setExportBackingList(java.util.Collection items, java.lang.String valueProperty, java.lang.String labelProperty)
    {
        if (valueProperty == null || labelProperty == null)
        {
            throw new IllegalArgumentException("GroupScheduleFormImpl.setExportBackingList requires non-null property arguments");
        }

        this.exportValueList = null;
        this.exportLabelList = null;

        if (items != null)
        {
            this.exportValueList = new java.lang.Object[items.size()];
            this.exportLabelList = new java.lang.Object[items.size()];

            try
            {
                int i = 0;
                for (java.util.Iterator iterator = items.iterator(); iterator.hasNext(); i++)
                {
                    final java.lang.Object item = iterator.next();

                    this.exportValueList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, valueProperty);
                    this.exportLabelList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, labelProperty);
                }
            }
            catch (Exception ex)
            {
                throw new java.lang.RuntimeException("GroupScheduleFormImpl.setExportBackingList encountered an exception", ex);
            }
        }
    }

    /**
     * Resets the given <code>day</code>.
     */
    public void resetDay()
    {
        this.day = null;
    }

    public void setDayAsDate(java.util.Date day)
    {
        this.day = day;
    }

    /**
     * Returns the Date instance representing the <code>day</code> field.
     *
     * @see finf.ucf.cu.web.groupschedule.GroupScheduleFormImpl#getDay
     * @see finf.ucf.cu.web.groupschedule.GroupScheduleFormImpl#dayDateFormatter
     */
    public java.util.Date getDayAsDate()
    {
        return this.day;
    }

    public void setDay(java.lang.String day)
    {
        if (day == null || day.trim().length() == 0)
        {
            this.day = null;
        }
        else
        {
            try
            {
                this.day = dayDateFormatter.parse(day);
            }
            catch(java.text.ParseException e)
            {
                // we are not throwing an exception, let the validator handle these cases
                this.day = null;
            }
        }
    }

    /**
     * 
     *
     * This method returns a <code>java.lang.String</code> instance, in order to get the
     * <code>java.util.Date</code> instance see the <code>getDayAsDate()</code>
     * method.
     * <p>
     * The conversion from Date to String (and vice-versa) is done by means of a date formatter, which
     * can be accessed here: <code>getDayDateFormatter()</code>.
     *
     * @see finf.ucf.cu.web.groupschedule.GroupScheduleFormImpl#getDayAsDate
     * @see finf.ucf.cu.web.groupschedule.GroupScheduleFormImpl#getDayDateFormatter
     */
    public java.lang.String getDay()
    {
        return (day == null) ? null : dayDateFormatter.format(day);
    }

    /**
     * Returns the date formatter used for the <code>day</code> property.
     *
     * @see finf.ucf.cu.web.groupschedule.GroupScheduleFormImpl#getDay
     * @see finf.ucf.cu.web.groupschedule.GroupScheduleFormImpl#getDayAsDate
     */
    public static java.text.DateFormat getDayDateFormatter()
    {
        return GroupScheduleFormImpl.dayDateFormatter;
    }

    public java.lang.Object[] getDayBackingList()
    {
        java.lang.Object[] values = this.dayValueList;
        java.lang.Object[] labels = this.dayLabelList;

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

    public java.lang.Object[] getDayValueList()
    {
        return this.dayValueList;
    }

    public void setDayValueList(java.lang.Object[] dayValueList)
    {
        this.dayValueList = dayValueList;
    }

    public java.lang.Object[] getDayLabelList()
    {
        return this.dayLabelList;
    }

    public void setDayLabelList(java.lang.Object[] dayLabelList)
    {
        this.dayLabelList = dayLabelList;
    }

    public void setDayBackingList(java.util.Collection items, java.lang.String valueProperty, java.lang.String labelProperty)
    {
        if (valueProperty == null || labelProperty == null)
        {
            throw new IllegalArgumentException("GroupScheduleFormImpl.setDayBackingList requires non-null property arguments");
        }

        this.dayValueList = null;
        this.dayLabelList = null;

        if (items != null)
        {
            this.dayValueList = new java.lang.Object[items.size()];
            this.dayLabelList = new java.lang.Object[items.size()];

            try
            {
                int i = 0;
                for (java.util.Iterator iterator = items.iterator(); iterator.hasNext(); i++)
                {
                    final java.lang.Object item = iterator.next();

                    this.dayValueList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, valueProperty);
                    this.dayLabelList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, labelProperty);
                }
            }
            catch (Exception ex)
            {
                throw new java.lang.RuntimeException("GroupScheduleFormImpl.setDayBackingList encountered an exception", ex);
            }
        }
    }

    /**
     * Resets the given <code>mygroup</code>.
     */
    public void resetMygroup()
    {
        this.mygroup = null;
    }

    public void setMygroup(java.lang.Object mygroup)
    {
        this.mygroup = mygroup;
    }

    /**
     * <p>
     * Muestra todos los grupos
     * </p>
     */
    public java.lang.Object getMygroup()
    {
        return this.mygroup;
    }
    
    public java.lang.Object[] getMygroupBackingList()
    {
        java.lang.Object[] values = this.mygroupValueList;
        java.lang.Object[] labels = this.mygroupLabelList;

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

    public java.lang.Object[] getMygroupValueList()
    {
        return this.mygroupValueList;
    }

    public void setMygroupValueList(java.lang.Object[] mygroupValueList)
    {
        this.mygroupValueList = mygroupValueList;
    }

    public java.lang.Object[] getMygroupLabelList()
    {
        return this.mygroupLabelList;
    }

    public void setMygroupLabelList(java.lang.Object[] mygroupLabelList)
    {
        this.mygroupLabelList = mygroupLabelList;
    }

    public void setMygroupBackingList(java.util.Collection items, java.lang.String valueProperty, java.lang.String labelProperty)
    {
        if (valueProperty == null || labelProperty == null)
        {
            throw new IllegalArgumentException("GroupScheduleFormImpl.setMygroupBackingList requires non-null property arguments");
        }

        this.mygroupValueList = null;
        this.mygroupLabelList = null;

        if (items != null)
        {
            this.mygroupValueList = new java.lang.Object[items.size()];
            this.mygroupLabelList = new java.lang.Object[items.size()];

            try
            {
                int i = 0;
                for (java.util.Iterator iterator = items.iterator(); iterator.hasNext(); i++)
                {
                    final java.lang.Object item = iterator.next();

                    this.mygroupValueList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, valueProperty);
                    this.mygroupLabelList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, labelProperty);
                }
            }
            catch (Exception ex)
            {
                throw new java.lang.RuntimeException("GroupScheduleFormImpl.setMygroupBackingList encountered an exception", ex);
            }
        }
    }

    /**
     * Resets the given <code>groupSchedule</code>.
     */
    public void resetGroupSchedule()
    {
        this.groupSchedule = null;
    }

    public void setGroupSchedule(java.util.List groupSchedule)
    {
        this.groupSchedule = groupSchedule;
    }

    /**
     * 
     */
    public java.util.List getGroupSchedule()
    {
        return this.groupSchedule;
    }

    public void setGroupScheduleAsArray(Object[] groupSchedule)
    {
        this.groupSchedule = (groupSchedule == null) ? null : java.util.Arrays.asList(groupSchedule);
    }

    /**
     * Returns this collection as an array, if the collection itself would be <code>null</code> this method
     * will also return <code>null</code>.
     *
     * @see finf.ucf.cu.web.groupschedule.GroupScheduleFormImpl#getGroupSchedule
     */
    public java.lang.Object[] getGroupScheduleAsArray()
    {
        return (groupSchedule == null) ? null : groupSchedule.toArray();
    }
    
    public java.lang.Object[] getGroupScheduleBackingList()
    {
        java.lang.Object[] values = this.groupScheduleValueList;
        java.lang.Object[] labels = this.groupScheduleLabelList;

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

    public java.lang.Object[] getGroupScheduleValueList()
    {
        return this.groupScheduleValueList;
    }

    public void setGroupScheduleValueList(java.lang.Object[] groupScheduleValueList)
    {
        this.groupScheduleValueList = groupScheduleValueList;
    }

    public java.lang.Object[] getGroupScheduleLabelList()
    {
        return this.groupScheduleLabelList;
    }

    public void setGroupScheduleLabelList(java.lang.Object[] groupScheduleLabelList)
    {
        this.groupScheduleLabelList = groupScheduleLabelList;
    }

    public void setGroupScheduleBackingList(java.util.Collection items, java.lang.String valueProperty, java.lang.String labelProperty)
    {
        if (valueProperty == null || labelProperty == null)
        {
            throw new IllegalArgumentException("GroupScheduleFormImpl.setGroupScheduleBackingList requires non-null property arguments");
        }

        this.groupScheduleValueList = null;
        this.groupScheduleLabelList = null;

        if (items != null)
        {
            this.groupScheduleValueList = new java.lang.Object[items.size()];
            this.groupScheduleLabelList = new java.lang.Object[items.size()];

            try
            {
                int i = 0;
                for (java.util.Iterator iterator = items.iterator(); iterator.hasNext(); i++)
                {
                    final java.lang.Object item = iterator.next();

                    this.groupScheduleValueList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, valueProperty);
                    this.groupScheduleLabelList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, labelProperty);
                }
            }
            catch (Exception ex)
            {
                throw new java.lang.RuntimeException("GroupScheduleFormImpl.setGroupScheduleBackingList encountered an exception", ex);
            }
        }
    }

    /**
     * @see org.apache.struts.validator.ValidatorForm#reset(org.apache.struts.action.ActionMapping,javax.servlet.http.HttpServletRequest)
     */
    public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request)
    {
        this.export = null;
        this.mygroup = null;
    }

    public java.lang.String toString()
    {
        org.apache.commons.lang.builder.ToStringBuilder builder =
            new org.apache.commons.lang.builder.ToStringBuilder(this);
        builder.append("export", this.export);
        builder.append("day", this.day);
        builder.append("mygroup", this.mygroup);
        builder.append("groupSchedule", this.groupSchedule);
        return builder.toString();
    }

    /**
     * Allows you to clean all values from this form. Objects will be set to <code>null</code>, numeric values will be
     * set to zero and boolean values will be set to <code>false</code>. Backinglists for selectable fields will
     * also be set to <code>null</code>.
     */
    public void clean()
    {
        this.export = null;
        this.exportValueList = null;
        this.exportLabelList = null;
        this.day = null;
        this.dayValueList = null;
        this.dayLabelList = null;
        this.mygroup = null;
        this.mygroupValueList = null;
        this.mygroupLabelList = null;
        this.groupSchedule = null;
        this.groupScheduleValueList = null;
        this.groupScheduleLabelList = null;
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