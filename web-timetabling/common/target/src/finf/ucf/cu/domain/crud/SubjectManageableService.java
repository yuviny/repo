// license-header java merge-point
package finf.ucf.cu.domain.crud;

public interface SubjectManageableService
{
    public finf.ucf.cu.domain.crud.SubjectValueObject create(java.lang.String name, java.lang.String abbreviation, java.lang.Long id)
        throws Exception;

    public finf.ucf.cu.domain.crud.SubjectValueObject readById(java.lang.Long id)
        throws Exception;

    public java.util.List read(java.lang.String name, java.lang.String abbreviation, java.lang.Long id)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public finf.ucf.cu.domain.crud.SubjectValueObject update(java.lang.String name, java.lang.String abbreviation, java.lang.Long id)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
