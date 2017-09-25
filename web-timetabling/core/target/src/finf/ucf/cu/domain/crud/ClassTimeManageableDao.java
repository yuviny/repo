// license-header java merge-point
package finf.ucf.cu.domain.crud;

public interface ClassTimeManageableDao
{
    public finf.ucf.cu.domain.ClassTime create(java.util.Date day, finf.ucf.cu.domain.cTime time, java.lang.Integer duration, boolean fixed, boolean tipic, java.lang.Long id, java.lang.Long groupId, java.lang.Long teacherId, java.lang.Long subjectId, java.lang.Long roomId, java.lang.Long solution, java.lang.Long classTypeID);

    public finf.ucf.cu.domain.ClassTime readById(java.lang.Long id);

    public java.util.List read(java.util.Date day, finf.ucf.cu.domain.cTime time, java.lang.Integer duration, boolean fixed, boolean tipic, java.lang.Long id, java.lang.Long groupId, java.lang.Long teacherId, java.lang.Long subjectId, java.lang.Long roomId, java.lang.Long solution, java.lang.Long classTypeID);

    public java.util.List readAll();

    public java.util.Map readBackingLists();

    public finf.ucf.cu.domain.ClassTime update(java.util.Date day, finf.ucf.cu.domain.cTime time, java.lang.Integer duration, boolean fixed, boolean tipic, java.lang.Long id, java.lang.Long groupId, java.lang.Long teacherId, java.lang.Long subjectId, java.lang.Long roomId, java.lang.Long solution, java.lang.Long classTypeID);

    public void delete(java.lang.Long[] ids);

}