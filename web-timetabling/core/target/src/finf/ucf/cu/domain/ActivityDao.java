// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringDao.vsl in andromda-spring-cartridge.
//
package finf.ucf.cu.domain;

/**
 * @see finf.ucf.cu.domain.Activity
 */
public interface ActivityDao
{
    /**
     * This constant is used as a transformation flag; entities can be converted automatically into value objects
     * or other types, different methods in a class implementing this interface support this feature: look for
     * an <code>int</code> parameter called <code>transform</code>.
     * <p>
     * This specific flag denotes no transformation will occur.
     */
    public final static int TRANSFORM_NONE = 0;


    /**
     * Transforms the given results to a collection of {@link com.lighthousepmg.plz.domain.messaging.persistence.CommunicationCategory}
     * instances (this is useful when the returned results contains a row of data and you want just entities only).
     *
     * @param the query results.
     */
    public void toEntities(final java.util.Collection results);

    /**
     * Loads an instance of finf.ucf.cu.domain.Activity from the persistent store.
     */
    public finf.ucf.cu.domain.Activity load(java.lang.Long id);

    /**
     * <p>
     * Does the same thing as {@link #load(java.lang.Long)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined in this class then the result <strong>WILL BE</strong> passed through an operation which can
     * optionally transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     *
     * @param id the identifier of the entity to load.
     * @return either the entity or the object transformed from the entity.
     */
    public Object load(int transform, java.lang.Long id);

    /**
     * Loads all entities of type {@link finf.ucf.cu.domain.Activity}.
     *
     * @return the loaded entities.
     */
    public java.util.Collection loadAll();

    /**
     * <p>
     * Does the same thing as {@link #loadAll()} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     *
     * @param transform the flag indicating what transformation to use.
     * @return the loaded entities.
     */
    public java.util.Collection loadAll(final int transform);

    /**
     * <p>
     * Does the same thing as {@link #loadAll()} with an
     * additional two arguments called <code>pageNumber</code> and <code>pageSize</code>. The <code>pageNumber</code>
     * argument allows you to specify the page number when you are paging the results and the pageSize allows you to specify the size of the
     * page retrieved.
     * </p>
     *
     * @param pageNumber the page number to retrieve when paging results.
     * @param pageSize the size of the page to retrieve when paging results.
     * @return the loaded entities.
     */
    public java.util.Collection loadAll(final int pageNumber, final int pageSize);

    /**
     * <p>
     * Does the same thing as {@link #loadAll(int)} with an
     * additional two arguments called <code>pageNumber</code> and <code>pageSize</code>. The <code>pageNumber</code>
     * argument allows you to specify the page number when you are paging the results and the pageSize allows you to specify the size of the
     * page retrieved.
     * </p>
     *
     * @param transform the flag indicating what transformation to use.
     * @param pageNumber the page number to retrieve when paging results.
     * @param pageSize the size of the page to retrieve when paging results.
     * @return the loaded entities.
     */
    public java.util.Collection loadAll(final int transform, final int pageNumber, final int pageSize);

    /**
     * Creates an instance of finf.ucf.cu.domain.Activity and adds it to the persistent store.
     */
    public finf.ucf.cu.domain.Activity create(finf.ucf.cu.domain.Activity activity);

    /**
     * <p>
     * Does the same thing as {@link #create(finf.ucf.cu.domain.Activity)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     */
    public Object create(int transform, finf.ucf.cu.domain.Activity activity);

    /**
     * Creates a new instance of finf.ucf.cu.domain.Activity and adds
     * from the passed in <code>entities</code> collection
     *
     * @param entities the collection of finf.ucf.cu.domain.Activity
     * instances to create.
     *
     * @return the created instances.
     */
    public java.util.Collection create(java.util.Collection entities);

    /**
     * <p>
     * Does the same thing as {@link #create(finf.ucf.cu.domain.Activity)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entities (into value objects for example). By default, transformation does
     * not occur.
     * </p>
     */
    public java.util.Collection create(int transform, java.util.Collection entities);

    /**
     * <p>
     * Creates a new <code>finf.ucf.cu.domain.Activity</code>
     * instance from <strong>all</strong> attributes and adds it to
     * the persistent store.
     * </p>
     */
    public finf.ucf.cu.domain.Activity create(
        java.lang.Integer number,
        java.lang.String name,
        java.lang.Integer hour_cant,
        java.lang.Integer week);

    /**
     * <p>
     * Does the same thing as {@link #create(java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     */
    public Object create(
        int transform,
        java.lang.Integer number,
        java.lang.String name,
        java.lang.Integer hour_cant,
        java.lang.Integer week);

    /**
     * <p>
     * Creates a new <code>finf.ucf.cu.domain.Activity</code>
     * instance from only <strong>required</strong> properties (attributes
     * and association ends) and adds it to the persistent store.
     * </p>
     */
    public finf.ucf.cu.domain.Activity create(
        finf.ucf.cu.domain.ClassType classTypeId,
        java.lang.Integer hour_cant,
        java.lang.String name,
        java.lang.Integer number,
        finf.ucf.cu.domain.Theme themeId,
        java.lang.Integer week);

    /**
     * <p>
     * Does the same thing as {@link #create(java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * the returned entity will <strong>NOT</strong> be transformed. If this flag is any of the other constants
     * defined here then the result <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entity (into a value object for example). By default, transformation does
     * not occur.
     * </p>
     */
    public Object create(
        int transform,
        finf.ucf.cu.domain.ClassType classTypeId,
        java.lang.Integer hour_cant,
        java.lang.String name,
        java.lang.Integer number,
        finf.ucf.cu.domain.Theme themeId,
        java.lang.Integer week);

    /**
     * Updates the <code>activity</code> instance in the persistent store.
     */
    public void update(finf.ucf.cu.domain.Activity activity);

    /**
     * Updates all instances in the <code>entities</code> collection in the persistent store.
     */
    public void update(java.util.Collection entities);

    /**
     * Removes the instance of finf.ucf.cu.domain.Activity from the persistent store.
     */
    public void remove(finf.ucf.cu.domain.Activity activity);

    /**
     * Removes the instance of finf.ucf.cu.domain.Activity having the given
     * <code>identifier</code> from the persistent store.
     */
    public void remove(java.lang.Long id);

    /**
     * Removes all entities in the given <code>entities</code> collection.
     */
    public void remove(java.util.Collection entities);

    /**
     * 
     */
    public finf.ucf.cu.domain.Activity findbyId(java.lang.Long id);

    /**
     * <p>
     * Does the same thing as {@link #findbyId(java.lang.Long)} with an
     * additional argument called <code>queryString</code>. This <code>queryString</code>
     * argument allows you to override the query string defined in {@link #findbyId(java.lang.Long)}.
     * </p>
     */
    public finf.ucf.cu.domain.Activity findbyId(String queryString, java.lang.Long id);

    /**
     * <p>
     * Does the same thing as {@link #findbyId(java.lang.Long)} with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * finder results will <strong>NOT</strong> be transformed during retrieval.
     * If this flag is any of the other constants defined here
     * then finder results <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entities (into value objects for example). By default, transformation does
     * not occur.
     * </p>
     */
    public java.lang.Object findbyId(int transform, java.lang.Long id);

    /**
     * <p>
     * Does the same thing as {@link #findbyId(int, java.lang.Long)} with an
     * additional argument called <code>queryString</code>. This <code>queryString</code>
     * argument allows you to override the query string defined in {@link #findbyId(int, java.lang.Long id)}.
     * </p>
     */
    public java.lang.Object findbyId(int transform, String queryString, java.lang.Long id);


    /**
     * Does the same thing as {@link #search(int, finf.ucf.cu.Search) but with an
     * additional two flags called <code>pageNumber</code> and <code>pageSize</code>. These flags allow you to
     * limit your data to a specified page number and size.
     *
     * @param transform the transformation flag.
     * @param pageNumber the page number in the data to retrieve
     * @param pageSize the size of the page to retrieve.
     * @param search the search object which provides the search parameters and pagination specification.
     * @return any found results from the search wrapped in a {@link finf.ucf.cu.PaginationResult} instance.
     */
    public finf.ucf.cu.PaginationResult search(final int transform, final int pageNumber, final int pageSize, final finf.ucf.cu.Search search);

    /**
     * Does the same thing as {@link #search(finf.ucf.cu.Search) but with an
     * additional two flags called <code>pageNumber</code> and <code>pageSize</code>. These flags allow you to
     * limit your data to a specified page number and size.
     *
     * @param pageNumber the page number in the data to retrieve
     * @param pageSize the size of the page to retrieve.
     * @param search the search object which provides the search parameters and pagination specification.
     * @return any found results from the search wrapped in a {@link finf.ucf.cu.PaginationResult} instance.
     */
    public finf.ucf.cu.PaginationResult search(final int pageNumber, final int pageSize, final finf.ucf.cu.Search search);

    /**
     * Does the same thing as {@link #search(finf.ucf.cu.Search)} but with an
     * additional flag called <code>transform</code>. If this flag is set to <code>TRANSFORM_NONE</code> then
     * finder results will <strong>NOT</strong> be transformed during retrieval.
     * If this flag is any of the other constants defined here
     * then results <strong>WILL BE</strong> passed through an operation which can optionally
     * transform the entities (into value objects for example). By default, transformation does
     * not occur.
     *
     * @param transform the transformation flag.
     * @param search the search object which provides the search parameters and pagination specification.
     * @return any found results from the search.
     */
    public java.util.Set search(final int transform, final finf.ucf.cu.Search search);

    /**
     * Performs a search using the parameters specified in the given <code>search</code> object.
     *
     * @param search the search object which provides the search parameters and pagination specification.
     * @return any found results from the search.
     */
    public java.util.Set search(final finf.ucf.cu.Search search);

    // spring-dao merge-point
}