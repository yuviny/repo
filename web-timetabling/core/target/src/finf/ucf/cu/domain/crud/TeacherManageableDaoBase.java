// license-header java merge-point
package finf.ucf.cu.domain.crud;

import org.hibernate.Session;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Expression;

public final class TeacherManageableDaoBase
    extends org.springframework.orm.hibernate3.support.HibernateDaoSupport
    implements TeacherManageableDao
{
    private finf.ucf.cu.domain.TeacherDao dao;

    public void setDao(finf.ucf.cu.domain.TeacherDao dao)
    {
        this.dao = dao;
    }

    protected finf.ucf.cu.domain.TeacherDao getDao()
    {
        return this.dao;
    }

    private finf.ucf.cu.domain.DepartmentDao departmentIdDao = null;

    public void setDepartmentIdDao(finf.ucf.cu.domain.DepartmentDao departmentIdDao)
    {
        this.departmentIdDao = departmentIdDao;
    }

    protected finf.ucf.cu.domain.DepartmentDao getDepartmentIdDao()
    {
        return this.departmentIdDao;
    }

    private java.util.Set findClassTimeByIds(java.lang.Long[] ids)
    {
        final Session session = this.getSession(false);
        try
        {
            final Criteria criteria = session.createCriteria(finf.ucf.cu.domain.ClassTimeImpl.class);
            criteria.add(Expression.in("id", ids));
            return new java.util.HashSet(criteria.list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    private java.util.Set findNotAvalabilityByIds(java.lang.Long[] ids)
    {
        final Session session = this.getSession(false);
        try
        {
            final Criteria criteria = session.createCriteria(finf.ucf.cu.domain.NotAvalabilityImpl.class);
            criteria.add(Expression.in("id", ids));
            return new java.util.HashSet(criteria.list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    private java.util.Set findDepartmentByIds(java.lang.Long[] ids)
    {
        final Session session = this.getSession(false);
        try
        {
            final Criteria criteria = session.createCriteria(finf.ucf.cu.domain.DepartmentImpl.class);
            criteria.add(Expression.in("id", ids));
            return new java.util.HashSet(criteria.list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    private java.util.Set findImpartitionPlanByIds(java.lang.Long[] ids)
    {
        final Session session = this.getSession(false);
        try
        {
            final Criteria criteria = session.createCriteria(finf.ucf.cu.domain.ImpartitionPlanImpl.class);
            criteria.add(Expression.in("id", ids));
            return new java.util.HashSet(criteria.list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    private java.util.Set findP1ByIds(java.lang.Long[] ids)
    {
        final Session session = this.getSession(false);
        try
        {
            final Criteria criteria = session.createCriteria(finf.ucf.cu.domain.P1Impl.class);
            criteria.add(Expression.in("id", ids));
            return new java.util.HashSet(criteria.list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    public finf.ucf.cu.domain.Teacher create(java.lang.String email, java.lang.String name, java.lang.String firstName, java.lang.String lastName, java.lang.String grade, java.lang.Long id, java.lang.Long departmentId)
    {
        final finf.ucf.cu.domain.Teacher entity = new finf.ucf.cu.domain.TeacherImpl();
        entity.setEmail(email);
        entity.setName(name);
        entity.setFirstName(firstName);
        entity.setLastName(lastName);
        entity.setGrade(grade);
        entity.setId(id);
        finf.ucf.cu.domain.Department departmentIdEntity = null;
        if (departmentId != null)
        {
            departmentIdEntity = (finf.ucf.cu.domain.Department)getDepartmentIdDao().load(departmentId);
        }

        entity.setDepartmentId(departmentIdEntity);


        return (finf.ucf.cu.domain.Teacher)this.getDao().create(entity);
    }

    public finf.ucf.cu.domain.Teacher readById(java.lang.Long id)
    {
        return getDao().load(id);
    }

    public java.util.List read(java.lang.String email, java.lang.String name, java.lang.String firstName, java.lang.String lastName, java.lang.String grade, java.lang.Long id, java.lang.Long departmentId)
    {
        final Session session = getSession(false);

        try
        {
            final Criteria criteria = session.createCriteria(finf.ucf.cu.domain.TeacherImpl.class);

            if (email != null)
                criteria.add(Expression.ilike("email", email, MatchMode.START));
            if (name != null)
                criteria.add(Expression.ilike("name", name, MatchMode.START));
            if (firstName != null)
                criteria.add(Expression.ilike("firstName", firstName, MatchMode.START));
            if (lastName != null)
                criteria.add(Expression.ilike("lastName", lastName, MatchMode.START));
            if (grade != null)
                criteria.add(Expression.ilike("grade", grade, MatchMode.START));
            if (id != null)
            criteria.add(Expression.eq("id", id));
            if (departmentId != null) criteria.createCriteria("departmentId").add(Expression.eq("id", departmentId));
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
            final Criteria criteria = session.createCriteria(finf.ucf.cu.domain.TeacherImpl.class);
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
            lists.put("departmentId", session.createQuery("select item.id, item.name from finf.ucf.cu.domain.Department item order by item.name").list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
        return lists;
    }

    public finf.ucf.cu.domain.Teacher update(java.lang.String email, java.lang.String name, java.lang.String firstName, java.lang.String lastName, java.lang.String grade, java.lang.Long id, java.lang.Long departmentId)
    {
        final finf.ucf.cu.domain.Teacher entity = this.getDao().load(id);

        entity.setEmail(email);
        entity.setName(name);
        entity.setFirstName(firstName);
        entity.setLastName(lastName);
        entity.setGrade(grade);
        finf.ucf.cu.domain.Department departmentIdEntity = null;
        if (departmentId != null)
        {
            departmentIdEntity = getDepartmentIdDao().load(departmentId);
        }

        entity.setDepartmentId(departmentIdEntity);


        this.getDao().update(entity);
        return entity;
    }

    public void delete(java.lang.Long[] ids)
    {
        final Session session = getSession(false);
        try
        {
            final org.hibernate.Query queryObject =
                session.createQuery("delete finf.ucf.cu.domain.TeacherImpl where id in (:ids)");
            queryObject.setParameterList("ids", ids);
            queryObject.executeUpdate();
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

}