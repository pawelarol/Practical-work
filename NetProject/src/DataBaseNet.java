import java.sql.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class DataBaseNet {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String login = "PavelArol";
        String password = "Soap_orel1998";

        String createTableQuery = "Create Table Net("
                + "Net,"
                + "Bus";
        try{
            Connection connectionDatabase = DriverManager.getConnection(url,login,password);
            Statement statement = connectionDatabase.createStatement();
            statement.executeUpdate(createTableQuery);
            System.out.println("Table created successfully");
            statement.close();
            connectionDatabase.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

}
