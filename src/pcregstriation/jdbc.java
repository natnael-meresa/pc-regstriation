
package pcregstriation;
import java.sql.*;
public class jdbc extends main {
    Statement s1;
    jdbc(){
        
         
        try{
            String un ="root";
            String pw ="namemeresa123.";
            String url = "jdbc:mysql://localhost:3306/Pc_Registration";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection(url,un,pw);
            s1 = c.createStatement();     
        }
        
        catch(Exception E){
          System.out.println(E);
        }
    }

   
    
}
