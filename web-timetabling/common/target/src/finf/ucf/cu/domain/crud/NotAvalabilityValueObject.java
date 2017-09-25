// license-header java merge-point
package finf.ucf.cu.domain.crud;

public class NotAvalabilityValueObject
    implements java.io.Serializable
{
    private java.util.Date date;

    public java.util.Date getDate()
    {
        return this.date;
    }

    public void setDate(java.util.Date date)
    {
        this.date = date;
    }

    private finf.ucf.cu.domain.cTime not_time;

    public finf.ucf.cu.domain.cTime getNot_time()
    {
        return this.not_time;
    }

    public void setNot_time(finf.ucf.cu.domain.cTime not_time)
    {
        this.not_time = not_time;
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

    private java.lang.Long teacherId;

    public java.lang.Long getTeacherId()
    {
        return this.teacherId;
    }

    public void setTeacherId(java.lang.Long teacherId)
    {
        this.teacherId = teacherId;
    }

    private java.lang.String teacherIdLabel;

    public java.lang.String getTeacherIdLabel()
    {
        return this.teacherIdLabel;
    }

    public void setTeacherIdLabel(java.lang.String teacherIdLabel)
    {
        this.teacherIdLabel = teacherIdLabel;
    }

    private java.lang.Long groupId;

    public java.lang.Long getGroupId()
    {
        return this.groupId;
    }

    public void setGroupId(java.lang.Long groupId)
    {
        this.groupId = groupId;
    }

    private java.lang.String groupIdLabel;

    public java.lang.String getGroupIdLabel()
    {
        return this.groupIdLabel;
    }

    public void setGroupIdLabel(java.lang.String groupIdLabel)
    {
        this.groupIdLabel = groupIdLabel;
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

}