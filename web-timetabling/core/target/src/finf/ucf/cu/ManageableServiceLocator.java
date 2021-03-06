// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringManageableServiceLocator.vsl in andromda-spring-cartridge.
//
package finf.ucf.cu;

/**
 * Locates and provides all available application services.
 */
public class ManageableServiceLocator
{
    /**
     * The default application context location.
     */
    private final String DEFAULT_BEAN_REFERENCE_LOCATION = "beanRefFactory.xml";

    /**
     * The bean factory reference location.
     */
    private String beanFactoryReferenceLocation;

    protected ManageableServiceLocator()
    {
        // shouldn't be instantiated
    }

    /**
     * The shared instance of this ManageableServiceLocator.
     */
    private final static ManageableServiceLocator instance = new ManageableServiceLocator();

    /**
     * Gets the shared instance of this Class
     *
     * @return the shared service locator instance.
     */
    public static final ManageableServiceLocator instance()
    {
        return instance;
    }

    /**
     * Initializes the Spring application context from
     * the given <code>beanFactoryReferenceLocation</code>.  If <code>null</code>
     * is specified for the <code>beanFactoryReferenceLocation</code>
     * then the default application context will be used.
     *
     * @param contextLocation the location of the context
     */
    public synchronized void init(String beanFactoryReferenceLocation)
    {
        this.beanFactoryReferenceLocation = beanFactoryReferenceLocation;
        this.beanFactoryReference = null;
    }

    /**
     * The bean factory reference instance.
     */
    private org.springframework.beans.factory.access.BeanFactoryReference beanFactoryReference;

    /**
     * Gets the Spring ApplicationContext.
     */
    protected synchronized org.springframework.context.ApplicationContext getContext()
    {
        if (this.beanFactoryReference == null)
        {
            if (this.beanFactoryReferenceLocation == null)
            {
                this.beanFactoryReferenceLocation = DEFAULT_BEAN_REFERENCE_LOCATION;
            }
            org.springframework.beans.factory.access.BeanFactoryLocator beanFactoryLocator =
                org.springframework.context.access.ContextSingletonBeanFactoryLocator.getInstance(
                    this.beanFactoryReferenceLocation);
            this.beanFactoryReference = beanFactoryLocator.useBeanFactory("beanRefFactory");
        }
        return (org.springframework.context.ApplicationContext)this.beanFactoryReference.getFactory();
    }

    /**
     * Shuts down the ManageableServiceLocator and releases any used resources.
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
     * Gets an instance of {@link finf.ucf.cu.domain.crud.TeacherManageableService}.
     */
    public final finf.ucf.cu.domain.crud.TeacherManageableService getTeacherManageableService()
    {
        return (finf.ucf.cu.domain.crud.TeacherManageableService)
            getContext().getBean("TeacherManageableService");
    }

    /**
     * Gets an instance of {@link finf.ucf.cu.domain.crud.GroupManageableService}.
     */
    public final finf.ucf.cu.domain.crud.GroupManageableService getGroupManageableService()
    {
        return (finf.ucf.cu.domain.crud.GroupManageableService)
            getContext().getBean("GroupManageableService");
    }

    /**
     * Gets an instance of {@link finf.ucf.cu.domain.crud.SubjectManageableService}.
     */
    public final finf.ucf.cu.domain.crud.SubjectManageableService getSubjectManageableService()
    {
        return (finf.ucf.cu.domain.crud.SubjectManageableService)
            getContext().getBean("SubjectManageableService");
    }

    /**
     * Gets an instance of {@link finf.ucf.cu.domain.crud.ClassTimeManageableService}.
     */
    public final finf.ucf.cu.domain.crud.ClassTimeManageableService getClassTimeManageableService()
    {
        return (finf.ucf.cu.domain.crud.ClassTimeManageableService)
            getContext().getBean("ClassTimeManageableService");
    }

    /**
     * Gets an instance of {@link finf.ucf.cu.domain.crud.RoomManageableService}.
     */
    public final finf.ucf.cu.domain.crud.RoomManageableService getRoomManageableService()
    {
        return (finf.ucf.cu.domain.crud.RoomManageableService)
            getContext().getBean("RoomManageableService");
    }

    /**
     * Gets an instance of {@link finf.ucf.cu.domain.crud.SemesterManageableService}.
     */
    public final finf.ucf.cu.domain.crud.SemesterManageableService getSemesterManageableService()
    {
        return (finf.ucf.cu.domain.crud.SemesterManageableService)
            getContext().getBean("SemesterManageableService");
    }

    /**
     * Gets an instance of {@link finf.ucf.cu.domain.crud.ClassTypeManageableService}.
     */
    public final finf.ucf.cu.domain.crud.ClassTypeManageableService getClassTypeManageableService()
    {
        return (finf.ucf.cu.domain.crud.ClassTypeManageableService)
            getContext().getBean("ClassTypeManageableService");
    }

    /**
     * Gets an instance of {@link finf.ucf.cu.domain.crud.ResourceManageableService}.
     */
    public final finf.ucf.cu.domain.crud.ResourceManageableService getResourceManageableService()
    {
        return (finf.ucf.cu.domain.crud.ResourceManageableService)
            getContext().getBean("ResourceManageableService");
    }

    /**
     * Gets an instance of {@link finf.ucf.cu.domain.crud.BuildingManageableService}.
     */
    public final finf.ucf.cu.domain.crud.BuildingManageableService getBuildingManageableService()
    {
        return (finf.ucf.cu.domain.crud.BuildingManageableService)
            getContext().getBean("BuildingManageableService");
    }

    /**
     * Gets an instance of {@link finf.ucf.cu.domain.crud.NotAvalabilityManageableService}.
     */
    public final finf.ucf.cu.domain.crud.NotAvalabilityManageableService getNotAvalabilityManageableService()
    {
        return (finf.ucf.cu.domain.crud.NotAvalabilityManageableService)
            getContext().getBean("NotAvalabilityManageableService");
    }

    /**
     * Gets an instance of {@link finf.ucf.cu.domain.crud.P1ManageableService}.
     */
    public final finf.ucf.cu.domain.crud.P1ManageableService getP1ManageableService()
    {
        return (finf.ucf.cu.domain.crud.P1ManageableService)
            getContext().getBean("P1ManageableService");
    }

    /**
     * Gets an instance of {@link finf.ucf.cu.domain.crud.ActivityManageableService}.
     */
    public final finf.ucf.cu.domain.crud.ActivityManageableService getActivityManageableService()
    {
        return (finf.ucf.cu.domain.crud.ActivityManageableService)
            getContext().getBean("ActivityManageableService");
    }

    /**
     * Gets an instance of {@link finf.ucf.cu.domain.crud.ImpartitionPlanManageableService}.
     */
    public final finf.ucf.cu.domain.crud.ImpartitionPlanManageableService getImpartitionPlanManageableService()
    {
        return (finf.ucf.cu.domain.crud.ImpartitionPlanManageableService)
            getContext().getBean("ImpartitionPlanManageableService");
    }

    /**
     * Gets an instance of {@link finf.ucf.cu.domain.crud.DepartmentManageableService}.
     */
    public final finf.ucf.cu.domain.crud.DepartmentManageableService getDepartmentManageableService()
    {
        return (finf.ucf.cu.domain.crud.DepartmentManageableService)
            getContext().getBean("DepartmentManageableService");
    }

    /**
     * Gets an instance of {@link finf.ucf.cu.domain.crud.ThemeManageableService}.
     */
    public final finf.ucf.cu.domain.crud.ThemeManageableService getThemeManageableService()
    {
        return (finf.ucf.cu.domain.crud.ThemeManageableService)
            getContext().getBean("ThemeManageableService");
    }

}
