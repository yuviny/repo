// license-header java merge-point
package finf.ucf.cu.domain.crud;

import org.hibernate.Session;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Expression;

public final class GroupManageableDaoBase
    extends org.springframework.orm.hibernate3.support.HibernateDaoSupport
    implements GroupManageableDao
{
    private finf.ucf.cu.domain.GroupDao dao;

    public void setDao(finf.ucf.cu.domain.GroupDao dao)
    {
        this.dao = dao;
    }

    protected finf.ucf.cu.domain.GroupDao getDao()
    {
        return this.dao;
    }

    private finf.ucf.cu.domain.GroupDao subGroupIdDao = null;

    public void setSubGroupIdDao(finf.ucf.cu.domain.GroupDao subGroupIdDao)
    {
        this.subGroupIdDao = subGroupIdDao;
    }

    protected finf.ucf.cu.domain.GroupDao getSubGroupIdDao()
    {
        return this.subGroupIdDao;
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

    public finf.ucf.cu.domain.Group create(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.util.Date dateBegin1Semester, java.util.Date dateBegin2Semester, java.lang.Long id, java.lang.Long subGroupId)
    {
        final finf.ucf.cu.domain.Group entity = new finf.ucf.cu.domain.GroupImpl();
        entity.setName(name);
        entity.setSize(size);
        entity.setAbbreviation(abbreviation);
        entity.setDateBegin1Semester(dateBegin1Semester);
        entity.setDateBegin2Semester(dateBegin2Semester);
        entity.setId(id);
        finf.ucf.cu.domain.Group subGroupIdEntity = null;
        if (subGroupId != null)
        {
            subGroupIdEntity = (finf.ucf.cu.domain.Group)getSubGroupIdDao().load(subGroupId);
        }

        entity.setSubGroupId(subGroupIdEntity);


        return (finf.ucf.cu.domain.Group)this.getDao().create(entity);
    }

    public finf.ucf.cu.domain.Group readById(java.lang.Long id)
    {
        return getDao().load(id);
    }

    public java.util.List read(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.util.Date dateBegin1Semester, java.util.Date dateBegin2Semester, java.lang.Long id, java.lang.Long subGroupId)
    {
        final Session session = getSession(false);

        try
        {
            final Criteria criteria = session.createCriteria(finf.ucf.cu.domain.GroupImpl.class);

            if (name != null)
                criteria.add(Expression.ilike("name", name, MatchMode.START));
            if (size != null)
            criteria.add(Expression.eq("size", size));
            if (abbreviation != null)
                criteria.add(Expression.ilike("abbreviation", abbreviation, MatchMode.START));
            if (dateBegin1Semester != null)
            {
                // we check whether or not the user supplied time information within this particular date argument
                // if he/she didn't we assume he/she wishes to search in the scope of the entire day
                final java.util.Calendar calendar = new java.util.GregorianCalendar();
                calendar.setTime(dateBegin1Semester);
                if ( calendar.get(java.util.Calendar.HOUR) != 0
                     || calendar.get(java.util.Calendar.MINUTE) != 0
                     || calendar.get(java.util.Calendar.SECOND) != 0
                     || calendar.get(java.util.Calendar.MILLISECOND) != 0 )
                {
                    criteria.add(Expression.eq("dateBegin1Semester", dateBegin1Semester));
                }
                else
                {
                    calendar.add(java.util.Calendar.DATE, 1);
                    criteria.add(Expression.between("dateBegin1Semester", dateBegin1Semester, calendar.getTime()));
                }
            }
            if (dateBegin2Semester != null)
            {
                // we check whether or not the user supplied time information within this particular date argument
                // if he/she didn't we assume he/she wishes to search in the scope of the entire day
                final java.util.Calendar calendar = new java.util.GregorianCalendar();
                calendar.setTime(dateBegin2Semester);
                if ( calendar.get(java.util.Calendar.HOUR) != 0
                     || calendar.get(java.util.Calendar.MINUTE) != 0
                     || calendar.get(java.util.Calendar.SECOND) != 0
                     || calendar.get(java.util.Calendar.MILLISECOND) != 0 )
                {
                    criteria.add(Expression.eq("dateBegin2Semester", dateBegin2Semester));
                }
                else
                {
                    calendar.add(java.util.Calendar.DATE, 1);
                    criteria.add(Expression.between("dateBegin2Semester", dateBegin2Semester, calendar.getTime()));
                }
            }
            if (id != null)
            criteria.add(Expression.eq("id", id));
            if (subGroupId != null) criteria.createCriteria("subGroupId").add(Expression.eq("id", subGroupId));
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
            final Criteria criteria = session.createCriteria(finf.ucf.cu.domain.GroupImpl.class);
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
            lists.put("subGroupId", session.createQuery("select item.id, item.name from finf.ucf.cu.domain.Group item order by item.name").list());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
        return lists;
    }

    public finf.ucf.cu.domain.Group update(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.util.Date dateBegin1Semester, java.util.Date dateBegin2Semester, java.lang.Long id, java.lang.Long subGroupId)
    {
        final finf.ucf.cu.domain.Group entity = this.getDao().load(id);

        entity.setName(name);
        entity.setSize(size);
        entity.setAbbreviation(abbreviation);
        entity.setDateBegin1Semester(dateBegin1Semester);
        entity.setDateBegin2Semester(dateBegin2Semester);
        finf.ucf.cu.domain.Group subGroupIdEntity = null;
        if (subGroupId != null)
        {
            subGroupIdEntity = getSubGroupIdDao().load(subGroupId);
        }

        entity.setSubGroupId(subGroupIdEntity);


        this.getDao().update(entity);
        return entity;
    }

    public void delete(java.lang.Long[] ids)
    {
        final Session session = getSession(false);
        try
        {
            final org.hibernate.Query queryObject =
                session.createQuery("delete finf.ucf.cu.domain.GroupImpl where id in (:ids)");
            queryObject.setParameterList("ids", ids);
            queryObject.executeUpdate();
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

}