import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetData {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
        data();
    }


    public static void data() throws SQLException, ClassNotFoundException, IOException {

            String query = "select * from actor";
            Statement statement = ConnectPSQL.connect().createStatement();
            //Execute Query
            ResultSet resultSet = statement.executeQuery(query);
            resultSet.next();
            String id = resultSet.getString("first_name");
             System.out.println(id);

    }
}
