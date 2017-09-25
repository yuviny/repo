// license-header java merge-point
package finf.ucf.cu.domain.crud;

public interface SemesterManageableService
{
    public finf.ucf.cu.domain.crud.SemesterValueObject create(java.lang.String name, java.lang.Long id)
        throws Exception;

    public finf.ucf.cu.domain.crud.SemesterValueObject readById(java.lang.Long id)
        throws Exception;

    public java.util.List read(java.lang.String name, java.lang.Long id)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public finf.ucf.cu.domain.crud.SemesterValueObject update(java.lang.String name, java.lang.Long id)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
