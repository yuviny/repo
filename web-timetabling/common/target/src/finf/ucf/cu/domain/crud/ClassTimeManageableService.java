// license-header java merge-point
package finf.ucf.cu.domain.crud;

public interface ClassTimeManageableService
{
    public finf.ucf.cu.domain.crud.ClassTimeValueObject create(java.util.Date day, finf.ucf.cu.domain.cTime time, java.lang.Integer duration, boolean fixed, boolean tipic, java.lang.Long id, java.lang.Long groupId, java.lang.Long teacherId, java.lang.Long subjectId, java.lang.Long roomId, java.lang.Long solution, java.lang.Long classTypeID)
        throws Exception;

    public finf.ucf.cu.domain.crud.ClassTimeValueObject readById(java.lang.Long id)
        throws Exception;

    public java.util.List read(java.util.Date day, finf.ucf.cu.domain.cTime time, java.lang.Integer duration, boolean fixed, boolean tipic, java.lang.Long id, java.lang.Long groupId, java.lang.Long teacherId, java.lang.Long subjectId, java.lang.Long roomId, java.lang.Long solution, java.lang.Long classTypeID)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public finf.ucf.cu.domain.crud.ClassTimeValueObject update(java.util.Date day, finf.ucf.cu.domain.cTime time, java.lang.Integer duration, boolean fixed, boolean tipic, java.lang.Long id, java.lang.Long groupId, java.lang.Long teacherId, java.lang.Long subjectId, java.lang.Long roomId, java.lang.Long solution, java.lang.Long classTypeID)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
