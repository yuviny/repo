// license-header java merge-point
package finf.ucf.cu.domain.crud;

public interface SemesterManageableDao
{
    public finf.ucf.cu.domain.Semester create(java.lang.String name, java.lang.Long id);

    public finf.ucf.cu.domain.Semester readById(java.lang.Long id);

    public java.util.List read(java.lang.String name, java.lang.Long id);

    public java.util.List readAll();

    public finf.ucf.cu.domain.Semester update(java.lang.String name, java.lang.Long id);

    public void delete(java.lang.Long[] ids);

}