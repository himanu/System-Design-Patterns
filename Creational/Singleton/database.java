package Creational.Singleton;

public class database {
    private static database databaseObj;

    /** Mark the constructor as private */
    private database() {

    }

    /** instance creation method */
    static database getDataBaseObject() {
        if (databaseObj == null) {
            databaseObj = new database();
        } 
        return databaseObj;
    }

    /** each singleton class should have some buisness logic */
    void runQuery(String sqlString) {
        System.out.println("Running sql query " + sqlString);
    }
}
