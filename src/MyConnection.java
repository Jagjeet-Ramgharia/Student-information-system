
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MyConnection {
     
        
        public static Connection getConnection(){
                
            Connection con = null;
            
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/stdmgdb","root","");
                        
                        
                        } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
                    
                    
        return con;
    }
}
