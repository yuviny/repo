// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: HibernateEntity.vsl in andromda-hibernate-cartridge.
//
package finf.ucf.cu.domain;

/**
 * 
 */
public abstract class Resource
    implements java.io.Serializable
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = 3353046120674596485L;

    private java.lang.String name;

    /**
     * 
     */
    public java.lang.String getName()
    {
        return this.name;
    }

    public void setName(java.lang.String name)
    {
        this.name = name;
    }

    private java.lang.String description;

    /**
     * 
     */
    public java.lang.String getDescription()
    {
        return this.description;
    }

    public void setDescription(java.lang.String description)
    {
        this.description = description;
    }

    private java.lang.Long id;

    /**
     * 
     */
    public java.lang.Long getId()
    {
        return this.id;
    }

    public void setId(java.lang.Long id)
    {
        this.id = id;
    }

    /**
     * Returns <code>true</code> if the argument is an Resource instance and all identifiers for this entity
     * equal the identifiers of the argument entity. Returns <code>false</code> otherwise.
     */
    public boolean equals(Object object)
    {
        if (this == object)
        {
            return true;
        }
        if (!(object instanceof Resource))
        {
            return false;
        }
        final Resource that = (Resource)object;
        if (this.id == null || that.getId() == null || !this.id.equals(that.getId()))
        {
            return false;
        }
        return true;
    }

    /**
     * Returns a hash code based on this entity's identifiers.
     */
    public int hashCode()
    {
        int hashCode = 0;
        hashCode = 29 * hashCode + (id == null ? 0 : id.hashCode());

        return hashCode;
    }

    /**
     * Constructs new instances of {@link finf.ucf.cu.domain.Resource}.
     */
    public static final class Factory
    {
        /**
         * Constructs a new instance of {@link finf.ucf.cu.domain.Resource}.
         */
        public static finf.ucf.cu.domain.Resource newInstance()
        {
            return new finf.ucf.cu.domain.ResourceImpl();
        }

        /**
         * Constructs a new instance of {@link finf.ucf.cu.domain.Resource}, taking all required and/or
         * read-only properties as arguments.
         */
        public static finf.ucf.cu.domain.Resource newInstance(java.lang.String name)
        {
            final finf.ucf.cu.domain.Resource entity = new finf.ucf.cu.domain.ResourceImpl();
            entity.setName(name);
            return entity;
        }

        /**
         * Constructs a new instance of {@link finf.ucf.cu.domain.Resource}, taking all possible properties
         * (except the identifier(s))as arguments.
         */
        public static finf.ucf.cu.domain.Resource newInstance(java.lang.String name, java.lang.String description)
        {
            final finf.ucf.cu.domain.Resource entity = new finf.ucf.cu.domain.ResourceImpl();
            entity.setName(name);
            entity.setDescription(description);
            return entity;
        }
    }
    
// HibernateEntity.vsl merge-point
}