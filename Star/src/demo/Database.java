package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.PreparedStatement;
 
public class Database {
    public static void main(String[] args) {
 
        // creates three different Connection objects
        Connection conn1 = null;
       
        try {
            // connect way #1
            String url1 = "jdbc:mysql://localhost:3306/test";
            String user = "root";
            String password = "root";
 
            conn1 = DriverManager.getConnection(url1, user, password);
            if (conn1 != null) {
               
                java.sql.PreparedStatement ps = conn1.prepareStatement("delete from asd where srno= '6'");
                ps.executeUpdate();
                System.out.println("Done Succesfully");
            }
 

        } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        }
    }
}