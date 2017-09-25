// license-header java merge-point
package finf.ucf.cu.domain.crud;

public final class TeacherForm
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

    private java.lang.String email;

    public java.lang.String getEmail()
    {
        return this.email;
    }

    public void setEmail(java.lang.String email)
    {
        this.email = email;
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

    private java.lang.String firstName;

    public java.lang.String getFirstName()
    {
        return this.firstName;
    }

    public void setFirstName(java.lang.String firstName)
    {
        this.firstName = firstName;
    }

    private java.lang.String lastName;

    public java.lang.String getLastName()
    {
        return this.lastName;
    }

    public void setLastName(java.lang.String lastName)
    {
        this.lastName = lastName;
    }

    private java.lang.String grade;

    public java.lang.String getGrade()
    {
        return this.grade;
    }

    public void setGrade(java.lang.String grade)
    {
        this.grade = grade;
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

    private java.lang.Long departmentId;

    public java.lang.Long getDepartmentId()
    {
        return this.departmentId;
    }

    public void setDepartmentId(java.lang.Long departmentId)
    {
        this.departmentId = departmentId;
    }

    private java.util.List departmentIdBackingList;

    public java.util.List getDepartmentIdBackingList()
    {
        return this.departmentIdBackingList;
    }

    public void setDepartmentIdBackingList(java.util.List departmentIdBackingList)
    {
        this.departmentIdBackingList = departmentIdBackingList;
    }

    /**
     * @see org.apache.struts.validator.ValidatorForm#reset(org.apache.struts.action.ActionMapping,javax.servlet.http.HttpServletRequest)
     */
    public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request)
    {
        email = null;
        name = null;
        firstName = null;
        lastName = null;
        grade = null;
        id = null;
        departmentId = null;
        departmentIdBackingList = null;
    }
}