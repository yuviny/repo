// license-header java merge-point
package finf.ucf.cu.domain.crud;

public interface ResourceManageableService
{
    public finf.ucf.cu.domain.crud.ResourceValueObject create(java.lang.String name, java.lang.String description, java.lang.Long id)
        throws Exception;

    public finf.ucf.cu.domain.crud.ResourceValueObject readById(java.lang.Long id)
        throws Exception;

    public java.util.List read(java.lang.String name, java.lang.String description, java.lang.Long id)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public finf.ucf.cu.domain.crud.ResourceValueObject update(java.lang.String name, java.lang.String description, java.lang.Long id)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
