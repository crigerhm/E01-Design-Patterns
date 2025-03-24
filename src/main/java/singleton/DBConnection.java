package singleton;

public class DBConnection {

    private static DBConnection instance;
    private String connectionString;

    private DBConnection(String connectionString) {
        this.connectionString = connectionString;
    }


    public static DBConnection getInstance(String connectionString) {
        if (instance == null) {
            synchronized (DBConnection.class) {
                if (instance == null) {
                    instance = new DBConnection(connectionString);
                }
            }
        }
        return instance;
    }

    public void connect() throws InterruptedException {
        System.out.println("Conectando " + this.connectionString);
        Thread.sleep(1000);
        System.out.println("Conectado!!");
    }
}
