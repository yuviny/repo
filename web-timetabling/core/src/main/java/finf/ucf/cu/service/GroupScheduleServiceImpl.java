// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package finf.ucf.cu.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import finf.ucf.cu.domain.ClassTime;
import finf.ucf.cu.domain.Semester;
import finf.ucf.cu.domain.cTime;
import finf.ucf.cu.domain.cTimeEnum;
import finf.ucf.cu.vo.ScheduleGroupVO;

/**
 * @see finf.ucf.cu.service.GroupScheduleService
 */
public class GroupScheduleServiceImpl
        extends finf.ucf.cu.service.GroupScheduleServiceBase {

    @SuppressWarnings("deprecation")
	protected List handleGetGroupSchedule(Long groupId, Date date) throws Exception {

        List myClass = new ArrayList(0);

        finf.ucf.cu.domain.Group group = getGroupDao().findById(groupId);

        //seteando el dia para el lunes de esa semana
        switch (date.getDay()) {
            case 0: //Domingo
                date.setDate(date.getDate() + 1);
                break;
            case 2: //Martes
                date.setDate(date.getDate() - 1);
                break;
            case 3: //Miercoles
                date.setDate(date.getDate() - 2);
                break;
            case 4: //Jueves
                date.setDate(date.getDate() - 3);
                break;
            case 5: //Viernes
                date.setDate(date.getDate() - 4);
                break;
            case 6: //Sábado
                date.setDate(date.getDate() - 5);
                break;
            default:
                break;
        }
        for (int i = 0; i < 6; i++) {
            myClass.addAll(getClassTimeDao().findByDayAndGroup(date, group));
            date.setDate(date.getDate() + 1);
        }

        ArrayList scheduleGroupListVO = new ArrayList();
        String tea, room, type = new String();

        for (int i = 0; i < myClass.size(); i++) {
           
            tea = (((ClassTime) myClass.get(i)).getTeacherId() != null) ? getTeacherDao().findById(((ClassTime) myClass.get(i)).getTeacherId().getId()).getName() +" " 		+getTeacherDao().findById(((ClassTime) myClass.get(i)).getTeacherId().getId()).getFirstName() +" "+ getTeacherDao().findById(((ClassTime) myClass.get(i)).getTeacherId().getId()).getLastName() : "";
            
            room = (((ClassTime) myClass.get(i)).getRoomId() != null)  ?  getRoomDao().findById(((ClassTime) myClass.get(i)).getRoomId().getId()).getName() : ""; 
            
            type = (((ClassTime) myClass.get(i)).getClassTypeID() != null)  ?  getClassTypeDao().findbyId(((ClassTime) myClass.get(i)).getClassTypeID().getId()).getName() :"";
       

            scheduleGroupListVO.add(new ScheduleGroupVO(
                    ((ClassTime) myClass.get(i)).getId(),
                    getSubjectDao().findById(((ClassTime) myClass.get(i)).getSubjectId().getId()).getName() ,
                    tea ,
                    room,
                    getSubjectDao().findById(((ClassTime) myClass.get(i)).getSubjectId().getId()).getAbbreviation(),
                    ((ClassTime) myClass.get(i)).getDay(),
                    ((ClassTime) myClass.get(i)).getTime().getValue(),
                    getGroupDao().findById(((ClassTime) myClass.get(i)).getGroupId().getId()).getName(),
                    getGroupDao().findById(((ClassTime) myClass.get(i)).getGroupId().getId()).getAbbreviation(),
                    (((ClassTime) myClass.get(i)).getRoomId() != null)  ? getRoomDao().findById(((ClassTime) myClass.get(i)).getRoomId().getId()).getAbbreviation() : "",
                    type,
                    getGroupDao().findById(((ClassTime) myClass.get(i)).getGroupId().getId()).getDateBegin1Semester(),
                    getGroupDao().findById(((ClassTime) myClass.get(i)).getGroupId().getId()).getDateBegin2Semester()));
        }
        return scheduleGroupListVO;
    }

    protected List handleGetRoomSchedule(Long roomId, Date date) throws Exception {

        List myClass = new ArrayList(0);


        finf.ucf.cu.domain.Room myroom = getRoomDao().findById(roomId);

        //seteando el dia para el lunes de esa semana
        switch (date.getDay()) {
            case 0: //Domingo
                date.setDate(date.getDate() + 1);
                break;
            case 2: //Martes
                date.setDate(date.getDate() - 1);
                break;
            case 3: //Miercoles
                date.setDate(date.getDate() - 2);
                break;
            case 4: //Jueves
                date.setDate(date.getDate() - 3);
                break;
            case 5: //Viernes
                date.setDate(date.getDate() - 4);
                break;
            case 6: //Sábado
                date.setDate(date.getDate() - 5);
                break;
            default:
                break;
        }
        for (int i = 0; i < 6; i++) {
            myClass.addAll(getClassTimeDao().findByDayAndRoom(date, myroom));
            date.setDate(date.getDate() + 1);
        }


        ArrayList scheduleGroupListVO = new ArrayList(); //ScheduleGroupVO
        String tea, type, room = new String();

        for (int i = 0; i < myClass.size(); i++) {
        	tea = (((ClassTime) myClass.get(i)).getTeacherId() != null) ? getTeacherDao().findById(((ClassTime) myClass.get(i)).getTeacherId().getId()).getName() +" " 		+getTeacherDao().findById(((ClassTime) myClass.get(i)).getTeacherId().getId()).getFirstName() +" "+ getTeacherDao().findById(((ClassTime) myClass.get(i)).getTeacherId().getId()).getLastName() : "";
            
            room = (((ClassTime) myClass.get(i)).getRoomId() != null)  ? room = getRoomDao().findById(((ClassTime) myClass.get(i)).getRoomId().getId()).getName() : ""; 
            	
            type = (((ClassTime) myClass.get(i)).getClassTypeID() != null)  ?  getClassTypeDao().findbyId(((ClassTime) myClass.get(i)).getClassTypeID().getId()).getName() :"";
            
            scheduleGroupListVO.add(new ScheduleGroupVO(
                    ((ClassTime) myClass.get(i)).getId(),
                    getSubjectDao().findById(((ClassTime) myClass.get(i)).getSubjectId().getId()).getName() ,
                    tea ,
                    room,
                    getSubjectDao().findById(((ClassTime) myClass.get(i)).getSubjectId().getId()).getAbbreviation(),
                    ((ClassTime) myClass.get(i)).getDay(),
                    ((ClassTime) myClass.get(i)).getTime().getValue(),
                    getGroupDao().findById(((ClassTime) myClass.get(i)).getGroupId().getId()).getName(),
                    getGroupDao().findById(((ClassTime) myClass.get(i)).getGroupId().getId()).getAbbreviation(),
                    (((ClassTime) myClass.get(i)).getRoomId() != null)  ? getRoomDao().findById(((ClassTime) myClass.get(i)).getRoomId().getId()).getAbbreviation() : "",
                    type,
                    getGroupDao().findById(((ClassTime) myClass.get(i)).getGroupId().getId()).getDateBegin1Semester(),
                    getGroupDao().findById(((ClassTime) myClass.get(i)).getGroupId().getId()).getDateBegin2Semester()));
        }
        /// esto es que se debe retornar un arraglo de value object     

        return scheduleGroupListVO;
    }

    protected List handleGetTeacherSchedule(Long teacherId, Date date) throws Exception {

        


        List myClass = new ArrayList(0);


        finf.ucf.cu.domain.Teacher myTeacher = getTeacherDao().findById(teacherId);

        //seteando el dia para el lunes de esa semana
        switch (date.getDay()) {
            case 0: //Domingo
                date.setDate(date.getDate() + 1);
                break;
            case 2: //Martes
                date.setDate(date.getDate() - 1);
                break;
            case 3: //Miercoles
                date.setDate(date.getDate() - 2);
                break;
            case 4: //Jueves
                date.setDate(date.getDate() - 3);
                break;
            case 5: //Viernes
                date.setDate(date.getDate() - 4);
                break;
            case 6: //Sábado
                date.setDate(date.getDate() - 5);
                break;
            default:
                break;
        }
        for (int i = 0; i < 6; i++) {
            myClass.addAll(getClassTimeDao().findByDayAndTeacher(date, myTeacher));
            date.setDate(date.getDate() + 1);
        }
        date.setDate(date.getDate() + 1);
        
        ArrayList scheduleGroupListVO = new ArrayList(); //ScheduleGroupVO
        String tea, room, type = new String();

        for (int i = 0; i < myClass.size(); i++) {
        	tea = (((ClassTime) myClass.get(i)).getTeacherId() != null) ? getTeacherDao().findById(((ClassTime) myClass.get(i)).getTeacherId().getId()).getName() +" " 		+getTeacherDao().findById(((ClassTime) myClass.get(i)).getTeacherId().getId()).getFirstName() +" "+ getTeacherDao().findById(((ClassTime) myClass.get(i)).getTeacherId().getId()).getLastName() : "";
            
            room = (((ClassTime) myClass.get(i)).getRoomId() != null)  ? room = getRoomDao().findById(((ClassTime) myClass.get(i)).getRoomId().getId()).getName() : ""; 
            	
            type = (((ClassTime) myClass.get(i)).getClassTypeID() != null)  ?  getClassTypeDao().findbyId(((ClassTime) myClass.get(i)).getClassTypeID().getId()).getName() :"";
            
            scheduleGroupListVO.add(new ScheduleGroupVO(
                    ((ClassTime) myClass.get(i)).getId(),
                    getSubjectDao().findById(((ClassTime) myClass.get(i)).getSubjectId().getId()).getName() ,
                    tea, 
                    room,
                    getSubjectDao().findById(((ClassTime) myClass.get(i)).getSubjectId().getId()).getAbbreviation(),
                    ((ClassTime) myClass.get(i)).getDay(),
                    ((ClassTime) myClass.get(i)).getTime().getValue(),
                    getGroupDao().findById(((ClassTime) myClass.get(i)).getGroupId().getId()).getName(),
                    getGroupDao().findById(((ClassTime) myClass.get(i)).getGroupId().getId()).getAbbreviation(),
                    (((ClassTime) myClass.get(i)).getRoomId() != null) ? getRoomDao().findById(((ClassTime) myClass.get(i)).getRoomId().getId()).getAbbreviation() : "",
                    type,
                    getGroupDao().findById(((ClassTime) myClass.get(i)).getGroupId().getId()).getDateBegin1Semester(),
                    getGroupDao().findById(((ClassTime) myClass.get(i)).getGroupId().getId()).getDateBegin2Semester()));
        }

        /// esto es que se debe retornar un arraglo de value object 
        return scheduleGroupListVO;
    }
}