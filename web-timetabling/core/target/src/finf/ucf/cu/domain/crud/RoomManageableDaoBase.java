// license-header java merge-point
package finf.ucf.cu.domain.crud;

import org.hibernate.Session;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Expression;

public final class RoomManageableDaoBase
    extends org.springframework.orm.hibernate3.support.HibernateDaoSupport
    implements RoomManageableDao
{
    private finf.ucf.cu.domain.RoomDao dao;

    public void setDao(finf.ucf.cu.domain.RoomDao dao)
    {
        this.dao = dao;
    }

    protected finf.ucf.cu.domain.RoomDao getDao()
    {
        return this.dao;
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

    private finf.ucf.cu.domain.BuildingDao buildingIdDao = null;

    public void setBuildingIdDao(finf.ucf.cu.domain.BuildingDao buildingIdDao)
    {
        this.buildingIdDao = buildingIdDao;
    }

    protected finf.ucf.cu.domain.BuildingDao getBuildingIdDao()
    {
        return this.buildingIdDao;
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

    private java.util.Set findBuildingByIds(java.lang.Long[] ids)
    {
        final Session session = this.getSession(false);
        try
        {
            final Criteria criteria = session.createCriteria(finf.ucf.cu.domain.BuildingImpl.class);
            criteria.add(Expression.in("id", ids));
            return new java.util.HashSet(criteria.list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    public finf.ucf.cu.domain.Room create(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.lang.Long id, java.lang.Long[] resources, java.lang.Long buildingId)
    {
        final finf.ucf.cu.domain.Room entity = new finf.ucf.cu.domain.RoomImpl();
        entity.setName(name);
        entity.setSize(size);
        entity.setAbbreviation(abbreviation);
        entity.setId(id);
        final java.util.Set resourcesEntities = (resources != null && resources.length > 0)
            ? this.findResourceByIds(resources)
            : java.util.Collections.EMPTY_SET;

        entity.setResources(resourcesEntities);

        finf.ucf.cu.domain.Building buildingIdEntity = null;
        if (buildingId != null)
        {
            buildingIdEntity = (finf.ucf.cu.domain.Building)getBuildingIdDao().load(buildingId);
        }

        entity.setBuildingId(buildingIdEntity);


        return (finf.ucf.cu.domain.Room)this.getDao().create(entity);
    }

    public finf.ucf.cu.domain.Room readById(java.lang.Long id)
    {
        return getDao().load(id);
    }

    public java.util.List read(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.lang.Long id, java.lang.Long[] resources, java.lang.Long buildingId)
    {
        final Session session = getSession(false);

        try
        {
            final Criteria criteria = session.createCriteria(finf.ucf.cu.domain.RoomImpl.class);

            if (name != null)
                criteria.add(Expression.ilike("name", name, MatchMode.START));
            if (size != null)
            criteria.add(Expression.eq("size", size));
            if (abbreviation != null)
                criteria.add(Expression.ilike("abbreviation", abbreviation, MatchMode.START));
            if (id != null)
            criteria.add(Expression.eq("id", id));
            if (resources != null && resources.length > 0) criteria.createCriteria("resources").add(Expression.in("id", resources));
            if (buildingId != null) criteria.createCriteria("buildingId").add(Expression.eq("id", buildingId));
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
            final Criteria criteria = session.createCriteria(finf.ucf.cu.domain.RoomImpl.class);
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
            lists.put("resources", session.createQuery("select item.id, item.name from finf.ucf.cu.domain.Resource item order by item.name").list());
            lists.put("buildingId", session.createQuery("select item.id, item.name from finf.ucf.cu.domain.Building item order by item.name").list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
        return lists;
    }

    public finf.ucf.cu.domain.Room update(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.lang.Long id, java.lang.Long[] resources, java.lang.Long buildingId)
    {
        final finf.ucf.cu.domain.Room entity = this.getDao().load(id);

        entity.setName(name);
        entity.setSize(size);
        entity.setAbbreviation(abbreviation);
        final java.util.Set resourcesEntities = (resources != null && resources.length > 0)
            ? this.findResourceByIds(resources)
            : java.util.Collections.EMPTY_SET;

        entity.setResources(resourcesEntities);

        finf.ucf.cu.domain.Building buildingIdEntity = null;
        if (buildingId != null)
        {
            buildingIdEntity = getBuildingIdDao().load(buildingId);
        }

        entity.setBuildingId(buildingIdEntity);


        this.getDao().update(entity);
        return entity;
    }

    public void delete(java.lang.Long[] ids)
    {
        final Session session = getSession(false);
        try
        {
            final org.hibernate.Query queryObject =
                session.createQuery("delete finf.ucf.cu.domain.RoomImpl where id in (:ids)");
            queryObject.setParameterList("ids", ids);
            queryObject.executeUpdate();
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

}