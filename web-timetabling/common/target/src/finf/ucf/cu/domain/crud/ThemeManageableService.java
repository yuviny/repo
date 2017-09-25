// license-header java merge-point
package finf.ucf.cu.domain.crud;

public interface ThemeManageableService
{
    public finf.ucf.cu.domain.crud.ThemeValueObject create(java.lang.String name, java.lang.Long id, java.lang.Long punoId)
        throws Exception;

    public finf.ucf.cu.domain.crud.ThemeValueObject readById(java.lang.Long id)
        throws Exception;

    public java.util.List read(java.lang.String name, java.lang.Long id, java.lang.Long punoId)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public finf.ucf.cu.domain.crud.ThemeValueObject update(java.lang.String name, java.lang.Long id, java.lang.Long punoId)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
