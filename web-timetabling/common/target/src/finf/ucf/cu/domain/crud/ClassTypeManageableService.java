// license-header java merge-point
package finf.ucf.cu.domain.crud;

public interface ClassTypeManageableService
{
    public finf.ucf.cu.domain.crud.ClassTypeValueObject create(java.lang.String name, java.lang.Long id)
        throws Exception;

    public finf.ucf.cu.domain.crud.ClassTypeValueObject readById(java.lang.Long id)
        throws Exception;

    public java.util.List read(java.lang.String name, java.lang.Long id)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public finf.ucf.cu.domain.crud.ClassTypeValueObject update(java.lang.String name, java.lang.Long id)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
