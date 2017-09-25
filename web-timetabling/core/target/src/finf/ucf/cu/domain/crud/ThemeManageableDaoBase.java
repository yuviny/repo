// license-header java merge-point
package finf.ucf.cu.domain.crud;

import org.hibernate.Session;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Expression;

public final class ThemeManageableDaoBase
    extends org.springframework.orm.hibernate3.support.HibernateDaoSupport
    implements ThemeManageableDao
{
    private finf.ucf.cu.domain.ThemeDao dao;

    public void setDao(finf.ucf.cu.domain.ThemeDao dao)
    {
        this.dao = dao;
    }

    protected finf.ucf.cu.domain.ThemeDao getDao()
    {
        return this.dao;
    }

    private finf.ucf.cu.domain.P1Dao punoIdDao = null;

    public void setPunoIdDao(finf.ucf.cu.domain.P1Dao punoIdDao)
    {
        this.punoIdDao = punoIdDao;
    }

    protected finf.ucf.cu.domain.P1Dao getPunoIdDao()
    {
        return this.punoIdDao;
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

    public finf.ucf.cu.domain.Theme create(java.lang.String name, java.lang.Long id, java.lang.Long punoId)
    {
        final finf.ucf.cu.domain.Theme entity = new finf.ucf.cu.domain.ThemeImpl();
        entity.setName(name);
        entity.setId(id);
        finf.ucf.cu.domain.P1 punoIdEntity = null;
        if (punoId != null)
        {
            punoIdEntity = (finf.ucf.cu.domain.P1)getPunoIdDao().load(punoId);
        }

        entity.setPunoId(punoIdEntity);


        return (finf.ucf.cu.domain.Theme)this.getDao().create(entity);
    }

    public finf.ucf.cu.domain.Theme readById(java.lang.Long id)
    {
        return getDao().load(id);
    }

    public java.util.List read(java.lang.String name, java.lang.Long id, java.lang.Long punoId)
    {
        final Session session = getSession(false);

        try
        {
            final Criteria criteria = session.createCriteria(finf.ucf.cu.domain.ThemeImpl.class);

            if (name != null)
                criteria.add(Expression.ilike("name", name, MatchMode.START));
            if (id != null)
            criteria.add(Expression.eq("id", id));
            if (punoId != null) criteria.createCriteria("punoId").add(Expression.eq("id", punoId));
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
            final Criteria criteria = session.createCriteria(finf.ucf.cu.domain.ThemeImpl.class);
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
            lists.put("punoId", session.createQuery("select item.id, item.name from finf.ucf.cu.domain.P1 item order by item.name").list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
        return lists;
    }

    public finf.ucf.cu.domain.Theme update(java.lang.String name, java.lang.Long id, java.lang.Long punoId)
    {
        final finf.ucf.cu.domain.Theme entity = this.getDao().load(id);

        entity.setName(name);
        finf.ucf.cu.domain.P1 punoIdEntity = null;
        if (punoId != null)
        {
            punoIdEntity = getPunoIdDao().load(punoId);
        }

        entity.setPunoId(punoIdEntity);


        this.getDao().update(entity);
        return entity;
    }

    public void delete(java.lang.Long[] ids)
    {
        final Session session = getSession(false);
        try
        {
            final org.hibernate.Query queryObject =
                session.createQuery("delete finf.ucf.cu.domain.ThemeImpl where id in (:ids)");
            queryObject.setParameterList("ids", ids);
            queryObject.executeUpdate();
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

}