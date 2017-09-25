// license-header java merge-point
package finf.ucf.cu.domain.crud;

public final class DepartmentForm
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

    private java.lang.Long id;

    public java.lang.Long getId()
    {
        return this.id;
    }

    public void setId(java.lang.Long id)
    {
        this.id = id;
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
        id = null;
        teacher = null;
        teacherBackingList = null;
    }
}