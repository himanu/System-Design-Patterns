package Creational.BDP;

public class Builder {
    private Home homeObj;
    public Builder() {
        this.homeObj = new Home();
    }
    void addWindow() {
        this.homeObj.addWindows(10);
    }
    void addFloors() {
        this.homeObj.addFloors(2);
    }
    void addRooms() {
        this.homeObj.addRooms(1);
    }
    Home getHome() {
        return this.homeObj;
    }
}
