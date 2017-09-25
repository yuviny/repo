// license-header java merge-point
package finf.ucf.cu.domain.crud;

public final class ActivityManageableServiceBase
    implements ActivityManageableService
{
    private finf.ucf.cu.domain.crud.ActivityManageableDao dao;

    public void setDao(finf.ucf.cu.domain.crud.ActivityManageableDao dao)
    {
        this.dao = dao;
    }

    protected finf.ucf.cu.domain.crud.ActivityManageableDao getDao()
    {
        return this.dao;
    }

    public finf.ucf.cu.domain.crud.ActivityValueObject create(java.lang.Integer number, java.lang.String name, java.lang.Integer hour_cant, java.lang.Integer week, java.lang.Long id, java.lang.Long classTypeId, java.lang.Long[] resources, java.lang.Long themeId)
        throws Exception
    {
        if (number == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ActivityManageableService.create(java.lang.Integer number, java.lang.String name, java.lang.Integer hour_cant, java.lang.Integer week, java.lang.Long id, java.lang.Long classTypeId, java.lang.Long[] resources, java.lang.Long themeId) - 'number' can not be null");
        }

        if (name == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ActivityManageableService.create(java.lang.Integer number, java.lang.String name, java.lang.Integer hour_cant, java.lang.Integer week, java.lang.Long id, java.lang.Long classTypeId, java.lang.Long[] resources, java.lang.Long themeId) - 'name' can not be null");
        }

        if (hour_cant == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ActivityManageableService.create(java.lang.Integer number, java.lang.String name, java.lang.Integer hour_cant, java.lang.Integer week, java.lang.Long id, java.lang.Long classTypeId, java.lang.Long[] resources, java.lang.Long themeId) - 'hour_cant' can not be null");
        }

        if (week == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ActivityManageableService.create(java.lang.Integer number, java.lang.String name, java.lang.Integer hour_cant, java.lang.Integer week, java.lang.Long id, java.lang.Long classTypeId, java.lang.Long[] resources, java.lang.Long themeId) - 'week' can not be null");
        }

        if (classTypeId == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ActivityManageableService.create(java.lang.Integer number, java.lang.String name, java.lang.Integer hour_cant, java.lang.Integer week, java.lang.Long id, java.lang.Long classTypeId, java.lang.Long[] resources, java.lang.Long themeId) - 'classTypeId' can not be null");
        }

        if (themeId == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ActivityManageableService.create(java.lang.Integer number, java.lang.String name, java.lang.Integer hour_cant, java.lang.Integer week, java.lang.Long id, java.lang.Long classTypeId, java.lang.Long[] resources, java.lang.Long themeId) - 'themeId' can not be null");
        }

        return toValueObject(dao.create(number, name, hour_cant, week, id, classTypeId, resources, themeId));
    }

    public finf.ucf.cu.domain.crud.ActivityValueObject readById(java.lang.Long id)
        throws Exception
    {
        return toValueObject(dao.readById(id));
    }

    public java.util.List read(java.lang.Integer number, java.lang.String name, java.lang.Integer hour_cant, java.lang.Integer week, java.lang.Long id, java.lang.Long classTypeId, java.lang.Long[] resources, java.lang.Long themeId)
        throws Exception
    {
        return toValueObjects(dao.read(number, name, hour_cant, week, id, classTypeId, resources, themeId));
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

    public finf.ucf.cu.domain.crud.ActivityValueObject update(java.lang.Integer number, java.lang.String name, java.lang.Integer hour_cant, java.lang.Integer week, java.lang.Long id, java.lang.Long classTypeId, java.lang.Long[] resources, java.lang.Long themeId)
        throws Exception
    {
        if (number == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ActivityManageableService.update(java.lang.Integer number, java.lang.String name, java.lang.Integer hour_cant, java.lang.Integer week, java.lang.Long id, java.lang.Long classTypeId, java.lang.Long[] resources, java.lang.Long themeId) - 'number' can not be null");
        }

        if (name == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ActivityManageableService.update(java.lang.Integer number, java.lang.String name, java.lang.Integer hour_cant, java.lang.Integer week, java.lang.Long id, java.lang.Long classTypeId, java.lang.Long[] resources, java.lang.Long themeId) - 'name' can not be null");
        }

        if (hour_cant == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ActivityManageableService.update(java.lang.Integer number, java.lang.String name, java.lang.Integer hour_cant, java.lang.Integer week, java.lang.Long id, java.lang.Long classTypeId, java.lang.Long[] resources, java.lang.Long themeId) - 'hour_cant' can not be null");
        }

        if (week == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ActivityManageableService.update(java.lang.Integer number, java.lang.String name, java.lang.Integer hour_cant, java.lang.Integer week, java.lang.Long id, java.lang.Long classTypeId, java.lang.Long[] resources, java.lang.Long themeId) - 'week' can not be null");
        }

        if (id == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ActivityManageableService.update(java.lang.Integer number, java.lang.String name, java.lang.Integer hour_cant, java.lang.Integer week, java.lang.Long id, java.lang.Long classTypeId, java.lang.Long[] resources, java.lang.Long themeId) - 'id' can not be null");
        }

        if (classTypeId == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ActivityManageableService.update(java.lang.Integer number, java.lang.String name, java.lang.Integer hour_cant, java.lang.Integer week, java.lang.Long id, java.lang.Long classTypeId, java.lang.Long[] resources, java.lang.Long themeId) - 'classTypeId' can not be null");
        }

        if (themeId == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ActivityManageableService.update(java.lang.Integer number, java.lang.String name, java.lang.Integer hour_cant, java.lang.Integer week, java.lang.Long id, java.lang.Long classTypeId, java.lang.Long[] resources, java.lang.Long themeId) - 'themeId' can not be null");
        }

        return toValueObject(dao.update(number, name, hour_cant, week, id, classTypeId, resources, themeId));
    }

    public void delete(java.lang.Long[] ids)
        throws Exception
    {
        if (ids == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.domain.crud.ActivityManageableService.delete(java.lang.Long[] ids) - 'ids' can not be null");
        }

        dao.delete(ids);
    }


    private static java.util.List toValueObjects(java.util.Collection entities)
    {
        final java.util.List list = new java.util.ArrayList();

        for (java.util.Iterator iterator = entities.iterator(); iterator.hasNext();)
        {
            list.add(toValueObject((finf.ucf.cu.domain.Activity)iterator.next()));
        }

        return list;
    }

    private static finf.ucf.cu.domain.crud.ActivityValueObject toValueObject(finf.ucf.cu.domain.Activity entity)
    {
        final finf.ucf.cu.domain.crud.ActivityValueObject valueObject = new finf.ucf.cu.domain.crud.ActivityValueObject();

        valueObject.setNumber(entity.getNumber());
        valueObject.setName(entity.getName());
        valueObject.setHour_cant(entity.getHour_cant());
        valueObject.setWeek(entity.getWeek());
        valueObject.setId(entity.getId());

        final finf.ucf.cu.domain.ClassType classTypeId = entity.getClassTypeId();
        if (classTypeId != null)
        {
            valueObject.setClassTypeId(classTypeId.getId());
            valueObject.setClassTypeIdLabel(classTypeId.getName());
        }

        final java.util.Collection resources = entity.getResources();
        if (resources == null || resources.isEmpty())
        {
            valueObject.setResources(null);
            valueObject.setResourcesLabels(null);
        }
        else
        {
            final java.lang.Long[] values = new java.lang.Long[resources.size()];
            final java.lang.String[] labels = new java.lang.String[resources.size()];
            int counter = 0;
            for (final java.util.Iterator iterator = resources.iterator(); iterator.hasNext();counter++)
            {
                final finf.ucf.cu.domain.Resource element = (finf.ucf.cu.domain.Resource)iterator.next();
                values[counter] = element.getId();
                labels[counter] = element.getName();
            }
            valueObject.setResources(values);
            valueObject.setResourcesLabels(labels);
        }

        final finf.ucf.cu.domain.Theme themeId = entity.getThemeId();
        if (themeId != null)
        {
            valueObject.setThemeId(themeId.getId());
            valueObject.setThemeIdLabel(themeId.getName());
        }

        return valueObject;
    }
}
