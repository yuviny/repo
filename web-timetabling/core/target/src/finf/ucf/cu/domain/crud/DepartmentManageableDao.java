// license-header java merge-point
package finf.ucf.cu.domain.crud;

public interface DepartmentManageableDao
{
    public finf.ucf.cu.domain.Department create(java.lang.String name, java.lang.Long id, java.lang.Long teacher);

    public finf.ucf.cu.domain.Department readById(java.lang.Long id);

    public java.util.List read(java.lang.String name, java.lang.Long id, java.lang.Long teacher);

    public java.util.List readAll();

    public java.util.Map readBackingLists();

    public finf.ucf.cu.domain.Department update(java.lang.String name, java.lang.Long id, java.lang.Long teacher);

    public void delete(java.lang.Long[] ids);

}