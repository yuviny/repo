// license-header java merge-point
package finf.ucf.cu.domain.crud;

public final class ActivityForm
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

    private java.lang.Integer number;

    public java.lang.Integer getNumber()
    {
        return this.number;
    }

    public void setNumber(java.lang.Integer number)
    {
        this.number = number;
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

    private java.lang.Integer hour_cant;

    public java.lang.Integer getHour_cant()
    {
        return this.hour_cant;
    }

    public void setHour_cant(java.lang.Integer hour_cant)
    {
        this.hour_cant = hour_cant;
    }

    private java.lang.Integer week;

    public java.lang.Integer getWeek()
    {
        return this.week;
    }

    public void setWeek(java.lang.Integer week)
    {
        this.week = week;
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

    private java.lang.Long classTypeId;

    public java.lang.Long getClassTypeId()
    {
        return this.classTypeId;
    }

    public void setClassTypeId(java.lang.Long classTypeId)
    {
        this.classTypeId = classTypeId;
    }

    private java.util.List classTypeIdBackingList;

    public java.util.List getClassTypeIdBackingList()
    {
        return this.classTypeIdBackingList;
    }

    public void setClassTypeIdBackingList(java.util.List classTypeIdBackingList)
    {
        this.classTypeIdBackingList = classTypeIdBackingList;
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

    private java.lang.Long themeId;

    public java.lang.Long getThemeId()
    {
        return this.themeId;
    }

    public void setThemeId(java.lang.Long themeId)
    {
        this.themeId = themeId;
    }

    private java.util.List themeIdBackingList;

    public java.util.List getThemeIdBackingList()
    {
        return this.themeIdBackingList;
    }

    public void setThemeIdBackingList(java.util.List themeIdBackingList)
    {
        this.themeIdBackingList = themeIdBackingList;
    }

    /**
     * @see org.apache.struts.validator.ValidatorForm#reset(org.apache.struts.action.ActionMapping,javax.servlet.http.HttpServletRequest)
     */
    public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request)
    {
        number = null;
        name = null;
        hour_cant = null;
        week = null;
        id = null;
        classTypeId = null;
        classTypeIdBackingList = null;
        resources = null;
        resourcesBackingList = null;
        themeId = null;
        themeIdBackingList = null;
    }
}