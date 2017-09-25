// license-header java merge-point
package finf.ucf.cu.domain.crud;

import org.hibernate.Session;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Expression;

public final class ClassTimeManageableDaoBase
    extends org.springframework.orm.hibernate3.support.HibernateDaoSupport
    implements ClassTimeManageableDao
{
    private finf.ucf.cu.domain.ClassTimeDao dao;

    public void setDao(finf.ucf.cu.domain.ClassTimeDao dao)
    {
        this.dao = dao;
    }

    protected finf.ucf.cu.domain.ClassTimeDao getDao()
    {
        return this.dao;
    }

    private finf.ucf.cu.domain.GroupDao groupIdDao = null;

    public void setGroupIdDao(finf.ucf.cu.domain.GroupDao groupIdDao)
    {
        this.groupIdDao = groupIdDao;
    }

    protected finf.ucf.cu.domain.GroupDao getGroupIdDao()
    {
        return this.groupIdDao;
    }

    private finf.ucf.cu.domain.TeacherDao teacherIdDao = null;

    public void setTeacherIdDao(finf.ucf.cu.domain.TeacherDao teacherIdDao)
    {
        this.teacherIdDao = teacherIdDao;
    }

    protected finf.ucf.cu.domain.TeacherDao getTeacherIdDao()
    {
        return this.teacherIdDao;
    }

    private finf.ucf.cu.domain.SubjectDao subjectIdDao = null;

    public void setSubjectIdDao(finf.ucf.cu.domain.SubjectDao subjectIdDao)
    {
        this.subjectIdDao = subjectIdDao;
    }

    protected finf.ucf.cu.domain.SubjectDao getSubjectIdDao()
    {
        return this.subjectIdDao;
    }

    private finf.ucf.cu.domain.RoomDao roomIdDao = null;

    public void setRoomIdDao(finf.ucf.cu.domain.RoomDao roomIdDao)
    {
        this.roomIdDao = roomIdDao;
    }

    protected finf.ucf.cu.domain.RoomDao getRoomIdDao()
    {
        return this.roomIdDao;
    }

    private finf.ucf.cu.domain.SemesterDao solutionDao = null;

    public void setSolutionDao(finf.ucf.cu.domain.SemesterDao solutionDao)
    {
        this.solutionDao = solutionDao;
    }

    protected finf.ucf.cu.domain.SemesterDao getSolutionDao()
    {
        return this.solutionDao;
    }

    private finf.ucf.cu.domain.ClassTypeDao classTypeIDDao = null;

    public void setClassTypeIDDao(finf.ucf.cu.domain.ClassTypeDao classTypeIDDao)
    {
        this.classTypeIDDao = classTypeIDDao;
    }

    protected finf.ucf.cu.domain.ClassTypeDao getClassTypeIDDao()
    {
        return this.classTypeIDDao;
    }

    private java.util.Set findGroupByIds(java.lang.Long[] ids)
    {
        final Session session = this.getSession(false);
        try
        {
            final Criteria criteria = session.createCriteria(finf.ucf.cu.domain.GroupImpl.class);
            criteria.add(Expression.in("id", ids));
            return new java.util.HashSet(criteria.list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    private java.util.Set findTeacherByIds(java.lang.Long[] ids)
    {
        final Session session = this.getSession(false);
        try
        {
            final Criteria criteria = session.createCriteria(finf.ucf.cu.domain.TeacherImpl.class);
            criteria.add(Expression.in("id", ids));
            return new java.util.HashSet(criteria.list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    private java.util.Set findSubjectByIds(java.lang.Long[] ids)
    {
        final Session session = this.getSession(false);
        try
        {
            final Criteria criteria = session.createCriteria(finf.ucf.cu.domain.SubjectImpl.class);
            criteria.add(Expression.in("id", ids));
            return new java.util.HashSet(criteria.list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    private java.util.Set findRoomByIds(java.lang.Long[] ids)
    {
        final Session session = this.getSession(false);
        try
        {
            final Criteria criteria = session.createCriteria(finf.ucf.cu.domain.RoomImpl.class);
            criteria.add(Expression.in("id", ids));
            return new java.util.HashSet(criteria.list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    private java.util.Set findSemesterByIds(java.lang.Long[] ids)
    {
        final Session session = this.getSession(false);
        try
        {
            final Criteria criteria = session.createCriteria(finf.ucf.cu.domain.SemesterImpl.class);
            criteria.add(Expression.in("id", ids));
            return new java.util.HashSet(criteria.list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    private java.util.Set findClassTypeByIds(java.lang.Long[] ids)
    {
        final Session session = this.getSession(false);
        try
        {
            final Criteria criteria = session.createCriteria(finf.ucf.cu.domain.ClassTypeImpl.class);
            criteria.add(Expression.in("id", ids));
            return new java.util.HashSet(criteria.list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    public finf.ucf.cu.domain.ClassTime create(java.util.Date day, finf.ucf.cu.domain.cTime time, java.lang.Integer duration, boolean fixed, boolean tipic, java.lang.Long id, java.lang.Long groupId, java.lang.Long teacherId, java.lang.Long subjectId, java.lang.Long roomId, java.lang.Long solution, java.lang.Long classTypeID)
    {
        final finf.ucf.cu.domain.ClassTime entity = new finf.ucf.cu.domain.ClassTimeImpl();
        entity.setDay(day);
        entity.setTime(time);
        entity.setDuration(duration);
        entity.setFixed(fixed);
        entity.setTipic(tipic);
        entity.setId(id);
        finf.ucf.cu.domain.Group groupIdEntity = null;
        if (groupId != null)
        {
            groupIdEntity = (finf.ucf.cu.domain.Group)getGroupIdDao().load(groupId);
        }

        entity.setGroupId(groupIdEntity);

        finf.ucf.cu.domain.Teacher teacherIdEntity = null;
        if (teacherId != null)
        {
            teacherIdEntity = (finf.ucf.cu.domain.Teacher)getTeacherIdDao().load(teacherId);
        }

        entity.setTeacherId(teacherIdEntity);

        finf.ucf.cu.domain.Subject subjectIdEntity = null;
        if (subjectId != null)
        {
            subjectIdEntity = (finf.ucf.cu.domain.Subject)getSubjectIdDao().load(subjectId);
        }

        entity.setSubjectId(subjectIdEntity);

        finf.ucf.cu.domain.Room roomIdEntity = null;
        if (roomId != null)
        {
            roomIdEntity = (finf.ucf.cu.domain.Room)getRoomIdDao().load(roomId);
        }

        entity.setRoomId(roomIdEntity);

        finf.ucf.cu.domain.Semester solutionEntity = null;
        if (solution != null)
        {
            solutionEntity = (finf.ucf.cu.domain.Semester)getSolutionDao().load(solution);
        }

        entity.setSolution(solutionEntity);

        finf.ucf.cu.domain.ClassType classTypeIDEntity = null;
        if (classTypeID != null)
        {
            classTypeIDEntity = (finf.ucf.cu.domain.ClassType)getClassTypeIDDao().load(classTypeID);
        }

        entity.setClassTypeID(classTypeIDEntity);


        return (finf.ucf.cu.domain.ClassTime)this.getDao().create(entity);
    }

    public finf.ucf.cu.domain.ClassTime readById(java.lang.Long id)
    {
        return getDao().load(id);
    }

    public java.util.List read(java.util.Date day, finf.ucf.cu.domain.cTime time, java.lang.Integer duration, boolean fixed, boolean tipic, java.lang.Long id, java.lang.Long groupId, java.lang.Long teacherId, java.lang.Long subjectId, java.lang.Long roomId, java.lang.Long solution, java.lang.Long classTypeID)
    {
        final Session session = getSession(false);

        try
        {
            final Criteria criteria = session.createCriteria(finf.ucf.cu.domain.ClassTimeImpl.class);

            if (day != null)
            {
                // we check whether or not the user supplied time information within this particular date argument
                // if he/she didn't we assume he/she wishes to search in the scope of the entire day
                final java.util.Calendar calendar = new java.util.GregorianCalendar();
                calendar.setTime(day);
                if ( calendar.get(java.util.Calendar.HOUR) != 0
                     || calendar.get(java.util.Calendar.MINUTE) != 0
                     || calendar.get(java.util.Calendar.SECOND) != 0
                     || calendar.get(java.util.Calendar.MILLISECOND) != 0 )
                {
                    criteria.add(Expression.eq("day", day));
                }
                else
                {
                    calendar.add(java.util.Calendar.DATE, 1);
                    criteria.add(Expression.between("day", day, calendar.getTime()));
                }
            }
            if (time != null)
            criteria.add(Expression.eq("time", time));
            if (duration != null)
            criteria.add(Expression.eq("duration", duration));
            if (fixed) criteria.add(Expression.eq("fixed", java.lang.Boolean.TRUE));
                if (tipic) criteria.add(Expression.eq("tipic", java.lang.Boolean.TRUE));
                if (id != null)
            criteria.add(Expression.eq("id", id));
            if (groupId != null) criteria.createCriteria("groupId").add(Expression.eq("id", groupId));
            if (teacherId != null) criteria.createCriteria("teacherId").add(Expression.eq("id", teacherId));
            if (subjectId != null) criteria.createCriteria("subjectId").add(Expression.eq("id", subjectId));
            if (roomId != null) criteria.createCriteria("roomId").add(Expression.eq("id", roomId));
            if (solution != null) criteria.createCriteria("solution").add(Expression.eq("id", solution));
            if (classTypeID != null) criteria.createCriteria("classTypeID").add(Expression.eq("id", classTypeID));
            criteria.setMaxResults(250);

            return criteria.list();
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    public java.util.List readAll()
    {
        final Session session = getSession(false);

        try
        {
            final Criteria criteria = session.createCriteria(finf.ucf.cu.domain.ClassTimeImpl.class);
            criteria.setMaxResults(250);
            return criteria.list();
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    public java.util.Map readBackingLists()
    {
        final java.util.Map lists = new java.util.HashMap();
        final Session session = this.getSession();

        try
        {
            lists.put("groupId", session.createQuery("select item.id, item.name from finf.ucf.cu.domain.Group item order by item.name").list());
            lists.put("teacherId", session.createQuery("select item.id, item.email from finf.ucf.cu.domain.Teacher item order by item.email").list());
            lists.put("subjectId", session.createQuery("select item.id, item.name from finf.ucf.cu.domain.Subject item order by item.name").list());
            lists.put("roomId", session.createQuery("select item.id, item.name from finf.ucf.cu.domain.Room item order by item.name").list());
            lists.put("solution", session.createQuery("select item.id, item.name from finf.ucf.cu.domain.Semester item order by item.name").list());
            lists.put("classTypeID", session.createQuery("select item.id, item.name from finf.ucf.cu.domain.ClassType item order by item.name").list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
        return lists;
    }

    public finf.ucf.cu.domain.ClassTime update(java.util.Date day, finf.ucf.cu.domain.cTime time, java.lang.Integer duration, boolean fixed, boolean tipic, java.lang.Long id, java.lang.Long groupId, java.lang.Long teacherId, java.lang.Long subjectId, java.lang.Long roomId, java.lang.Long solution, java.lang.Long classTypeID)
    {
        final finf.ucf.cu.domain.ClassTime entity = this.getDao().load(id);

        entity.setDay(day);
        entity.setTime(time);
        entity.setDuration(duration);
        entity.setFixed(fixed);
        entity.setTipic(tipic);
        finf.ucf.cu.domain.Group groupIdEntity = null;
        if (groupId != null)
        {
            groupIdEntity = getGroupIdDao().load(groupId);
        }

        entity.setGroupId(groupIdEntity);

        finf.ucf.cu.domain.Teacher teacherIdEntity = null;
        if (teacherId != null)
        {
            teacherIdEntity = getTeacherIdDao().load(teacherId);
        }

        entity.setTeacherId(teacherIdEntity);

        finf.ucf.cu.domain.Subject subjectIdEntity = null;
        if (subjectId != null)
        {
            subjectIdEntity = getSubjectIdDao().load(subjectId);
        }

        entity.setSubjectId(subjectIdEntity);

        finf.ucf.cu.domain.Room roomIdEntity = null;
        if (roomId != null)
        {
            roomIdEntity = getRoomIdDao().load(roomId);
        }

        entity.setRoomId(roomIdEntity);

        finf.ucf.cu.domain.Semester solutionEntity = null;
        if (solution != null)
        {
            solutionEntity = getSolutionDao().load(solution);
        }

        entity.setSolution(solutionEntity);

        finf.ucf.cu.domain.ClassType classTypeIDEntity = null;
        if (classTypeID != null)
        {
            classTypeIDEntity = getClassTypeIDDao().load(classTypeID);
        }

        entity.setClassTypeID(classTypeIDEntity);


        this.getDao().update(entity);
        return entity;
    }

    public void delete(java.lang.Long[] ids)
    {
        final Session session = getSession(false);
        try
        {
            final org.hibernate.Query queryObject =
                session.createQuery("delete finf.ucf.cu.domain.ClassTimeImpl where id in (:ids)");
            queryObject.setParameterList("ids", ids);
            queryObject.executeUpdate();
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

}