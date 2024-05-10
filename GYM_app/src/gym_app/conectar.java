
package gym_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author jpala
 */
public class conectar {
    public static final String URL = "jdbc:mysql://localhost:3306/gym";
    
    public static final String USER = "root";
    public static final String CLAVE = "";
    
     public Connection getConexion(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
            System.out.println("Se logro COnexion");
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
       return con;
     }
     public PreparedStatement prepareStatement(String sql) throws SQLException {
        Connection con = getConexion();
        PreparedStatement ps = con.prepareStatement(sql);
        return ps;
    }
     
     
}
