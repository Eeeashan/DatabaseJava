import java.sql.*;

public class Prac {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
demoConnect();
    }
    public static void demoConnect() throws ClassNotFoundException, SQLException {
        String user = "postgres";
        String pw = "root";
        String url = "jdbc:postgresql://localhost/dvdrental";
        String query = "Select * from actor";

        Class.forName("org.postgresql.Driver");

        Connection connection = DriverManager.getConnection(url,user,pw);
        System.out.println("Connected to DB");
        Statement statement = connection.createStatement();
        ResultSet resultSet =statement.executeQuery(query);
        resultSet.next();
        String idf = resultSet.getString("last_name");
        String idl= resultSet.getString("first_name");
        System.out.println(idf + " "+ idl);
    }
}
