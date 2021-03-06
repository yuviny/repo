// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: HibernateEntity.vsl in andromda-hibernate-cartridge.
//
package finf.ucf.cu.domain;

/**
 * 
 */
public abstract class Theme
    implements java.io.Serializable
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = -5170904425457657643L;

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

    private finf.ucf.cu.domain.P1 punoId;

    /**
     * 
     */
    public finf.ucf.cu.domain.P1 getPunoId()
    {
        return this.punoId;
    }

    public void setPunoId(finf.ucf.cu.domain.P1 punoId)
    {
        this.punoId = punoId;
    }

    /**
     * Returns <code>true</code> if the argument is an Theme instance and all identifiers for this entity
     * equal the identifiers of the argument entity. Returns <code>false</code> otherwise.
     */
    public boolean equals(Object object)
    {
        if (this == object)
        {
            return true;
        }
        if (!(object instanceof Theme))
        {
            return false;
        }
        final Theme that = (Theme)object;
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
     * Constructs new instances of {@link finf.ucf.cu.domain.Theme}.
     */
    public static final class Factory
    {
        /**
         * Constructs a new instance of {@link finf.ucf.cu.domain.Theme}.
         */
        public static finf.ucf.cu.domain.Theme newInstance()
        {
            return new finf.ucf.cu.domain.ThemeImpl();
        }


        /**
         * Constructs a new instance of {@link finf.ucf.cu.domain.Theme}, taking all possible properties
         * (except the identifier(s))as arguments.
         */
        public static finf.ucf.cu.domain.Theme newInstance(java.lang.String name, finf.ucf.cu.domain.P1 punoId)
        {
            final finf.ucf.cu.domain.Theme entity = new finf.ucf.cu.domain.ThemeImpl();
            entity.setName(name);
            entity.setPunoId(punoId);
            return entity;
        }
    }
    
// HibernateEntity.vsl merge-point
}