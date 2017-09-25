// license-header java merge-point
package finf.ucf.cu.domain.crud;

public interface ResourceManageableDao
{
    public finf.ucf.cu.domain.Resource create(java.lang.String name, java.lang.String description, java.lang.Long id);

    public finf.ucf.cu.domain.Resource readById(java.lang.Long id);

    public java.util.List read(java.lang.String name, java.lang.String description, java.lang.Long id);

    public java.util.List readAll();

    public finf.ucf.cu.domain.Resource update(java.lang.String name, java.lang.String description, java.lang.Long id);

    public void delete(java.lang.Long[] ids);

}