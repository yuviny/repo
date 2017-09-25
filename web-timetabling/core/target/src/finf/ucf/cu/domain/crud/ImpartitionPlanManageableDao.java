// license-header java merge-point
package finf.ucf.cu.domain.crud;

public interface ImpartitionPlanManageableDao
{
    public finf.ucf.cu.domain.ImpartitionPlan create(java.lang.Boolean teacherallclasetype, java.lang.Long id, java.lang.Long subjectId, java.lang.Long teacherId, java.lang.Long classTypeId, java.lang.Long groupId, java.lang.Long semesterId);

    public finf.ucf.cu.domain.ImpartitionPlan readById(java.lang.Long id);

    public java.util.List read(java.lang.Boolean teacherallclasetype, java.lang.Long id, java.lang.Long subjectId, java.lang.Long teacherId, java.lang.Long classTypeId, java.lang.Long groupId, java.lang.Long semesterId);

    public java.util.List readAll();

    public java.util.Map readBackingLists();

    public finf.ucf.cu.domain.ImpartitionPlan update(java.lang.Boolean teacherallclasetype, java.lang.Long id, java.lang.Long subjectId, java.lang.Long teacherId, java.lang.Long classTypeId, java.lang.Long groupId, java.lang.Long semesterId);

    public void delete(java.lang.Long[] ids);

}