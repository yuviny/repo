// license-header java merge-point
package finf.ucf.cu.domain.crud;

public final class NotAvalabilityManageableServiceBase
    implements NotAvalabilityManageableService
{
    private finf.ucf.cu.domain.crud.NotAvalabilityManageableDao dao;

    public void setDao(finf.ucf.cu.domain.crud.NotAvalabilityManageableDao dao)
    {
        this.dao = dao;
    }

    protected finf.ucf.cu.domain.crud.NotAvalabilityManageableDao getDao()
    {
        return this.dao;
    }

    public finf.ucf.cu.domain.crud.NotAvalabilityValueObject create(java.util.Date date, finf.ucf.cu.domain.cTime not_time, java.lang.Long id, java.lang.Long teacherId, java.lang.Long groupId, java.lang.Long subjectId)
        throws Exception
    {
        return toValueObject(dao.create(date, not_time, id, teacherId, groupId, subjectId));
    }

    public finf.ucf.cu.domain.crud.NotAvalabilityValueObject readById(java.lang.Long id)
        throws Exception
    {
        return toValueObject(dao.readById(id));
    }

    public java.util.List read(java.util.Date date, finf.ucf.cu.domain.cTime not_time, java.lang.Long id, java.lang.Long teacherId, java.lang.Long groupId, java.lang.Long subjectId)
        throws Exception
    {
        return toValueObjects(dao.read(date, not_time, id, teacherId, groupId, subjectId));
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

    public finf.ucf.cu.domain.crud.NotAvalabilityValueObject update(java.util.Date date, finf.ucf.cu.domain.cTime not_time, java.lang.Long id, java.lang.Long teacherId, java.lang.Long groupId, java.lang.Long subjectId)
        throws Exception
    {
        if (id == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.NotAvalabilityManageableService.update(java.util.Date date, finf.ucf.cu.domain.cTime not_time, java.lang.Long id, java.lang.Long teacherId, java.lang.Long groupId, java.lang.Long subjectId) - 'id' can not be null");
        }

        return toValueObject(dao.update(date, not_time, id, teacherId, groupId, subjectId));
    }

    public void delete(java.lang.Long[] ids)
        throws Exception
    {
        if (ids == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.NotAvalabilityManageableService.delete(java.lang.Long[] ids) - 'ids' can not be null");
        }

        dao.delete(ids);
    }


    private static java.util.List toValueObjects(java.util.Collection entities)
    {
        final java.util.List list = new java.util.ArrayList();

        for (java.util.Iterator iterator = entities.iterator(); iterator.hasNext();)
        {
            list.add(toValueObject((finf.ucf.cu.domain.NotAvalability)iterator.next()));
        }

        return list;
    }

    private static finf.ucf.cu.domain.crud.NotAvalabilityValueObject toValueObject(finf.ucf.cu.domain.NotAvalability entity)
    {
        final finf.ucf.cu.domain.crud.NotAvalabilityValueObject valueObject = new finf.ucf.cu.domain.crud.NotAvalabilityValueObject();

        valueObject.setDate(entity.getDate());
        valueObject.setNot_time(entity.getNot_time());
        valueObject.setId(entity.getId());

        final finf.ucf.cu.domain.Teacher teacherId = entity.getTeacherId();
        if (teacherId != null)
        {
            valueObject.setTeacherId(teacherId.getId());
            valueObject.setTeacherIdLabel(teacherId.getEmail());
        }

        final finf.ucf.cu.domain.Group groupId = entity.getGroupId();
        if (groupId != null)
        {
            valueObject.setGroupId(groupId.getId());
            valueObject.setGroupIdLabel(groupId.getName());
        }

        final finf.ucf.cu.domain.Subject subjectId = entity.getSubjectId();
        if (subjectId != null)
        {
            valueObject.setSubjectId(subjectId.getId());
            valueObject.setSubjectIdLabel(subjectId.getName());
        }

        return valueObject;
    }
}
