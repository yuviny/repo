// license-header java merge-point
package finf.ucf.cu.web.makep1;

public class MakeP1ControllerFactory
{
    private final static MakeP1Controller INSTANCE = new MakeP1ControllerImpl();

    public final static MakeP1Controller getMakeP1ControllerInstance()
    {
        return INSTANCE;
    }
}