// license-header java merge-point
package finf.ucf.cu.domain.crud;

public final class SemesterManageableServiceBase
    implements SemesterManageableService
{
    private finf.ucf.cu.domain.crud.SemesterManageableDao dao;

    public void setDao(finf.ucf.cu.domain.crud.SemesterManageableDao dao)
    {
        this.dao = dao;
    }

    protected finf.ucf.cu.domain.crud.SemesterManageableDao getDao()
    {
        return this.dao;
    }

    public finf.ucf.cu.domain.crud.SemesterValueObject create(java.lang.String name, java.lang.Long id)
        throws Exception
    {
        if (name == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.SemesterManageableService.create(java.lang.String name, java.lang.Long id) - 'name' can not be null");
        }

        return toValueObject(dao.create(name, id));
    }

    public finf.ucf.cu.domain.crud.SemesterValueObject readById(java.lang.Long id)
        throws Exception
    {
        return toValueObject(dao.readById(id));
    }

    public java.util.List read(java.lang.String name, java.lang.Long id)
        throws Exception
    {
        return toValueObjects(dao.read(name, id));
    }

    public java.util.List readAll()
        throws Exception
    {
        return toValueObjects(dao.readAll());
    }

    public finf.ucf.cu.domain.crud.SemesterValueObject update(java.lang.String name, java.lang.Long id)
        throws Exception
    {
        if (name == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.SemesterManageableService.update(java.lang.String name, java.lang.Long id) - 'name' can not be null");
        }

        if (id == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.SemesterManageableService.update(java.lang.String name, java.lang.Long id) - 'id' can not be null");
        }

        return toValueObject(dao.update(name, id));
    }

    public void delete(java.lang.Long[] ids)
        throws Exception
    {
        if (ids == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.SemesterManageableService.delete(java.lang.Long[] ids) - 'ids' can not be null");
        }

        dao.delete(ids);
    }


    private static java.util.List toValueObjects(java.util.Collection entities)
    {
        final java.util.List list = new java.util.ArrayList();

        for (java.util.Iterator iterator = entities.iterator(); iterator.hasNext();)
        {
            list.add(toValueObject((finf.ucf.cu.domain.Semester)iterator.next()));
        }

        return list;
    }

    private static finf.ucf.cu.domain.crud.SemesterValueObject toValueObject(finf.ucf.cu.domain.Semester entity)
    {
        final finf.ucf.cu.domain.crud.SemesterValueObject valueObject = new finf.ucf.cu.domain.crud.SemesterValueObject();

        valueObject.setName(entity.getName());
        valueObject.setId(entity.getId());

        return valueObject;
    }
}
