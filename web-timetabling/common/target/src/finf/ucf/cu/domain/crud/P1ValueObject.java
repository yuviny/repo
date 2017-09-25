// license-header java merge-point
package finf.ucf.cu.domain.crud;

public class P1ValueObject
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

    private java.util.Date endDate;

    public java.util.Date getEndDate()
    {
        return this.endDate;
    }

    public void setEndDate(java.util.Date endDate)
    {
        this.endDate = endDate;
    }

    private java.lang.String approved_by;

    public java.lang.String getApproved_by()
    {
        return this.approved_by;
    }

    public void setApproved_by(java.lang.String approved_by)
    {
        this.approved_by = approved_by;
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

    private java.lang.Long subjectId;

    public java.lang.Long getSubjectId()
    {
        return this.subjectId;
    }

    public void setSubjectId(java.lang.Long subjectId)
    {
        this.subjectId = subjectId;
    }

    private java.lang.String subjectIdLabel;

    public java.lang.String getSubjectIdLabel()
    {
        return this.subjectIdLabel;
    }

    public void setSubjectIdLabel(java.lang.String subjectIdLabel)
    {
        this.subjectIdLabel = subjectIdLabel;
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