// license-header java merge-point
package finf.ucf.cu.domain.crud;

public interface GroupManageableService
{
    public finf.ucf.cu.domain.crud.GroupValueObject create(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.util.Date dateBegin1Semester, java.util.Date dateBegin2Semester, java.lang.Long id, java.lang.Long subGroupId)
        throws Exception;

    public finf.ucf.cu.domain.crud.GroupValueObject readById(java.lang.Long id)
        throws Exception;

    public java.util.List read(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.util.Date dateBegin1Semester, java.util.Date dateBegin2Semester, java.lang.Long id, java.lang.Long subGroupId)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public finf.ucf.cu.domain.crud.GroupValueObject update(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.util.Date dateBegin1Semester, java.util.Date dateBegin2Semester, java.lang.Long id, java.lang.Long subGroupId)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
