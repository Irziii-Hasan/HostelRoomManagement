package HotelRoomManagement;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Room {
    private int roomNumber;
    private int capacity;
    List<Integer> allocatedStudentIdList = new ArrayList<>();

    public Room(int roomNumber, int capacity) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
    }

    public boolean AllocateStudent(int studentId){
        if (capacity==allocatedStudentIdList.size()){
            return false;
        }else {
            setAllocatedStudentIdList(studentId);
            return true;
        }
    }

    private void setAllocatedStudentIdList(int studentId){
        allocatedStudentIdList.add(studentId);
    }

    public List<Integer> getAllocatedStudentIdList() {
        return allocatedStudentIdList;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", capacity=" + capacity +
                '}';
    }
}
