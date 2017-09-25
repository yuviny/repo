// license-header java merge-point
package finf.ucf.cu.domain.crud;

public interface BuildingManageableDao
{
    public finf.ucf.cu.domain.Building create(java.lang.String name, java.lang.String address, java.lang.Long id);

    public finf.ucf.cu.domain.Building readById(java.lang.Long id);

    public java.util.List read(java.lang.String name, java.lang.String address, java.lang.Long id);

    public java.util.List readAll();

    public finf.ucf.cu.domain.Building update(java.lang.String name, java.lang.String address, java.lang.Long id);

    public void delete(java.lang.Long[] ids);

}