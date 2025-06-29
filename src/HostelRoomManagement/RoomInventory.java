package HostelRoomManagement;
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
                    student.setStatus("Allocated");
                    return true;
                }
            }
        }
        return false;
    }

    public boolean vacateStudent(Student student){
        for (Room room : roomList){
            for (int list: room.allocatedStudentIdList){
                if (list==student.getStudentId()){
                    room.allocatedStudentIdList.remove(list);
                    student.setStatus("Not Allocated");
                    return true;
                }
            }
        }
        return false;
    }

    public void showRoomInfo(){
        for( Room room : roomList){
            System.out.println(room.toString());
        }
    }
}
