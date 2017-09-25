// license-header java merge-point
package finf.ucf.cu.domain.crud;

public interface P1ManageableService
{
    public finf.ucf.cu.domain.crud.P1ValueObject create(java.lang.String name, java.util.Date endDate, java.lang.String approved_by, java.lang.Long id, java.lang.Long subjectId, java.lang.Long teacher)
        throws Exception;

    public finf.ucf.cu.domain.crud.P1ValueObject readById(java.lang.Long id)
        throws Exception;

    public java.util.List read(java.lang.String name, java.util.Date endDate, java.lang.String approved_by, java.lang.Long id, java.lang.Long subjectId, java.lang.Long teacher)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public finf.ucf.cu.domain.crud.P1ValueObject update(java.lang.String name, java.util.Date endDate, java.lang.String approved_by, java.lang.Long id, java.lang.Long subjectId, java.lang.Long teacher)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
