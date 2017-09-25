// license-header java merge-point
package finf.ucf.cu.domain.crud;

public final class ImpartitionPlanForm
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

    private java.lang.Boolean teacherallclasetype;

    public java.lang.Boolean getTeacherallclasetype()
    {
        return this.teacherallclasetype;
    }

    public void setTeacherallclasetype(java.lang.Boolean teacherallclasetype)
    {
        this.teacherallclasetype = teacherallclasetype;
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

    private java.util.List subjectIdBackingList;

    public java.util.List getSubjectIdBackingList()
    {
        return this.subjectIdBackingList;
    }

    public void setSubjectIdBackingList(java.util.List subjectIdBackingList)
    {
        this.subjectIdBackingList = subjectIdBackingList;
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

    private java.lang.Long classTypeId;

    public java.lang.Long getClassTypeId()
    {
        return this.classTypeId;
    }

    public void setClassTypeId(java.lang.Long classTypeId)
    {
        this.classTypeId = classTypeId;
    }

    private java.util.List classTypeIdBackingList;

    public java.util.List getClassTypeIdBackingList()
    {
        return this.classTypeIdBackingList;
    }

    public void setClassTypeIdBackingList(java.util.List classTypeIdBackingList)
    {
        this.classTypeIdBackingList = classTypeIdBackingList;
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

    private java.lang.Long semesterId;

    public java.lang.Long getSemesterId()
    {
        return this.semesterId;
    }

    public void setSemesterId(java.lang.Long semesterId)
    {
        this.semesterId = semesterId;
    }

    private java.util.List semesterIdBackingList;

    public java.util.List getSemesterIdBackingList()
    {
        return this.semesterIdBackingList;
    }

    public void setSemesterIdBackingList(java.util.List semesterIdBackingList)
    {
        this.semesterIdBackingList = semesterIdBackingList;
    }

    /**
     * @see org.apache.struts.validator.ValidatorForm#reset(org.apache.struts.action.ActionMapping,javax.servlet.http.HttpServletRequest)
     */
    public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request)
    {
        teacherallclasetype = null;
        id = null;
        subjectId = null;
        subjectIdBackingList = null;
        teacherId = null;
        teacherIdBackingList = null;
        classTypeId = null;
        classTypeIdBackingList = null;
        groupId = null;
        groupIdBackingList = null;
        semesterId = null;
        semesterIdBackingList = null;
    }
}