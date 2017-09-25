// license-header java merge-point
package finf.ucf.cu.domain.crud;

public final class SubjectManageableServiceBase
    implements SubjectManageableService
{
    private finf.ucf.cu.domain.crud.SubjectManageableDao dao;

    public void setDao(finf.ucf.cu.domain.crud.SubjectManageableDao dao)
    {
        this.dao = dao;
    }

    protected finf.ucf.cu.domain.crud.SubjectManageableDao getDao()
    {
        return this.dao;
    }

    public finf.ucf.cu.domain.crud.SubjectValueObject create(java.lang.String name, java.lang.String abbreviation, java.lang.Long id)
        throws Exception
    {
        if (name == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.SubjectManageableService.create(java.lang.String name, java.lang.String abbreviation, java.lang.Long id) - 'name' can not be null");
        }

        if (abbreviation == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.SubjectManageableService.create(java.lang.String name, java.lang.String abbreviation, java.lang.Long id) - 'abbreviation' can not be null");
        }

        return toValueObject(dao.create(name, abbreviation, id));
    }

    public finf.ucf.cu.domain.crud.SubjectValueObject readById(java.lang.Long id)
        throws Exception
    {
        return toValueObject(dao.readById(id));
    }

    public java.util.List read(java.lang.String name, java.lang.String abbreviation, java.lang.Long id)
        throws Exception
    {
        return toValueObjects(dao.read(name, abbreviation, id));
    }

    public java.util.List readAll()
        throws Exception
    {
        return toValueObjects(dao.readAll());
    }

    public finf.ucf.cu.domain.crud.SubjectValueObject update(java.lang.String name, java.lang.String abbreviation, java.lang.Long id)
        throws Exception
    {
        if (name == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.SubjectManageableService.update(java.lang.String name, java.lang.String abbreviation, java.lang.Long id) - 'name' can not be null");
        }

        if (abbreviation == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.SubjectManageableService.update(java.lang.String name, java.lang.String abbreviation, java.lang.Long id) - 'abbreviation' can not be null");
        }

        if (id == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.SubjectManageableService.update(java.lang.String name, java.lang.String abbreviation, java.lang.Long id) - 'id' can not be null");
        }

        return toValueObject(dao.update(name, abbreviation, id));
    }

    public void delete(java.lang.Long[] ids)
        throws Exception
    {
        if (ids == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.SubjectManageableService.delete(java.lang.Long[] ids) - 'ids' can not be null");
        }

        dao.delete(ids);
    }


    private static java.util.List toValueObjects(java.util.Collection entities)
    {
        final java.util.List list = new java.util.ArrayList();

        for (java.util.Iterator iterator = entities.iterator(); iterator.hasNext();)
        {
            list.add(toValueObject((finf.ucf.cu.domain.Subject)iterator.next()));
        }

        return list;
    }

    private static finf.ucf.cu.domain.crud.SubjectValueObject toValueObject(finf.ucf.cu.domain.Subject entity)
    {
        final finf.ucf.cu.domain.crud.SubjectValueObject valueObject = new finf.ucf.cu.domain.crud.SubjectValueObject();

        valueObject.setName(entity.getName());
        valueObject.setAbbreviation(entity.getAbbreviation());
        valueObject.setId(entity.getId());

        return valueObject;
    }
}
