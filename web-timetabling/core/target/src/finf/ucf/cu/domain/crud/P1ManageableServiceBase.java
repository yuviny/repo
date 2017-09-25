// license-header java merge-point
package finf.ucf.cu.domain.crud;

public final class P1ManageableServiceBase
    implements P1ManageableService
{
    private finf.ucf.cu.domain.crud.P1ManageableDao dao;

    public void setDao(finf.ucf.cu.domain.crud.P1ManageableDao dao)
    {
        this.dao = dao;
    }

    protected finf.ucf.cu.domain.crud.P1ManageableDao getDao()
    {
        return this.dao;
    }

    public finf.ucf.cu.domain.crud.P1ValueObject create(java.lang.String name, java.util.Date endDate, java.lang.String approved_by, java.lang.Long id, java.lang.Long subjectId, java.lang.Long teacher)
        throws Exception
    {
        if (name == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.P1ManageableService.create(java.lang.String name, java.util.Date endDate, java.lang.String approved_by, java.lang.Long id, java.lang.Long subjectId, java.lang.Long teacher) - 'name' can not be null");
        }

        if (endDate == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.P1ManageableService.create(java.lang.String name, java.util.Date endDate, java.lang.String approved_by, java.lang.Long id, java.lang.Long subjectId, java.lang.Long teacher) - 'endDate' can not be null");
        }

        if (approved_by == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.P1ManageableService.create(java.lang.String name, java.util.Date endDate, java.lang.String approved_by, java.lang.Long id, java.lang.Long subjectId, java.lang.Long teacher) - 'approved_by' can not be null");
        }

        if (subjectId == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.P1ManageableService.create(java.lang.String name, java.util.Date endDate, java.lang.String approved_by, java.lang.Long id, java.lang.Long subjectId, java.lang.Long teacher) - 'subjectId' can not be null");
        }

        return toValueObject(dao.create(name, endDate, approved_by, id, subjectId, teacher));
    }

    public finf.ucf.cu.domain.crud.P1ValueObject readById(java.lang.Long id)
        throws Exception
    {
        return toValueObject(dao.readById(id));
    }

    public java.util.List read(java.lang.String name, java.util.Date endDate, java.lang.String approved_by, java.lang.Long id, java.lang.Long subjectId, java.lang.Long teacher)
        throws Exception
    {
        return toValueObjects(dao.read(name, endDate, approved_by, id, subjectId, teacher));
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

    public finf.ucf.cu.domain.crud.P1ValueObject update(java.lang.String name, java.util.Date endDate, java.lang.String approved_by, java.lang.Long id, java.lang.Long subjectId, java.lang.Long teacher)
        throws Exception
    {
        if (name == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.P1ManageableService.update(java.lang.String name, java.util.Date endDate, java.lang.String approved_by, java.lang.Long id, java.lang.Long subjectId, java.lang.Long teacher) - 'name' can not be null");
        }

        if (endDate == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.P1ManageableService.update(java.lang.String name, java.util.Date endDate, java.lang.String approved_by, java.lang.Long id, java.lang.Long subjectId, java.lang.Long teacher) - 'endDate' can not be null");
        }

        if (approved_by == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.P1ManageableService.update(java.lang.String name, java.util.Date endDate, java.lang.String approved_by, java.lang.Long id, java.lang.Long subjectId, java.lang.Long teacher) - 'approved_by' can not be null");
        }

        if (id == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.P1ManageableService.update(java.lang.String name, java.util.Date endDate, java.lang.String approved_by, java.lang.Long id, java.lang.Long subjectId, java.lang.Long teacher) - 'id' can not be null");
        }

        if (subjectId == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.P1ManageableService.update(java.lang.String name, java.util.Date endDate, java.lang.String approved_by, java.lang.Long id, java.lang.Long subjectId, java.lang.Long teacher) - 'subjectId' can not be null");
        }

        return toValueObject(dao.update(name, endDate, approved_by, id, subjectId, teacher));
    }

    public void delete(java.lang.Long[] ids)
        throws Exception
    {
        if (ids == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.P1ManageableService.delete(java.lang.Long[] ids) - 'ids' can not be null");
        }

        dao.delete(ids);
    }


    private static java.util.List toValueObjects(java.util.Collection entities)
    {
        final java.util.List list = new java.util.ArrayList();

        for (java.util.Iterator iterator = entities.iterator(); iterator.hasNext();)
        {
            list.add(toValueObject((finf.ucf.cu.domain.P1)iterator.next()));
        }

        return list;
    }

    private static finf.ucf.cu.domain.crud.P1ValueObject toValueObject(finf.ucf.cu.domain.P1 entity)
    {
        final finf.ucf.cu.domain.crud.P1ValueObject valueObject = new finf.ucf.cu.domain.crud.P1ValueObject();

        valueObject.setName(entity.getName());
        valueObject.setEndDate(entity.getEndDate());
        valueObject.setApproved_by(entity.getApproved_by());
        valueObject.setId(entity.getId());

        final finf.ucf.cu.domain.Subject subjectId = entity.getSubjectId();
        if (subjectId != null)
        {
            valueObject.setSubjectId(subjectId.getId());
            valueObject.setSubjectIdLabel(subjectId.getName());
        }

        final finf.ucf.cu.domain.Teacher teacher = entity.getTeacher();
        if (teacher != null)
        {
            valueObject.setTeacher(teacher.getId());
            valueObject.setTeacherLabel(teacher.getEmail());
        }

        return valueObject;
    }
}
