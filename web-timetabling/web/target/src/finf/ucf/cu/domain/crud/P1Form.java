// license-header java merge-point
package finf.ucf.cu.domain.crud;

public final class P1Form
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

    private java.lang.String name;

    public java.lang.String getName()
    {
        return this.name;
    }

    public void setName(java.lang.String name)
    {
        this.name = name;
    }

    private java.util.Date endDate;

    public java.util.Date getEndDate()
    {
        return this.endDate;
    }

    public void setEndDate(java.util.Date endDate)
    {
        this.endDate = endDate;
    }

    private static final java.text.DateFormat endDateFormatter = new java.text.SimpleDateFormat("dd/MM/yyyy");
    static { endDateFormatter.setLenient(true); }

    public java.lang.String getEndDateAsString()
    {
        return (endDate == null) ? null : endDateFormatter.format(endDate);
    }

    public void setEndDateAsString(java.lang.String endDate)
    {
        try
        {
            this.endDate = (org.apache.commons.lang.StringUtils.isBlank(endDate)) ? null : endDateFormatter.parse(endDate);
        }
        catch (java.text.ParseException pe)
        {
            throw new java.lang.RuntimeException(pe);
        }
    }

    private java.lang.String approved_by;

    public java.lang.String getApproved_by()
    {
        return this.approved_by;
    }

    public void setApproved_by(java.lang.String approved_by)
    {
        this.approved_by = approved_by;
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

    private java.lang.Long teacher;

    public java.lang.Long getTeacher()
    {
        return this.teacher;
    }

    public void setTeacher(java.lang.Long teacher)
    {
        this.teacher = teacher;
    }

    private java.util.List teacherBackingList;

    public java.util.List getTeacherBackingList()
    {
        return this.teacherBackingList;
    }

    public void setTeacherBackingList(java.util.List teacherBackingList)
    {
        this.teacherBackingList = teacherBackingList;
    }

    /**
     * @see org.apache.struts.validator.ValidatorForm#reset(org.apache.struts.action.ActionMapping,javax.servlet.http.HttpServletRequest)
     */
    public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request)
    {
        name = null;
        endDate = null;
        approved_by = null;
        id = null;
        subjectId = null;
        subjectIdBackingList = null;
        teacher = null;
        teacherBackingList = null;
    }
}