// license-header java merge-point
package finf.ucf.cu.domain.crud;

public final class DepartmentManageableServiceBase
    implements DepartmentManageableService
{
    private finf.ucf.cu.domain.crud.DepartmentManageableDao dao;

    public void setDao(finf.ucf.cu.domain.crud.DepartmentManageableDao dao)
    {
        this.dao = dao;
    }

    protected finf.ucf.cu.domain.crud.DepartmentManageableDao getDao()
    {
        return this.dao;
    }

    public finf.ucf.cu.domain.crud.DepartmentValueObject create(java.lang.String name, java.lang.Long id, java.lang.Long teacher)
        throws Exception
    {
        if (name == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.DepartmentManageableService.create(java.lang.String name, java.lang.Long id, java.lang.Long teacher) - 'name' can not be null");
        }

        return toValueObject(dao.create(name, id, teacher));
    }

    public finf.ucf.cu.domain.crud.DepartmentValueObject readById(java.lang.Long id)
        throws Exception
    {
        return toValueObject(dao.readById(id));
    }

    public java.util.List read(java.lang.String name, java.lang.Long id, java.lang.Long teacher)
        throws Exception
    {
        return toValueObjects(dao.read(name, id, teacher));
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

    public finf.ucf.cu.domain.crud.DepartmentValueObject update(java.lang.String name, java.lang.Long id, java.lang.Long teacher)
        throws Exception
    {
        if (name == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.DepartmentManageableService.update(java.lang.String name, java.lang.Long id, java.lang.Long teacher) - 'name' can not be null");
        }

        if (id == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.DepartmentManageableService.update(java.lang.String name, java.lang.Long id, java.lang.Long teacher) - 'id' can not be null");
        }

        return toValueObject(dao.update(name, id, teacher));
    }

    public void delete(java.lang.Long[] ids)
        throws Exception
    {
        if (ids == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.DepartmentManageableService.delete(java.lang.Long[] ids) - 'ids' can not be null");
        }

        dao.delete(ids);
    }


    private static java.util.List toValueObjects(java.util.Collection entities)
    {
        final java.util.List list = new java.util.ArrayList();

        for (java.util.Iterator iterator = entities.iterator(); iterator.hasNext();)
        {
            list.add(toValueObject((finf.ucf.cu.domain.Department)iterator.next()));
        }

        return list;
    }

    private static finf.ucf.cu.domain.crud.DepartmentValueObject toValueObject(finf.ucf.cu.domain.Department entity)
    {
        final finf.ucf.cu.domain.crud.DepartmentValueObject valueObject = new finf.ucf.cu.domain.crud.DepartmentValueObject();

        valueObject.setName(entity.getName());
        valueObject.setId(entity.getId());

        final finf.ucf.cu.domain.Teacher teacher = entity.getTeacher();
        if (teacher != null)
        {
            valueObject.setTeacher(teacher.getId());
            valueObject.setTeacherLabel(teacher.getEmail());
        }

        return valueObject;
    }
}
