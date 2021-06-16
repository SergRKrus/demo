import javax.swing.*;
import java.sql.*;

public class ConnectDB {
    ///подключение к серверу
    public static void connectDB() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Pi314");
        Statement stmt = connection.createStatement();
        ResultSet result = stmt.executeQuery("SELECT * FROM test.test_table");

        if (!connection.isClosed()){
            System.out.println("Подключение успешно создано");
            Login.login();
        while (result.next()) {
            System.out.println(result.getString(2));
        }
    }
    }



}
