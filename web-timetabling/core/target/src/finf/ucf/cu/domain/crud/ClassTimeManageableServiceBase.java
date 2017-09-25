// license-header java merge-point
package finf.ucf.cu.domain.crud;

public final class ClassTimeManageableServiceBase
    implements ClassTimeManageableService
{
    private finf.ucf.cu.domain.crud.ClassTimeManageableDao dao;

    public void setDao(finf.ucf.cu.domain.crud.ClassTimeManageableDao dao)
    {
        this.dao = dao;
    }

    protected finf.ucf.cu.domain.crud.ClassTimeManageableDao getDao()
    {
        return this.dao;
    }

    public finf.ucf.cu.domain.crud.ClassTimeValueObject create(java.util.Date day, finf.ucf.cu.domain.cTime time, java.lang.Integer duration, boolean fixed, boolean tipic, java.lang.Long id, java.lang.Long groupId, java.lang.Long teacherId, java.lang.Long subjectId, java.lang.Long roomId, java.lang.Long solution, java.lang.Long classTypeID)
        throws Exception
    {
        if (day == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ClassTimeManageableService.create(java.util.Date day, finf.ucf.cu.domain.cTime time, java.lang.Integer duration, boolean fixed, boolean tipic, java.lang.Long id, java.lang.Long groupId, java.lang.Long teacherId, java.lang.Long subjectId, java.lang.Long roomId, java.lang.Long solution, java.lang.Long classTypeID) - 'day' can not be null");
        }

        if (time == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ClassTimeManageableService.create(java.util.Date day, finf.ucf.cu.domain.cTime time, java.lang.Integer duration, boolean fixed, boolean tipic, java.lang.Long id, java.lang.Long groupId, java.lang.Long teacherId, java.lang.Long subjectId, java.lang.Long roomId, java.lang.Long solution, java.lang.Long classTypeID) - 'time' can not be null");
        }

        if (groupId == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ClassTimeManageableService.create(java.util.Date day, finf.ucf.cu.domain.cTime time, java.lang.Integer duration, boolean fixed, boolean tipic, java.lang.Long id, java.lang.Long groupId, java.lang.Long teacherId, java.lang.Long subjectId, java.lang.Long roomId, java.lang.Long solution, java.lang.Long classTypeID) - 'groupId' can not be null");
        }

        if (subjectId == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ClassTimeManageableService.create(java.util.Date day, finf.ucf.cu.domain.cTime time, java.lang.Integer duration, boolean fixed, boolean tipic, java.lang.Long id, java.lang.Long groupId, java.lang.Long teacherId, java.lang.Long subjectId, java.lang.Long roomId, java.lang.Long solution, java.lang.Long classTypeID) - 'subjectId' can not be null");
        }

        if (solution == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ClassTimeManageableService.create(java.util.Date day, finf.ucf.cu.domain.cTime time, java.lang.Integer duration, boolean fixed, boolean tipic, java.lang.Long id, java.lang.Long groupId, java.lang.Long teacherId, java.lang.Long subjectId, java.lang.Long roomId, java.lang.Long solution, java.lang.Long classTypeID) - 'solution' can not be null");
        }

        return toValueObject(dao.create(day, time, duration, fixed, tipic, id, groupId, teacherId, subjectId, roomId, solution, classTypeID));
    }

    public finf.ucf.cu.domain.crud.ClassTimeValueObject readById(java.lang.Long id)
        throws Exception
    {
        return toValueObject(dao.readById(id));
    }

    public java.util.List read(java.util.Date day, finf.ucf.cu.domain.cTime time, java.lang.Integer duration, boolean fixed, boolean tipic, java.lang.Long id, java.lang.Long groupId, java.lang.Long teacherId, java.lang.Long subjectId, java.lang.Long roomId, java.lang.Long solution, java.lang.Long classTypeID)
        throws Exception
    {
        return toValueObjects(dao.read(day, time, duration, fixed, tipic, id, groupId, teacherId, subjectId, roomId, solution, classTypeID));
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

    public finf.ucf.cu.domain.crud.ClassTimeValueObject update(java.util.Date day, finf.ucf.cu.domain.cTime time, java.lang.Integer duration, boolean fixed, boolean tipic, java.lang.Long id, java.lang.Long groupId, java.lang.Long teacherId, java.lang.Long subjectId, java.lang.Long roomId, java.lang.Long solution, java.lang.Long classTypeID)
        throws Exception
    {
        if (day == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ClassTimeManageableService.update(java.util.Date day, finf.ucf.cu.domain.cTime time, java.lang.Integer duration, boolean fixed, boolean tipic, java.lang.Long id, java.lang.Long groupId, java.lang.Long teacherId, java.lang.Long subjectId, java.lang.Long roomId, java.lang.Long solution, java.lang.Long classTypeID) - 'day' can not be null");
        }

        if (time == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ClassTimeManageableService.update(java.util.Date day, finf.ucf.cu.domain.cTime time, java.lang.Integer duration, boolean fixed, boolean tipic, java.lang.Long id, java.lang.Long groupId, java.lang.Long teacherId, java.lang.Long subjectId, java.lang.Long roomId, java.lang.Long solution, java.lang.Long classTypeID) - 'time' can not be null");
        }

        if (id == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ClassTimeManageableService.update(java.util.Date day, finf.ucf.cu.domain.cTime time, java.lang.Integer duration, boolean fixed, boolean tipic, java.lang.Long id, java.lang.Long groupId, java.lang.Long teacherId, java.lang.Long subjectId, java.lang.Long roomId, java.lang.Long solution, java.lang.Long classTypeID) - 'id' can not be null");
        }

        if (groupId == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ClassTimeManageableService.update(java.util.Date day, finf.ucf.cu.domain.cTime time, java.lang.Integer duration, boolean fixed, boolean tipic, java.lang.Long id, java.lang.Long groupId, java.lang.Long teacherId, java.lang.Long subjectId, java.lang.Long roomId, java.lang.Long solution, java.lang.Long classTypeID) - 'groupId' can not be null");
        }

        if (subjectId == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ClassTimeManageableService.update(java.util.Date day, finf.ucf.cu.domain.cTime time, java.lang.Integer duration, boolean fixed, boolean tipic, java.lang.Long id, java.lang.Long groupId, java.lang.Long teacherId, java.lang.Long subjectId, java.lang.Long roomId, java.lang.Long solution, java.lang.Long classTypeID) - 'subjectId' can not be null");
        }

        if (solution == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ClassTimeManageableService.update(java.util.Date day, finf.ucf.cu.domain.cTime time, java.lang.Integer duration, boolean fixed, boolean tipic, java.lang.Long id, java.lang.Long groupId, java.lang.Long teacherId, java.lang.Long subjectId, java.lang.Long roomId, java.lang.Long solution, java.lang.Long classTypeID) - 'solution' can not be null");
        }

        return toValueObject(dao.update(day, time, duration, fixed, tipic, id, groupId, teacherId, subjectId, roomId, solution, classTypeID));
    }

    public void delete(java.lang.Long[] ids)
        throws Exception
    {
        if (ids == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ClassTimeManageableService.delete(java.lang.Long[] ids) - 'ids' can not be null");
        }

        dao.delete(ids);
    }


    private static java.util.List toValueObjects(java.util.Collection entities)
    {
        final java.util.List list = new java.util.ArrayList();

        for (java.util.Iterator iterator = entities.iterator(); iterator.hasNext();)
        {
            list.add(toValueObject((finf.ucf.cu.domain.ClassTime)iterator.next()));
        }

        return list;
    }

    private static finf.ucf.cu.domain.crud.ClassTimeValueObject toValueObject(finf.ucf.cu.domain.ClassTime entity)
    {
        final finf.ucf.cu.domain.crud.ClassTimeValueObject valueObject = new finf.ucf.cu.domain.crud.ClassTimeValueObject();

        valueObject.setDay(entity.getDay());
        valueObject.setTime(entity.getTime());
        valueObject.setDuration(entity.getDuration());
        valueObject.setFixed(entity.isFixed());
        valueObject.setTipic(entity.isTipic());
        valueObject.setId(entity.getId());

        final finf.ucf.cu.domain.Group groupId = entity.getGroupId();
        if (groupId != null)
        {
            valueObject.setGroupId(groupId.getId());
            valueObject.setGroupIdLabel(groupId.getName());
        }

        final finf.ucf.cu.domain.Teacher teacherId = entity.getTeacherId();
        if (teacherId != null)
        {
            valueObject.setTeacherId(teacherId.getId());
            valueObject.setTeacherIdLabel(teacherId.getEmail());
        }

        final finf.ucf.cu.domain.Subject subjectId = entity.getSubjectId();
        if (subjectId != null)
        {
            valueObject.setSubjectId(subjectId.getId());
            valueObject.setSubjectIdLabel(subjectId.getName());
        }

        final finf.ucf.cu.domain.Room roomId = entity.getRoomId();
        if (roomId != null)
        {
            valueObject.setRoomId(roomId.getId());
            valueObject.setRoomIdLabel(roomId.getName());
        }

        final finf.ucf.cu.domain.Semester solution = entity.getSolution();
        if (solution != null)
        {
            valueObject.setSolution(solution.getId());
            valueObject.setSolutionLabel(solution.getName());
        }

        final finf.ucf.cu.domain.ClassType classTypeID = entity.getClassTypeID();
        if (classTypeID != null)
        {
            valueObject.setClassTypeID(classTypeID.getId());
            valueObject.setClassTypeIDLabel(classTypeID.getName());
        }

        return valueObject;
    }
}
