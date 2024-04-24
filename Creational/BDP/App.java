package Creational.BDP;

public class App {
    public static void main(String args[]) {
        Builder b = new Builder();
        b.addFloors();
        b.addRooms();
        Home home = b.getHome();
        home.getHomeDetail();
    }
}
