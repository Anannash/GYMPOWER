
package gym_app;

import gym_app.conectar;
import gym_app.productos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ProductoDAO {
 int r;
 PreparedStatement ps;
 ResultSet rs;
 Connection con;
 conectar acceso=new conectar();
 productos pro=new productos();
 public int actualizarstock(int cant,int idp){
   String sql="update  producto set stock=? where id_producto=?";      
     try {
      con=acceso.getConexion();
            ps=con.prepareStatement(sql);
              ps.setInt(1, cant);
              ps.setInt(2, idp);
            ps.executeUpdate();    
     } catch (Exception e) {
     }
     
    return r; 
     
     
     
     
 }
              
 public productos listarID(int id){
      productos  p=new productos();
  String sql="select * from producto where id_producto=?";    
      try {
        con=acceso.getConexion();
            ps=con.prepareStatement(sql);
              ps.setInt(1, id);
            rs=ps.executeQuery(); 
            if(rs.next()){
             p.setID(rs.getInt(1));
             p.setNombres(rs.getString(2));
             p.setPrecio(rs.getDouble(3));
             p.setStock(rs.getInt(4));
            }else {
                JOptionPane.showMessageDialog(null, "No se pudo encontrar el Producto");
            }
      } catch (SQLException e) {
      }
      return p;
  }
  
}
