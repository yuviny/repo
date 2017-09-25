// license-header java merge-point
package finf.ucf.cu.domain.crud;

public interface SubjectManageableDao
{
    public finf.ucf.cu.domain.Subject create(java.lang.String name, java.lang.String abbreviation, java.lang.Long id);

    public finf.ucf.cu.domain.Subject readById(java.lang.Long id);

    public java.util.List read(java.lang.String name, java.lang.String abbreviation, java.lang.Long id);

    public java.util.List readAll();

    public finf.ucf.cu.domain.Subject update(java.lang.String name, java.lang.String abbreviation, java.lang.Long id);

    public void delete(java.lang.Long[] ids);

}