// license-header java merge-point
package finf.ucf.cu.domain.crud;

public final class RoomManageableServiceBase
    implements RoomManageableService
{
    private finf.ucf.cu.domain.crud.RoomManageableDao dao;

    public void setDao(finf.ucf.cu.domain.crud.RoomManageableDao dao)
    {
        this.dao = dao;
    }

    protected finf.ucf.cu.domain.crud.RoomManageableDao getDao()
    {
        return this.dao;
    }

    public finf.ucf.cu.domain.crud.RoomValueObject create(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.lang.Long id, java.lang.Long[] resources, java.lang.Long buildingId)
        throws Exception
    {
        if (name == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.RoomManageableService.create(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.lang.Long id, java.lang.Long[] resources, java.lang.Long buildingId) - 'name' can not be null");
        }

        if (size == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.RoomManageableService.create(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.lang.Long id, java.lang.Long[] resources, java.lang.Long buildingId) - 'size' can not be null");
        }

        if (abbreviation == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.RoomManageableService.create(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.lang.Long id, java.lang.Long[] resources, java.lang.Long buildingId) - 'abbreviation' can not be null");
        }

        if (buildingId == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.RoomManageableService.create(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.lang.Long id, java.lang.Long[] resources, java.lang.Long buildingId) - 'buildingId' can not be null");
        }

        return toValueObject(dao.create(name, size, abbreviation, id, resources, buildingId));
    }

    public finf.ucf.cu.domain.crud.RoomValueObject readById(java.lang.Long id)
        throws Exception
    {
        return toValueObject(dao.readById(id));
    }

    public java.util.List read(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.lang.Long id, java.lang.Long[] resources, java.lang.Long buildingId)
        throws Exception
    {
        return toValueObjects(dao.read(name, size, abbreviation, id, resources, buildingId));
    }

    public java.util.List readAll()
        throws Exception
    {
        return toValueObjects(dao.readAll());
    }

    public java.util.Map readBackingLists()
        throws Exception
    {
        return getDao().readBackingLists();
    }

    public finf.ucf.cu.domain.crud.RoomValueObject update(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.lang.Long id, java.lang.Long[] resources, java.lang.Long buildingId)
        throws Exception
    {
        if (name == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.RoomManageableService.update(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.lang.Long id, java.lang.Long[] resources, java.lang.Long buildingId) - 'name' can not be null");
        }

        if (size == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.RoomManageableService.update(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.lang.Long id, java.lang.Long[] resources, java.lang.Long buildingId) - 'size' can not be null");
        }

        if (abbreviation == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.RoomManageableService.update(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.lang.Long id, java.lang.Long[] resources, java.lang.Long buildingId) - 'abbreviation' can not be null");
        }

        if (id == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.RoomManageableService.update(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.lang.Long id, java.lang.Long[] resources, java.lang.Long buildingId) - 'id' can not be null");
        }

        if (buildingId == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.RoomManageableService.update(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.lang.Long id, java.lang.Long[] resources, java.lang.Long buildingId) - 'buildingId' can not be null");
        }

        return toValueObject(dao.update(name, size, abbreviation, id, resources, buildingId));
    }

    public void delete(java.lang.Long[] ids)
        throws Exception
    {
        if (ids == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.RoomManageableService.delete(java.lang.Long[] ids) - 'ids' can not be null");
        }

        dao.delete(ids);
    }


    private static java.util.List toValueObjects(java.util.Collection entities)
    {
        final java.util.List list = new java.util.ArrayList();

        for (java.util.Iterator iterator = entities.iterator(); iterator.hasNext();)
        {
            list.add(toValueObject((finf.ucf.cu.domain.Room)iterator.next()));
        }

        return list;
    }

    private static finf.ucf.cu.domain.crud.RoomValueObject toValueObject(finf.ucf.cu.domain.Room entity)
    {
        final finf.ucf.cu.domain.crud.RoomValueObject valueObject = new finf.ucf.cu.domain.crud.RoomValueObject();

        valueObject.setName(entity.getName());
        valueObject.setSize(entity.getSize());
        valueObject.setAbbreviation(entity.getAbbreviation());
        valueObject.setId(entity.getId());

        final java.util.Collection resources = entity.getResources();
        if (resources == null || resources.isEmpty())
        {
            valueObject.setResources(null);
            valueObject.setResourcesLabels(null);
        }
        else
        {
            final java.lang.Long[] values = new java.lang.Long[resources.size()];
            final java.lang.String[] labels = new java.lang.String[resources.size()];
            int counter = 0;
            for (final java.util.Iterator iterator = resources.iterator(); iterator.hasNext();counter++)
            {
                final finf.ucf.cu.domain.Resource element = (finf.ucf.cu.domain.Resource)iterator.next();
                values[counter] = element.getId();
                labels[counter] = element.getName();
            }
            valueObject.setResources(values);
            valueObject.setResourcesLabels(labels);
        }

        final finf.ucf.cu.domain.Building buildingId = entity.getBuildingId();
        if (buildingId != null)
        {
            valueObject.setBuildingId(buildingId.getId());
            valueObject.setBuildingIdLabel(buildingId.getName());
        }

        return valueObject;
    }
}
