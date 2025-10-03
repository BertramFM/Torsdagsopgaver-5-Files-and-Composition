package Task3;
import java.util.ArrayList;

public class Building {
    private ArrayList<Room> rooms = new ArrayList<>();
    private int numberOfFloors;


    public Building(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public void addRoom(Room room){
        rooms.add(room);
    }

    public int countRooms (){
        return getRooms().size();
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public int countLamps(Building building){
        int total = 0;
        for(Room r: building.getRooms()){
            total += r.getNumberOfLamps();
        }
        return total;
    }

    public int countWindows(Building building){
        int total = 0;
        for (Room r : building.getRooms()){
            total += r.getNumberOfWindows();
        }
        return total;
    }

}
