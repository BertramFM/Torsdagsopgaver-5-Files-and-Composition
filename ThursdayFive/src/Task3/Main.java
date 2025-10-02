package Task3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList<Room> rooms = new ArrayList<>();

        Room room1 = new Room(2, 3);
        Room room2 = new Room(5,1);
        Room room3 = new Room(1,2);
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Building building = new Building(rooms, 3);

        System.out.println("Total lamps: " + countLampsInBuilding(building));
        System.out.println("Total windows: " + countWindowsInBuilding(building));
        System.out.println("Total rooms: " + countRoomsInBuilding(building));

        System.out.println("Is building normal? " + isNormal(building));

        Building weirdBuilding = new Building(rooms, 10);
        System.out.println("Is building normal? " + isNormal(weirdBuilding));
    }

    public static int countLampsInBuilding(Building building){
        int total = 0;
        for(Room r: building.getRooms()){
            total += r.getNumberOfLamps();
        }
        return total;
    }

    public static int countWindowsInBuilding(Building building){
        int total = 0;
        for (Room r : building.getRooms()){
            total += r.getNumberOfWindows();
        }
        return total;
    }

    public static int countRoomsInBuilding (Building building){
        return building.getRooms().size();
    }

    public static boolean isNormal(Building building){
        return building.getNumberOfFloors() <= building.getRooms().size();
    }

}
