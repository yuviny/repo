// license-header java merge-point
package finf.ucf.cu.domain.crud;

import org.hibernate.Session;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Expression;

public final class ClassTypeManageableDaoBase
    extends org.springframework.orm.hibernate3.support.HibernateDaoSupport
    implements ClassTypeManageableDao
{
    private finf.ucf.cu.domain.ClassTypeDao dao;

    public void setDao(finf.ucf.cu.domain.ClassTypeDao dao)
    {
        this.dao = dao;
    }

    protected finf.ucf.cu.domain.ClassTypeDao getDao()
    {
        return this.dao;
    }

    private java.util.Set findActivityByIds(java.lang.Long[] ids)
    {
        final Session session = this.getSession(false);
        try
        {
            final Criteria criteria = session.createCriteria(finf.ucf.cu.domain.ActivityImpl.class);
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

    public finf.ucf.cu.domain.ClassType create(java.lang.String name, java.lang.Long id)
    {
        final finf.ucf.cu.domain.ClassType entity = new finf.ucf.cu.domain.ClassTypeImpl();
        entity.setName(name);
        entity.setId(id);

        return (finf.ucf.cu.domain.ClassType)this.getDao().create(entity);
    }

    public finf.ucf.cu.domain.ClassType readById(java.lang.Long id)
    {
        return getDao().load(id);
    }

    public java.util.List read(java.lang.String name, java.lang.Long id)
    {
        final Session session = getSession(false);

        try
        {
            final Criteria criteria = session.createCriteria(finf.ucf.cu.domain.ClassTypeImpl.class);

            if (name != null)
                criteria.add(Expression.ilike("name", name, MatchMode.START));
            if (id != null)
            criteria.add(Expression.eq("id", id));
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
            final Criteria criteria = session.createCriteria(finf.ucf.cu.domain.ClassTypeImpl.class);
            criteria.setMaxResults(250);
            return criteria.list();
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    public finf.ucf.cu.domain.ClassType update(java.lang.String name, java.lang.Long id)
    {
        final finf.ucf.cu.domain.ClassType entity = this.getDao().load(id);

        entity.setName(name);

        this.getDao().update(entity);
        return entity;
    }

    public void delete(java.lang.Long[] ids)
    {
        final Session session = getSession(false);
        try
        {
            final org.hibernate.Query queryObject =
                session.createQuery("delete finf.ucf.cu.domain.ClassTypeImpl where id in (:ids)");
            queryObject.setParameterList("ids", ids);
            queryObject.executeUpdate();
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

}