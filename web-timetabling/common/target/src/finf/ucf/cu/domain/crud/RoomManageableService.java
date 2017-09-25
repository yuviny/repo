// license-header java merge-point
package finf.ucf.cu.domain.crud;

public interface RoomManageableService
{
    public finf.ucf.cu.domain.crud.RoomValueObject create(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.lang.Long id, java.lang.Long[] resources, java.lang.Long buildingId)
        throws Exception;

    public finf.ucf.cu.domain.crud.RoomValueObject readById(java.lang.Long id)
        throws Exception;

    public java.util.List read(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.lang.Long id, java.lang.Long[] resources, java.lang.Long buildingId)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public finf.ucf.cu.domain.crud.RoomValueObject update(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.lang.Long id, java.lang.Long[] resources, java.lang.Long buildingId)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
