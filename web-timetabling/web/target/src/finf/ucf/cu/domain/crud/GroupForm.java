// license-header java merge-point
package finf.ucf.cu.domain.crud;

public final class GroupForm
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

    private java.lang.Integer size;

    public java.lang.Integer getSize()
    {
        return this.size;
    }

    public void setSize(java.lang.Integer size)
    {
        this.size = size;
    }

    private java.lang.String abbreviation;

    public java.lang.String getAbbreviation()
    {
        return this.abbreviation;
    }

    public void setAbbreviation(java.lang.String abbreviation)
    {
        this.abbreviation = abbreviation;
    }

    private java.util.Date dateBegin1Semester;

    public java.util.Date getDateBegin1Semester()
    {
        return this.dateBegin1Semester;
    }

    public void setDateBegin1Semester(java.util.Date dateBegin1Semester)
    {
        this.dateBegin1Semester = dateBegin1Semester;
    }

    private static final java.text.DateFormat dateBegin1SemesterFormatter = new java.text.SimpleDateFormat("dd/MM/yyyy");
    static { dateBegin1SemesterFormatter.setLenient(true); }

    public java.lang.String getDateBegin1SemesterAsString()
    {
        return (dateBegin1Semester == null) ? null : dateBegin1SemesterFormatter.format(dateBegin1Semester);
    }

    public void setDateBegin1SemesterAsString(java.lang.String dateBegin1Semester)
    {
        try
        {
            this.dateBegin1Semester = (org.apache.commons.lang.StringUtils.isBlank(dateBegin1Semester)) ? null : dateBegin1SemesterFormatter.parse(dateBegin1Semester);
        }
        catch (java.text.ParseException pe)
        {
            throw new java.lang.RuntimeException(pe);
        }
    }

    private java.util.Date dateBegin2Semester;

    public java.util.Date getDateBegin2Semester()
    {
        return this.dateBegin2Semester;
    }

    public void setDateBegin2Semester(java.util.Date dateBegin2Semester)
    {
        this.dateBegin2Semester = dateBegin2Semester;
    }

    private static final java.text.DateFormat dateBegin2SemesterFormatter = new java.text.SimpleDateFormat("dd/MM/yyyy");
    static { dateBegin2SemesterFormatter.setLenient(true); }

    public java.lang.String getDateBegin2SemesterAsString()
    {
        return (dateBegin2Semester == null) ? null : dateBegin2SemesterFormatter.format(dateBegin2Semester);
    }

    public void setDateBegin2SemesterAsString(java.lang.String dateBegin2Semester)
    {
        try
        {
            this.dateBegin2Semester = (org.apache.commons.lang.StringUtils.isBlank(dateBegin2Semester)) ? null : dateBegin2SemesterFormatter.parse(dateBegin2Semester);
        }
        catch (java.text.ParseException pe)
        {
            throw new java.lang.RuntimeException(pe);
        }
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

    private java.lang.Long subGroupId;

    public java.lang.Long getSubGroupId()
    {
        return this.subGroupId;
    }

    public void setSubGroupId(java.lang.Long subGroupId)
    {
        this.subGroupId = subGroupId;
    }

    private java.util.List subGroupIdBackingList;

    public java.util.List getSubGroupIdBackingList()
    {
        return this.subGroupIdBackingList;
    }

    public void setSubGroupIdBackingList(java.util.List subGroupIdBackingList)
    {
        this.subGroupIdBackingList = subGroupIdBackingList;
    }

    /**
     * @see org.apache.struts.validator.ValidatorForm#reset(org.apache.struts.action.ActionMapping,javax.servlet.http.HttpServletRequest)
     */
    public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request)
    {
        name = null;
        size = null;
        abbreviation = null;
        dateBegin1Semester = null;
        dateBegin2Semester = null;
        id = null;
        subGroupId = null;
        subGroupIdBackingList = null;
    }
}