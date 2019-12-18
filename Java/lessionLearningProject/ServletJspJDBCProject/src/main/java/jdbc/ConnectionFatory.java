//package jdbc;
//
//import model.CustomerModel;
//
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class ConnectionFatory {
//    private static String customerNamePrepare;
//    private static String contactLastName;
//    private static String phonePrepare;
//    private static String cityPrepare;
//    private static Connection connection;
//
//    {
//        try {
//            connection = ConnectionUtils.getMySQLConnection();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void getCustommer() throws SQLException, ClassNotFoundException {
//        String sql = "Select * from custommers";
//        Statement statement = connection.createStatement();
//        ResultSet resultSet = statement.executeQuery(sql);
//        while (resultSet.next()){
//            customerNamePrepare = resultSet.getString("customerName ");
//            customerNamePrepare = resultSet.getString("contactLastName ");
//            phonePrepare = resultSet.getString("phone");
//            cityPrepare = resultSet.getString("city ");
//            System.out.println(customerNamePrepare + phonePrepare);
//
//        }
//        connection.close();
//
//
//
//    }
//
//    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        getCustommer();
//    }
//
//}
