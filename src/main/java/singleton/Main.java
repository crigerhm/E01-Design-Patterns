public class Main {
    public static void main(String[] args) throws InterruptedException {
        DBConnection connection1 = DBConnection.getInstance("jdbc:mysql://localhost:3306/mydb");
        connection1.connect();

        DBConnection connection2 = DBConnection.getInstance("jdbc:mysql://localhost:3306/mydb");

        System.out.println(connection1 == connection2);
    }
}
