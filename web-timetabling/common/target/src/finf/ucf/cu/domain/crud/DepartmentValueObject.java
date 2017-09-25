// license-header java merge-point
package finf.ucf.cu.domain.crud;

public class DepartmentValueObject
    implements java.io.Serializable
{
    private java.lang.String name;

    public java.lang.String getName()
    {
        return this.name;
    }

    public void setName(java.lang.String name)
    {
        this.name = name;
    }

    private java.lang.Long id;

    public java.lang.Long getId()
    {
        return this.id;
    }

    public void setId(java.lang.Long id)
    {
        this.id = id;
    }

    private java.lang.Long teacher;

    public java.lang.Long getTeacher()
    {
        return this.teacher;
    }

    public void setTeacher(java.lang.Long teacher)
    {
        this.teacher = teacher;
    }

    private java.lang.String teacherLabel;

    public java.lang.String getTeacherLabel()
    {
        return this.teacherLabel;
    }

    public void setTeacherLabel(java.lang.String teacherLabel)
    {
        this.teacherLabel = teacherLabel;
    }

}