package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class closeAll {
    private static final Logger LOGGER = Logger.getLogger(closeAll.class.getName());

    public static void closeStatement(Statement stm){
        try {
            stm.close();
        } catch (SQLException e) {
            e.printStackTrace();
            LOGGER.log(Level.SEVERE,"ERROR" + e.getMessage());
        }
    }

    public static void closeResultSet(ResultSet rs){
        try {
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
            LOGGER.log(Level.SEVERE,"ERROR" + e.getMessage());
        }
    }
    public static void closeConnection(Connection connection){
        try {
            if (connection !=null|| !connection.isClosed()){
                connection.close();
                connection = null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            LOGGER.log(Level.SEVERE,"ERROR" + e.getMessage());
        }
    }


}
