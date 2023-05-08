package EagerLoading;

// this is not preferred since it will slow down the class load time
// if the value should be initialized based on some env arg -> then it wont be possible here
public class DatabaseConnection {

    private static DatabaseConnection dbConn = new DatabaseConnection();

    private DatabaseConnection() {
    }

    public static DatabaseConnection getInsDatabaseConnection() {
        return dbConn;
    }

}
