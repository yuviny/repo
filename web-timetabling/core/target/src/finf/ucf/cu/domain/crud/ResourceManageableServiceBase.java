// license-header java merge-point
package finf.ucf.cu.domain.crud;

public final class ResourceManageableServiceBase
    implements ResourceManageableService
{
    private finf.ucf.cu.domain.crud.ResourceManageableDao dao;

    public void setDao(finf.ucf.cu.domain.crud.ResourceManageableDao dao)
    {
        this.dao = dao;
    }

    protected finf.ucf.cu.domain.crud.ResourceManageableDao getDao()
    {
        return this.dao;
    }

    public finf.ucf.cu.domain.crud.ResourceValueObject create(java.lang.String name, java.lang.String description, java.lang.Long id)
        throws Exception
    {
        if (name == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ResourceManageableService.create(java.lang.String name, java.lang.String description, java.lang.Long id) - 'name' can not be null");
        }

        return toValueObject(dao.create(name, description, id));
    }

    public finf.ucf.cu.domain.crud.ResourceValueObject readById(java.lang.Long id)
        throws Exception
    {
        return toValueObject(dao.readById(id));
    }

    public java.util.List read(java.lang.String name, java.lang.String description, java.lang.Long id)
        throws Exception
    {
        return toValueObjects(dao.read(name, description, id));
    }

    public java.util.List readAll()
        throws Exception
    {
        return toValueObjects(dao.readAll());
    }

    public finf.ucf.cu.domain.crud.ResourceValueObject update(java.lang.String name, java.lang.String description, java.lang.Long id)
        throws Exception
    {
        if (name == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ResourceManageableService.update(java.lang.String name, java.lang.String description, java.lang.Long id) - 'name' can not be null");
        }

        if (id == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ResourceManageableService.update(java.lang.String name, java.lang.String description, java.lang.Long id) - 'id' can not be null");
        }

        return toValueObject(dao.update(name, description, id));
    }

    public void delete(java.lang.Long[] ids)
        throws Exception
    {
        if (ids == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ResourceManageableService.delete(java.lang.Long[] ids) - 'ids' can not be null");
        }

        dao.delete(ids);
    }


    private static java.util.List toValueObjects(java.util.Collection entities)
    {
        final java.util.List list = new java.util.ArrayList();

        for (java.util.Iterator iterator = entities.iterator(); iterator.hasNext();)
        {
            list.add(toValueObject((finf.ucf.cu.domain.Resource)iterator.next()));
        }

        return list;
    }

    private static finf.ucf.cu.domain.crud.ResourceValueObject toValueObject(finf.ucf.cu.domain.Resource entity)
    {
        final finf.ucf.cu.domain.crud.ResourceValueObject valueObject = new finf.ucf.cu.domain.crud.ResourceValueObject();

        valueObject.setName(entity.getName());
        valueObject.setDescription(entity.getDescription());
        valueObject.setId(entity.getId());

        return valueObject;
    }
}
