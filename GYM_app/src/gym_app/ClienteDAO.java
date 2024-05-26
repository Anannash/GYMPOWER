package gym_app;

import gym_app.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO implements CRUD {
  Connection con;  
  conectar cn=new conectar();
  PreparedStatement ps;
  ResultSet rs;

  public Cliente listarID(String idc){
      Cliente  c=new Cliente();
  String sql="select * from cliente where id_cliente=?";    
      try {
        con=cn.getConexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, idc);
            rs=ps.executeQuery(); 
            while(rs.next()){
             c.setIdc(rs.getString(1));
               c.setNom(rs.getString(2));
               c.setApellidoP(rs.getString(3));
              c.setApellidoM(rs.getString(4));
           
            }
      } catch (SQLException e) {
          System.out.println(e.getMessage());
      }
      return c;
  }
  
  
  
  
    @Override
    public List listar() {
        List<Cliente> lista=new ArrayList<>();
        String sql="select * from cliente";
        try {
            con=cn.getConexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
               Cliente  c=new Cliente();
               c.setIdc(rs.getString(1));
               c.setMem(rs.getString(2));
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
