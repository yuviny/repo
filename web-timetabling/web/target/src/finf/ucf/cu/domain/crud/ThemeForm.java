// license-header java merge-point
package finf.ucf.cu.domain.crud;

public final class ThemeForm
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

    private java.lang.Long punoId;

    public java.lang.Long getPunoId()
    {
        return this.punoId;
    }

    public void setPunoId(java.lang.Long punoId)
    {
        this.punoId = punoId;
    }

    private java.util.List punoIdBackingList;

    public java.util.List getPunoIdBackingList()
    {
        return this.punoIdBackingList;
    }

    public void setPunoIdBackingList(java.util.List punoIdBackingList)
    {
        this.punoIdBackingList = punoIdBackingList;
    }

    /**
     * @see org.apache.struts.validator.ValidatorForm#reset(org.apache.struts.action.ActionMapping,javax.servlet.http.HttpServletRequest)
     */
    public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request)
    {
        name = null;
        id = null;
        punoId = null;
        punoIdBackingList = null;
    }
}