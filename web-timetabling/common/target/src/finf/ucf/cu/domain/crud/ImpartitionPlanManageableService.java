// license-header java merge-point
package finf.ucf.cu.domain.crud;

public interface ImpartitionPlanManageableService
{
    public finf.ucf.cu.domain.crud.ImpartitionPlanValueObject create(java.lang.Boolean teacherallclasetype, java.lang.Long id, java.lang.Long subjectId, java.lang.Long teacherId, java.lang.Long classTypeId, java.lang.Long groupId, java.lang.Long semesterId)
        throws Exception;

    public finf.ucf.cu.domain.crud.ImpartitionPlanValueObject readById(java.lang.Long id)
        throws Exception;

    public java.util.List read(java.lang.Boolean teacherallclasetype, java.lang.Long id, java.lang.Long subjectId, java.lang.Long teacherId, java.lang.Long classTypeId, java.lang.Long groupId, java.lang.Long semesterId)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public finf.ucf.cu.domain.crud.ImpartitionPlanValueObject update(java.lang.Boolean teacherallclasetype, java.lang.Long id, java.lang.Long subjectId, java.lang.Long teacherId, java.lang.Long classTypeId, java.lang.Long groupId, java.lang.Long semesterId)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
