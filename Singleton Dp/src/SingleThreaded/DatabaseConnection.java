package SingleThreaded;

public class DatabaseConnection {

    private static DatabaseConnection dbConn = null;

    private DatabaseConnection() {
    }

    public static DatabaseConnection getInsDatabaseConnection() {
        if (dbConn != null)
            dbConn = new DatabaseConnection();
        return dbConn;
    }

}
