package querysource;

import jdbc.ConnectionUtils;
import jdbc.closeAll;
import model.CustomerModel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ExcuteQueryGetList implements CustomersService{
    public Connection connection = ConnectionUtils.getSQLConnection();

//    public Connection getConnection() {
//        return connection;
//    }
//
//    public void setConnection(Connection connection) {
//        this.connection = connection;
//    }

    @Override
    public List<CustomerModel> listCustomers() {
        List<CustomerModel> listCustommers = new ArrayList<>();
        ResultSet rs = null;
        Statement stm = null;
        try {
            String sql = "select * from customers";
            stm = connection.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()){
                int id = rs.getInt(1);
                String customerName = rs.getString("custommerName");
                String contactLastName = rs.getString("contactLastName");
                int phone = rs.getInt("phone");
                String city = rs.getString("city");

                CustomerModel addCustomers = new CustomerModel(id,customerName,contactLastName,phone,city);
                listCustommers.add(addCustomers);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll.closeConnection(connection);
            closeAll.closeStatement(stm);
            closeAll.closeResultSet(rs);

        }
    return listCustommers;
    }

    public static void main(String[] args) {
        System.out.println();
    }

//
//    public int id;
//    public String customerName;
//    public String contactLastName;
//    public int phone;
//    public String city;
//

//    public List<CustomerModel> listCustomers(){
//
//    }



}
