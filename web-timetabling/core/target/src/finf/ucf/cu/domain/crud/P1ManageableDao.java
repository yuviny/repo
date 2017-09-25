// license-header java merge-point
package finf.ucf.cu.domain.crud;

public interface P1ManageableDao
{
    public finf.ucf.cu.domain.P1 create(java.lang.String name, java.util.Date endDate, java.lang.String approved_by, java.lang.Long id, java.lang.Long subjectId, java.lang.Long teacher);

    public finf.ucf.cu.domain.P1 readById(java.lang.Long id);

    public java.util.List read(java.lang.String name, java.util.Date endDate, java.lang.String approved_by, java.lang.Long id, java.lang.Long subjectId, java.lang.Long teacher);

    public java.util.List readAll();

    public java.util.Map readBackingLists();

    public finf.ucf.cu.domain.P1 update(java.lang.String name, java.util.Date endDate, java.lang.String approved_by, java.lang.Long id, java.lang.Long subjectId, java.lang.Long teacher);

    public void delete(java.lang.Long[] ids);

}