// license-header java merge-point
package finf.ucf.cu.domain.crud;

public final class ThemeManageableServiceBase
    implements ThemeManageableService
{
    private finf.ucf.cu.domain.crud.ThemeManageableDao dao;

    public void setDao(finf.ucf.cu.domain.crud.ThemeManageableDao dao)
    {
        this.dao = dao;
    }

    protected finf.ucf.cu.domain.crud.ThemeManageableDao getDao()
    {
        return this.dao;
    }

    public finf.ucf.cu.domain.crud.ThemeValueObject create(java.lang.String name, java.lang.Long id, java.lang.Long punoId)
        throws Exception
    {
        if (name == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ThemeManageableService.create(java.lang.String name, java.lang.Long id, java.lang.Long punoId) - 'name' can not be null");
        }

        if (punoId == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ThemeManageableService.create(java.lang.String name, java.lang.Long id, java.lang.Long punoId) - 'punoId' can not be null");
        }

        return toValueObject(dao.create(name, id, punoId));
    }

    public finf.ucf.cu.domain.crud.ThemeValueObject readById(java.lang.Long id)
        throws Exception
    {
        return toValueObject(dao.readById(id));
    }

    public java.util.List read(java.lang.String name, java.lang.Long id, java.lang.Long punoId)
        throws Exception
    {
        return toValueObjects(dao.read(name, id, punoId));
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

    public finf.ucf.cu.domain.crud.ThemeValueObject update(java.lang.String name, java.lang.Long id, java.lang.Long punoId)
        throws Exception
    {
        if (name == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ThemeManageableService.update(java.lang.String name, java.lang.Long id, java.lang.Long punoId) - 'name' can not be null");
        }

        if (id == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ThemeManageableService.update(java.lang.String name, java.lang.Long id, java.lang.Long punoId) - 'id' can not be null");
        }

        if (punoId == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ThemeManageableService.update(java.lang.String name, java.lang.Long id, java.lang.Long punoId) - 'punoId' can not be null");
        }

        return toValueObject(dao.update(name, id, punoId));
    }

    public void delete(java.lang.Long[] ids)
        throws Exception
    {
        if (ids == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ThemeManageableService.delete(java.lang.Long[] ids) - 'ids' can not be null");
        }

        dao.delete(ids);
    }


    private static java.util.List toValueObjects(java.util.Collection entities)
    {
        final java.util.List list = new java.util.ArrayList();

        for (java.util.Iterator iterator = entities.iterator(); iterator.hasNext();)
        {
            list.add(toValueObject((finf.ucf.cu.domain.Theme)iterator.next()));
        }

        return list;
    }

    private static finf.ucf.cu.domain.crud.ThemeValueObject toValueObject(finf.ucf.cu.domain.Theme entity)
    {
        final finf.ucf.cu.domain.crud.ThemeValueObject valueObject = new finf.ucf.cu.domain.crud.ThemeValueObject();

        valueObject.setName(entity.getName());
        valueObject.setId(entity.getId());

        final finf.ucf.cu.domain.P1 punoId = entity.getPunoId();
        if (punoId != null)
        {
            valueObject.setPunoId(punoId.getId());
            valueObject.setPunoIdLabel(punoId.getName());
        }

        return valueObject;
    }
}
