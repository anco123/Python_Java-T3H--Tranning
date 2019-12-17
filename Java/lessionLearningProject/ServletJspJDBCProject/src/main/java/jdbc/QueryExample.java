package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryExample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        Connection connection = ConnectionUtils.getMySQLConnection();
        Statement statement = connection.createStatement();

        String sql = "Select * from  customers";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {



            System.out.println(resultSet.getString("customerName"));
            System.out.println(resultSet.getString("contactFirstName"));
            System.out.println();
        }
        connection.close();
    }
}
