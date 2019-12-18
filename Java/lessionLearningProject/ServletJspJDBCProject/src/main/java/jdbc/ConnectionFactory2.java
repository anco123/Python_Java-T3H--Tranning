package jdbc;

import model.CustomerModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionFactory2 {
        private Connection connection = ConnectionUtils.getSQLConnection();
    public static void getCustomer(CustomerModel customerModel) throws SQLException,ClassNotFoundException {

        String sql = "select * from customers";
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = con
        };
    }
}
