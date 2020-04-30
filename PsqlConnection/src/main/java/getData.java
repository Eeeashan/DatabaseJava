import java.io.IOException;
import java.sql.*;

public class getData {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
        getInfo();
    }


    public static void getInfo() throws SQLException, ClassNotFoundException, IOException {
        String query = "Select * from actor";

        Statement statement = ConnectionDB.connect().createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        resultSet.next();

        while(resultSet.next()) {
           String last_name = resultSet.getString("last_name");
           String first_name = resultSet.getString("first_name");
           System.out.println(last_name + " " + first_name);


        }
        
    }
}
