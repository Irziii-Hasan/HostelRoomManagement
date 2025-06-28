package HotelRoomManagement;

public class Room {
    private int roomNumber;
    private int capacity;
    private int roomCapacityLimit = 2;

    public Room(int roomNumber, int capacity) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
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

    public int getRoomCapacityLimit() {
        return roomCapacityLimit;
    }

    public void setRoomCapacityLimit(int roomCapacityLimit) {
        this.roomCapacityLimit = roomCapacityLimit;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", capacity=" + capacity +
                '}';
    }
}
