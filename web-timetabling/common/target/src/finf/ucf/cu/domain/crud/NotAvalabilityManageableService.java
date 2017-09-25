// license-header java merge-point
package finf.ucf.cu.domain.crud;

public interface NotAvalabilityManageableService
{
    public finf.ucf.cu.domain.crud.NotAvalabilityValueObject create(java.util.Date date, finf.ucf.cu.domain.cTime not_time, java.lang.Long id, java.lang.Long teacherId, java.lang.Long groupId, java.lang.Long subjectId)
        throws Exception;

    public finf.ucf.cu.domain.crud.NotAvalabilityValueObject readById(java.lang.Long id)
        throws Exception;

    public java.util.List read(java.util.Date date, finf.ucf.cu.domain.cTime not_time, java.lang.Long id, java.lang.Long teacherId, java.lang.Long groupId, java.lang.Long subjectId)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public finf.ucf.cu.domain.crud.NotAvalabilityValueObject update(java.util.Date date, finf.ucf.cu.domain.cTime not_time, java.lang.Long id, java.lang.Long teacherId, java.lang.Long groupId, java.lang.Long subjectId)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
