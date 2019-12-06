package javaJdbc;
import java.sql.*;

public class SqlConnect2 {
    public static void main(String[] args) {
        try{
// Buoc 1: Tai lop Driver
            Class.forName("com.mysql.jdbc.Driver");

// Buoc 2: Tao doi tuong Connection
            Connection con =DriverManager.getConnection(
                    "jdbc:mysql://localhost:3310/java_t3hclass?useLegacyDatetimeCode=false&serverTimezone=America/New_York","anco12396","12396");

// sihvien la ten co so du lieu, root la username va mat khau la 123456

// Buoc 3: Tao doi tuong Statement
            Statement stmt = con.createStatement();
// Buoc 4: Thuc thi truy van
            ResultSet rs = stmt.executeQuery("SELECT * FROM student1");

            while(rs.next()) {
//                System.out.println(rs);
//                    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+ rs.getInt(4));
//            System.out.println(rs.getInt("id"));
                String name = rs.getString("name");
                int id = rs.getInt("id");
                System.out.println(name);
                System.out.println(id);
//
//            // Hien thi cac gia tri
//            System.out.print("\nMSSV: " + name);

// Buoc 5: Dong doi tuong Connection
            }if (con != null) {
                    System.out.println("Connected to the database!");
                } else {
                    System.out.println("Failed to make connection!");
                }
            con.close();

        }catch(Exception e){ System.out.println(e);}

    }




    }
