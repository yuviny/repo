// license-header java merge-point
package finf.ucf.cu.domain.crud;

public interface GroupManageableDao
{
    public finf.ucf.cu.domain.Group create(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.util.Date dateBegin1Semester, java.util.Date dateBegin2Semester, java.lang.Long id, java.lang.Long subGroupId);

    public finf.ucf.cu.domain.Group readById(java.lang.Long id);

    public java.util.List read(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.util.Date dateBegin1Semester, java.util.Date dateBegin2Semester, java.lang.Long id, java.lang.Long subGroupId);

    public java.util.List readAll();

    public java.util.Map readBackingLists();

    public finf.ucf.cu.domain.Group update(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.util.Date dateBegin1Semester, java.util.Date dateBegin2Semester, java.lang.Long id, java.lang.Long subGroupId);

    public void delete(java.lang.Long[] ids);

}