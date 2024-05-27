
package gym_app;

import gym_app.DetalleVentas;
import gym_app.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class VentasDAO {
   conectar cn=new conectar();
   Connection con;
   PreparedStatement ps;
  ResultSet rs;
  int r=0;
  
  public String NoVentas(){
      String serie="";
      String sql="select  NumeroSerie from ventas";
      try {
      con=cn.getConexion();
            ps=con.prepareStatement(sql); 
            rs=ps.executeQuery();
            while(rs.next()){
                serie=rs.getString(1);
            }
      } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "Error: " + e.toString());
      }
      return serie;
  }
  public String IdVentas(){
     String idv="";
      String sql="select IdVentas from ventas";    
      try {
        con=cn.getConexion();
            ps=con.prepareStatement(sql);
           // ps.setString(1, idc);
            rs=ps.executeQuery(); 
            while(rs.next()){
            idv=rs.getString(1);
          
            }
      } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "Error: " + e.toString());
      }
      return idv;
  }
  public int GuardarVentas(Ventas v){
    Ventas ventas=new Ventas();
    String sql="insert into ventas(IdCliente,NumeroSerie,FechaVentas,Monto,Estado) values(?,?,?,?,?)";
      try {
        con=cn.getConexion();
        ps=con.prepareStatement(sql);
        ps.setString(1, v.getIdCliente());
        ps.setString(2, v.getSerie());
        ps.setString(3, v.getFecha());
        ps.setDouble(4, v.getMonto());
        ps.setString(5, v.getEstado());
        r=ps.executeUpdate();
      
      } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Error: " + e.toString());
      }
    return r;
  }
  public int GuardarDetalleV(DetalleVentas dv){
      
      String sql="insert into detalle_ventas(IdVentas,IdProducto,Cantidad,PrecioVenta) values(?,?,?,?)";
      try {
        con=cn.getConexion();
        
        ps=con.prepareStatement(sql);
        ps.setInt(1, dv.getIdVentas());
        ps.setInt(2, dv.getIdProducto());
        ps.setInt(3, dv.getCantidad());
        ps.setDouble(4, dv.getPrecioVenta());
     
        r=ps.executeUpdate();  
      } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Error: " + e.toString());
      }
      return r;
  }
}
