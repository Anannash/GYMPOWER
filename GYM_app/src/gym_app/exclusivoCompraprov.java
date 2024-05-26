
package gym_app;

import gym_app.conectar;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author mazuk
 */
public class exclusivoCompraprov {
    public exclusivoCompraprov() {  
}
    
    public String BuscarPArticulo(String articulo){
            
                     
            String consulta = "SELECT nombrePro, precioPro, tipoPro, id_producto FROM producto WHERE nombrePro LIKE '%"+articulo+"%';";     
            String datos_e="";
            conectar ObjetoConexion = new conectar();
        try {
        // Crear la sentencia SQL
        java.sql.Statement stmt = ObjetoConexion.getConexion().createStatement();
        
        // Ejecutar la consulta y obtener el resultado
        ResultSet rs = stmt.executeQuery(consulta);
        
        // Si se encontraron resultados, obtener el máximo número de cliente
        while (rs.next()) {
            datos_e = datos_e + rs.getString("nombrePro")+" -  "+rs.getString("precioPro")+"$             Tipo Producto: "+rs.getString("tipoPro")+"            Clave producto: "+rs.getString("id_producto")+"\n";
        }
        
        // Cerrar el ResultSet, el Statement y la conexión
        rs.close();
        stmt.close();
        ObjetoConexion.getConexion().close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: "+e.toString());
    }
         if(datos_e.equals("")){
             datos_e = "No se han encontrado productos relacionados";
         }   
         return datos_e;
}
    
    public String Proveedores(){
            
                     
            String consulta = "SELECT * FROM proveedor;";     
            String datos_e="";
            conectar ObjetoConexion = new conectar();
        try {
        // Crear la sentencia SQL
        java.sql.Statement stmt = ObjetoConexion.getConexion().createStatement();
        
        // Ejecutar la consulta y obtener el resultado
        ResultSet rs = stmt.executeQuery(consulta);
        
        // Si se encontraron resultados, obtener el máximo número de cliente
        while (rs.next()) {
            datos_e = datos_e +"Clave de proveedor: " +rs.getString("id_prov")+"        "+ rs.getString("nombreProv")+"        "+rs.getString("correoProv")+"      "+rs.getString("celularProv")+"\n";
        }
        
        // Cerrar el ResultSet, el Statement y la conexión
        rs.close();
        stmt.close();
        ObjetoConexion.getConexion().close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: "+e.toString());
    }
         if(datos_e.equals("")){
             datos_e = "No hay proveedores registrados, contacte a soporte técnico";
         }   
         return datos_e;
}
    
     public String BuscarProv(String prov){
            
                     
            String consulta = "SELECT nombrePro, precioPro, tipoPro, id_producto FROM producto WHERE id_prov = "+prov+";";     
            String datos_e="";
            conectar ObjetoConexion = new conectar();
        try {
        // Crear la sentencia SQL
        java.sql.Statement stmt = ObjetoConexion.getConexion().createStatement();
        
        // Ejecutar la consulta y obtener el resultado
        ResultSet rs = stmt.executeQuery(consulta);
        
        // Si se encontraron resultados, obtener el máximo número de cliente
        while (rs.next()) {
            datos_e = datos_e + rs.getString("nombrePro")+" -  "+rs.getString("precioPro")+"$             Tipo Producto: "+rs.getString("tipoPro")+"            Clave producto: "+rs.getString("id_producto")+"\n";
        }
        
        // Cerrar el ResultSet, el Statement y la conexión
        rs.close();
        stmt.close();
        ObjetoConexion.getConexion().close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: "+e.toString());
    }
         if(datos_e.equals("")){
             datos_e = "Clave ingresada erronea o no existente";
         }   
         return datos_e;
}
     
     public String BuscarProducto(String prod,int cant){
            
                     
            String consulta = "SELECT nombrePro, precioPro, stock FROM producto WHERE id_producto = "+prod+";";     
            String datos_e="";
            
            conectar ObjetoConexion = new conectar();
            
            
        try {
        // Crear la sentencia SQL
        java.sql.Statement stmt = ObjetoConexion.getConexion().createStatement();    
        // Ejecutar la consulta y obtener el resultado
        ResultSet rs = stmt.executeQuery(consulta);
        
        // Si se encontraron resultados, obtener el máximo número de cliente
        if (rs.next()) {
            datos_e = datos_e + rs.getString("nombrePro")+"          "+cant+"                               "+rs.getString("precioPro")+"$                                       "+rs.getString("stock")+"\n";
        }
        
        // Cerrar el ResultSet, el Statement y la conexión
        
        rs.close();
        stmt.close();
        ObjetoConexion.getConexion().close();
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: "+e.toString());
    }
         if(datos_e.equals("")){
             datos_e = "Clave ingresada erronea o no existente";
         } 
         
         return datos_e;
}
     public String Total(String prod,int cant){
            
                     
            String consulta = "SELECT precioPro*"+cant+" AS total FROM producto WHERE id_producto = "+prod+";";     
            String datos_e="";
            
            
            conectar ObjetoConexion = new conectar();
            
            
        try {
        // Crear la sentencia SQL
        java.sql.Statement stmt = ObjetoConexion.getConexion().createStatement();    
        // Ejecutar la consulta y obtener el resultado
        ResultSet rs = stmt.executeQuery(consulta);
        
        // Si se encontraron resultados, obtener el máximo número de cliente
        if (rs.next()) {
            datos_e = datos_e + rs.getString("total");
        }
        
        // Cerrar el ResultSet, el Statement y la conexión
        
        rs.close();
        stmt.close();
        ObjetoConexion.getConexion().close();
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: "+e.toString());
    }
         if(datos_e.equals("")){
             datos_e = "Clave ingresada erronea o no existente";
         } 
         
         return datos_e;
}
     
          
    public void Compra(String cant) throws java.io.IOException {
       
          
    String rutaProyecto = System.getProperty("user.dir");
    String archivo= rutaProyecto+"\\src\\Doc\\Compras.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true))) {
            writer.write(cant);
           
        } catch (Exception e) {
            // Manejar cualquier error de escritura en el archivo
            System.out.println(e.getMessage());
        }
    }
    
     public void Borrarcompra() throws java.io.IOException {
       
          
    String rutaArchivo = System.getProperty("user.dir");
    String archivo= rutaArchivo+"\\src\\Doc\\Compras.txt";
   try {
        // Crear un nuevo archivo temporal para almacenar los nombres de usuario
        File archivoTemporal = new File("temporal.txt");
       
                      
        // Eliminar el archivo original
        File archivoOriginal = new File(archivo);
        archivoOriginal.delete();
        
        // Renombrar el archivo temporal al nombre original
        archivoTemporal.renameTo(archivoOriginal);
        
    } catch (Exception e) {
        // Manejar cualquier excepción de IO
        System.out.println(e);
    }
    }
    
     public String cargarCompra(){
        //aqui va el .txt nombrado como el puerto al que se conecta el usuario
         String rutaProyecto = System.getProperty("user.dir");
         String archivo= rutaProyecto+"\\src\\Doc\\Compras.txt";          
         String c="";  
         try{
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            
            String linea;
            
            // Leer cada línea del archivo hasta que se alcance el final
            while ((linea = br.readLine()) != null) {
                // Procesar la línea (en este ejemplo, simplemente imprimirla)               
                    c=c+linea;             
            }
           
            // Cerrar el BufferedReader y el FileReader
            br.close();
            fr.close();
            }catch(Exception e){
                System.out.println("Error: "+e.getMessage());
            }
            return c;
    }
     
      public void Confirmar(String compra, String producto) {

        conectar ObjetoConexion = new conectar();

        String Alta = "update producto set stock = stock+"+compra+ " where id_producto = '"+producto+"'";

        try {
        

           // CallableStatement cs = (CallableStatement) ObjetoConexion.getConexion().prepareCall(Alta);
            //cs.execute();
                 java.sql.Statement stmt = ObjetoConexion.getConexion().createStatement();              
        
       
                 stmt.executeUpdate(Alta);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }  
}


