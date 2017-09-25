// license-header java merge-point
package finf.ucf.cu.domain.crud;

public interface TeacherManageableService
{
    public finf.ucf.cu.domain.crud.TeacherValueObject create(java.lang.String email, java.lang.String name, java.lang.String firstName, java.lang.String lastName, java.lang.String grade, java.lang.Long id, java.lang.Long departmentId)
        throws Exception;

    public finf.ucf.cu.domain.crud.TeacherValueObject readById(java.lang.Long id)
        throws Exception;

    public java.util.List read(java.lang.String email, java.lang.String name, java.lang.String firstName, java.lang.String lastName, java.lang.String grade, java.lang.Long id, java.lang.Long departmentId)
        throws Exception;

    public java.util.List readAll()
        throws Exception;

    public java.util.Map readBackingLists()
        throws Exception;

    public finf.ucf.cu.domain.crud.TeacherValueObject update(java.lang.String email, java.lang.String name, java.lang.String firstName, java.lang.String lastName, java.lang.String grade, java.lang.Long id, java.lang.Long departmentId)
        throws Exception;

    public void delete(java.lang.Long[] ids)
        throws Exception;

}
