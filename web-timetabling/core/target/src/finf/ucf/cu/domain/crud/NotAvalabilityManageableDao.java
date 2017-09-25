// license-header java merge-point
package finf.ucf.cu.domain.crud;

public interface NotAvalabilityManageableDao
{
    public finf.ucf.cu.domain.NotAvalability create(java.util.Date date, finf.ucf.cu.domain.cTime not_time, java.lang.Long id, java.lang.Long teacherId, java.lang.Long groupId, java.lang.Long subjectId);

    public finf.ucf.cu.domain.NotAvalability readById(java.lang.Long id);

    public java.util.List read(java.util.Date date, finf.ucf.cu.domain.cTime not_time, java.lang.Long id, java.lang.Long teacherId, java.lang.Long groupId, java.lang.Long subjectId);

    public java.util.List readAll();

    public java.util.Map readBackingLists();

    public finf.ucf.cu.domain.NotAvalability update(java.util.Date date, finf.ucf.cu.domain.cTime not_time, java.lang.Long id, java.lang.Long teacherId, java.lang.Long groupId, java.lang.Long subjectId);

    public void delete(java.lang.Long[] ids);

}