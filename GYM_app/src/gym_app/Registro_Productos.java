/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gym_app;

import com.sun.jdi.connect.spi.Connection;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Point;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author caos1
 */
public class Registro_Productos extends javax.swing.JFrame {

    Reglas IDD = new Reglas();

    private JPanelConFondo fondo;
    public File archivoSeleccionado;
    private Point mPoint;

    // Obtener la fecha actual
    LocalDate fechaActual = LocalDate.now();

    // Formatear la fecha como una cadena en el formato deseado (YYYY-MM-DD)
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String fechaFormateada = fechaActual.format(formatter);

    public Registro_Productos() {
        setUndecorated(true);
        // Inicializa los componentes de la interfaz gráfica
        initComponents();
        fondo = new JPanelConFondo("src/Image/perfilF.png");
        Fondo.setLayout(new BorderLayout());
        Fondo.add(fondo);
        // foto de salir
        SetImageButton("src/Image/X.png", Salir);
        SetImageButton("src/Image/regresar.png", Regresarbtn);
        
      


        // Ubica la ventana en el centro de la pantalla
        setLocationRelativeTo(null);
    }

    private void SetImageButton(String url, JButton boton) {
        ImageIcon image = new ImageIcon(url);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), Image.SCALE_SMOOTH));
        boton.setIcon(icon);

        boton.setBorderPainted(false);
        boton.setContentAreaFilled(false);
        boton.setFocusPainted(false);
        boton.setOpaque(false);
        this.repaint();
    }

    private void seleccionarImagen() {
        // Crea un JFileChooser para que el usuario seleccione una imagen
        JFileChooser fileChooser = new JFileChooser();
        // Muestra el diálogo para seleccionar un archivo y espera a que el usuario elija uno
        int resultado = fileChooser.showOpenDialog(this);
        // Si el usuario selecciona un archivo y hace clic en "Abrir"
        if (resultado == JFileChooser.APPROVE_OPTION) {
            // Obtiene el archivo seleccionado por el usuario
            File archivoSeleccionado = fileChooser.getSelectedFile();
            // Crea un ImageIcon a partir de la ruta del archivo seleccionado
            ImageIcon imagenSeleccionada = new ImageIcon(archivoSeleccionado.getPath());

            //Se escala la imagen al tamaño deseado
            Image imagen = imagenSeleccionada.getImage();
            int ancho = 200;
            int alto = 240;

          
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombrePro = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        txtPrecioPro = new javax.swing.JTextField();
        txtTipoPro = new javax.swing.JTextField();
        eliminarbtn = new javax.swing.JButton();
        modificarbtn = new javax.swing.JButton();
        altabtn = new javax.swing.JButton();
        RealizarMbtn = new javax.swing.JButton();
        Fondo = new javax.swing.JPanel();
        Salir = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        Regresarbtn = new javax.swing.JButton();

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(251, 250, 248));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("Stock Actual:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel17.setText("Nombre Producto:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Precio:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 90, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Tipo de Producto:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        txtNombrePro.setBackground(new java.awt.Color(251, 250, 248));
        txtNombrePro.setToolTipText("");
        txtNombrePro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombrePro, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 410, -1));

        txtStock.setBackground(new java.awt.Color(251, 250, 248));
        txtStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockActionPerformed(evt);
            }
        });
        jPanel1.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 237, -1));

        txtPrecioPro.setBackground(new java.awt.Color(251, 250, 248));
        jPanel1.add(txtPrecioPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 237, -1));

        txtTipoPro.setBackground(new java.awt.Color(251, 250, 248));
        jPanel1.add(txtTipoPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 237, -1));

        eliminarbtn.setBackground(new java.awt.Color(255, 145, 77));
        eliminarbtn.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        eliminarbtn.setForeground(new java.awt.Color(255, 255, 255));
        eliminarbtn.setText("Baja");
        eliminarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarbtnActionPerformed(evt);
            }
        });
        jPanel1.add(eliminarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 250, -1));

        modificarbtn.setBackground(new java.awt.Color(255, 145, 77));
        modificarbtn.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        modificarbtn.setForeground(new java.awt.Color(255, 255, 255));
        modificarbtn.setText("Modificar");
        modificarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarbtnActionPerformed(evt);
            }
        });
        jPanel1.add(modificarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 250, -1));

        altabtn.setBackground(new java.awt.Color(255, 145, 77));
        altabtn.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        altabtn.setForeground(new java.awt.Color(255, 255, 255));
        altabtn.setText("Alta");
        altabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altabtnActionPerformed(evt);
            }
        });
        jPanel1.add(altabtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 250, -1));

        RealizarMbtn.setBackground(new java.awt.Color(255, 145, 77));
        RealizarMbtn.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        RealizarMbtn.setForeground(new java.awt.Color(255, 255, 255));
        RealizarMbtn.setText("Realizar Modificacion");
        RealizarMbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarMbtnActionPerformed(evt);
            }
        });
        jPanel1.add(RealizarMbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 250, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 700, 310));

        Fondo.setBackground(new java.awt.Color(255, 145, 77));
        Fondo.setPreferredSize(new java.awt.Dimension(836, 336));
        Fondo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                FondoMouseDragged(evt);
            }
        });
        Fondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FondoMousePressed(evt);
            }
        });
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Salir.setBackground(new java.awt.Color(193, 86, 14));
        Salir.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        Fondo.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 60, 53));

        jLabel20.setFont(new java.awt.Font("Eras Demi ITC", 1, 48)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Registro de Productos");
        Fondo.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 39, 573, -1));

        Regresarbtn.setBackground(new java.awt.Color(193, 86, 14));
        Regresarbtn.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        Regresarbtn.setForeground(new java.awt.Color(255, 255, 255));
        Regresarbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Regresarbtn.setMaximumSize(new java.awt.Dimension(10, 8));
        Regresarbtn.setMinimumSize(new java.awt.Dimension(10, 8));
        Regresarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarbtnActionPerformed(evt);
            }
        });
        Fondo.add(Regresarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 40, 40));

        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        /*SimpleDateFormat calendario = new SimpleDateFormat("yyyy-MM-dd");
            // Se crea un objeto SimpleDateFormat para dar formato a la fecha.
            PreparedStatement guardar = conecta.preparetStatement("INSERT INTO registro_empleado (id_Empleado, nombreE, apellidoPE, apellidoME,"
                     + "correoE, celularE, domicilioE, sueldoE, edadE, fecha_registroE, puesto, sexoE"
                     + "servicioMedico, telefonoME, codigoPo, curp, nivelEducacion, rfc) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

        try{
             
             // Se prepara una sentencia SQL para insertar datos en la tabla registro_empleado.

             guardar.setString(1, txtID.getText());
             guardar.setString(2, txtNombre.getText());
             guardar.setString(3, txtAP.getText());
             guardar.setString(4, txtAM.getText());
             guardar.setString(5, txtCorreo.getText());
             guardar.setString(6, txtDireccion.getText());
             guardar.setInt(7, Integer.parseInt(txtTelefono.getText()));
             guardar.setString(8, CBSexo.getSelectedItem().toString());
             guardar.setDate(9, (java.sql.Date)Cfecha.getDate());
             guardar.setInt(10, Integer.parseInt(txtEdad.getText()));
             guardar.setInt(11, Integer.parseInt(txtSueldo.getText()));
             guardar.setInt(12, Integer.parseInt(txtTelefonoE.getText()));
             guardar.setInt(13,Integer.parseInt(txtCP.getText()));
             guardar.setString(14, txtCURP.getText());
             guardar.setString(15, txtRFC.getText());
             guardar.setString(16, CBsm.getSelectedItem().toString());
             guardar.setString(17, CBCargo.getSelectedItem().toString());
             // Se establecen los valores de los parámetros en la sentencia preparada.
             guardar.executeUpdate();
             // Se ejecuta la inserción de datos en la base de datos.
             JOptionPane.showMessageDialog(null, "Los datos han sido registrados");
              // Se muestra un mensaje de éxito al usuario.
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se a podido registrar los datos. Error: "+e);
            // En caso de error, se muestra un mensaje de error al usuario.
        }*/


    }//GEN-LAST:event_jButton1ActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        int R = JOptionPane.showConfirmDialog(null, "Estas seguro de salir?", "Salir", JOptionPane.YES_NO_OPTION,
            JOptionPane.INFORMATION_MESSAGE);

        if (R == 0) {
        System.exit(0);}
    }//GEN-LAST:event_SalirActionPerformed

    private void FondoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FondoMouseDragged
        // TODO add your handling code here:

        int CX = this.getLocation().x;
        int CY = this.getLocation().y;

        int MoveX = ((CX + evt.getX()) - (CX + mPoint.x));
        int MoveY = ((CY + evt.getY()) - (CY + mPoint.y));

        int x = CX + MoveX;
        int y = CY + MoveY;

        this.setLocation(x, y);
    }//GEN-LAST:event_FondoMouseDragged

    private void FondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FondoMousePressed
        // TODO add your handling code here:
        mPoint = evt.getPoint();
        getComponentAt(mPoint);
    }//GEN-LAST:event_FondoMousePressed

    private void txtNombreProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProActionPerformed

    private void RegresarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarbtnActionPerformed
        // TODO add your handling code here:

        int R = JOptionPane.showConfirmDialog(null, "Estas Seguro de regresar?", "Regresar", JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE);

        if (R == 0) {
            Perfil_Empleado Perfil = new Perfil_Empleado();
            Perfil.setVisible(true);
            this.setVisible(false);
        }

    }//GEN-LAST:event_RegresarbtnActionPerformed

    private void eliminarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarbtnActionPerformed
        // TODO add your handling code here:
        String id_Empleado = JOptionPane.showInputDialog("Ingrese el ID del Empleado: ", JOptionPane.QUESTION_MESSAGE);

try {
    // Conectar a la base de datos
    conectar ObjetoConexion = new conectar();

    // Consulta SQL para eliminar un empleado
    String Eliminar = "DELETE FROM Empleado WHERE id_Empleado = ?;";

    // Preparar la sentencia SQL para la eliminación
    PreparedStatement ps = ObjetoConexion.prepareStatement(Eliminar);

    // Establecer el parámetro de la consulta
    ps.setString(1, id_Empleado);

    // Ejecutar la eliminación
    int filasAfectadas = ps.executeUpdate();

    // Comprobar si se eliminó alguna fila
    if (filasAfectadas > 0) {
        JOptionPane.showMessageDialog(null, "Se eliminó el empleado con ID: " + id_Empleado);
    } else {
        JOptionPane.showMessageDialog(null, "No se encontró el empleado con ID: " + id_Empleado);
    }

} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, e.toString());
}

    }//GEN-LAST:event_eliminarbtnActionPerformed

    private void modificarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarbtnActionPerformed
        // TODO add your handling code here:
        String id_Pr = JOptionPane.showInputDialog("Ingrese el ID del Empleado: ", JOptionPane.QUESTION_MESSAGE);

     
       //Aqui se coloca el id del producto 1,2,3  RECUERDA QUE ES INCREMENTAL
        Buscardatos(id_Pr);
        //en este bton se realizara el UPDATE
        RealizarMbtn.setVisible(true);
        modificarbtn.setVisible(false);
     

    }//GEN-LAST:event_modificarbtnActionPerformed

    private void altabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altabtnActionPerformed
        // TODO add your handling code here:
   
   
        //  Guardar.show(true);
    }//GEN-LAST:event_altabtnActionPerformed

    private void txtStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockActionPerformed

    private void RealizarMbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RealizarMbtnActionPerformed
        // TODO add your handling code here:
        ////AQUI COLOCA EL UPDATE
        
    }//GEN-LAST:event_RealizarMbtnActionPerformed

    ///METODO PARA CARGAR DATOS
    public void Buscardatos(String ID) {
        try {
            // Conectar a la base de datos
        conectar ObjetoConexion = new conectar();

        // Consulta SQL para buscar un producto por su ID
        String consulta = "SELECT * FROM producto WHERE id_producto = ?";

        // Preparar la sentencia SQL
        PreparedStatement ps = ObjetoConexion.prepareStatement(consulta);

        // Establecer el parámetro de la consulta
        ps.setInt(1, Integer.parseInt(ID));

        // Ejecutar la consulta
        ResultSet resultado = ps.executeQuery();

        // Comprobar si se encontró algún resultado
        if (resultado.next()) {
            // Obtener los datos del resultado
            String nombrePro = resultado.getString("nombrePro");
            double precioPro = resultado.getDouble("precioPro");
            String tipoPro = resultado.getString("tipoPro");
            int stock = resultado.getInt("stock");

            // Asignar los datos a los campos de texto
            txtNombrePro.setText(nombrePro);
            txtPrecioPro.setText(Double.toString(precioPro));
            txtTipoPro.setText(tipoPro);
            txtStock.setText(Integer.toString(stock));
        } else {
            // Mostrar mensaje si no se encontró el producto
            JOptionPane.showMessageDialog(null, "No se pudo encontrar el producto con ID: " + ID);
        }
    } catch (SQLException e) {
        // Manejar errores de SQL
        JOptionPane.showMessageDialog(null, "Error: " + e.toString());
    } catch (NumberFormatException e) {
        // Manejar errores de formato de número
        JOptionPane.showMessageDialog(null, "El ID debe ser un número entero.");
    }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registro_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Registro_Productos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JButton RealizarMbtn;
    private javax.swing.JButton Regresarbtn;
    private javax.swing.JButton Salir;
    private javax.swing.JButton altabtn;
    private javax.swing.JButton eliminarbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton modificarbtn;
    private javax.swing.JTextField txtNombrePro;
    private javax.swing.JTextField txtPrecioPro;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTipoPro;
    // End of variables declaration//GEN-END:variables
}
