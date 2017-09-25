// license-header java merge-point
package finf.ucf.cu.domain.crud;

public class ClassTimeValueObject
    implements java.io.Serializable
{
    private java.util.Date day;

    public java.util.Date getDay()
    {
        return this.day;
    }

    public void setDay(java.util.Date day)
    {
        this.day = day;
    }

    private finf.ucf.cu.domain.cTime time;

    public finf.ucf.cu.domain.cTime getTime()
    {
        return this.time;
    }

    public void setTime(finf.ucf.cu.domain.cTime time)
    {
        this.time = time;
    }

    private java.lang.Integer duration;

    public java.lang.Integer getDuration()
    {
        return this.duration;
    }

    public void setDuration(java.lang.Integer duration)
    {
        this.duration = duration;
    }

    private boolean fixed;

    public boolean isFixed()
    {
        return this.fixed;
    }

    public void setFixed(boolean fixed)
    {
        this.fixed = fixed;
    }

    private boolean tipic;

    public boolean isTipic()
    {
        return this.tipic;
    }

    public void setTipic(boolean tipic)
    {
        this.tipic = tipic;
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

    private java.lang.Long roomId;

    public java.lang.Long getRoomId()
    {
        return this.roomId;
    }

    public void setRoomId(java.lang.Long roomId)
    {
        this.roomId = roomId;
    }

    private java.lang.String roomIdLabel;

    public java.lang.String getRoomIdLabel()
    {
        return this.roomIdLabel;
    }

    public void setRoomIdLabel(java.lang.String roomIdLabel)
    {
        this.roomIdLabel = roomIdLabel;
    }

    private java.lang.Long solution;

    public java.lang.Long getSolution()
    {
        return this.solution;
    }

    public void setSolution(java.lang.Long solution)
    {
        this.solution = solution;
    }

    private java.lang.String solutionLabel;

    public java.lang.String getSolutionLabel()
    {
        return this.solutionLabel;
    }

    public void setSolutionLabel(java.lang.String solutionLabel)
    {
        this.solutionLabel = solutionLabel;
    }

    private java.lang.Long classTypeID;

    public java.lang.Long getClassTypeID()
    {
        return this.classTypeID;
    }

    public void setClassTypeID(java.lang.Long classTypeID)
    {
        this.classTypeID = classTypeID;
    }

    private java.lang.String classTypeIDLabel;

    public java.lang.String getClassTypeIDLabel()
    {
        return this.classTypeIDLabel;
    }

    public void setClassTypeIDLabel(java.lang.String classTypeIDLabel)
    {
        this.classTypeIDLabel = classTypeIDLabel;
    }

}