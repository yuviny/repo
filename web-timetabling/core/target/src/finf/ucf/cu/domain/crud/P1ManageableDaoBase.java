// license-header java merge-point
package finf.ucf.cu.domain.crud;

import org.hibernate.Session;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Expression;

public final class P1ManageableDaoBase
    extends org.springframework.orm.hibernate3.support.HibernateDaoSupport
    implements P1ManageableDao
{
    private finf.ucf.cu.domain.P1Dao dao;

    public void setDao(finf.ucf.cu.domain.P1Dao dao)
    {
        this.dao = dao;
    }

    protected finf.ucf.cu.domain.P1Dao getDao()
    {
        return this.dao;
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

    private finf.ucf.cu.domain.TeacherDao teacherDao = null;

    public void setTeacherDao(finf.ucf.cu.domain.TeacherDao teacherDao)
    {
        this.teacherDao = teacherDao;
    }

    protected finf.ucf.cu.domain.TeacherDao getTeacherDao()
    {
        return this.teacherDao;
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

    private java.util.Set findThemeByIds(java.lang.Long[] ids)
    {
        final Session session = this.getSession(false);
        try
        {
            final Criteria criteria = session.createCriteria(finf.ucf.cu.domain.ThemeImpl.class);
            criteria.add(Expression.in("id", ids));
            return new java.util.HashSet(criteria.list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    public finf.ucf.cu.domain.P1 create(java.lang.String name, java.util.Date endDate, java.lang.String approved_by, java.lang.Long id, java.lang.Long subjectId, java.lang.Long teacher)
    {
        final finf.ucf.cu.domain.P1 entity = new finf.ucf.cu.domain.P1Impl();
        entity.setName(name);
        entity.setEndDate(endDate);
        entity.setApproved_by(approved_by);
        entity.setId(id);
        finf.ucf.cu.domain.Subject subjectIdEntity = null;
        if (subjectId != null)
        {
            subjectIdEntity = (finf.ucf.cu.domain.Subject)getSubjectIdDao().load(subjectId);
        }

        entity.setSubjectId(subjectIdEntity);

        finf.ucf.cu.domain.Teacher teacherEntity = null;
        if (teacher != null)
        {
            teacherEntity = (finf.ucf.cu.domain.Teacher)getTeacherDao().load(teacher);
        }

        entity.setTeacher(teacherEntity);


        return (finf.ucf.cu.domain.P1)this.getDao().create(entity);
    }

    public finf.ucf.cu.domain.P1 readById(java.lang.Long id)
    {
        return getDao().load(id);
    }

    public java.util.List read(java.lang.String name, java.util.Date endDate, java.lang.String approved_by, java.lang.Long id, java.lang.Long subjectId, java.lang.Long teacher)
    {
        final Session session = getSession(false);

        try
        {
            final Criteria criteria = session.createCriteria(finf.ucf.cu.domain.P1Impl.class);

            if (name != null)
                criteria.add(Expression.ilike("name", name, MatchMode.START));
            if (endDate != null)
            {
                // we check whether or not the user supplied time information within this particular date argument
                // if he/she didn't we assume he/she wishes to search in the scope of the entire day
                final java.util.Calendar calendar = new java.util.GregorianCalendar();
                calendar.setTime(endDate);
                if ( calendar.get(java.util.Calendar.HOUR) != 0
                     || calendar.get(java.util.Calendar.MINUTE) != 0
                     || calendar.get(java.util.Calendar.SECOND) != 0
                     || calendar.get(java.util.Calendar.MILLISECOND) != 0 )
                {
                    criteria.add(Expression.eq("endDate", endDate));
                }
                else
                {
                    calendar.add(java.util.Calendar.DATE, 1);
                    criteria.add(Expression.between("endDate", endDate, calendar.getTime()));
                }
            }
            if (approved_by != null)
                criteria.add(Expression.ilike("approved_by", approved_by, MatchMode.START));
            if (id != null)
            criteria.add(Expression.eq("id", id));
            if (subjectId != null) criteria.createCriteria("subjectId").add(Expression.eq("id", subjectId));
            if (teacher != null) criteria.createCriteria("teacher").add(Expression.eq("id", teacher));
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
            final Criteria criteria = session.createCriteria(finf.ucf.cu.domain.P1Impl.class);
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
            lists.put("subjectId", session.createQuery("select item.id, item.name from finf.ucf.cu.domain.Subject item order by item.name").list());
            lists.put("teacher", session.createQuery("select item.id, item.email from finf.ucf.cu.domain.Teacher item order by item.email").list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
        return lists;
    }

    public finf.ucf.cu.domain.P1 update(java.lang.String name, java.util.Date endDate, java.lang.String approved_by, java.lang.Long id, java.lang.Long subjectId, java.lang.Long teacher)
    {
        final finf.ucf.cu.domain.P1 entity = this.getDao().load(id);

        entity.setName(name);
        entity.setEndDate(endDate);
        entity.setApproved_by(approved_by);
        finf.ucf.cu.domain.Subject subjectIdEntity = null;
        if (subjectId != null)
        {
            subjectIdEntity = getSubjectIdDao().load(subjectId);
        }

        entity.setSubjectId(subjectIdEntity);

        finf.ucf.cu.domain.Teacher teacherEntity = null;
        if (teacher != null)
        {
            teacherEntity = getTeacherDao().load(teacher);
        }

        entity.setTeacher(teacherEntity);


        this.getDao().update(entity);
        return entity;
    }

    public void delete(java.lang.Long[] ids)
    {
        final Session session = getSession(false);
        try
        {
            final org.hibernate.Query queryObject =
                session.createQuery("delete finf.ucf.cu.domain.P1Impl where id in (:ids)");
            queryObject.setParameterList("ids", ids);
            queryObject.executeUpdate();
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

}