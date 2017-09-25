// license-header java merge-point
package finf.ucf.cu.domain.crud;

public final class ClassTimeForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
    private java.util.List manageableList = null;

    public java.util.List getManageableList()
    {
        return this.manageableList;
    }

    public void setManageableList(java.util.List manageableList)
    {
        this.manageableList = manageableList;
    }

    private java.lang.Long[] selectedRows = null;

    public java.lang.Long[] getSelectedRows()
    {
        return this.selectedRows;
    }

    public void setSelectedRows(java.lang.Long[] selectedRows)
    {
        this.selectedRows = selectedRows;
    }

    private java.util.Date day;

    public java.util.Date getDay()
    {
        return this.day;
    }

    public void setDay(java.util.Date day)
    {
        this.day = day;
    }

    private static final java.text.DateFormat dayFormatter = new java.text.SimpleDateFormat("dd/MM/yyyy");
    static { dayFormatter.setLenient(true); }

    public java.lang.String getDayAsString()
    {
        return (day == null) ? null : dayFormatter.format(day);
    }

    public void setDayAsString(java.lang.String day)
    {
        try
        {
            this.day = (org.apache.commons.lang.StringUtils.isBlank(day)) ? null : dayFormatter.parse(day);
        }
        catch (java.text.ParseException pe)
        {
            throw new java.lang.RuntimeException(pe);
        }
    }

    private java.lang.Integer time;

    public java.lang.Integer getTime()
    {
        return this.time;
    }

    public void setTime(java.lang.Integer time)
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

    private java.util.List groupIdBackingList;

    public java.util.List getGroupIdBackingList()
    {
        return this.groupIdBackingList;
    }

    public void setGroupIdBackingList(java.util.List groupIdBackingList)
    {
        this.groupIdBackingList = groupIdBackingList;
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

    private java.util.List teacherIdBackingList;

    public java.util.List getTeacherIdBackingList()
    {
        return this.teacherIdBackingList;
    }

    public void setTeacherIdBackingList(java.util.List teacherIdBackingList)
    {
        this.teacherIdBackingList = teacherIdBackingList;
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

    private java.util.List subjectIdBackingList;

    public java.util.List getSubjectIdBackingList()
    {
        return this.subjectIdBackingList;
    }

    public void setSubjectIdBackingList(java.util.List subjectIdBackingList)
    {
        this.subjectIdBackingList = subjectIdBackingList;
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

    private java.util.List roomIdBackingList;

    public java.util.List getRoomIdBackingList()
    {
        return this.roomIdBackingList;
    }

    public void setRoomIdBackingList(java.util.List roomIdBackingList)
    {
        this.roomIdBackingList = roomIdBackingList;
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

    private java.util.List solutionBackingList;

    public java.util.List getSolutionBackingList()
    {
        return this.solutionBackingList;
    }

    public void setSolutionBackingList(java.util.List solutionBackingList)
    {
        this.solutionBackingList = solutionBackingList;
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

    private java.util.List classTypeIDBackingList;

    public java.util.List getClassTypeIDBackingList()
    {
        return this.classTypeIDBackingList;
    }

    public void setClassTypeIDBackingList(java.util.List classTypeIDBackingList)
    {
        this.classTypeIDBackingList = classTypeIDBackingList;
    }

    /**
     * @see org.apache.struts.validator.ValidatorForm#reset(org.apache.struts.action.ActionMapping,javax.servlet.http.HttpServletRequest)
     */
    public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request)
    {
        day = null;
        time = null;
        duration = null;
        fixed = false;
        tipic = false;
        id = null;
        groupId = null;
        groupIdBackingList = null;
        teacherId = null;
        teacherIdBackingList = null;
        subjectId = null;
        subjectIdBackingList = null;
        roomId = null;
        roomIdBackingList = null;
        solution = null;
        solutionBackingList = null;
        classTypeID = null;
        classTypeIDBackingList = null;
    }
}