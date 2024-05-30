
package gym_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteCarmenDAO implements CRUD {
   Connection con;  
  conectar cn=new conectar();
  PreparedStatement ps;
  ResultSet rs;

  public clienteCarmen listarID(String idc){
      clienteCarmen  c=new clienteCarmen();
  String sql="select * from cliente where id_cliente=?";    
      try {
        con=cn.getConexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, idc);
            rs=ps.executeQuery(); 
            while(rs.next()){
             c.setIdc(rs.getString(1));
               c.setNom(rs.getString(3));
               c.setApellidoP(rs.getString(4));
              c.setApellidoM(rs.getString(5));
           
            }
      } catch (SQLException e) {
      }
      return c;
  }
  
  
  
  
    @Override
    public List listar() {
        List<clienteCarmen> lista=new ArrayList<>();
        String sql="select * from cliente";
        try {
            con=cn.getConexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
               clienteCarmen  c=new clienteCarmen();
               c.setIdc(rs.getString(1));
               c.setNom(rs.getString(3));
               c.setApellidoP(rs.getString(4));
              c.setApellidoM(rs.getString(5));
              lista.add(c);
            }
        } catch (SQLException e) {
        }
        return lista;
    }

    

}

