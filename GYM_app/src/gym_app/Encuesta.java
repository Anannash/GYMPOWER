
package gym_app;

import gym_app.conectar;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Point;
import java.io.File;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

public class Encuesta extends javax.swing.JFrame {
    //se declaran los entrenadores disponibles en el cboBox y sus IDS asignados 
//String Nombres[]={"Juan Perez Gonzales ","Pedro Palacios Rodriguez ", "Jose Salazar Gutierrez ","Francisco Guerra Renteria ","Rosa Aragon Chavez "};
//int IDS[]={5001,5002,5003,5004,5005}; 
EntrenadorDAO pdao=new EntrenadorDAO();
//inicializo las variables que voy a utilizar
int ID=0;
private JPanelConFondo fondo;
    public File archivoSeleccionado;
    private Point mPoint;

    public Encuesta() {
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        // this.setContentPane(fondo);
        fondo = new JPanelConFondo("src/Image/perfilF.png");
        FondoP.setLayout(new BorderLayout());
        FondoP.add(fondo);
        
         imagenBtn_EoR("src/Image/X.png", Salir);
         imagenBtn_EoR("src/Image/regresar.png", Regresarbtn);
        //manda a llamar al archivo donde estan los parametros de conexion con la base de datos
        conectar conecta = new conectar();
        Connection con = conecta.getConexion();
        
        IdEntrenador.setText(Variables.getIDU());
        buscarEntrenador(); 
        //ingreso los nombres al cboBox
        //DefaultComboBoxModel comboModel=new DefaultComboBoxModel (Nombres);
        //cboNombre.setModel(comboModel);
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
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo1 = new javax.swing.ButtonGroup();
        Grupo2 = new javax.swing.ButtonGroup();
        Grupo3 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        Grupo4 = new javax.swing.ButtonGroup();
        Grupo5 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        LEdad5 = new javax.swing.JLabel();
        LEdad1 = new javax.swing.JLabel();
        LEdad2 = new javax.swing.JLabel();
        LEdad3 = new javax.swing.JLabel();
        LEdad4 = new javax.swing.JLabel();
        Si1 = new javax.swing.JRadioButton();
        No1 = new javax.swing.JRadioButton();
        Si2 = new javax.swing.JRadioButton();
        No2 = new javax.swing.JRadioButton();
        Si3 = new javax.swing.JRadioButton();
        No3 = new javax.swing.JRadioButton();
        Si4 = new javax.swing.JRadioButton();
        No4 = new javax.swing.JRadioButton();
        Si5 = new javax.swing.JRadioButton();
        No5 = new javax.swing.JRadioButton();
        enviar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        IdEntrenador = new javax.swing.JTextField();
        LEdad = new javax.swing.JLabel();
        NombreE = new javax.swing.JTextField();
        LEdad6 = new javax.swing.JLabel();
        ID1 = new javax.swing.JTextField();
        FondoP = new javax.swing.JPanel();
        Salir = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        Regresarbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(251, 250, 248));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LEdad5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LEdad5.setText("¿La atencion del entrenador ha sido adecuada?");
        jPanel1.add(LEdad5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        LEdad1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LEdad1.setText("Cuando tienes problemas o dudas ¿el entrenador te ayuda?");
        jPanel1.add(LEdad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 20));

        LEdad2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LEdad2.setText("¿El entrenador te asigno una rutina de acuerdo con tu condicion?");
        jPanel1.add(LEdad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 20));

        LEdad3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LEdad3.setText("¿El entrenador te da un  correcto seguimiento?");
        jPanel1.add(LEdad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, 20));

        LEdad4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LEdad4.setText("¿Recomendarias a este entrenador?");
        jPanel1.add(LEdad4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, 20));

        Grupo1.add(Si1);
        Si1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Si1.setText("Si");
        Si1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Si1ActionPerformed(evt);
            }
        });
        jPanel1.add(Si1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, -1, -1));

        Grupo1.add(No1);
        No1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        No1.setText("No");
        jPanel1.add(No1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, -1, -1));

        Grupo2.add(Si2);
        Si2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Si2.setText("Si");
        jPanel1.add(Si2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, -1, -1));

        Grupo2.add(No2);
        No2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        No2.setText("No");
        jPanel1.add(No2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 190, -1, -1));

        Grupo3.add(Si3);
        Si3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Si3.setText("Si");
        jPanel1.add(Si3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, -1, -1));

        Grupo3.add(No3);
        No3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        No3.setText("No");
        jPanel1.add(No3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 220, -1, -1));

        Grupo4.add(Si4);
        Si4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Si4.setText("Si");
        jPanel1.add(Si4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, -1, -1));

        Grupo4.add(No4);
        No4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        No4.setText("No");
        jPanel1.add(No4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 270, -1, -1));

        Grupo5.add(Si5);
        Si5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Si5.setText("Si");
        jPanel1.add(Si5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, -1, -1));

        Grupo5.add(No5);
        No5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        No5.setText("No");
        jPanel1.add(No5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, -1, -1));

        enviar.setBackground(new java.awt.Color(255, 145, 77));
        enviar.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        enviar.setText("Guardar respuestas");
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });
        jPanel1.add(enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("ID del Entrenador");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, 27));

        IdEntrenador.setEditable(false);
        IdEntrenador.setBackground(new java.awt.Color(224, 223, 222));
        jPanel1.add(IdEntrenador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 260, 34));

        LEdad.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LEdad.setText("Nombre del entrenador");
        jPanel1.add(LEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, 20));

        NombreE.setEditable(false);
        NombreE.setBackground(new java.awt.Color(224, 223, 222));
        NombreE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(NombreE, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 437, 34));

        LEdad6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LEdad6.setText("Calificacion");
        jPanel1.add(LEdad6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 120, -1, -1));

        ID1.setEditable(false);
        ID1.setBackground(new java.awt.Color(224, 223, 222));
        ID1.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        ID1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID1ActionPerformed(evt);
            }
        });
        jPanel1.add(ID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 150, 221, 171));

        FondoP.setBackground(new java.awt.Color(255, 145, 77));
        FondoP.setPreferredSize(new java.awt.Dimension(836, 336));
        FondoP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                FondoPMouseDragged(evt);
            }
        });
        FondoP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FondoPMousePressed(evt);
            }
        });
        FondoP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Salir.setBackground(new java.awt.Color(193, 86, 14));
        Salir.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        FondoP.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 10, 60, 53));

        jLabel21.setFont(new java.awt.Font("Eras Demi ITC", 1, 48)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Evaluacion");
        FondoP.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 39, 270, -1));

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
        FondoP.add(Regresarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, 50, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoP, javax.swing.GroupLayout.DEFAULT_SIZE, 1089, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(FondoP, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Si1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Si1ActionPerformed
    
    }//GEN-LAST:event_Si1ActionPerformed

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
  //aqui, dependiendo de si se selecciona "si" o "no" va a generar la calificacion del entrenador
        int aciertos=0;
    if(Si1.isSelected()){
        aciertos++;
    }
    if(Si2.isSelected()){
        aciertos++;
    }
    if(Si3.isSelected()){
        aciertos++;
    }
    if(Si4.isSelected()){
        aciertos++;
    }
    if(Si5.isSelected()){
        aciertos++;
    }
    ID1.setText(String.valueOf(aciertos)); 
    //escribe en los text field los valores del nombre del entrenador y su calificacion
     
    

        
    //envia a la base de datos el nombre del entrenador y su calificacion juntas
    conectar ObjetoConexion = new conectar();
String idE=IdEntrenador.getText();
double califas=Double.parseDouble(ID1.getText());
      String Alta = "insert into encuesta (id_entrenador,calificacion)" + "values (?, ?); ";
      try {
            

            CallableStatement cs = (CallableStatement) ObjetoConexion.getConexion().prepareCall(Alta);

           
          cs.setString(1, idE);
     
          cs.setDouble(2, califas);
           
            

            cs.execute();

            JOptionPane.showMessageDialog(null, "Registro COMPLETADO !!!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        } 
    
    
    
    
    
    

    }//GEN-LAST:event_enviarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        int R = JOptionPane.showConfirmDialog(null, "Estas seguro de salir?", "Salir", JOptionPane.YES_NO_OPTION,
            JOptionPane.INFORMATION_MESSAGE);

        if (R == 0) {
        System.exit(0);}
    }//GEN-LAST:event_SalirActionPerformed

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

    private void FondoPMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FondoPMouseDragged
        // TODO add your handling code here:

        int CX = this.getLocation().x;
        int CY = this.getLocation().y;

        int MoveX = ((CX + evt.getX()) - (CX + mPoint.x));
        int MoveY = ((CY + evt.getY()) - (CY + mPoint.y));

        int x = CX + MoveX;
        int y = CY + MoveY;

        this.setLocation(x, y);
    }//GEN-LAST:event_FondoPMouseDragged

    private void FondoPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FondoPMousePressed
        // TODO add your handling code here:
        mPoint = evt.getPoint();
        getComponentAt(mPoint);
    }//GEN-LAST:event_FondoPMousePressed

    private void ID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ID1ActionPerformed
 void buscarEntrenador(){
     
      String cod= IdEntrenador.getText();
      if(IdEntrenador.getText().equals("")){
          JOptionPane.showMessageDialog(this, "Ingresa un ID ");
      }else{
        Entrenador entrenador=pdao.listarID(cod);
        if(entrenador.getIdE()!=null){
         NombreE.setText(entrenador.getNombreE()+" "+entrenador.getApellidoPE()+" "+ entrenador.getApellidoME());
        }else{
          JOptionPane.showMessageDialog(this, "Este ID no existe, prueba con otro ");  
        }
      }
   }









//asignar id con los nombres de entrenador 
   /* public void IDE(){
       ID=IDS[cboNombre.getSelectedIndex()];
       
       LbID.setText(ID1(ID));
      
        
    }
private void guardarCalificacion() {
        String idEstudiante = (String) cboNombre.getSelectedItem();
        
            int calificacion = Integer.parseInt(LbID.getText());
            
    }
//pasar el dato del ID de string a Double
   public String ID1(double ID){
  return "ID "+Math.round(ID*100)/100;     
   }
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
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Encuesta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FondoP;
    private javax.swing.ButtonGroup Grupo1;
    private javax.swing.ButtonGroup Grupo2;
    private javax.swing.ButtonGroup Grupo3;
    private javax.swing.ButtonGroup Grupo4;
    private javax.swing.ButtonGroup Grupo5;
    private javax.swing.JTextField ID1;
    private javax.swing.JTextField IdEntrenador;
    private javax.swing.JLabel LEdad;
    private javax.swing.JLabel LEdad1;
    private javax.swing.JLabel LEdad2;
    private javax.swing.JLabel LEdad3;
    private javax.swing.JLabel LEdad4;
    private javax.swing.JLabel LEdad5;
    private javax.swing.JLabel LEdad6;
    private javax.swing.JRadioButton No1;
    private javax.swing.JRadioButton No2;
    private javax.swing.JRadioButton No3;
    private javax.swing.JRadioButton No4;
    private javax.swing.JRadioButton No5;
    private javax.swing.JTextField NombreE;
    private javax.swing.JButton Regresarbtn;
    private javax.swing.JButton Salir;
    private javax.swing.JRadioButton Si1;
    private javax.swing.JRadioButton Si2;
    private javax.swing.JRadioButton Si3;
    private javax.swing.JRadioButton Si4;
    private javax.swing.JRadioButton Si5;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton enviar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
