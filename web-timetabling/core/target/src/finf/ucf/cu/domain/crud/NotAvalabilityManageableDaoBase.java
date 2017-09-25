// license-header java merge-point
package finf.ucf.cu.domain.crud;

import org.hibernate.Session;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Expression;

public final class NotAvalabilityManageableDaoBase
    extends org.springframework.orm.hibernate3.support.HibernateDaoSupport
    implements NotAvalabilityManageableDao
{
    private finf.ucf.cu.domain.NotAvalabilityDao dao;

    public void setDao(finf.ucf.cu.domain.NotAvalabilityDao dao)
    {
        this.dao = dao;
    }

    protected finf.ucf.cu.domain.NotAvalabilityDao getDao()
    {
        return this.dao;
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

    private finf.ucf.cu.domain.GroupDao groupIdDao = null;

    public void setGroupIdDao(finf.ucf.cu.domain.GroupDao groupIdDao)
    {
        this.groupIdDao = groupIdDao;
    }

    protected finf.ucf.cu.domain.GroupDao getGroupIdDao()
    {
        return this.groupIdDao;
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

    public finf.ucf.cu.domain.NotAvalability create(java.util.Date date, finf.ucf.cu.domain.cTime not_time, java.lang.Long id, java.lang.Long teacherId, java.lang.Long groupId, java.lang.Long subjectId)
    {
        final finf.ucf.cu.domain.NotAvalability entity = new finf.ucf.cu.domain.NotAvalabilityImpl();
        entity.setDate(date);
        entity.setNot_time(not_time);
        entity.setId(id);
        finf.ucf.cu.domain.Teacher teacherIdEntity = null;
        if (teacherId != null)
        {
            teacherIdEntity = (finf.ucf.cu.domain.Teacher)getTeacherIdDao().load(teacherId);
        }

        entity.setTeacherId(teacherIdEntity);

        finf.ucf.cu.domain.Group groupIdEntity = null;
        if (groupId != null)
        {
            groupIdEntity = (finf.ucf.cu.domain.Group)getGroupIdDao().load(groupId);
        }

        entity.setGroupId(groupIdEntity);

        finf.ucf.cu.domain.Subject subjectIdEntity = null;
        if (subjectId != null)
        {
            subjectIdEntity = (finf.ucf.cu.domain.Subject)getSubjectIdDao().load(subjectId);
        }

        entity.setSubjectId(subjectIdEntity);


        return (finf.ucf.cu.domain.NotAvalability)this.getDao().create(entity);
    }

    public finf.ucf.cu.domain.NotAvalability readById(java.lang.Long id)
    {
        return getDao().load(id);
    }

    public java.util.List read(java.util.Date date, finf.ucf.cu.domain.cTime not_time, java.lang.Long id, java.lang.Long teacherId, java.lang.Long groupId, java.lang.Long subjectId)
    {
        final Session session = getSession(false);

        try
        {
            final Criteria criteria = session.createCriteria(finf.ucf.cu.domain.NotAvalabilityImpl.class);

            if (date != null)
            {
                // we check whether or not the user supplied time information within this particular date argument
                // if he/she didn't we assume he/she wishes to search in the scope of the entire day
                final java.util.Calendar calendar = new java.util.GregorianCalendar();
                calendar.setTime(date);
                if ( calendar.get(java.util.Calendar.HOUR) != 0
                     || calendar.get(java.util.Calendar.MINUTE) != 0
                     || calendar.get(java.util.Calendar.SECOND) != 0
                     || calendar.get(java.util.Calendar.MILLISECOND) != 0 )
                {
                    criteria.add(Expression.eq("date", date));
                }
                else
                {
                    calendar.add(java.util.Calendar.DATE, 1);
                    criteria.add(Expression.between("date", date, calendar.getTime()));
                }
            }
            if (not_time != null)
            criteria.add(Expression.eq("not_time", not_time));
            if (id != null)
            criteria.add(Expression.eq("id", id));
            if (teacherId != null) criteria.createCriteria("teacherId").add(Expression.eq("id", teacherId));
            if (groupId != null) criteria.createCriteria("groupId").add(Expression.eq("id", groupId));
            if (subjectId != null) criteria.createCriteria("subjectId").add(Expression.eq("id", subjectId));
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
            final Criteria criteria = session.createCriteria(finf.ucf.cu.domain.NotAvalabilityImpl.class);
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
            lists.put("teacherId", session.createQuery("select item.id, item.email from finf.ucf.cu.domain.Teacher item order by item.email").list());
            lists.put("groupId", session.createQuery("select item.id, item.name from finf.ucf.cu.domain.Group item order by item.name").list());
            lists.put("subjectId", session.createQuery("select item.id, item.name from finf.ucf.cu.domain.Subject item order by item.name").list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
        return lists;
    }

    public finf.ucf.cu.domain.NotAvalability update(java.util.Date date, finf.ucf.cu.domain.cTime not_time, java.lang.Long id, java.lang.Long teacherId, java.lang.Long groupId, java.lang.Long subjectId)
    {
        final finf.ucf.cu.domain.NotAvalability entity = this.getDao().load(id);

        entity.setDate(date);
        entity.setNot_time(not_time);
        finf.ucf.cu.domain.Teacher teacherIdEntity = null;
        if (teacherId != null)
        {
            teacherIdEntity = getTeacherIdDao().load(teacherId);
        }

        entity.setTeacherId(teacherIdEntity);

        finf.ucf.cu.domain.Group groupIdEntity = null;
        if (groupId != null)
        {
            groupIdEntity = getGroupIdDao().load(groupId);
        }

        entity.setGroupId(groupIdEntity);

        finf.ucf.cu.domain.Subject subjectIdEntity = null;
        if (subjectId != null)
        {
            subjectIdEntity = getSubjectIdDao().load(subjectId);
        }

        entity.setSubjectId(subjectIdEntity);


        this.getDao().update(entity);
        return entity;
    }

    public void delete(java.lang.Long[] ids)
    {
        final Session session = getSession(false);
        try
        {
            final org.hibernate.Query queryObject =
                session.createQuery("delete finf.ucf.cu.domain.NotAvalabilityImpl where id in (:ids)");
            queryObject.setParameterList("ids", ids);
            queryObject.executeUpdate();
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

}