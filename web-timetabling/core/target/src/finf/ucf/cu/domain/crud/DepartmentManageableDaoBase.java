// license-header java merge-point
package finf.ucf.cu.domain.crud;

import org.hibernate.Session;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Expression;

public final class DepartmentManageableDaoBase
    extends org.springframework.orm.hibernate3.support.HibernateDaoSupport
    implements DepartmentManageableDao
{
    private finf.ucf.cu.domain.DepartmentDao dao;

    public void setDao(finf.ucf.cu.domain.DepartmentDao dao)
    {
        this.dao = dao;
    }

    protected finf.ucf.cu.domain.DepartmentDao getDao()
    {
        return this.dao;
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

    public finf.ucf.cu.domain.Department create(java.lang.String name, java.lang.Long id, java.lang.Long teacher)
    {
        final finf.ucf.cu.domain.Department entity = new finf.ucf.cu.domain.DepartmentImpl();
        entity.setName(name);
        entity.setId(id);
        finf.ucf.cu.domain.Teacher teacherEntity = null;
        if (teacher != null)
        {
            teacherEntity = (finf.ucf.cu.domain.Teacher)getTeacherDao().load(teacher);
        }

        entity.setTeacher(teacherEntity);


        return (finf.ucf.cu.domain.Department)this.getDao().create(entity);
    }

    public finf.ucf.cu.domain.Department readById(java.lang.Long id)
    {
        return getDao().load(id);
    }

    public java.util.List read(java.lang.String name, java.lang.Long id, java.lang.Long teacher)
    {
        final Session session = getSession(false);

        try
        {
            final Criteria criteria = session.createCriteria(finf.ucf.cu.domain.DepartmentImpl.class);

            if (name != null)
                criteria.add(Expression.ilike("name", name, MatchMode.START));
            if (id != null)
            criteria.add(Expression.eq("id", id));
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
            final Criteria criteria = session.createCriteria(finf.ucf.cu.domain.DepartmentImpl.class);
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
            lists.put("teacher", session.createQuery("select item.id, item.email from finf.ucf.cu.domain.Teacher item order by item.email").list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
        return lists;
    }

    public finf.ucf.cu.domain.Department update(java.lang.String name, java.lang.Long id, java.lang.Long teacher)
    {
        final finf.ucf.cu.domain.Department entity = this.getDao().load(id);

        entity.setName(name);
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
                session.createQuery("delete finf.ucf.cu.domain.DepartmentImpl where id in (:ids)");
            queryObject.setParameterList("ids", ids);
            queryObject.executeUpdate();
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

}