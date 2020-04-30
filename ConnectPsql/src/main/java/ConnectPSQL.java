import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class ConnectPSQL {
   /* public static void main(String[] args) throws SQLException, ClassNotFoundException {
    connect();
    data();
    }*/
    public static Properties readProperties() throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = new FileInputStream("C:\\Users\\easha\\OneDrive\\Desktop\\NewJavaProject\\ConnectPsql\\src\\main\\resources\\app.properties");
        properties.load(inputStream);
        inputStream.close();
        return properties;
    }

    public static Connection connect() throws ClassNotFoundException, SQLException, IOException {
       Properties properties = readProperties();
        String userName = properties.getProperty("userName");
        String password = properties.getProperty("password");

        String url = properties.getProperty("url");
        //Psql Driver
        Class.forName("org.postgresql.Driver");
        //Establishing Connection
        Connection connection = DriverManager.getConnection(url, userName,password);
        System.out.println("Connected");
        return connection;
    }
    //Hardcoding connecting to DB
   /* public static Connection connect() throws ClassNotFoundException, SQLException {
        String userName = "postgres";
        String password = "root";

        String url = "jdbc:postgresql://localhost:5432/dvdrental";
        //Psql Driver
        Class.forName("org.postgresql.Driver");
        //Establishing Connection
        Connection connection = DriverManager.getConnection(url, userName,password);
        System.out.println("Connected");
        return connection;
    }*/
  }
