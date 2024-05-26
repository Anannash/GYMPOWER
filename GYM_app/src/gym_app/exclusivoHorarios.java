/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym_app;

import com.mysql.cj.jdbc.CallableStatement;
import gym_app.conectar;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ANDY
 */
public class exclusivoHorarios {

    public exclusivoHorarios() {
    }
    
    //Esto es de KAREN
    
     
        
        public String leerBD (String clave){
            
                     
            String consulta = "SELECT nombreE,apellidoPE,apellidoME,CelularE,fechaCumple,id_Horario FROM Empleado WHERE id_Empleado = '"+clave+"'";     
            String datos_e="";
            conectar ObjetoConexion = new conectar();
        try {
        // Crear la sentencia SQL
        java.sql.Statement stmt = ObjetoConexion.getConexion().createStatement();
        
        // Ejecutar la consulta y obtener el resultado
        ResultSet rs = stmt.executeQuery(consulta);
        
        // Si se encontraron resultados, obtener el máximo número de cliente
        if (rs.next()) {
            datos_e ="Nombre: "+ rs.getString("nombreE")+" ";
            datos_e =datos_e + rs.getString("apellidoPE")+" ";
            datos_e =datos_e + rs.getString("apellidoME")+"\n";
            datos_e= datos_e+ "Celular: "+ rs.getString("celularE")+"\n";
            datos_e= datos_e+ "Fecha de nacimiento: "+ rs.getDate("fechaCumple")+"\n";
             datos_e= datos_e+ "Clave de horario: "+ rs.getString("id_Horario");
        }
        
        // Cerrar el ResultSet, el Statement y la conexión
        rs.close();
        stmt.close();
        ObjetoConexion.getConexion().close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: "+e.toString());
    }
            
         return datos_e;
}
     public String leerHBD (String clave){
            
                     
            String consulta = "SELECT horas,dias FROM gestion_horarios WHERE id_Horario = '"+clave+"'";     
            String datos_e="";
            conectar ObjetoConexion = new conectar();
        try {
        // Crear la sentencia SQL
        java.sql.Statement stmt = ObjetoConexion.getConexion().createStatement();
        
        // Ejecutar la consulta y obtener el resultado
        ResultSet rs = stmt.executeQuery(consulta);
        
        // Si se encontraron resultados, obtener el máximo número de cliente
        if (rs.next()) {
            datos_e ="Horario: "+ rs.getString("horas")+"\n";
            datos_e= datos_e+ "Dias: "+ rs.getString("dias");
               
        }
        
        // Cerrar el ResultSet, el Statement y la conexión
        rs.close();
        stmt.close();
        ObjetoConexion.getConexion().close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: "+e.toString());
    }
            
         return datos_e;
}
     
 
 public void RegistrarHorario(String clavhorario, String clave) {

        conectar ObjetoConexion = new conectar();

        String Alta = "update Empleado set id_Horario = "+clavhorario+ " where id_Empleado = '"+clave+"'";

        try {
        

           // CallableStatement cs = (CallableStatement) ObjetoConexion.getConexion().prepareCall(Alta);
            //cs.execute();
                 java.sql.Statement stmt = ObjetoConexion.getConexion().createStatement();              
        
       
                 stmt.executeUpdate(Alta);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }     
     
    

public String VerificarCl(String clave){
            
                     
            String consulta = "SELECT id_Horario FROM Empleado WHERE id_Empleado = '"+clave+"'";     
            String datos_e="";
            conectar ObjetoConexion = new conectar();
        try {
        // Crear la sentencia SQL
        java.sql.Statement stmt = ObjetoConexion.getConexion().createStatement();
        
        // Ejecutar la consulta y obtener el resultado
        ResultSet rs = stmt.executeQuery(consulta);
        
        // Si se encontraron resultados, obtener el máximo número de cliente
        if (rs.next()) {
            datos_e = rs.getString("id_Horario");
        }
        
        // Cerrar el ResultSet, el Statement y la conexión
        rs.close();
        stmt.close();
        ObjetoConexion.getConexion().close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: "+e.toString());
    }
            
         return datos_e;
} 

public String VerClaveexistente(String clave){
            
                     
            String consulta = "SELECT id_Horario FROM Empleado WHERE id_Empleado = '"+clave+"'";     
            String datos_e="";
            conectar ObjetoConexion = new conectar();
        try {
        // Crear la sentencia SQL
        java.sql.Statement stmt = ObjetoConexion.getConexion().createStatement();
        
        // Ejecutar la consulta y obtener el resultado
        ResultSet rs = stmt.executeQuery(consulta);
        
        // Si se encontraron resultados, obtener el máximo número de cliente
        if (rs.next()) {
            datos_e = rs.getString("id_Horario");
        }
        
        // Cerrar el ResultSet, el Statement y la conexión
        rs.close();
        stmt.close();
        ObjetoConexion.getConexion().close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: "+e.toString());
    }
            
         return datos_e;
} 

public String ClavesDisp(){
            
                     
            String consulta = "SELECT * FROM gestion_horarios";     
            String datos_e="";
            conectar ObjetoConexion = new conectar();
        try {
        // Crear la sentencia SQL
        java.sql.Statement stmt = ObjetoConexion.getConexion().createStatement();
        
        // Ejecutar la consulta y obtener el resultado
        ResultSet rs = stmt.executeQuery(consulta);
        
        // Si se encontraron resultados, obtener el máximo número de cliente
        while (rs.next()) {
            datos_e = datos_e +"Clave: "+ rs.getString("id_Horario")+" - Detalles: "+rs.getString("horas")+" "+rs.getString("dias")+"\n";
        }
        
        // Cerrar el ResultSet, el Statement y la conexión
        rs.close();
        stmt.close();
        ObjetoConexion.getConexion().close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: "+e.toString());
    }
            
         return datos_e;
}

}
