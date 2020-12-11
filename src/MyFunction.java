
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MyFunction {
    
        public static int countData(String jTable1)
        {
            
            Connection con = MyConnection.getConnection();
            Statement st;
            try {
                st = con.createStatement();
                 ResultSet rs = st.executeQuery("SELECT COUNT(*) AS 'total' FROM "+ jTable1);
            } catch (SQLException ex) {
                Logger.getLogger(MyFunction.class.getName()).log(Level.SEVERE, null, ex);
            }
            int total=0;
           
            
            
            return total;
        }
        
        
   
    
    
    
}
