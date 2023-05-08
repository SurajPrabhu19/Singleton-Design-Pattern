package DoubleCheckLock;

public class DatabaseConnection {

    private static DatabaseConnection dbConn = null;

    private DatabaseConnection() {
    }

    public static DatabaseConnection getInsDatabaseConnection() {
        if (dbConn == null) {
            synchronized (DatabaseConnection.class) {
                if (dbConn == null) {
                    dbConn = new DatabaseConnection();
                }
            }
        }
        return dbConn;
    }

}
