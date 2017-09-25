// license-header java merge-point
package finf.ucf.cu.domain.crud;

public interface BuildingManageableService
{
    public finf.ucf.cu.domain.crud.BuildingValueObject create(java.lang.String name, java.lang.String address, java.lang.Long id)
        throws Exception;

    public finf.ucf.cu.domain.crud.BuildingValueObject readById(java.lang.Long id)
        throws Exception;

    public java.util.List read(java.lang.String name, java.lang.String address, java.lang.Long id)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public finf.ucf.cu.domain.crud.BuildingValueObject update(java.lang.String name, java.lang.String address, java.lang.Long id)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
