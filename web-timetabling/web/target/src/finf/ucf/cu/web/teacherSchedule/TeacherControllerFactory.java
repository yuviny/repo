// license-header java merge-point
package finf.ucf.cu.web.teacherSchedule;

public class TeacherControllerFactory
{
    private final static TeacherController INSTANCE = new TeacherControllerImpl();

    public final static TeacherController getTeacherControllerInstance()
    {
        return INSTANCE;
    }
}