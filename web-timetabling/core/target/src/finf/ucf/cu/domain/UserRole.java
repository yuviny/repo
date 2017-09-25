// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: HibernateEntity.vsl in andromda-hibernate-cartridge.
//
package finf.ucf.cu.domain;

/**
 * 
 */
public abstract class UserRole
    implements java.io.Serializable
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = 7844086459073233566L;

    private finf.ucf.cu.domain.Role role;

    /**
     * 
     */
    public finf.ucf.cu.domain.Role getRole()
    {
        return this.role;
    }

    public void setRole(finf.ucf.cu.domain.Role role)
    {
        this.role = role;
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
     * Returns <code>true</code> if the argument is an UserRole instance and all identifiers for this entity
     * equal the identifiers of the argument entity. Returns <code>false</code> otherwise.
     */
    public boolean equals(Object object)
    {
        if (this == object)
        {
            return true;
        }
        if (!(object instanceof UserRole))
        {
            return false;
        }
        final UserRole that = (UserRole)object;
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
     * Constructs new instances of {@link finf.ucf.cu.domain.UserRole}.
     */
    public static final class Factory
    {
        /**
         * Constructs a new instance of {@link finf.ucf.cu.domain.UserRole}.
         */
        public static finf.ucf.cu.domain.UserRole newInstance()
        {
            return new finf.ucf.cu.domain.UserRoleImpl();
        }


        /**
         * Constructs a new instance of {@link finf.ucf.cu.domain.UserRole}, taking all possible properties
         * (except the identifier(s))as arguments.
         */
        public static finf.ucf.cu.domain.UserRole newInstance(finf.ucf.cu.domain.Role role)
        {
            final finf.ucf.cu.domain.UserRole entity = new finf.ucf.cu.domain.UserRoleImpl();
            entity.setRole(role);
            return entity;
        }
    }
    
// HibernateEntity.vsl merge-point
}