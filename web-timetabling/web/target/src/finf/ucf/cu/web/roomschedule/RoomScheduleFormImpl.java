// license-header java merge-point
package finf.ucf.cu.web.roomschedule;

public class RoomScheduleFormImpl
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
        , finf.ucf.cu.web.roomschedule.LoadRoomScheduleForm
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = 12279615201L;

    private java.util.List par = null;
    private java.lang.Object[] parValueList;
    private java.lang.Object[] parLabelList;
    private java.lang.Boolean exportl;
    private java.lang.Object[] exportlValueList;
    private java.lang.Object[] exportlLabelList;
    private java.util.Date date;
    private final static java.text.DateFormat dateDateFormatter = new java.text.SimpleDateFormat("dd/MM/yyyy");
    private java.lang.Object[] dateValueList;
    private java.lang.Object[] dateLabelList;
    private java.lang.Object myRoom;
    private java.lang.Object[] myRoomValueList;
    private java.lang.Object[] myRoomLabelList;

    public RoomScheduleFormImpl()
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
     * @see finf.ucf.cu.web.roomschedule.RoomScheduleFormImpl#getPar
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
            throw new IllegalArgumentException("RoomScheduleFormImpl.setParBackingList requires non-null property arguments");
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
                throw new java.lang.RuntimeException("RoomScheduleFormImpl.setParBackingList encountered an exception", ex);
            }
        }
    }

    /**
     * Resets the given <code>exportl</code>.
     */
    public void resetExportl()
    {
        this.exportl = null;
    }

    public void setExportl(java.lang.Boolean exportl)
    {
        this.exportl = exportl;
    }

    /**
     * 
     */
    public java.lang.Boolean getExportl()
    {
        return this.exportl;
    }
    
    public java.lang.Object[] getExportlBackingList()
    {
        java.lang.Object[] values = this.exportlValueList;
        java.lang.Object[] labels = this.exportlLabelList;

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

    public java.lang.Object[] getExportlValueList()
    {
        return this.exportlValueList;
    }

    public void setExportlValueList(java.lang.Object[] exportlValueList)
    {
        this.exportlValueList = exportlValueList;
    }

    public java.lang.Object[] getExportlLabelList()
    {
        return this.exportlLabelList;
    }

    public void setExportlLabelList(java.lang.Object[] exportlLabelList)
    {
        this.exportlLabelList = exportlLabelList;
    }

    public void setExportlBackingList(java.util.Collection items, java.lang.String valueProperty, java.lang.String labelProperty)
    {
        if (valueProperty == null || labelProperty == null)
        {
            throw new IllegalArgumentException("RoomScheduleFormImpl.setExportlBackingList requires non-null property arguments");
        }

        this.exportlValueList = null;
        this.exportlLabelList = null;

        if (items != null)
        {
            this.exportlValueList = new java.lang.Object[items.size()];
            this.exportlLabelList = new java.lang.Object[items.size()];

            try
            {
                int i = 0;
                for (java.util.Iterator iterator = items.iterator(); iterator.hasNext(); i++)
                {
                    final java.lang.Object item = iterator.next();

                    this.exportlValueList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, valueProperty);
                    this.exportlLabelList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, labelProperty);
                }
            }
            catch (Exception ex)
            {
                throw new java.lang.RuntimeException("RoomScheduleFormImpl.setExportlBackingList encountered an exception", ex);
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
     * @see finf.ucf.cu.web.roomschedule.RoomScheduleFormImpl#getDate
     * @see finf.ucf.cu.web.roomschedule.RoomScheduleFormImpl#dateDateFormatter
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
     * @see finf.ucf.cu.web.roomschedule.RoomScheduleFormImpl#getDateAsDate
     * @see finf.ucf.cu.web.roomschedule.RoomScheduleFormImpl#getDateDateFormatter
     */
    public java.lang.String getDate()
    {
        return (date == null) ? null : dateDateFormatter.format(date);
    }

    /**
     * Returns the date formatter used for the <code>date</code> property.
     *
     * @see finf.ucf.cu.web.roomschedule.RoomScheduleFormImpl#getDate
     * @see finf.ucf.cu.web.roomschedule.RoomScheduleFormImpl#getDateAsDate
     */
    public static java.text.DateFormat getDateDateFormatter()
    {
        return RoomScheduleFormImpl.dateDateFormatter;
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
            throw new IllegalArgumentException("RoomScheduleFormImpl.setDateBackingList requires non-null property arguments");
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
                throw new java.lang.RuntimeException("RoomScheduleFormImpl.setDateBackingList encountered an exception", ex);
            }
        }
    }

    /**
     * Resets the given <code>myRoom</code>.
     */
    public void resetMyRoom()
    {
        this.myRoom = null;
    }

    public void setMyRoom(java.lang.Object myRoom)
    {
        this.myRoom = myRoom;
    }

    /**
     * <p>
     * Muestra todos los locales
     * </p>
     */
    public java.lang.Object getMyRoom()
    {
        return this.myRoom;
    }
    
    public java.lang.Object[] getMyRoomBackingList()
    {
        java.lang.Object[] values = this.myRoomValueList;
        java.lang.Object[] labels = this.myRoomLabelList;

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

    public java.lang.Object[] getMyRoomValueList()
    {
        return this.myRoomValueList;
    }

    public void setMyRoomValueList(java.lang.Object[] myRoomValueList)
    {
        this.myRoomValueList = myRoomValueList;
    }

    public java.lang.Object[] getMyRoomLabelList()
    {
        return this.myRoomLabelList;
    }

    public void setMyRoomLabelList(java.lang.Object[] myRoomLabelList)
    {
        this.myRoomLabelList = myRoomLabelList;
    }

    public void setMyRoomBackingList(java.util.Collection items, java.lang.String valueProperty, java.lang.String labelProperty)
    {
        if (valueProperty == null || labelProperty == null)
        {
            throw new IllegalArgumentException("RoomScheduleFormImpl.setMyRoomBackingList requires non-null property arguments");
        }

        this.myRoomValueList = null;
        this.myRoomLabelList = null;

        if (items != null)
        {
            this.myRoomValueList = new java.lang.Object[items.size()];
            this.myRoomLabelList = new java.lang.Object[items.size()];

            try
            {
                int i = 0;
                for (java.util.Iterator iterator = items.iterator(); iterator.hasNext(); i++)
                {
                    final java.lang.Object item = iterator.next();

                    this.myRoomValueList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, valueProperty);
                    this.myRoomLabelList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, labelProperty);
                }
            }
            catch (Exception ex)
            {
                throw new java.lang.RuntimeException("RoomScheduleFormImpl.setMyRoomBackingList encountered an exception", ex);
            }
        }
    }

    /**
     * @see org.apache.struts.validator.ValidatorForm#reset(org.apache.struts.action.ActionMapping,javax.servlet.http.HttpServletRequest)
     */
    public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request)
    {
        this.exportl = null;
        this.myRoom = null;
    }

    public java.lang.String toString()
    {
        org.apache.commons.lang.builder.ToStringBuilder builder =
            new org.apache.commons.lang.builder.ToStringBuilder(this);
        builder.append("par", this.par);
        builder.append("exportl", this.exportl);
        builder.append("date", this.date);
        builder.append("myRoom", this.myRoom);
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
        this.exportl = null;
        this.exportlValueList = null;
        this.exportlLabelList = null;
        this.date = null;
        this.dateValueList = null;
        this.dateLabelList = null;
        this.myRoom = null;
        this.myRoomValueList = null;
        this.myRoomLabelList = null;
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