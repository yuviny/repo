// license-header java merge-point
package finf.ucf.cu.domain.crud;

public final class GroupManageableServiceBase
    implements GroupManageableService
{
    private finf.ucf.cu.domain.crud.GroupManageableDao dao;

    public void setDao(finf.ucf.cu.domain.crud.GroupManageableDao dao)
    {
        this.dao = dao;
    }

    protected finf.ucf.cu.domain.crud.GroupManageableDao getDao()
    {
        return this.dao;
    }

    public finf.ucf.cu.domain.crud.GroupValueObject create(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.util.Date dateBegin1Semester, java.util.Date dateBegin2Semester, java.lang.Long id, java.lang.Long subGroupId)
        throws Exception
    {
        if (name == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.GroupManageableService.create(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.util.Date dateBegin1Semester, java.util.Date dateBegin2Semester, java.lang.Long id, java.lang.Long subGroupId) - 'name' can not be null");
        }

        if (size == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.GroupManageableService.create(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.util.Date dateBegin1Semester, java.util.Date dateBegin2Semester, java.lang.Long id, java.lang.Long subGroupId) - 'size' can not be null");
        }

        if (abbreviation == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.GroupManageableService.create(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.util.Date dateBegin1Semester, java.util.Date dateBegin2Semester, java.lang.Long id, java.lang.Long subGroupId) - 'abbreviation' can not be null");
        }

        if (dateBegin1Semester == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.GroupManageableService.create(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.util.Date dateBegin1Semester, java.util.Date dateBegin2Semester, java.lang.Long id, java.lang.Long subGroupId) - 'dateBegin1Semester' can not be null");
        }

        if (dateBegin2Semester == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.GroupManageableService.create(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.util.Date dateBegin1Semester, java.util.Date dateBegin2Semester, java.lang.Long id, java.lang.Long subGroupId) - 'dateBegin2Semester' can not be null");
        }

        return toValueObject(dao.create(name, size, abbreviation, dateBegin1Semester, dateBegin2Semester, id, subGroupId));
    }

    public finf.ucf.cu.domain.crud.GroupValueObject readById(java.lang.Long id)
        throws Exception
    {
        return toValueObject(dao.readById(id));
    }

    public java.util.List read(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.util.Date dateBegin1Semester, java.util.Date dateBegin2Semester, java.lang.Long id, java.lang.Long subGroupId)
        throws Exception
    {
        return toValueObjects(dao.read(name, size, abbreviation, dateBegin1Semester, dateBegin2Semester, id, subGroupId));
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

    public finf.ucf.cu.domain.crud.GroupValueObject update(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.util.Date dateBegin1Semester, java.util.Date dateBegin2Semester, java.lang.Long id, java.lang.Long subGroupId)
        throws Exception
    {
        if (name == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.GroupManageableService.update(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.util.Date dateBegin1Semester, java.util.Date dateBegin2Semester, java.lang.Long id, java.lang.Long subGroupId) - 'name' can not be null");
        }

        if (size == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.GroupManageableService.update(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.util.Date dateBegin1Semester, java.util.Date dateBegin2Semester, java.lang.Long id, java.lang.Long subGroupId) - 'size' can not be null");
        }

        if (abbreviation == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.GroupManageableService.update(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.util.Date dateBegin1Semester, java.util.Date dateBegin2Semester, java.lang.Long id, java.lang.Long subGroupId) - 'abbreviation' can not be null");
        }

        if (dateBegin1Semester == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.GroupManageableService.update(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.util.Date dateBegin1Semester, java.util.Date dateBegin2Semester, java.lang.Long id, java.lang.Long subGroupId) - 'dateBegin1Semester' can not be null");
        }

        if (dateBegin2Semester == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.GroupManageableService.update(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.util.Date dateBegin1Semester, java.util.Date dateBegin2Semester, java.lang.Long id, java.lang.Long subGroupId) - 'dateBegin2Semester' can not be null");
        }

        if (id == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.GroupManageableService.update(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.util.Date dateBegin1Semester, java.util.Date dateBegin2Semester, java.lang.Long id, java.lang.Long subGroupId) - 'id' can not be null");
        }

        return toValueObject(dao.update(name, size, abbreviation, dateBegin1Semester, dateBegin2Semester, id, subGroupId));
    }

    public void delete(java.lang.Long[] ids)
        throws Exception
    {
        if (ids == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.GroupManageableService.delete(java.lang.Long[] ids) - 'ids' can not be null");
        }

        dao.delete(ids);
    }


    private static java.util.List toValueObjects(java.util.Collection entities)
    {
        final java.util.List list = new java.util.ArrayList();

        for (java.util.Iterator iterator = entities.iterator(); iterator.hasNext();)
        {
            list.add(toValueObject((finf.ucf.cu.domain.Group)iterator.next()));
        }

        return list;
    }

    private static finf.ucf.cu.domain.crud.GroupValueObject toValueObject(finf.ucf.cu.domain.Group entity)
    {
        final finf.ucf.cu.domain.crud.GroupValueObject valueObject = new finf.ucf.cu.domain.crud.GroupValueObject();

        valueObject.setName(entity.getName());
        valueObject.setSize(entity.getSize());
        valueObject.setAbbreviation(entity.getAbbreviation());
        valueObject.setDateBegin1Semester(entity.getDateBegin1Semester());
        valueObject.setDateBegin2Semester(entity.getDateBegin2Semester());
        valueObject.setId(entity.getId());

        final finf.ucf.cu.domain.Group subGroupId = entity.getSubGroupId();
        if (subGroupId != null)
        {
            valueObject.setSubGroupId(subGroupId.getId());
            valueObject.setSubGroupIdLabel(subGroupId.getName());
        }

        return valueObject;
    }
}
