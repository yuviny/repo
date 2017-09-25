// license-header java merge-point
package finf.ucf.cu.domain.crud;

import org.hibernate.Session;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Expression;

public final class ImpartitionPlanManageableDaoBase
    extends org.springframework.orm.hibernate3.support.HibernateDaoSupport
    implements ImpartitionPlanManageableDao
{
    private finf.ucf.cu.domain.ImpartitionPlanDao dao;

    public void setDao(finf.ucf.cu.domain.ImpartitionPlanDao dao)
    {
        this.dao = dao;
    }

    protected finf.ucf.cu.domain.ImpartitionPlanDao getDao()
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

    private finf.ucf.cu.domain.TeacherDao teacherIdDao = null;

    public void setTeacherIdDao(finf.ucf.cu.domain.TeacherDao teacherIdDao)
    {
        this.teacherIdDao = teacherIdDao;
    }

    protected finf.ucf.cu.domain.TeacherDao getTeacherIdDao()
    {
        return this.teacherIdDao;
    }

    private finf.ucf.cu.domain.ClassTypeDao classTypeIdDao = null;

    public void setClassTypeIdDao(finf.ucf.cu.domain.ClassTypeDao classTypeIdDao)
    {
        this.classTypeIdDao = classTypeIdDao;
    }

    protected finf.ucf.cu.domain.ClassTypeDao getClassTypeIdDao()
    {
        return this.classTypeIdDao;
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

    private finf.ucf.cu.domain.SemesterDao semesterIdDao = null;

    public void setSemesterIdDao(finf.ucf.cu.domain.SemesterDao semesterIdDao)
    {
        this.semesterIdDao = semesterIdDao;
    }

    protected finf.ucf.cu.domain.SemesterDao getSemesterIdDao()
    {
        return this.semesterIdDao;
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

    public finf.ucf.cu.domain.ImpartitionPlan create(java.lang.Boolean teacherallclasetype, java.lang.Long id, java.lang.Long subjectId, java.lang.Long teacherId, java.lang.Long classTypeId, java.lang.Long groupId, java.lang.Long semesterId)
    {
        final finf.ucf.cu.domain.ImpartitionPlan entity = new finf.ucf.cu.domain.ImpartitionPlanImpl();
        entity.setTeacherallclasetype(teacherallclasetype);
        entity.setId(id);
        finf.ucf.cu.domain.Subject subjectIdEntity = null;
        if (subjectId != null)
        {
            subjectIdEntity = (finf.ucf.cu.domain.Subject)getSubjectIdDao().load(subjectId);
        }

        entity.setSubjectId(subjectIdEntity);

        finf.ucf.cu.domain.Teacher teacherIdEntity = null;
        if (teacherId != null)
        {
            teacherIdEntity = (finf.ucf.cu.domain.Teacher)getTeacherIdDao().load(teacherId);
        }

        entity.setTeacherId(teacherIdEntity);

        finf.ucf.cu.domain.ClassType classTypeIdEntity = null;
        if (classTypeId != null)
        {
            classTypeIdEntity = (finf.ucf.cu.domain.ClassType)getClassTypeIdDao().load(classTypeId);
        }

        entity.setClassTypeId(classTypeIdEntity);

        finf.ucf.cu.domain.Group groupIdEntity = null;
        if (groupId != null)
        {
            groupIdEntity = (finf.ucf.cu.domain.Group)getGroupIdDao().load(groupId);
        }

        entity.setGroupId(groupIdEntity);

        finf.ucf.cu.domain.Semester semesterIdEntity = null;
        if (semesterId != null)
        {
            semesterIdEntity = (finf.ucf.cu.domain.Semester)getSemesterIdDao().load(semesterId);
        }

        entity.setSemesterId(semesterIdEntity);


        return (finf.ucf.cu.domain.ImpartitionPlan)this.getDao().create(entity);
    }

    public finf.ucf.cu.domain.ImpartitionPlan readById(java.lang.Long id)
    {
        return getDao().load(id);
    }

    public java.util.List read(java.lang.Boolean teacherallclasetype, java.lang.Long id, java.lang.Long subjectId, java.lang.Long teacherId, java.lang.Long classTypeId, java.lang.Long groupId, java.lang.Long semesterId)
    {
        final Session session = getSession(false);

        try
        {
            final Criteria criteria = session.createCriteria(finf.ucf.cu.domain.ImpartitionPlanImpl.class);

            if (teacherallclasetype != null)
            if (teacherallclasetype.booleanValue()) criteria.add(Expression.eq("teacherallclasetype", java.lang.Boolean.TRUE));
            if (id != null)
            criteria.add(Expression.eq("id", id));
            if (subjectId != null) criteria.createCriteria("subjectId").add(Expression.eq("id", subjectId));
            if (teacherId != null) criteria.createCriteria("teacherId").add(Expression.eq("id", teacherId));
            if (classTypeId != null) criteria.createCriteria("classTypeId").add(Expression.eq("id", classTypeId));
            if (groupId != null) criteria.createCriteria("groupId").add(Expression.eq("id", groupId));
            if (semesterId != null) criteria.createCriteria("semesterId").add(Expression.eq("id", semesterId));
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
            final Criteria criteria = session.createCriteria(finf.ucf.cu.domain.ImpartitionPlanImpl.class);
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
            lists.put("teacherId", session.createQuery("select item.id, item.email from finf.ucf.cu.domain.Teacher item order by item.email").list());
            lists.put("classTypeId", session.createQuery("select item.id, item.name from finf.ucf.cu.domain.ClassType item order by item.name").list());
            lists.put("groupId", session.createQuery("select item.id, item.name from finf.ucf.cu.domain.Group item order by item.name").list());
            lists.put("semesterId", session.createQuery("select item.id, item.name from finf.ucf.cu.domain.Semester item order by item.name").list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
        return lists;
    }

    public finf.ucf.cu.domain.ImpartitionPlan update(java.lang.Boolean teacherallclasetype, java.lang.Long id, java.lang.Long subjectId, java.lang.Long teacherId, java.lang.Long classTypeId, java.lang.Long groupId, java.lang.Long semesterId)
    {
        final finf.ucf.cu.domain.ImpartitionPlan entity = this.getDao().load(id);

        entity.setTeacherallclasetype(teacherallclasetype);
        finf.ucf.cu.domain.Subject subjectIdEntity = null;
        if (subjectId != null)
        {
            subjectIdEntity = getSubjectIdDao().load(subjectId);
        }

        entity.setSubjectId(subjectIdEntity);

        finf.ucf.cu.domain.Teacher teacherIdEntity = null;
        if (teacherId != null)
        {
            teacherIdEntity = getTeacherIdDao().load(teacherId);
        }

        entity.setTeacherId(teacherIdEntity);

        finf.ucf.cu.domain.ClassType classTypeIdEntity = null;
        if (classTypeId != null)
        {
            classTypeIdEntity = getClassTypeIdDao().load(classTypeId);
        }

        entity.setClassTypeId(classTypeIdEntity);

        finf.ucf.cu.domain.Group groupIdEntity = null;
        if (groupId != null)
        {
            groupIdEntity = getGroupIdDao().load(groupId);
        }

        entity.setGroupId(groupIdEntity);

        finf.ucf.cu.domain.Semester semesterIdEntity = null;
        if (semesterId != null)
        {
            semesterIdEntity = getSemesterIdDao().load(semesterId);
        }

        entity.setSemesterId(semesterIdEntity);


        this.getDao().update(entity);
        return entity;
    }

    public void delete(java.lang.Long[] ids)
    {
        final Session session = getSession(false);
        try
        {
            final org.hibernate.Query queryObject =
                session.createQuery("delete finf.ucf.cu.domain.ImpartitionPlanImpl where id in (:ids)");
            queryObject.setParameterList("ids", ids);
            queryObject.executeUpdate();
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

}