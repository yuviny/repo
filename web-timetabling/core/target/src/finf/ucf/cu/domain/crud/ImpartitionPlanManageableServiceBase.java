// license-header java merge-point
package finf.ucf.cu.domain.crud;

public final class ImpartitionPlanManageableServiceBase
    implements ImpartitionPlanManageableService
{
    private finf.ucf.cu.domain.crud.ImpartitionPlanManageableDao dao;

    public void setDao(finf.ucf.cu.domain.crud.ImpartitionPlanManageableDao dao)
    {
        this.dao = dao;
    }

    protected finf.ucf.cu.domain.crud.ImpartitionPlanManageableDao getDao()
    {
        return this.dao;
    }

    public finf.ucf.cu.domain.crud.ImpartitionPlanValueObject create(java.lang.Boolean teacherallclasetype, java.lang.Long id, java.lang.Long subjectId, java.lang.Long teacherId, java.lang.Long classTypeId, java.lang.Long groupId, java.lang.Long semesterId)
        throws Exception
    {
        if (subjectId == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ImpartitionPlanManageableService.create(java.lang.Boolean teacherallclasetype, java.lang.Long id, java.lang.Long subjectId, java.lang.Long teacherId, java.lang.Long classTypeId, java.lang.Long groupId, java.lang.Long semesterId) - 'subjectId' can not be null");
        }

        if (teacherId == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ImpartitionPlanManageableService.create(java.lang.Boolean teacherallclasetype, java.lang.Long id, java.lang.Long subjectId, java.lang.Long teacherId, java.lang.Long classTypeId, java.lang.Long groupId, java.lang.Long semesterId) - 'teacherId' can not be null");
        }

        if (groupId == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ImpartitionPlanManageableService.create(java.lang.Boolean teacherallclasetype, java.lang.Long id, java.lang.Long subjectId, java.lang.Long teacherId, java.lang.Long classTypeId, java.lang.Long groupId, java.lang.Long semesterId) - 'groupId' can not be null");
        }

        if (semesterId == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ImpartitionPlanManageableService.create(java.lang.Boolean teacherallclasetype, java.lang.Long id, java.lang.Long subjectId, java.lang.Long teacherId, java.lang.Long classTypeId, java.lang.Long groupId, java.lang.Long semesterId) - 'semesterId' can not be null");
        }

        return toValueObject(dao.create(teacherallclasetype, id, subjectId, teacherId, classTypeId, groupId, semesterId));
    }

    public finf.ucf.cu.domain.crud.ImpartitionPlanValueObject readById(java.lang.Long id)
        throws Exception
    {
        return toValueObject(dao.readById(id));
    }

    public java.util.List read(java.lang.Boolean teacherallclasetype, java.lang.Long id, java.lang.Long subjectId, java.lang.Long teacherId, java.lang.Long classTypeId, java.lang.Long groupId, java.lang.Long semesterId)
        throws Exception
    {
        return toValueObjects(dao.read(teacherallclasetype, id, subjectId, teacherId, classTypeId, groupId, semesterId));
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

    public finf.ucf.cu.domain.crud.ImpartitionPlanValueObject update(java.lang.Boolean teacherallclasetype, java.lang.Long id, java.lang.Long subjectId, java.lang.Long teacherId, java.lang.Long classTypeId, java.lang.Long groupId, java.lang.Long semesterId)
        throws Exception
    {
        if (id == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ImpartitionPlanManageableService.update(java.lang.Boolean teacherallclasetype, java.lang.Long id, java.lang.Long subjectId, java.lang.Long teacherId, java.lang.Long classTypeId, java.lang.Long groupId, java.lang.Long semesterId) - 'id' can not be null");
        }

        if (subjectId == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ImpartitionPlanManageableService.update(java.lang.Boolean teacherallclasetype, java.lang.Long id, java.lang.Long subjectId, java.lang.Long teacherId, java.lang.Long classTypeId, java.lang.Long groupId, java.lang.Long semesterId) - 'subjectId' can not be null");
        }

        if (teacherId == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ImpartitionPlanManageableService.update(java.lang.Boolean teacherallclasetype, java.lang.Long id, java.lang.Long subjectId, java.lang.Long teacherId, java.lang.Long classTypeId, java.lang.Long groupId, java.lang.Long semesterId) - 'teacherId' can not be null");
        }

        if (groupId == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ImpartitionPlanManageableService.update(java.lang.Boolean teacherallclasetype, java.lang.Long id, java.lang.Long subjectId, java.lang.Long teacherId, java.lang.Long classTypeId, java.lang.Long groupId, java.lang.Long semesterId) - 'groupId' can not be null");
        }

        if (semesterId == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ImpartitionPlanManageableService.update(java.lang.Boolean teacherallclasetype, java.lang.Long id, java.lang.Long subjectId, java.lang.Long teacherId, java.lang.Long classTypeId, java.lang.Long groupId, java.lang.Long semesterId) - 'semesterId' can not be null");
        }

        return toValueObject(dao.update(teacherallclasetype, id, subjectId, teacherId, classTypeId, groupId, semesterId));
    }

    public void delete(java.lang.Long[] ids)
        throws Exception
    {
        if (ids == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ImpartitionPlanManageableService.delete(java.lang.Long[] ids) - 'ids' can not be null");
        }

        dao.delete(ids);
    }


    private static java.util.List toValueObjects(java.util.Collection entities)
    {
        final java.util.List list = new java.util.ArrayList();

        for (java.util.Iterator iterator = entities.iterator(); iterator.hasNext();)
        {
            list.add(toValueObject((finf.ucf.cu.domain.ImpartitionPlan)iterator.next()));
        }

        return list;
    }

    private static finf.ucf.cu.domain.crud.ImpartitionPlanValueObject toValueObject(finf.ucf.cu.domain.ImpartitionPlan entity)
    {
        final finf.ucf.cu.domain.crud.ImpartitionPlanValueObject valueObject = new finf.ucf.cu.domain.crud.ImpartitionPlanValueObject();

        valueObject.setTeacherallclasetype(entity.getTeacherallclasetype());
        valueObject.setId(entity.getId());

        final finf.ucf.cu.domain.Subject subjectId = entity.getSubjectId();
        if (subjectId != null)
        {
            valueObject.setSubjectId(subjectId.getId());
            valueObject.setSubjectIdLabel(subjectId.getName());
        }

        final finf.ucf.cu.domain.Teacher teacherId = entity.getTeacherId();
        if (teacherId != null)
        {
            valueObject.setTeacherId(teacherId.getId());
            valueObject.setTeacherIdLabel(teacherId.getEmail());
        }

        final finf.ucf.cu.domain.ClassType classTypeId = entity.getClassTypeId();
        if (classTypeId != null)
        {
            valueObject.setClassTypeId(classTypeId.getId());
            valueObject.setClassTypeIdLabel(classTypeId.getName());
        }

        final finf.ucf.cu.domain.Group groupId = entity.getGroupId();
        if (groupId != null)
        {
            valueObject.setGroupId(groupId.getId());
            valueObject.setGroupIdLabel(groupId.getName());
        }

        final finf.ucf.cu.domain.Semester semesterId = entity.getSemesterId();
        if (semesterId != null)
        {
            valueObject.setSemesterId(semesterId.getId());
            valueObject.setSemesterIdLabel(semesterId.getName());
        }

        return valueObject;
    }
}
