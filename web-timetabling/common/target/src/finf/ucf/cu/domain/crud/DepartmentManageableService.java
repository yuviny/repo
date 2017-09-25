// license-header java merge-point
package finf.ucf.cu.domain.crud;

public interface DepartmentManageableService
{
    public finf.ucf.cu.domain.crud.DepartmentValueObject create(java.lang.String name, java.lang.Long id, java.lang.Long teacher)
        throws Exception;

    public finf.ucf.cu.domain.crud.DepartmentValueObject readById(java.lang.Long id)
        throws Exception;

    public java.util.List read(java.lang.String name, java.lang.Long id, java.lang.Long teacher)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public finf.ucf.cu.domain.crud.DepartmentValueObject update(java.lang.String name, java.lang.Long id, java.lang.Long teacher)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
