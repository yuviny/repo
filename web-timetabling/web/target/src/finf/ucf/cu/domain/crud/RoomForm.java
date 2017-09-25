// license-header java merge-point
package finf.ucf.cu.domain.crud;

public final class RoomForm
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

    private java.lang.Long id;

    public java.lang.Long getId()
    {
        return this.id;
    }

    public void setId(java.lang.Long id)
    {
        this.id = id;
    }

    private java.lang.Long[] resources;

    public java.lang.Long[] getResources()
    {
        return this.resources;
    }

    public void setResources(java.lang.Long[] resources)
    {
        this.resources = resources;
    }

    private java.util.List resourcesBackingList;

    public java.util.List getResourcesBackingList()
    {
        return this.resourcesBackingList;
    }

    public void setResourcesBackingList(java.util.List resourcesBackingList)
    {
        this.resourcesBackingList = resourcesBackingList;
    }

    private java.lang.Long buildingId;

    public java.lang.Long getBuildingId()
    {
        return this.buildingId;
    }

    public void setBuildingId(java.lang.Long buildingId)
    {
        this.buildingId = buildingId;
    }

    private java.util.List buildingIdBackingList;

    public java.util.List getBuildingIdBackingList()
    {
        return this.buildingIdBackingList;
    }

    public void setBuildingIdBackingList(java.util.List buildingIdBackingList)
    {
        this.buildingIdBackingList = buildingIdBackingList;
    }

    /**
     * @see org.apache.struts.validator.ValidatorForm#reset(org.apache.struts.action.ActionMapping,javax.servlet.http.HttpServletRequest)
     */
    public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request)
    {
        name = null;
        size = null;
        abbreviation = null;
        id = null;
        resources = null;
        resourcesBackingList = null;
        buildingId = null;
        buildingIdBackingList = null;
    }
}