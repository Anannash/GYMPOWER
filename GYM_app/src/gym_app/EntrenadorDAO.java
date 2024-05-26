
package gym_app;

import gym_app.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EntrenadorDAO {
 Connection con;  
  conectar cn=new conectar();
  PreparedStatement ps;
  ResultSet rs;
  
  
 public Entrenador listarID(String IdE){
     Entrenador  c=new Entrenador();
  String sql="select * from empleado where id_Empleado =?";    
      try {
        con=cn.getConexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, IdE);
            rs=ps.executeQuery(); 
            while(rs.next()){
             c.setIdE(rs.getString(1));
               c.setNombreE(rs.getString(2));
               c.setApellidoPE(rs.getString(3));
              c.setApellidoME(rs.getString(4));
           
            }
      } catch (SQLException e) {
      }
      return c;
 }
}
