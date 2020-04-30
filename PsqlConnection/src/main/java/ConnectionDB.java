import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionDB {

    public static Properties getProp() throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = new FileInputStream("C:\\Users\\easha\\OneDrive\\Desktop\\NewJavaProject\\PsqlConnection\\src\\main\\resources\\app.properties");
        properties.load(inputStream);
        inputStream.close();
        return properties;
    }


    public static Connection connect() throws SQLException, ClassNotFoundException, IOException {

        Properties properties = getProp();
        String userName = properties.getProperty("user");
        String password = properties.getProperty("pw");
        String url = properties.getProperty("url");

        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(url, userName, password);
        System.out.println("Connected to Database");
        return connection;



    }
}