
package javalabtest;
import java.sql.*;

public class JavaLabTest {
    public static void main(String args[]) {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "Wafijailani84278");            
             if(con!=null){
             System.out.println ("Connected");    
             }
        } catch (Exception e) {
            System.out.println("Fail");
        }
    }
}
