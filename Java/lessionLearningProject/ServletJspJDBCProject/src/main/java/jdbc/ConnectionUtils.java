package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
    public static Connection getMySQLConnection() throws SQLException, ClassNotFoundException {
//        String dbDriver = "org.mariadb.jdbc.Driver";
        String dbUrl = "jdbc:mysql://localhost:3311/dataachung";
        String userName = "root";
        String password = "root";
        return getMySQLConnection(dbUrl,userName,password);

    }

    public static Connection getMySQLConnection(String dbUrl, String userName, String password) throws SQLException,ClassNotFoundException {
        Connection conn = DriverManager.getConnection(dbUrl, userName, password);

        return conn;
    }


}
