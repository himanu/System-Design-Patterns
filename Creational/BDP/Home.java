package Creational.BDP;

public class Home {
    private int rooms;
    private int windows;
    private int floors;

    public void addRooms(int rooms) {
        this.rooms = rooms;
    }
    public void addWindows(int windows) {
        this.windows = windows;
    }
    public void addFloors(int floors) {
        this.floors = floors;
    }
    public void getHomeDetail() {
        System.out.println("Home has " + rooms + " rooms, " + floors + " floors and " + windows + " windows."); 
    }
}
