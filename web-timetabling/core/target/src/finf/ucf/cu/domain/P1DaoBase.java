// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringHibernateDaoBase.vsl in andromda-spring-cartridge.
//
package finf.ucf.cu.domain;

/**
 * <p>
 * Base Spring DAO Class: is able to create, update, remove, load, and find
 * objects of type <code>finf.ucf.cu.domain.P1</code>.
 * </p>
 *
 * @see finf.ucf.cu.domain.P1
 */
public abstract class P1DaoBase
    extends org.springframework.orm.hibernate3.support.HibernateDaoSupport
    implements finf.ucf.cu.domain.P1Dao
{

    /**
     * @see finf.ucf.cu.domain.P1Dao#load(int, java.lang.Long)
     */
    public java.lang.Object load(final int transform, final java.lang.Long id)
    {
        if (id == null)
        {
            throw new IllegalArgumentException(
                "P1.load - 'id' can not be null");
        }
        final java.lang.Object entity = this.getHibernateTemplate().get(finf.ucf.cu.domain.P1Impl.class, id);
        return transformEntity(transform, (finf.ucf.cu.domain.P1)entity);
    }

    /**
     * @see finf.ucf.cu.domain.P1Dao#load(java.lang.Long)
     */
    public finf.ucf.cu.domain.P1 load(java.lang.Long id)
    {
        return (finf.ucf.cu.domain.P1)this.load(TRANSFORM_NONE, id);
    }

    /**
     * @see finf.ucf.cu.domain.P1Dao#loadAll()
     */
    public java.util.Collection loadAll()
    {
        return this.loadAll(TRANSFORM_NONE);
    }

    /**
     * @see finf.ucf.cu.domain.P1Dao#loadAll(int)
     */
    public java.util.Collection loadAll(final int transform)
    {
        return this.loadAll(transform, -1, -1);
    }

    /**
     * @see finf.ucf.cu.domain.P1Dao#loadAll(int, int)
     */
    public java.util.Collection loadAll(final int pageNumber, final int pageSize)
    {
        return this.loadAll(TRANSFORM_NONE, pageNumber, pageSize);
    }

    /**
     * @see finf.ucf.cu.domain.P1Dao#loadAll(int, int, int)
     */
    public java.util.Collection loadAll(final int transform, final int pageNumber, final int pageSize)
    {
        try
        {
            final org.hibernate.Criteria criteria = this.getSession(false).createCriteria(finf.ucf.cu.domain.P1Impl.class);
            if (pageNumber > 0 && pageSize > 0)
            {
                criteria.setFirstResult(this.calculateFirstResult(pageNumber, pageSize));
                criteria.setMaxResults(pageSize);
            }
            final java.util.Collection results = criteria.list();
            this.transformEntities(transform, results);
            return results;
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    protected int calculateFirstResult(int pageNumber, int pageSize)
    {
        int firstResult = 0;
        if (pageNumber > 0)
        {
            firstResult = (pageNumber - 1) * pageSize;
        }
        return firstResult;
    }

    /**
     * @see finf.ucf.cu.domain.P1Dao#create(finf.ucf.cu.domain.P1)
     */
    public finf.ucf.cu.domain.P1 create(finf.ucf.cu.domain.P1 p1)
    {
        return (finf.ucf.cu.domain.P1)this.create(TRANSFORM_NONE, p1);
    }

    /**
     * @see finf.ucf.cu.domain.P1Dao#create(int transform, finf.ucf.cu.domain.P1)
     */
    public java.lang.Object create(final int transform, final finf.ucf.cu.domain.P1 p1)
    {
        if (p1 == null)
        {
            throw new IllegalArgumentException(
                "P1.create - 'p1' can not be null");
        }
        this.getHibernateTemplate().save(p1);
        return this.transformEntity(transform, p1);
    }

    /**
     * @see finf.ucf.cu.domain.P1Dao#create(java.util.Collection)
     */
    public java.util.Collection create(final java.util.Collection entities)
    {
        return create(TRANSFORM_NONE, entities);
    }

    /**
     * @see finf.ucf.cu.domain.P1Dao#create(int, java.util.Collection)
     */
    public java.util.Collection create(final int transform, final java.util.Collection entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "P1.create - 'entities' can not be null");
        }
        this.getHibernateTemplate().execute(
            new org.springframework.orm.hibernate3.HibernateCallback()
            {
                public java.lang.Object doInHibernate(org.hibernate.Session session)
                    throws org.hibernate.HibernateException
                {
                    for (java.util.Iterator entityIterator = entities.iterator(); entityIterator.hasNext();)
                    {
                        create(transform, (finf.ucf.cu.domain.P1)entityIterator.next());
                    }
                    return null;
                }
            },
            true);
        return entities;
    }

    /**
     * @see finf.ucf.cu.domain.P1Dao#create(java.lang.String, java.util.Date, java.lang.String)
     */
    public finf.ucf.cu.domain.P1 create(
        java.lang.String name,
        java.util.Date endDate,
        java.lang.String approved_by)
    {
        return (finf.ucf.cu.domain.P1)this.create(TRANSFORM_NONE, name, endDate, approved_by);
    }

    /**
     * @see finf.ucf.cu.domain.P1Dao#create(int, java.lang.String, java.util.Date, java.lang.String)
     */
    public java.lang.Object create(
        final int transform,
        java.lang.String name,
        java.util.Date endDate,
        java.lang.String approved_by)
    {
        finf.ucf.cu.domain.P1 entity = new finf.ucf.cu.domain.P1Impl();
        entity.setName(name);
        entity.setEndDate(endDate);
        entity.setApproved_by(approved_by);
        return this.create(transform, entity);
    }

    /**
     * @see finf.ucf.cu.domain.P1Dao#create(java.lang.String, java.util.Date, java.lang.String, finf.ucf.cu.domain.Subject)
     */
    public finf.ucf.cu.domain.P1 create(
        java.lang.String approved_by,
        java.util.Date endDate,
        java.lang.String name,
        finf.ucf.cu.domain.Subject subjectId)
    {
        return (finf.ucf.cu.domain.P1)this.create(TRANSFORM_NONE, approved_by, endDate, name, subjectId);
    }

    /**
     * @see finf.ucf.cu.domain.P1Dao#create(int, java.lang.String, java.util.Date, java.lang.String, finf.ucf.cu.domain.Subject)
     */
    public java.lang.Object create(
        final int transform,
        java.lang.String approved_by,
        java.util.Date endDate,
        java.lang.String name,
        finf.ucf.cu.domain.Subject subjectId)
    {
        finf.ucf.cu.domain.P1 entity = new finf.ucf.cu.domain.P1Impl();
        entity.setApproved_by(approved_by);
        entity.setEndDate(endDate);
        entity.setName(name);
        entity.setSubjectId(subjectId);
        return this.create(transform, entity);
    }

    /**
     * @see finf.ucf.cu.domain.P1Dao#update(finf.ucf.cu.domain.P1)
     */
    public void update(finf.ucf.cu.domain.P1 p1)
    {
        if (p1 == null)
        {
            throw new IllegalArgumentException(
                "P1.update - 'p1' can not be null");
        }
        this.getHibernateTemplate().update(p1);
    }

    /**
     * @see finf.ucf.cu.domain.P1Dao#update(java.util.Collection)
     */
    public void update(final java.util.Collection entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "P1.update - 'entities' can not be null");
        }
        this.getHibernateTemplate().execute(
            new org.springframework.orm.hibernate3.HibernateCallback()
            {
                public java.lang.Object doInHibernate(org.hibernate.Session session)
                    throws org.hibernate.HibernateException
                {
                    for (java.util.Iterator entityIterator = entities.iterator(); entityIterator.hasNext();)
                    {
                        update((finf.ucf.cu.domain.P1)entityIterator.next());
                    }
                    return null;
                }
            },
            true);
    }

    /**
     * @see finf.ucf.cu.domain.P1Dao#remove(finf.ucf.cu.domain.P1)
     */
    public void remove(finf.ucf.cu.domain.P1 p1)
    {
        if (p1 == null)
        {
            throw new IllegalArgumentException(
                "P1.remove - 'p1' can not be null");
        }
        this.getHibernateTemplate().delete(p1);
    }

    /**
     * @see finf.ucf.cu.domain.P1Dao#remove(java.lang.Long)
     */
    public void remove(java.lang.Long id)
    {
        if (id == null)
        {
            throw new IllegalArgumentException(
                "P1.remove - 'id' can not be null");
        }
        finf.ucf.cu.domain.P1 entity = this.load(id);
        if (entity != null)
        {
            this.remove(entity);
        }
    }

    /**
     * @see finf.ucf.cu.domain.P1Dao#remove(java.util.Collection)
     */
    public void remove(java.util.Collection entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "P1.remove - 'entities' can not be null");
        }
        this.getHibernateTemplate().deleteAll(entities);
    }
    /**
     * @see finf.ucf.cu.domain.P1Dao#findbyid(java.lang.Long)
     */
    public finf.ucf.cu.domain.P1 findbyid(java.lang.Long id)
    {
        return (finf.ucf.cu.domain.P1)this.findbyid(TRANSFORM_NONE, id);
    }

    /**
     * @see finf.ucf.cu.domain.P1Dao#findbyid(int, java.lang.Long)
     */
    public java.lang.Object findbyid(final int transform, final java.lang.Long id)
    {
        return this.findbyid(transform, "from finf.ucf.cu.domain.P1 as p1 where p1.id = :id", id);
    }

    /**
     * @see finf.ucf.cu.domain.P1Dao#findbyid(java.lang.String, java.lang.Long)
     */
    public finf.ucf.cu.domain.P1 findbyid(final java.lang.String queryString, final java.lang.Long id)
    {
        return (finf.ucf.cu.domain.P1)this.findbyid(TRANSFORM_NONE, queryString, id);
    }

    /**
     * @see finf.ucf.cu.domain.P1Dao#findbyid(int, java.lang.String, java.lang.Long)
     */
    public java.lang.Object findbyid(final int transform, final java.lang.String queryString, final java.lang.Long id)
    {
        try
        {
            org.hibernate.Query queryObject = super.getSession(false).createQuery(queryString);
            queryObject.setParameter("id", id);
            java.util.Set results = new java.util.LinkedHashSet(queryObject.list());
            java.lang.Object result = null;
            if (results != null)
            {
                if (results.size() > 1)
                {
                    throw new org.springframework.dao.InvalidDataAccessResourceUsageException(
                        "More than one instance of 'finf.ucf.cu.domain.P1"
                            + "' was found when executing query --> '" + queryString + "'");
                }
                else if (results.size() == 1)
                {
                    result = results.iterator().next();
                }
            }
            result = transformEntity(transform, (finf.ucf.cu.domain.P1)result);
            return result;
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    /**
     * Allows transformation of entities into value objects
     * (or something else for that matter), when the <code>transform</code>
     * flag is set to one of the constants defined in <code>finf.ucf.cu.domain.P1Dao</code>, please note
     * that the {@link #TRANSFORM_NONE} constant denotes no transformation, so the entity itself
     * will be returned.
     *
     * If the integer argument value is unknown {@link #TRANSFORM_NONE} is assumed.
     *
     * @param transform one of the constants declared in {@link finf.ucf.cu.domain.P1Dao}
     * @param entity an entity that was found
     * @return the transformed entity (i.e. new value object, etc)
     * @see #transformEntities(int,java.util.Collection)
     */
    protected java.lang.Object transformEntity(final int transform, final finf.ucf.cu.domain.P1 entity)
    {
        java.lang.Object target = null;
        if (entity != null)
        {
            switch (transform)
            {
                case TRANSFORM_NONE : // fall-through
                default:
                    target = entity;
            }
        }
        return target;
    }

    /**
     * Transforms a collection of entities using the
     * {@link #transformEntity(int,finf.ucf.cu.domain.P1)}
     * method. This method does not instantiate a new collection.
     * <p>
     * This method is to be used internally only.
     *
     * @param transform one of the constants declared in <code>finf.ucf.cu.domain.P1Dao</code>
     * @param entities the collection of entities to transform
     * @see #transformEntity(int,finf.ucf.cu.domain.P1)
     */
    protected void transformEntities(final int transform, final java.util.Collection entities)
    {
        switch (transform)
        {
            case TRANSFORM_NONE : // fall-through
                default:
                // do nothing;
        }
    }

    /**
     * @see finf.ucf.cu.domain.P1Dao#toEntities(java.util.Collection)
     */
    public void toEntities(final java.util.Collection results)
    {
        if (results != null)
        {
            org.apache.commons.collections.CollectionUtils.transform(results, ENTITYTRANSFORMER);
        }
    }

    /**
     * This anonymous transformer is designed to transform report query results
     * (which result in an array of entities) to {@link finf.ucf.cu.domain.P1}
     * using the Jakarta Commons-Collections Transformation API.
     */
    private org.apache.commons.collections.Transformer ENTITYTRANSFORMER =
        new org.apache.commons.collections.Transformer()
        {
            public java.lang.Object transform(java.lang.Object input)
            {
                java.lang.Object result = null;
                if (input instanceof java.lang.Object[])
                {
                    result = toEntity((java.lang.Object[])input);
                }
                else if (input instanceof finf.ucf.cu.domain.P1)
                {
                    result = input;
                }
                return result;
            }
        };

    protected finf.ucf.cu.domain.P1 toEntity(java.lang.Object[] row)
    {
        finf.ucf.cu.domain.P1 target = null;
        if (row != null)
        {
            final int numberOfObjects = row.length;
            for (int ctr = 0; ctr < numberOfObjects; ctr++)
            {
                final java.lang.Object object = row[ctr];
                if (object instanceof finf.ucf.cu.domain.P1)
                {
                    target = (finf.ucf.cu.domain.P1)object;
                    break;
                }
            }
        }
        return target;
    }

    /**
     * Gets the current <code>principal</code> if one has been set,
     * otherwise returns <code>null</code>.
     *
     * @return the current principal
     */
    protected java.security.Principal getPrincipal()
    {
        return finf.ucf.cu.PrincipalStore.get();
    }

    /**
     * @see finf.ucf.cu.domain.P1Dao#search(int, int, int, finf.ucf.cu.Search)
     */
    public finf.ucf.cu.PaginationResult search(final int transform, final int pageNumber, final int pageSize, final finf.ucf.cu.Search search)
    {
        try
        {
            search.setPageNumber(pageNumber);
            search.setPageSize(pageSize);
            final finf.ucf.cu.PropertySearch propertySearch = new finf.ucf.cu.PropertySearch(
                this.getSession(false), finf.ucf.cu.domain.P1Impl.class, search);
            final java.util.List results = propertySearch.executeAsList();
            this.transformEntities(transform, results);
            return new finf.ucf.cu.PaginationResult(results.toArray(new java.lang.Object[0]), propertySearch.getTotalCount());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    /**
     * @see finf.ucf.cu.domain.P1Dao#search(int, int, finf.ucf.cu.Search)
     */
    public finf.ucf.cu.PaginationResult search(final int pageNumber, final int pageSize, final finf.ucf.cu.Search search)
    {
        return this.search(TRANSFORM_NONE, pageNumber, pageSize, search);
    }

    /**
     * @see finf.ucf.cu.domain.P1Dao#search(int, finf.ucf.cu.Search)
     */
    public java.util.Set search(final int transform, final finf.ucf.cu.Search search)
    {
        try
        {
            final finf.ucf.cu.PropertySearch propertySearch = new finf.ucf.cu.PropertySearch(
                this.getSession(false), finf.ucf.cu.domain.P1Impl.class, search);
            final java.util.Set results = propertySearch.executeAsSet();
            this.transformEntities(transform, results);
            return results;
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    /**
     * @see finf.ucf.cu.domain.P1Dao#search(finf.ucf.cu.Search)
     */
    public java.util.Set search(final finf.ucf.cu.Search search)
    {
        return this.search(TRANSFORM_NONE, search);
    }

    // spring-hibernate-dao-base merge-point
}