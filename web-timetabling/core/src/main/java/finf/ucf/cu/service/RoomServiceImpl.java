// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package finf.ucf.cu.service;

import java.util.ArrayList;
import java.util.List;

import org.andromda.translation.ocl.node.ARangeExpressionListOrRangeTail;

import finf.ucf.cu.domain.Room;

import finf.ucf.cu.domain.crud.RoomValueObject;

/**
 * @see finf.ucf.cu.service.RoomService
 */
public class RoomServiceImpl
    extends finf.ucf.cu.service.RoomServiceBase
{

    /**
     * @see finf.ucf.cu.service.RoomService#findRoomById(java.lang.Long)
     */
    protected  finf.ucf.cu.domain.crud.RoomValueObject handleFindRoomById(java.lang.Long id)
        throws java.lang.Exception
    {
    	Room room = getRoomDao().findById(id); 	
    	RoomValueObject vo = new RoomValueObject();
                
        vo.setId(room.getId());
        vo.setName(room.getName());
        
        vo.setSize(room.getSize());
        return vo;  	
        
    }

	
    

    
}