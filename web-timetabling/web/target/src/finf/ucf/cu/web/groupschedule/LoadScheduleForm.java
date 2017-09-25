// license-header java merge-point
package finf.ucf.cu.web.groupschedule;

/**
 * This form encapsulates the fields that are used in the execution of the
 * <code>loadSchedule</code> method, which is located on the
 * <code>finf.ucf.cu.web.groupschedule.GroupScheduleController</code> controller.
 *
 * 
 *
 * @see finf.ucf.cu.web.groupschedule.GroupScheduleController#loadSchedule
 */
public interface LoadScheduleForm
{
    /**
     * Sets the <code>export</code> field.
     *
     * 
     */
    public void setExport(java.lang.Boolean export);

    /**
     * Gets the <code>export</code> field.
     *
     * 
     */
    public java.lang.Boolean getExport();
    
    /**
     * Resets the <code>export</code> field.
     */
    public void resetExport();

    /**
     * This field is a date type, and this method allows you to set it into the form.
     *
     * 
     *
     * @see #setDay(java.lang.String)
     */
    public void setDayAsDate(java.util.Date day);

    /**
     * This field is a date type, and this method allows you to get it from the form.
     *
     * 
     *
     * @see #getDay()
     */
    public java.util.Date getDayAsDate();

    /**
     * This field is a date type, and this method allows you to set it into the form as a String.
     *
     * 
     *
     * @see #setDay#sDate(java.util.Date)
     */
    public void setDay(java.lang.String day);

    /**
     * This field is a date type, and this method allows you to get it from the form as a String.
     *
     * 
     *
     * @see #getDay#sDate()
     */
    public java.lang.String getDay();

    /**
     * Resets the <code>day</code> field.
     */
    public void resetDay();

    /**
     * Sets the <code>mygroup</code> field.
     *
     * <p>
     * Muestra todos los grupos
     * </p>
     */
    public void setMygroup(java.lang.Object mygroup);

    /**
     * Gets the <code>mygroup</code> field.
     *
     * <p>
     * Muestra todos los grupos
     * </p>
     */
    public java.lang.Object getMygroup();
    
    /**
     * Resets the <code>mygroup</code> field.
     */
    public void resetMygroup();

    /**
     * The <code>mygroup</code> field can be selected from a list,
     * this method allows you to retrieve the current elements from that list.
     * <p>
     * <i>Please note that the elements from that list are key value pairs, so you will
     * need to call <code>getLabel()</code> and <code>getValue()</code> to get the label and
     * value for this entry respectively.</i>
     *
     * @see #getMygroup()
     * @see #getMygroupValueList()
     * @see #getMygroupLabelList()
     * @see #setMygroupLabelList(java.util.Collection,java.lang.String,java.lang.String)
     */
    public java.lang.Object[] getMygroupBackingList();

    /**
     * Convenient method to quickly set the value and label backinglist for the
     * mygroup property. This method takes a collection of objects, as well as
     * the property names to query on these objects in order to find the corresponding
     * values and labels.
     * <p>
     * Let's say you have a set of value objects with the following properties:
     * <ul>
     *  <li><code>id</code></li>
     *  <li><code>code</code></li>
     *  <li><code>name</code></li>
     *  <li><code>description</code></li>
     * </ul>
     * But you need to populate the mygroup backing list with the <code>id</code> properties as the values and the
     * <code>name</code> properties as the labels then you would make a call like this:
     * <code>setMygroupBackingList(valueObjects, "id", "name")</code>
     * <p>
     * This method knows how to handle primitive property types as it simply delegates to
     * <code>org.apache.commons.beanutils.PropertyUtils.getProperty(Object, String)</code>.
     *
     * @param items The items from which to read the properties, if this argument is <code>null</code> this method
     *        will simply clear the existing values and labels
     * @param valueProperty the name of the property to query on each object to retrieve
     *        the corresponding value, cannot be <code>null</code>
     * @throws java.lang.IllegalArgumentException if the valueProperty or labelProperty is <code>null</code>
     * @throws java.lang.RuntimeException if one of the items in the collection is <code>null</code>, or
     *         if the caller does not have access one of the object's properties, if an exception was thrown while
     *         accessing a property or if the property does not exist on at least one of the items
     *
     * @see #getMygroup()
     * @see #getMygroupValueList()
     * @see #getMygroupLabelList()
     * @see #getMygroupLabelList()
     */
    public void setMygroupBackingList(java.util.Collection items, String valueProperty, String labelProperty);

    /**
     * The <code>mygroup</code> field can be selected from a list,
     * this method allows you to retrieve the values from that list.
     *
     * @see #getMygroup()
     * @see #getMygroupBackingList()
     */
    public java.lang.Object[] getMygroupValueList();

    /**
     * The <code>mygroup</code> field can be selected from a list,
     * this method allows you to set the values for that list.
     *
     * @see #getMygroup()
     * @see #getMygroupBackingList()
     */
    public void setMygroupValueList(java.lang.Object[] mygroupValueList);

    /**
     * The <code>mygroup</code> field can be selected from a list,
     * this method allows you to retrieve the labels from that list.
     *
     * @see #getMygroup()
     * @see #getMygroupBackingList()
     */
    public java.lang.Object[] getMygroupLabelList();

    /**
     * The <code>mygroup</code> field can be selected from a list,
     * this method allows you to set the labels for that list.
     *
     * @see #getMygroup()
     * @see #getMygroupBackingList()
     */
    public void setMygroupLabelList(java.lang.Object[] mygroupLabelList);

    /**
     * This field is a collection type, and this method allows you to set it into the form.
     *
     * 
     *
     * @see #setGroupSchedule#sArray(Object[])
     */
    public void setGroupSchedule(java.util.List groupSchedule);

    /**
     * This field is a collection type, and this method allows you to get it from the form.
     *
     * 
     *
     * @see #getGroupSchedule#sArray()
     */
    public java.util.List getGroupSchedule();

    /**
     * This field is a collection type, and this method allows you to set it as an
     * array into the form, conversion will be automatically performed.
     *
     * 
     *
     * @see #setGroupSchedule(java.util.List)
     */
    public void setGroupScheduleAsArray(Object[] groupSchedule);

    /**
     * This field is a collection type, and this method allows you to get it as an
     * array from the form, conversion will be automatically performed.
     *
     * 
     *
     * @see #getGroupSchedule()
     */
    public java.lang.Object[] getGroupScheduleAsArray();

    /**
     * Resets the <code>groupSchedule</code> field.
     */
    public void resetGroupSchedule();

}
