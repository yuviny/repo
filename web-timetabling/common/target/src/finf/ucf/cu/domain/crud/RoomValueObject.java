// license-header java merge-point
package finf.ucf.cu.domain.crud;

public class RoomValueObject
    implements java.io.Serializable
{
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

    private java.lang.String[] resourcesLabels;

    public java.lang.String[] getResourcesLabels()
    {
        return this.resourcesLabels;
    }

    public void setResourcesLabels(java.lang.String[] resourcesLabels)
    {
        this.resourcesLabels = resourcesLabels;
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

    private java.lang.String buildingIdLabel;

    public java.lang.String getBuildingIdLabel()
    {
        return this.buildingIdLabel;
    }

    public void setBuildingIdLabel(java.lang.String buildingIdLabel)
    {
        this.buildingIdLabel = buildingIdLabel;
    }

}