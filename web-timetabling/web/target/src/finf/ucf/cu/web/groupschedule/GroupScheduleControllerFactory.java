// license-header java merge-point
package finf.ucf.cu.web.groupschedule;

public class GroupScheduleControllerFactory
{
    private final static GroupScheduleController INSTANCE = new GroupScheduleControllerImpl();

    public final static GroupScheduleController getGroupScheduleControllerInstance()
    {
        return INSTANCE;
    }
}