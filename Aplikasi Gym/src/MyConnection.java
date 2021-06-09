import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

/**
 *
 * @author asus
 */
public class MyConnection {
    
    public static Connection getConnection(){
        
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_gym","root","");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return con;
    }
}

    

        
    
