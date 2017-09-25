// license-header java merge-point
package finf.ucf.cu.web.teacherSchedule;

/**
 * This form encapsulates the fields that are used in the execution of the
 * <code>loadTeacher</code> method, which is located on the
 * <code>finf.ucf.cu.web.teacherSchedule.TeacherController</code> controller.
 *
 * 
 *
 * @see finf.ucf.cu.web.teacherSchedule.TeacherController#loadTeacher
 */
public interface LoadTeacherForm
{
    /**
     * Sets the <code>exportt</code> field.
     *
     * 
     */
    public void setExportt(java.lang.Boolean exportt);

    /**
     * Gets the <code>exportt</code> field.
     *
     * 
     */
    public java.lang.Boolean getExportt();
    
    /**
     * Resets the <code>exportt</code> field.
     */
    public void resetExportt();

    /**
     * This field is a date type, and this method allows you to set it into the form.
     *
     * 
     *
     * @see #setDate(java.lang.String)
     */
    public void setDateAsDate(java.util.Date date);

    /**
     * This field is a date type, and this method allows you to get it from the form.
     *
     * 
     *
     * @see #getDate()
     */
    public java.util.Date getDateAsDate();

    /**
     * This field is a date type, and this method allows you to set it into the form as a String.
     *
     * 
     *
     * @see #setDate#sDate(java.util.Date)
     */
    public void setDate(java.lang.String date);

    /**
     * This field is a date type, and this method allows you to get it from the form as a String.
     *
     * 
     *
     * @see #getDate#sDate()
     */
    public java.lang.String getDate();

    /**
     * Resets the <code>date</code> field.
     */
    public void resetDate();

    /**
     * Sets the <code>myTeacher</code> field.
     *
     * <p>
     * Muestra todo los Profesores
     * </p>
     */
    public void setMyTeacher(java.lang.Object myTeacher);

    /**
     * Gets the <code>myTeacher</code> field.
     *
     * <p>
     * Muestra todo los Profesores
     * </p>
     */
    public java.lang.Object getMyTeacher();
    
    /**
     * Resets the <code>myTeacher</code> field.
     */
    public void resetMyTeacher();

    /**
     * The <code>myTeacher</code> field can be selected from a list,
     * this method allows you to retrieve the current elements from that list.
     * <p>
     * <i>Please note that the elements from that list are key value pairs, so you will
     * need to call <code>getLabel()</code> and <code>getValue()</code> to get the label and
     * value for this entry respectively.</i>
     *
     * @see #getMyTeacher()
     * @see #getMyTeacherValueList()
     * @see #getMyTeacherLabelList()
     * @see #setMyTeacherLabelList(java.util.Collection,java.lang.String,java.lang.String)
     */
    public java.lang.Object[] getMyTeacherBackingList();

    /**
     * Convenient method to quickly set the value and label backinglist for the
     * myTeacher property. This method takes a collection of objects, as well as
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
     * But you need to populate the myTeacher backing list with the <code>id</code> properties as the values and the
     * <code>name</code> properties as the labels then you would make a call like this:
     * <code>setMyTeacherBackingList(valueObjects, "id", "name")</code>
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
     * @see #getMyTeacher()
     * @see #getMyTeacherValueList()
     * @see #getMyTeacherLabelList()
     * @see #getMyTeacherLabelList()
     */
    public void setMyTeacherBackingList(java.util.Collection items, String valueProperty, String labelProperty);

    /**
     * The <code>myTeacher</code> field can be selected from a list,
     * this method allows you to retrieve the values from that list.
     *
     * @see #getMyTeacher()
     * @see #getMyTeacherBackingList()
     */
    public java.lang.Object[] getMyTeacherValueList();

    /**
     * The <code>myTeacher</code> field can be selected from a list,
     * this method allows you to set the values for that list.
     *
     * @see #getMyTeacher()
     * @see #getMyTeacherBackingList()
     */
    public void setMyTeacherValueList(java.lang.Object[] myTeacherValueList);

    /**
     * The <code>myTeacher</code> field can be selected from a list,
     * this method allows you to retrieve the labels from that list.
     *
     * @see #getMyTeacher()
     * @see #getMyTeacherBackingList()
     */
    public java.lang.Object[] getMyTeacherLabelList();

    /**
     * The <code>myTeacher</code> field can be selected from a list,
     * this method allows you to set the labels for that list.
     *
     * @see #getMyTeacher()
     * @see #getMyTeacherBackingList()
     */
    public void setMyTeacherLabelList(java.lang.Object[] myTeacherLabelList);

}
