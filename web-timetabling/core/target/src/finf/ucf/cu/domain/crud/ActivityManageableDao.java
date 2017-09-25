// license-header java merge-point
package finf.ucf.cu.domain.crud;

public interface ActivityManageableDao
{
    public finf.ucf.cu.domain.Activity create(java.lang.Integer number, java.lang.String name, java.lang.Integer hour_cant, java.lang.Integer week, java.lang.Long id, java.lang.Long classTypeId, java.lang.Long[] resources, java.lang.Long themeId);

    public finf.ucf.cu.domain.Activity readById(java.lang.Long id);

    public java.util.List read(java.lang.Integer number, java.lang.String name, java.lang.Integer hour_cant, java.lang.Integer week, java.lang.Long id, java.lang.Long classTypeId, java.lang.Long[] resources, java.lang.Long themeId);

    public java.util.List readAll();

    public java.util.Map readBackingLists();

    public finf.ucf.cu.domain.Activity update(java.lang.Integer number, java.lang.String name, java.lang.Integer hour_cant, java.lang.Integer week, java.lang.Long id, java.lang.Long classTypeId, java.lang.Long[] resources, java.lang.Long themeId);

    public void delete(java.lang.Long[] ids);

}