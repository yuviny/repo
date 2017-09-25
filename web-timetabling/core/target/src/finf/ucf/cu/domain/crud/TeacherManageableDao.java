// license-header java merge-point
package finf.ucf.cu.domain.crud;

public interface TeacherManageableDao
{
    public finf.ucf.cu.domain.Teacher create(java.lang.String email, java.lang.String name, java.lang.String firstName, java.lang.String lastName, java.lang.String grade, java.lang.Long id, java.lang.Long departmentId);

    public finf.ucf.cu.domain.Teacher readById(java.lang.Long id);

    public java.util.List read(java.lang.String email, java.lang.String name, java.lang.String firstName, java.lang.String lastName, java.lang.String grade, java.lang.Long id, java.lang.Long departmentId);

    public java.util.List readAll();

    public java.util.Map readBackingLists();

    public finf.ucf.cu.domain.Teacher update(java.lang.String email, java.lang.String name, java.lang.String firstName, java.lang.String lastName, java.lang.String grade, java.lang.Long id, java.lang.Long departmentId);

    public void delete(java.lang.Long[] ids);

}