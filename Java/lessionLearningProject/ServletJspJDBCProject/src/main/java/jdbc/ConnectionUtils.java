package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
    private static String dbUrl = "jdbc:mysql://localhost:3311/dataachung";
    private static String userName = "root";
    private static String password = "root";
    private static String dbDriver = "org.mariadb.jdbc.Driver";
    private static Connection connection;


    public static Connection getMySQLConnection() throws SQLException, ClassNotFoundException {
//        String ";
//        Class.forName(dbDriver);

        Connection connection = DriverManager.getConnection(dbUrl, userName, password);

        return connection;
    }
    public static Connection getSQLConnection() {
        try {

            if (connection == null || connection.isClosed())
            {


                Class.forName(dbDriver);
                connection = DriverManager.getConnection(dbUrl,userName,password);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
//        LOGGER.info(dbConfig.toString());

        return connection;
    }




}
