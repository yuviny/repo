// license-header java merge-point
package finf.ucf.cu.domain.crud;

public interface RoomManageableDao
{
    public finf.ucf.cu.domain.Room create(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.lang.Long id, java.lang.Long[] resources, java.lang.Long buildingId);

    public finf.ucf.cu.domain.Room readById(java.lang.Long id);

    public java.util.List read(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.lang.Long id, java.lang.Long[] resources, java.lang.Long buildingId);

    public java.util.List readAll();

    public java.util.Map readBackingLists();

    public finf.ucf.cu.domain.Room update(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.lang.Long id, java.lang.Long[] resources, java.lang.Long buildingId);

    public void delete(java.lang.Long[] ids);

}