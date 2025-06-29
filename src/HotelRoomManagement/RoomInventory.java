package HotelRoomManagement;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RoomInventory {
    List<Room> roomList = new ArrayList<>();

    public void addRoom(int roomNum, int capacity){
        roomList.add(new Room(roomNum, capacity));
    }

    private boolean isStudentEligible(Student student){
        if(Objects.equals(student.getStatus(), "Not Allocated")) {
            if(student.getSemester()<=4){
                return true;
            }
        }
        return false;
    }

    public boolean allocateStudent(Student student){
        if (isStudentEligible(student)){
            for (Room room : roomList){
                if (room.getCapacity()>room.allocatedStudentIdList.size()){
                    room.allocatedStudentIdList.add(student.getStudentId());
                    return true;
                }
            }
        }
        return false;
    }

    public boolean vacateStudent(int studentId){
        for (Room room : roomList){
            for (int list: room.allocatedStudentIdList){
                if (list==studentId){
                    room.allocatedStudentIdList.remove(list);
                    return true;
                }
            }
        }
        return false;
    }
}
