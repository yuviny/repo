// license-header java merge-point
package finf.ucf.cu.domain.crud;

public final class TeacherManageableServiceBase
    implements TeacherManageableService
{
    private finf.ucf.cu.domain.crud.TeacherManageableDao dao;

    public void setDao(finf.ucf.cu.domain.crud.TeacherManageableDao dao)
    {
        this.dao = dao;
    }

    protected finf.ucf.cu.domain.crud.TeacherManageableDao getDao()
    {
        return this.dao;
    }

    public finf.ucf.cu.domain.crud.TeacherValueObject create(java.lang.String email, java.lang.String name, java.lang.String firstName, java.lang.String lastName, java.lang.String grade, java.lang.Long id, java.lang.Long departmentId)
        throws Exception
    {
        if (email == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.TeacherManageableService.create(java.lang.String email, java.lang.String name, java.lang.String firstName, java.lang.String lastName, java.lang.String grade, java.lang.Long id, java.lang.Long departmentId) - 'email' can not be null");
        }

        if (name == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.TeacherManageableService.create(java.lang.String email, java.lang.String name, java.lang.String firstName, java.lang.String lastName, java.lang.String grade, java.lang.Long id, java.lang.Long departmentId) - 'name' can not be null");
        }

        return toValueObject(dao.create(email, name, firstName, lastName, grade, id, departmentId));
    }

    public finf.ucf.cu.domain.crud.TeacherValueObject readById(java.lang.Long id)
        throws Exception
    {
        return toValueObject(dao.readById(id));
    }

    public java.util.List read(java.lang.String email, java.lang.String name, java.lang.String firstName, java.lang.String lastName, java.lang.String grade, java.lang.Long id, java.lang.Long departmentId)
        throws Exception
    {
        return toValueObjects(dao.read(email, name, firstName, lastName, grade, id, departmentId));
    }

    public java.util.List readAll()
        throws Exception
    {
        return toValueObjects(dao.readAll());
    }

    public java.util.Map readBackingLists()
        throws Exception
    {
        return getDao().readBackingLists();
    }

    public finf.ucf.cu.domain.crud.TeacherValueObject update(java.lang.String email, java.lang.String name, java.lang.String firstName, java.lang.String lastName, java.lang.String grade, java.lang.Long id, java.lang.Long departmentId)
        throws Exception
    {
        if (email == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.TeacherManageableService.update(java.lang.String email, java.lang.String name, java.lang.String firstName, java.lang.String lastName, java.lang.String grade, java.lang.Long id, java.lang.Long departmentId) - 'email' can not be null");
        }

        if (name == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.TeacherManageableService.update(java.lang.String email, java.lang.String name, java.lang.String firstName, java.lang.String lastName, java.lang.String grade, java.lang.Long id, java.lang.Long departmentId) - 'name' can not be null");
        }

        if (id == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.TeacherManageableService.update(java.lang.String email, java.lang.String name, java.lang.String firstName, java.lang.String lastName, java.lang.String grade, java.lang.Long id, java.lang.Long departmentId) - 'id' can not be null");
        }

        return toValueObject(dao.update(email, name, firstName, lastName, grade, id, departmentId));
    }

    public void delete(java.lang.Long[] ids)
        throws Exception
    {
        if (ids == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.TeacherManageableService.delete(java.lang.Long[] ids) - 'ids' can not be null");
        }

        dao.delete(ids);
    }


    private static java.util.List toValueObjects(java.util.Collection entities)
    {
        final java.util.List list = new java.util.ArrayList();

        for (java.util.Iterator iterator = entities.iterator(); iterator.hasNext();)
        {
            list.add(toValueObject((finf.ucf.cu.domain.Teacher)iterator.next()));
        }

        return list;
    }

    private static finf.ucf.cu.domain.crud.TeacherValueObject toValueObject(finf.ucf.cu.domain.Teacher entity)
    {
        final finf.ucf.cu.domain.crud.TeacherValueObject valueObject = new finf.ucf.cu.domain.crud.TeacherValueObject();

        valueObject.setEmail(entity.getEmail());
        valueObject.setName(entity.getName());
        valueObject.setFirstName(entity.getFirstName());
        valueObject.setLastName(entity.getLastName());
        valueObject.setGrade(entity.getGrade());
        valueObject.setId(entity.getId());

        final finf.ucf.cu.domain.Department departmentId = entity.getDepartmentId();
        if (departmentId != null)
        {
            valueObject.setDepartmentId(departmentId.getId());
            valueObject.setDepartmentIdLabel(departmentId.getName());
        }

        return valueObject;
    }
}
