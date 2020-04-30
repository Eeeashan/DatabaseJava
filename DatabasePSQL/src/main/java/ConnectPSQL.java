import java.sql.*;

public class ConnectPSQL {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
connectDB();

    }
    public static Connection connectDB() throws ClassNotFoundException, SQLException {
        String user = "postgres";
        String pw = "root";

        //need api - Database Url to connect to database
        String url = "jdbc:postgresql://localhost:5432/dvdrental";

        //Driver for connection
        Class.forName("org.postgresql.Driver");
        //Making connection with database
        Connection connection = DriverManager.getConnection(url,user,pw);
        System.out.println("Connected to Database");
        return connection;
    }
    public static void getData() throws SQLException, ClassNotFoundException {
        String query = "Select * from actor";
        //Statement for EXECUTING THE QUERY
        Statement statement = connectDB().createStatement();
        statement.executeQuery(query);
        //Storing the Query in a resultSet
        ResultSet resultSet = statement.executeQuery(query);
        //Using Next method to push the pointer to next field
        resultSet.next();
        String id = resultSet.getString("first_name");
        System.out.println(id);
    }
}
