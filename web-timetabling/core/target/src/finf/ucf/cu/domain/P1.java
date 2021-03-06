// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: HibernateEntity.vsl in andromda-hibernate-cartridge.
//
package finf.ucf.cu.domain;

/**
 * 
 */
public abstract class P1
    implements java.io.Serializable
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = -8791133021323570545L;

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

    private java.util.Date endDate;

    /**
     * 
     */
    public java.util.Date getEndDate()
    {
        return this.endDate;
    }

    public void setEndDate(java.util.Date endDate)
    {
        this.endDate = endDate;
    }

    private java.lang.String approved_by;

    /**
     * 
     */
    public java.lang.String getApproved_by()
    {
        return this.approved_by;
    }

    public void setApproved_by(java.lang.String approved_by)
    {
        this.approved_by = approved_by;
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

    private finf.ucf.cu.domain.Subject subjectId;

    /**
     * 
     */
    public finf.ucf.cu.domain.Subject getSubjectId()
    {
        return this.subjectId;
    }

    public void setSubjectId(finf.ucf.cu.domain.Subject subjectId)
    {
        this.subjectId = subjectId;
    }

    private finf.ucf.cu.domain.Teacher teacher;

    /**
     * 
     */
    public finf.ucf.cu.domain.Teacher getTeacher()
    {
        return this.teacher;
    }

    public void setTeacher(finf.ucf.cu.domain.Teacher teacher)
    {
        this.teacher = teacher;
    }

    /**
     * Returns <code>true</code> if the argument is an P1 instance and all identifiers for this entity
     * equal the identifiers of the argument entity. Returns <code>false</code> otherwise.
     */
    public boolean equals(Object object)
    {
        if (this == object)
        {
            return true;
        }
        if (!(object instanceof P1))
        {
            return false;
        }
        final P1 that = (P1)object;
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
     * Constructs new instances of {@link finf.ucf.cu.domain.P1}.
     */
    public static final class Factory
    {
        /**
         * Constructs a new instance of {@link finf.ucf.cu.domain.P1}.
         */
        public static finf.ucf.cu.domain.P1 newInstance()
        {
            return new finf.ucf.cu.domain.P1Impl();
        }

        /**
         * Constructs a new instance of {@link finf.ucf.cu.domain.P1}, taking all required and/or
         * read-only properties as arguments.
         */
        public static finf.ucf.cu.domain.P1 newInstance(java.lang.String name, java.util.Date endDate, java.lang.String approved_by, finf.ucf.cu.domain.Subject subjectId)
        {
            final finf.ucf.cu.domain.P1 entity = new finf.ucf.cu.domain.P1Impl();
            entity.setName(name);
            entity.setEndDate(endDate);
            entity.setApproved_by(approved_by);
            entity.setSubjectId(subjectId);
            return entity;
        }

        /**
         * Constructs a new instance of {@link finf.ucf.cu.domain.P1}, taking all possible properties
         * (except the identifier(s))as arguments.
         */
        public static finf.ucf.cu.domain.P1 newInstance(java.lang.String name, java.util.Date endDate, java.lang.String approved_by, finf.ucf.cu.domain.Subject subjectId, finf.ucf.cu.domain.Teacher teacher)
        {
            final finf.ucf.cu.domain.P1 entity = new finf.ucf.cu.domain.P1Impl();
            entity.setName(name);
            entity.setEndDate(endDate);
            entity.setApproved_by(approved_by);
            entity.setSubjectId(subjectId);
            entity.setTeacher(teacher);
            return entity;
        }
    }
    
// HibernateEntity.vsl merge-point
}