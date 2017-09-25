// license-header java merge-point
package finf.ucf.cu.web.roomschedule;

public class RoomControllerFactory
{
    private final static RoomController INSTANCE = new RoomControllerImpl();

    public final static RoomController getRoomControllerInstance()
    {
        return INSTANCE;
    }
}