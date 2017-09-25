// license-header java merge-point
package finf.ucf.cu.domain.crud;

public final class BuildingManageableServiceBase
    implements BuildingManageableService
{
    private finf.ucf.cu.domain.crud.BuildingManageableDao dao;

    public void setDao(finf.ucf.cu.domain.crud.BuildingManageableDao dao)
    {
        this.dao = dao;
    }

    protected finf.ucf.cu.domain.crud.BuildingManageableDao getDao()
    {
        return this.dao;
    }

    public finf.ucf.cu.domain.crud.BuildingValueObject create(java.lang.String name, java.lang.String address, java.lang.Long id)
        throws Exception
    {
        if (name == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.BuildingManageableService.create(java.lang.String name, java.lang.String address, java.lang.Long id) - 'name' can not be null");
        }

        return toValueObject(dao.create(name, address, id));
    }

    public finf.ucf.cu.domain.crud.BuildingValueObject readById(java.lang.Long id)
        throws Exception
    {
        return toValueObject(dao.readById(id));
    }

    public java.util.List read(java.lang.String name, java.lang.String address, java.lang.Long id)
        throws Exception
    {
        return toValueObjects(dao.read(name, address, id));
    }

    public java.util.List readAll()
        throws Exception
    {
        return toValueObjects(dao.readAll());
    }

    public finf.ucf.cu.domain.crud.BuildingValueObject update(java.lang.String name, java.lang.String address, java.lang.Long id)
        throws Exception
    {
        if (name == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.BuildingManageableService.update(java.lang.String name, java.lang.String address, java.lang.Long id) - 'name' can not be null");
        }

        if (id == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.BuildingManageableService.update(java.lang.String name, java.lang.String address, java.lang.Long id) - 'id' can not be null");
        }

        return toValueObject(dao.update(name, address, id));
    }

    public void delete(java.lang.Long[] ids)
        throws Exception
    {
        if (ids == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.BuildingManageableService.delete(java.lang.Long[] ids) - 'ids' can not be null");
        }

        dao.delete(ids);
    }


    private static java.util.List toValueObjects(java.util.Collection entities)
    {
        final java.util.List list = new java.util.ArrayList();

        for (java.util.Iterator iterator = entities.iterator(); iterator.hasNext();)
        {
            list.add(toValueObject((finf.ucf.cu.domain.Building)iterator.next()));
        }

        return list;
    }

    private static finf.ucf.cu.domain.crud.BuildingValueObject toValueObject(finf.ucf.cu.domain.Building entity)
    {
        final finf.ucf.cu.domain.crud.BuildingValueObject valueObject = new finf.ucf.cu.domain.crud.BuildingValueObject();

        valueObject.setName(entity.getName());
        valueObject.setAddress(entity.getAddress());
        valueObject.setId(entity.getId());

        return valueObject;
    }
}
