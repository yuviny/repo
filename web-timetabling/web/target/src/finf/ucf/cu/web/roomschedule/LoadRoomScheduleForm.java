// license-header java merge-point
package finf.ucf.cu.web.roomschedule;

/**
 * This form encapsulates the fields that are used in the execution of the
 * <code>loadRoomSchedule</code> method, which is located on the
 * <code>finf.ucf.cu.web.roomschedule.RoomController</code> controller.
 *
 * 
 *
 * @see finf.ucf.cu.web.roomschedule.RoomController#loadRoomSchedule
 */
public interface LoadRoomScheduleForm
{
    /**
     * Sets the <code>exportl</code> field.
     *
     * 
     */
    public void setExportl(java.lang.Boolean exportl);

    /**
     * Gets the <code>exportl</code> field.
     *
     * 
     */
    public java.lang.Boolean getExportl();
    
    /**
     * Resets the <code>exportl</code> field.
     */
    public void resetExportl();

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
     * Sets the <code>myRoom</code> field.
     *
     * <p>
     * Muestra todos los locales
     * </p>
     */
    public void setMyRoom(java.lang.Object myRoom);

    /**
     * Gets the <code>myRoom</code> field.
     *
     * <p>
     * Muestra todos los locales
     * </p>
     */
    public java.lang.Object getMyRoom();
    
    /**
     * Resets the <code>myRoom</code> field.
     */
    public void resetMyRoom();

    /**
     * The <code>myRoom</code> field can be selected from a list,
     * this method allows you to retrieve the current elements from that list.
     * <p>
     * <i>Please note that the elements from that list are key value pairs, so you will
     * need to call <code>getLabel()</code> and <code>getValue()</code> to get the label and
     * value for this entry respectively.</i>
     *
     * @see #getMyRoom()
     * @see #getMyRoomValueList()
     * @see #getMyRoomLabelList()
     * @see #setMyRoomLabelList(java.util.Collection,java.lang.String,java.lang.String)
     */
    public java.lang.Object[] getMyRoomBackingList();

    /**
     * Convenient method to quickly set the value and label backinglist for the
     * myRoom property. This method takes a collection of objects, as well as
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
     * But you need to populate the myRoom backing list with the <code>id</code> properties as the values and the
     * <code>name</code> properties as the labels then you would make a call like this:
     * <code>setMyRoomBackingList(valueObjects, "id", "name")</code>
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
     * @see #getMyRoom()
     * @see #getMyRoomValueList()
     * @see #getMyRoomLabelList()
     * @see #getMyRoomLabelList()
     */
    public void setMyRoomBackingList(java.util.Collection items, String valueProperty, String labelProperty);

    /**
     * The <code>myRoom</code> field can be selected from a list,
     * this method allows you to retrieve the values from that list.
     *
     * @see #getMyRoom()
     * @see #getMyRoomBackingList()
     */
    public java.lang.Object[] getMyRoomValueList();

    /**
     * The <code>myRoom</code> field can be selected from a list,
     * this method allows you to set the values for that list.
     *
     * @see #getMyRoom()
     * @see #getMyRoomBackingList()
     */
    public void setMyRoomValueList(java.lang.Object[] myRoomValueList);

    /**
     * The <code>myRoom</code> field can be selected from a list,
     * this method allows you to retrieve the labels from that list.
     *
     * @see #getMyRoom()
     * @see #getMyRoomBackingList()
     */
    public java.lang.Object[] getMyRoomLabelList();

    /**
     * The <code>myRoom</code> field can be selected from a list,
     * this method allows you to set the labels for that list.
     *
     * @see #getMyRoom()
     * @see #getMyRoomBackingList()
     */
    public void setMyRoomLabelList(java.lang.Object[] myRoomLabelList);

}
