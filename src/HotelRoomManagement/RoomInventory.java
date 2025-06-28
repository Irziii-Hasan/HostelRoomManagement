package HotelRoomManagement;
import java.util.ArrayList;
import java.util.List;

public class RoomInventory {
    List<Room> roomList = new ArrayList<>();

    public void addRoom(int roomNum, int capacity){
        roomList.add(new Room(roomNum, capacity));
    }
}
