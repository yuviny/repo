// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: Enumeration.vsl in andromda-java-cartridge.
//
package finf.ucf.cu.domain;

/**
 * 
 */
public class Role
    implements java.io.Serializable, java.lang.Comparable
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = -5786864769759743669L;

    /**
     * 
     */
    public static final Role STANDARD_USER = new Role("StandardUser");

    /**
     * 
     */
    public static final Role ADMINISTRATOR = new Role("administrador");

    private java.lang.String value;

    private Role(java.lang.String value)
    {
        this.value = value;
    }

    /**
     * The default constructor allowing
     * super classes to access it.
     */
    protected Role()
    {
    }

    /**
     * @see java.lang.Object#toString()
     */
    public String toString()
    {
        return java.lang.String.valueOf(value);
    }

    /**
     * Creates an instance of Role from <code>value</code>.
     *
     * @param value the value to create the Role from.
     */
    public static Role fromString(java.lang.String value)
    {
        final Role typeValue = (Role)values.get(value);
        if (typeValue == null)
        {
            throw new IllegalArgumentException("invalid value '" + value + "', possible values are: " + literals);
        }
        return typeValue;
    }

    /**
     * Gets the underlying value of this type safe enumeration.
     *
     * @return the underlying value.
     */
    public java.lang.String getValue()
    {
        return this.value;
    }

    /**
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    public int compareTo(Object that)
    {
        return (this == that) ? 0 : this.getValue().compareTo(((Role)that).getValue());
    }

    /**
     * Returns an unmodifiable list containing the literals that are known by this enumeration.
     *
     * @return A List containing the actual literals defined by this enumeration, this list
     *         can not be modified.
     */
    public static java.util.List literals()
    {
        return literals;
    }

    /**
     * Returns an unmodifiable list containing the names of the literals that are known
     * by this enumeration.
     *
     * @return A List containing the actual names of the literals defined by this
     *         enumeration, this list can not be modified.
     */
    public static java.util.List names()
    {
        return names;
    }
    
    /**
     * Returns an unmodifiable list containing the actual enumeration instance values.
     *
     * @return A List containing the actual enumeration instance values.
     */
    public static java.util.List values()
    {
        return valueList;
    }

    /**
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object object)
    {
        return (this == object)
            || (object instanceof Role && ((Role)object).getValue().equals(
                this.getValue()));
    }

    /**
     * @see java.lang.Object#hashCode()
     */
    public int hashCode()
    {
        return this.getValue().hashCode();
    }

    /**
     * This method allows the deserialization of an instance of this enumeration type to return the actual instance
     * that will be the singleton for the JVM in which the current thread is running.
     * <p>
     * Doing this will allow users to safely use the equality operator <code>==</code> for enumerations because
     * a regular deserialized object is always a newly constructed instance and will therefore never be
     * an existing reference; it is this <code>readResolve()</code> method which will intercept the deserialization
     * process in order to return the proper singleton reference.
     * <p>
     * This method is documented here:
     * <a href="http://java.sun.com/j2se/1.3/docs/guide/serialization/spec/input.doc6.html">Java
     * Object Serialization Specification</a>
     */
    private java.lang.Object readResolve() throws java.io.ObjectStreamException
    {
        return Role.fromString(this.value);
    }

    private static final java.util.Map values = new java.util.LinkedHashMap(2, 1);
    private static java.util.List literals = new java.util.ArrayList(2);
    private static java.util.List names = new java.util.ArrayList(2);
    private static java.util.List valueList = new java.util.ArrayList(2);

    /**
     * Initializes the values.
     */
    static
    {
        values.put(STANDARD_USER.value, STANDARD_USER);
        valueList.add(STANDARD_USER);
        literals.add(STANDARD_USER.value);
        names.add("STANDARD_USER");
        values.put(ADMINISTRATOR.value, ADMINISTRATOR);
        valueList.add(ADMINISTRATOR);
        literals.add(ADMINISTRATOR.value);
        names.add("ADMINISTRATOR");
        valueList = java.util.Collections.unmodifiableList(valueList);
        literals = java.util.Collections.unmodifiableList(literals);
        names = java.util.Collections.unmodifiableList(names);
    }
}