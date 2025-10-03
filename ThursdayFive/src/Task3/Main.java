package Task3;

public class Main {

    public static void main(String[] args){

        Room room1 = new Room(2, 3);
        Room room2 = new Room(5,1);
        Room room3 = new Room(1,2);

        Building building = new Building( 3);
        building.addRoom(room1);
        building.addRoom(room2);
        building.addRoom(room3);

        System.out.println("Total lamps: " + building.countLamps(building));
        System.out.println("Total windows: " + building.countWindows(building));
        System.out.println("Total rooms: " + building.countRooms());

        Building weirdBuilding = new Building( 10);
        System.out.println("Is building normal? " + isNormal(building));
        System.out.println("Is building normal? " + isNormal(weirdBuilding));
    }

    public static boolean isNormal(Building building){
        return building.getNumberOfFloors() <= building.getRooms().size();
    }
}