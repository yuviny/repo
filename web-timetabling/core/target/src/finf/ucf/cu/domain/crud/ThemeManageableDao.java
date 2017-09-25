// license-header java merge-point
package finf.ucf.cu.domain.crud;

public interface ThemeManageableDao
{
    public finf.ucf.cu.domain.Theme create(java.lang.String name, java.lang.Long id, java.lang.Long punoId);

    public finf.ucf.cu.domain.Theme readById(java.lang.Long id);

    public java.util.List read(java.lang.String name, java.lang.Long id, java.lang.Long punoId);

    public java.util.List readAll();

    public java.util.Map readBackingLists();

    public finf.ucf.cu.domain.Theme update(java.lang.String name, java.lang.Long id, java.lang.Long punoId);

    public void delete(java.lang.Long[] ids);

}