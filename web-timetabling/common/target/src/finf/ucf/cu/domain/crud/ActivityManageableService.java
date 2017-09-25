// license-header java merge-point
package finf.ucf.cu.domain.crud;

public interface ActivityManageableService
{
    public finf.ucf.cu.domain.crud.ActivityValueObject create(java.lang.Integer number, java.lang.String name, java.lang.Integer hour_cant, java.lang.Integer week, java.lang.Long id, java.lang.Long classTypeId, java.lang.Long[] resources, java.lang.Long themeId)
        throws Exception;

    public finf.ucf.cu.domain.crud.ActivityValueObject readById(java.lang.Long id)
        throws Exception;

    public java.util.List read(java.lang.Integer number, java.lang.String name, java.lang.Integer hour_cant, java.lang.Integer week, java.lang.Long id, java.lang.Long classTypeId, java.lang.Long[] resources, java.lang.Long themeId)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public finf.ucf.cu.domain.crud.ActivityValueObject update(java.lang.Integer number, java.lang.String name, java.lang.Integer hour_cant, java.lang.Integer week, java.lang.Long id, java.lang.Long classTypeId, java.lang.Long[] resources, java.lang.Long themeId)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
