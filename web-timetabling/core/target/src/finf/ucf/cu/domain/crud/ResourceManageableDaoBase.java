// license-header java merge-point
package finf.ucf.cu.domain.crud;

import org.hibernate.Session;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Expression;

public final class ResourceManageableDaoBase
    extends org.springframework.orm.hibernate3.support.HibernateDaoSupport
    implements ResourceManageableDao
{
    private finf.ucf.cu.domain.ResourceDao dao;

    public void setDao(finf.ucf.cu.domain.ResourceDao dao)
    {
        this.dao = dao;
    }

    protected finf.ucf.cu.domain.ResourceDao getDao()
    {
        return this.dao;
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

    public finf.ucf.cu.domain.Resource create(java.lang.String name, java.lang.String description, java.lang.Long id)
    {
        final finf.ucf.cu.domain.Resource entity = new finf.ucf.cu.domain.ResourceImpl();
        entity.setName(name);
        entity.setDescription(description);
        entity.setId(id);

        return (finf.ucf.cu.domain.Resource)this.getDao().create(entity);
    }

    public finf.ucf.cu.domain.Resource readById(java.lang.Long id)
    {
        return getDao().load(id);
    }

    public java.util.List read(java.lang.String name, java.lang.String description, java.lang.Long id)
    {
        final Session session = getSession(false);

        try
        {
            final Criteria criteria = session.createCriteria(finf.ucf.cu.domain.ResourceImpl.class);

            if (name != null)
                criteria.add(Expression.ilike("name", name, MatchMode.START));
            if (description != null)
                criteria.add(Expression.ilike("description", description, MatchMode.START));
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
            final Criteria criteria = session.createCriteria(finf.ucf.cu.domain.ResourceImpl.class);
            criteria.setMaxResults(250);
            return criteria.list();
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    public finf.ucf.cu.domain.Resource update(java.lang.String name, java.lang.String description, java.lang.Long id)
    {
        final finf.ucf.cu.domain.Resource entity = this.getDao().load(id);

        entity.setName(name);
        entity.setDescription(description);

        this.getDao().update(entity);
        return entity;
    }

    public void delete(java.lang.Long[] ids)
    {
        final Session session = getSession(false);
        try
        {
            final org.hibernate.Query queryObject =
                session.createQuery("delete finf.ucf.cu.domain.ResourceImpl where id in (:ids)");
            queryObject.setParameterList("ids", ids);
            queryObject.executeUpdate();
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

}