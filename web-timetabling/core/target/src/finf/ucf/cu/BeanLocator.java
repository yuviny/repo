// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringBeanLocator.java.vsl in andromda-spring-cartridge.
//
package finf.ucf.cu;

/**
 * Provides lookup for Spring beans
 */
public class BeanLocator
{
    private BeanLocator()
    {
        // shouldn't be instantiated
    }

    /**
     * The prefix used for all bean ids.
     */
    public static final String BEAN_PREFIX = "";

    /**
     * The shared instance of this BeanLocator.
     */
    private final static BeanLocator instance = new BeanLocator();

    /**
     * Gets the shared instance of this Class
     *
     * @return the shared bean locator instance.
     */
    public static final BeanLocator instance()
    {
        return instance;
    }

    /**
     * The bean factory reference instance.
     */
    private org.springframework.beans.factory.access.BeanFactoryReference beanFactoryReference;

    /**
     * The bean factory reference location.
     */
    private String beanFactoryReferenceLocation;

    /**
     * The bean factory reference id.
     */
    private String beanRefFactoryReferenceId;

    /**
     * Initializes the Spring application context from the default settings.
     */
    public synchronized void init()
    {
        this.getContext();
    }

    /**
     * Initializes the Spring application context from
     * the given <code>beanFactoryReferenceLocation</code>.  If <code>null</code>
     * is specified for the <code>beanFactoryReferenceLocation</code>
     * then the default application context will be used.
     *
     * @param beanFactoryReferenceLocation the location of the beanRefFactory reference.
     */
    public synchronized void init(final String beanFactoryReferenceLocation, final String beanRefFactoryReferenceId)
    {
        this.beanFactoryReferenceLocation = beanFactoryReferenceLocation;
        this.beanRefFactoryReferenceId = beanRefFactoryReferenceId;
        this.beanFactoryReference = null;
        // - initialize the context
        this.getContext();
    }

    /**
     * Initializes the Spring application context from
     * the given <code>beanFactoryReferenceLocation</code>.  If <code>null</code>
     * is specified for the <code>beanFactoryReferenceLocation</code>
     * then the default application context will be used.
     *
     * @param beanFactoryReferenceLocation the location of the beanRefFactory reference.
     */
    public synchronized void init(final String beanFactoryReferenceLocation)
    {
        this.beanFactoryReferenceLocation = beanFactoryReferenceLocation;
        this.beanFactoryReference = null;
        // - initialize the context
        this.getContext();
    }

    /**
     * The default bean reference factory location.
     */
    private final String DEFAULT_BEAN_REFERENCE_LOCATION = "beanRefFactory.xml";

    /**
     * The default bean reference factory ID.
     */
    private final String DEFAULT_BEAN_REFERENCE_ID = "beanRefFactory";

    /**
     * Gets the Spring ApplicationContext.
     */
    public synchronized org.springframework.context.ApplicationContext getContext()
    {
        if (this.beanFactoryReference == null)
        {
            if (this.beanFactoryReferenceLocation == null)
            {
                this.beanFactoryReferenceLocation = DEFAULT_BEAN_REFERENCE_LOCATION;
            }
            if (this.beanRefFactoryReferenceId == null)
            {
                this.beanRefFactoryReferenceId = DEFAULT_BEAN_REFERENCE_ID;
            }
            org.springframework.beans.factory.access.BeanFactoryLocator beanFactoryLocator =
                org.springframework.context.access.ContextSingletonBeanFactoryLocator.getInstance(
                    this.beanFactoryReferenceLocation);
            this.beanFactoryReference = beanFactoryLocator.useBeanFactory(this.beanRefFactoryReferenceId);
        }
        return (org.springframework.context.ApplicationContext)this.beanFactoryReference.getFactory();
    }

    /**
     * Shuts down the BeanLocator and releases any used resources.
     */
    public synchronized void shutdown()
    {
        ((org.springframework.context.support.AbstractApplicationContext)this.getContext()).close();
        if (this.beanFactoryReference != null)
        {
            this.beanFactoryReference.release();
            this.beanFactoryReference = null;
        }
    }

    /**
     * Retrieve the bean with the given <code>name</code>.
     */
    public Object getBean(final String name)
    {
        return this.getContext().getBean(BEAN_PREFIX + name);
    }
}