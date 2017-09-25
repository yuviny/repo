// license-header java merge-point
package finf.ucf.cu.domain.crud;

public final class NotAvalabilityForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
    private java.util.List manageableList = null;

    public java.util.List getManageableList()
    {
        return this.manageableList;
    }

    public void setManageableList(java.util.List manageableList)
    {
        this.manageableList = manageableList;
    }

    private java.lang.Long[] selectedRows = null;

    public java.lang.Long[] getSelectedRows()
    {
        return this.selectedRows;
    }

    public void setSelectedRows(java.lang.Long[] selectedRows)
    {
        this.selectedRows = selectedRows;
    }

    private java.util.Date date;

    public java.util.Date getDate()
    {
        return this.date;
    }

    public void setDate(java.util.Date date)
    {
        this.date = date;
    }

    private static final java.text.DateFormat dateFormatter = new java.text.SimpleDateFormat("dd/MM/yyyy");
    static { dateFormatter.setLenient(true); }

    public java.lang.String getDateAsString()
    {
        return (date == null) ? null : dateFormatter.format(date);
    }

    public void setDateAsString(java.lang.String date)
    {
        try
        {
            this.date = (org.apache.commons.lang.StringUtils.isBlank(date)) ? null : dateFormatter.parse(date);
        }
        catch (java.text.ParseException pe)
        {
            throw new java.lang.RuntimeException(pe);
        }
    }

    private java.lang.Integer not_time;

    public java.lang.Integer getNot_time()
    {
        return this.not_time;
    }

    public void setNot_time(java.lang.Integer not_time)
    {
        this.not_time = not_time;
    }

    private java.lang.Long id;

    public java.lang.Long getId()
    {
        return this.id;
    }

    public void setId(java.lang.Long id)
    {
        this.id = id;
    }

    private java.lang.Long teacherId;

    public java.lang.Long getTeacherId()
    {
        return this.teacherId;
    }

    public void setTeacherId(java.lang.Long teacherId)
    {
        this.teacherId = teacherId;
    }

    private java.util.List teacherIdBackingList;

    public java.util.List getTeacherIdBackingList()
    {
        return this.teacherIdBackingList;
    }

    public void setTeacherIdBackingList(java.util.List teacherIdBackingList)
    {
        this.teacherIdBackingList = teacherIdBackingList;
    }

    private java.lang.Long groupId;

    public java.lang.Long getGroupId()
    {
        return this.groupId;
    }

    public void setGroupId(java.lang.Long groupId)
    {
        this.groupId = groupId;
    }

    private java.util.List groupIdBackingList;

    public java.util.List getGroupIdBackingList()
    {
        return this.groupIdBackingList;
    }

    public void setGroupIdBackingList(java.util.List groupIdBackingList)
    {
        this.groupIdBackingList = groupIdBackingList;
    }

    private java.lang.Long subjectId;

    public java.lang.Long getSubjectId()
    {
        return this.subjectId;
    }

    public void setSubjectId(java.lang.Long subjectId)
    {
        this.subjectId = subjectId;
    }

    private java.util.List subjectIdBackingList;

    public java.util.List getSubjectIdBackingList()
    {
        return this.subjectIdBackingList;
    }

    public void setSubjectIdBackingList(java.util.List subjectIdBackingList)
    {
        this.subjectIdBackingList = subjectIdBackingList;
    }

    /**
     * @see org.apache.struts.validator.ValidatorForm#reset(org.apache.struts.action.ActionMapping,javax.servlet.http.HttpServletRequest)
     */
    public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request)
    {
        date = null;
        not_time = null;
        id = null;
        teacherId = null;
        teacherIdBackingList = null;
        groupId = null;
        groupIdBackingList = null;
        subjectId = null;
        subjectIdBackingList = null;
    }
}