package Creational.Singleton;

public class App {
    public static void main(String[] args) {
        database dbObj = database.getDataBaseObject();
        dbObj.runQuery("Select * from users");
    }
}
