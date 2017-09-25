// license-header java merge-point
package finf.ucf.cu.domain.crud;

import org.hibernate.Session;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Expression;

public final class ActivityManageableDaoBase
    extends org.springframework.orm.hibernate3.support.HibernateDaoSupport
    implements ActivityManageableDao
{
    private finf.ucf.cu.domain.ActivityDao dao;

    public void setDao(finf.ucf.cu.domain.ActivityDao dao)
    {
        this.dao = dao;
    }

    protected finf.ucf.cu.domain.ActivityDao getDao()
    {
        return this.dao;
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

    private finf.ucf.cu.domain.ResourceDao resourcesDao = null;

    public void setResourcesDao(finf.ucf.cu.domain.ResourceDao resourcesDao)
    {
        this.resourcesDao = resourcesDao;
    }

    protected finf.ucf.cu.domain.ResourceDao getResourcesDao()
    {
        return this.resourcesDao;
    }

    private finf.ucf.cu.domain.ThemeDao themeIdDao = null;

    public void setThemeIdDao(finf.ucf.cu.domain.ThemeDao themeIdDao)
    {
        this.themeIdDao = themeIdDao;
    }

    protected finf.ucf.cu.domain.ThemeDao getThemeIdDao()
    {
        return this.themeIdDao;
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

    private java.util.Set findResourceByIds(java.lang.Long[] ids)
    {
        final Session session = this.getSession(false);
        try
        {
            final Criteria criteria = session.createCriteria(finf.ucf.cu.domain.ResourceImpl.class);
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

    public finf.ucf.cu.domain.Activity create(java.lang.Integer number, java.lang.String name, java.lang.Integer hour_cant, java.lang.Integer week, java.lang.Long id, java.lang.Long classTypeId, java.lang.Long[] resources, java.lang.Long themeId)
    {
        final finf.ucf.cu.domain.Activity entity = new finf.ucf.cu.domain.ActivityImpl();
        entity.setNumber(number);
        entity.setName(name);
        entity.setHour_cant(hour_cant);
        entity.setWeek(week);
        entity.setId(id);
        finf.ucf.cu.domain.ClassType classTypeIdEntity = null;
        if (classTypeId != null)
        {
            classTypeIdEntity = (finf.ucf.cu.domain.ClassType)getClassTypeIdDao().load(classTypeId);
        }

        entity.setClassTypeId(classTypeIdEntity);

        final java.util.Set resourcesEntities = (resources != null && resources.length > 0)
            ? this.findResourceByIds(resources)
            : java.util.Collections.EMPTY_SET;

        entity.setResources(resourcesEntities);

        finf.ucf.cu.domain.Theme themeIdEntity = null;
        if (themeId != null)
        {
            themeIdEntity = (finf.ucf.cu.domain.Theme)getThemeIdDao().load(themeId);
        }

        entity.setThemeId(themeIdEntity);


        return (finf.ucf.cu.domain.Activity)this.getDao().create(entity);
    }

    public finf.ucf.cu.domain.Activity readById(java.lang.Long id)
    {
        return getDao().load(id);
    }

    public java.util.List read(java.lang.Integer number, java.lang.String name, java.lang.Integer hour_cant, java.lang.Integer week, java.lang.Long id, java.lang.Long classTypeId, java.lang.Long[] resources, java.lang.Long themeId)
    {
        final Session session = getSession(false);

        try
        {
            final Criteria criteria = session.createCriteria(finf.ucf.cu.domain.ActivityImpl.class);

            if (number != null)
            criteria.add(Expression.eq("number", number));
            if (name != null)
                criteria.add(Expression.ilike("name", name, MatchMode.START));
            if (hour_cant != null)
            criteria.add(Expression.eq("hour_cant", hour_cant));
            if (week != null)
            criteria.add(Expression.eq("week", week));
            if (id != null)
            criteria.add(Expression.eq("id", id));
            if (classTypeId != null) criteria.createCriteria("classTypeId").add(Expression.eq("id", classTypeId));
            if (resources != null && resources.length > 0) criteria.createCriteria("resources").add(Expression.in("id", resources));
            if (themeId != null) criteria.createCriteria("themeId").add(Expression.eq("id", themeId));
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
            final Criteria criteria = session.createCriteria(finf.ucf.cu.domain.ActivityImpl.class);
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
            lists.put("classTypeId", session.createQuery("select item.id, item.name from finf.ucf.cu.domain.ClassType item order by item.name").list());
            lists.put("resources", session.createQuery("select item.id, item.name from finf.ucf.cu.domain.Resource item order by item.name").list());
            lists.put("themeId", session.createQuery("select item.id, item.name from finf.ucf.cu.domain.Theme item order by item.name").list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
        return lists;
    }

    public finf.ucf.cu.domain.Activity update(java.lang.Integer number, java.lang.String name, java.lang.Integer hour_cant, java.lang.Integer week, java.lang.Long id, java.lang.Long classTypeId, java.lang.Long[] resources, java.lang.Long themeId)
    {
        final finf.ucf.cu.domain.Activity entity = this.getDao().load(id);

        entity.setNumber(number);
        entity.setName(name);
        entity.setHour_cant(hour_cant);
        entity.setWeek(week);
        finf.ucf.cu.domain.ClassType classTypeIdEntity = null;
        if (classTypeId != null)
        {
            classTypeIdEntity = getClassTypeIdDao().load(classTypeId);
        }

        entity.setClassTypeId(classTypeIdEntity);

        final java.util.Set resourcesEntities = (resources != null && resources.length > 0)
            ? this.findResourceByIds(resources)
            : java.util.Collections.EMPTY_SET;

        entity.setResources(resourcesEntities);

        finf.ucf.cu.domain.Theme themeIdEntity = null;
        if (themeId != null)
        {
            themeIdEntity = getThemeIdDao().load(themeId);
        }

        entity.setThemeId(themeIdEntity);


        this.getDao().update(entity);
        return entity;
    }

    public void delete(java.lang.Long[] ids)
    {
        final Session session = getSession(false);
        try
        {
            final org.hibernate.Query queryObject =
                session.createQuery("delete finf.ucf.cu.domain.ActivityImpl where id in (:ids)");
            queryObject.setParameterList("ids", ids);
            queryObject.executeUpdate();
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

}