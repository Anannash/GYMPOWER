/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gym_app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Point;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author ANDY
 */
public class Seguiietno extends javax.swing.JDialog {

    ImageIcon icon;
    ImageIcon imagen;
    private Point mPoint;
    public File archivoSeleccionado;

    private JPanelConFondo fondo;

    public Seguiietno(java.awt.Frame parent, boolean modal) {

        super(parent, modal);
        setUndecorated(true);
        initComponents();
        // this.setContentPane(fondo);
        fondo = new JPanelConFondo("src/Image/perfilF.png");
        Fondo.setLayout(new BorderLayout());
        Fondo.add(fondo);
        Segumiiento(Variables.getTID());
        buscar(Variables.getTID());

        this.setLocationRelativeTo(this);

        imagenBtn_EoR("src/Image/X.png", Salir);
//        imagenBtn_EoR("src/Image/regresar.png", Regresarbtn);

        IDtxt1.setText(Variables.getTID());
    }

    private void imagenBtn_EoR(String url, JButton boton) {
        ImageIcon image = new ImageIcon(url);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), Image.SCALE_SMOOTH));
        boton.setIcon(icon);

        boton.setBorderPainted(false);
        boton.setContentAreaFilled(false);
        boton.setFocusPainted(false);
        boton.setOpaque(false);
        this.repaint();
    }

    public void Segumiiento(String idEntrenador) {
        try { ///Aqui es el Metodo para el promedio del entrenador / instructors
            conectar ObjetoConexion = new conectar();
            String prom = "SELECT avg(calificacion) AS PromedioG from encuesta where id_entrenador= ?;";
            //para el promedio
            PreparedStatement ps = ObjetoConexion.prepareStatement(prom);
            ps.setString(1, idEntrenador);
            ResultSet resultado = ps.executeQuery();
            if (resultado.next()) { //obtenr promedio y dependiendo del numero colocarlo con el color correpondiente
                double promedio = resultado.getDouble("PromedioG");
                if (promedio >= 4) {
                    Promediotxt.setForeground(Color.GREEN);
                    Promediotxt.setText(String.valueOf(promedio));
                } else if (promedio < 3.0) {
                    Promediotxt.setForeground(Color.RED);
                    Promediotxt.setText(String.valueOf(promedio));
                } else if (promedio >= 3.0 && promedio < 4) {
                    Promediotxt.setForeground(Color.YELLOW);
                    Promediotxt.setText(String.valueOf(promedio));
                }

            } else {
                
                this.setVisible(false);
                JOptionPane.showMessageDialog(null, "No se pudo encontrar al usuario");
                // Cerrar el JFrame actual si el usuario no se encontró
                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }

    public void buscar(String idEntrenador) {
        try { //mETODO BUSCAR ENTRENADOR / INSTUCTOR
            conectar ObjetoConexion = new conectar();
            String cosulta = "SELECT * FROM Empleado WHERE id_Empleado=?";
            PreparedStatement ps = ObjetoConexion.prepareStatement(cosulta);
            ps.setString(1, idEntrenador);
            ResultSet resultado = ps.executeQuery();
            if (resultado.next()) {
                String nombre = resultado.getString("nombreE");
                String apellidoP = resultado.getString("apellidoPE");
                String apellidoM = resultado.getString("apellidoME");
                byte[] fotoBytes = resultado.getBytes("foto");
                // Convertir arreglo de bytes a ImageIcon
                ImageIcon imagen = new ImageIcon(fotoBytes);
                // Escalar la imagen si es necesario
                Image imagenEscalada = imagen.getImage().getScaledInstance(FOTO.getWidth(), FOTO.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon imagenEscaladaIcon = new ImageIcon(imagenEscalada);
                FOTO.setIcon(imagenEscaladaIcon);
                nombretxt.setText(nombre + " " + apellidoP + " " + apellidoM);

            } else {
                this.setVisible(false);
                JOptionPane.showMessageDialog(null, "No se pudo encontrar al usuario");
                // Cerrar el JFrame actual si el usuario no se encontró
                
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
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

        jPanel1 = new javax.swing.JPanel();
        Promediotxt = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        nombretxt = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        IDtxt1 = new javax.swing.JTextField();
        FOTO = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        Fondo = new javax.swing.JPanel();
        Salir = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(244, 238, 238));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Promediotxt.setEditable(false);
        Promediotxt.setFont(new java.awt.Font("Eras Bold ITC", 1, 36)); // NOI18N
        Promediotxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(Promediotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 277, 195));

        jLabel32.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(1, 0, 0));
        jLabel32.setText("Nombre completo:");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        nombretxt.setEditable(false);
        nombretxt.setBackground(new java.awt.Color(240, 239, 239));
        jPanel1.add(nombretxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 320, -1));

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(1, 0, 0));
        jLabel30.setText("Id Empelado:");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        IDtxt1.setEditable(false);
        IDtxt1.setBackground(new java.awt.Color(240, 239, 239));
        jPanel1.add(IDtxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 139, -1));
        jPanel1.add(FOTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 310, 230));

        jLabel33.setFont(new java.awt.Font("Eras Demi ITC", 0, 36)); // NOI18N
        jLabel33.setText("Promedio del 1 al 5: ");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 350, -1));

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
        Fondo.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 60, 53));

        jLabel21.setFont(new java.awt.Font("Eras Demi ITC", 1, 48)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Seguimiento");
        Fondo.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 540, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
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
            java.util.logging.Logger.getLogger(Seguiietno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seguiietno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seguiietno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seguiietno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Seguiietno dialog = new Seguiietno(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FOTO;
    private javax.swing.JPanel Fondo;
    private javax.swing.JTextField IDtxt1;
    private javax.swing.JTextField Promediotxt;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombretxt;
    // End of variables declaration//GEN-END:variables
}
