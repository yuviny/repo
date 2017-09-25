// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package finf.ucf.cu.vo;

/**
 * 
 */
public class ScheduleGroupVO
    implements java.io.Serializable
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = -3013000540061857327L;

    public ScheduleGroupVO()
    {
    }

    public ScheduleGroupVO(java.lang.Long id, java.lang.String activityName, java.lang.String teacherName, java.lang.String roomName, java.lang.String activityAbbreviation, java.util.Date day, java.lang.Integer time, java.lang.String groupName, java.lang.String groupAbbreviation, java.lang.String roomAbbreviation, java.lang.String ClassTypeName, java.util.Date dateBegin1Semester, java.util.Date dateBegin2Semester)
    {
        this.id = id;
        this.activityName = activityName;
        this.teacherName = teacherName;
        this.roomName = roomName;
        this.activityAbbreviation = activityAbbreviation;
        this.day = day;
        this.time = time;
        this.groupName = groupName;
        this.groupAbbreviation = groupAbbreviation;
        this.roomAbbreviation = roomAbbreviation;
        this.ClassTypeName = ClassTypeName;
        this.dateBegin1Semester = dateBegin1Semester;
        this.dateBegin2Semester = dateBegin2Semester;
    }

    /**
     * Copies constructor from other ScheduleGroupVO
     *
     * @param otherBean, cannot be <code>null</code>
     * @throws java.lang.NullPointerException if the argument is <code>null</code>
     */
    public ScheduleGroupVO(ScheduleGroupVO otherBean)
    {
        this(otherBean.getId(), otherBean.getActivityName(), otherBean.getTeacherName(), otherBean.getRoomName(), otherBean.getActivityAbbreviation(), otherBean.getDay(), otherBean.getTime(), otherBean.getGroupName(), otherBean.getGroupAbbreviation(), otherBean.getRoomAbbreviation(), otherBean.getClassTypeName(), otherBean.getDateBegin1Semester(), otherBean.getDateBegin2Semester());
    }

    /**
     * Copies all properties from the argument value object into this value object.
     */
    public void copy(ScheduleGroupVO otherBean)
    {
        if (otherBean != null)
        {
            this.setId(otherBean.getId());
            this.setActivityName(otherBean.getActivityName());
            this.setTeacherName(otherBean.getTeacherName());
            this.setRoomName(otherBean.getRoomName());
            this.setActivityAbbreviation(otherBean.getActivityAbbreviation());
            this.setDay(otherBean.getDay());
            this.setTime(otherBean.getTime());
            this.setGroupName(otherBean.getGroupName());
            this.setGroupAbbreviation(otherBean.getGroupAbbreviation());
            this.setRoomAbbreviation(otherBean.getRoomAbbreviation());
            this.setClassTypeName(otherBean.getClassTypeName());
            this.setDateBegin1Semester(otherBean.getDateBegin1Semester());
            this.setDateBegin2Semester(otherBean.getDateBegin2Semester());
        }
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

    private java.lang.String activityName;

    /**
     * 
     */
    public java.lang.String getActivityName()
    {
        return this.activityName;
    }

    public void setActivityName(java.lang.String activityName)
    {
        this.activityName = activityName;
    }

    private java.lang.String teacherName;

    /**
     * 
     */
    public java.lang.String getTeacherName()
    {
        return this.teacherName;
    }

    public void setTeacherName(java.lang.String teacherName)
    {
        this.teacherName = teacherName;
    }

    private java.lang.String roomName;

    /**
     * 
     */
    public java.lang.String getRoomName()
    {
        return this.roomName;
    }

    public void setRoomName(java.lang.String roomName)
    {
        this.roomName = roomName;
    }

    private java.lang.String activityAbbreviation;

    /**
     * 
     */
    public java.lang.String getActivityAbbreviation()
    {
        return this.activityAbbreviation;
    }

    public void setActivityAbbreviation(java.lang.String activityAbbreviation)
    {
        this.activityAbbreviation = activityAbbreviation;
    }

    private java.util.Date day;

    /**
     * 
     */
    public java.util.Date getDay()
    {
        return this.day;
    }

    public void setDay(java.util.Date day)
    {
        this.day = day;
    }

    private java.lang.Integer time;

    /**
     * 
     */
    public java.lang.Integer getTime()
    {
        return this.time;
    }

    public void setTime(java.lang.Integer time)
    {
        this.time = time;
    }

    private java.lang.String groupName;

    /**
     * 
     */
    public java.lang.String getGroupName()
    {
        return this.groupName;
    }

    public void setGroupName(java.lang.String groupName)
    {
        this.groupName = groupName;
    }

    private java.lang.String groupAbbreviation;

    /**
     * 
     */
    public java.lang.String getGroupAbbreviation()
    {
        return this.groupAbbreviation;
    }

    public void setGroupAbbreviation(java.lang.String groupAbbreviation)
    {
        this.groupAbbreviation = groupAbbreviation;
    }

    private java.lang.String roomAbbreviation;

    /**
     * 
     */
    public java.lang.String getRoomAbbreviation()
    {
        return this.roomAbbreviation;
    }

    public void setRoomAbbreviation(java.lang.String roomAbbreviation)
    {
        this.roomAbbreviation = roomAbbreviation;
    }

    private java.lang.String ClassTypeName;

    /**
     * 
     */
    public java.lang.String getClassTypeName()
    {
        return this.ClassTypeName;
    }

    public void setClassTypeName(java.lang.String ClassTypeName)
    {
        this.ClassTypeName = ClassTypeName;
    }

    private java.util.Date dateBegin1Semester;

    /**
     * 
     */
    public java.util.Date getDateBegin1Semester()
    {
        return this.dateBegin1Semester;
    }

    public void setDateBegin1Semester(java.util.Date dateBegin1Semester)
    {
        this.dateBegin1Semester = dateBegin1Semester;
    }

    private java.util.Date dateBegin2Semester;

    /**
     * 
     */
    public java.util.Date getDateBegin2Semester()
    {
        return this.dateBegin2Semester;
    }

    public void setDateBegin2Semester(java.util.Date dateBegin2Semester)
    {
        this.dateBegin2Semester = dateBegin2Semester;
    }

    // finf.ucf.cu.vo.ScheduleGroupVO value-object java merge-point
}