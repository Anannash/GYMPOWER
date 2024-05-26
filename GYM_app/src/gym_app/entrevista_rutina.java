/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gym_app;

import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DecimalFormat;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author ANDY
 */
public class entrevista_rutina extends javax.swing.JFrame {

    /**
     * Creates new form entrevista_rutinasss
     */
    private String objetivos;
    private String lesiones;
    private String condiciones;
    private String nivel;
    private Point mPoint;
    // Obtener la fecha actual
    LocalDate fechaActual = LocalDate.now();

    // Formatear la fecha como una cadena en el formato deseado (YYYY-MM-DD)
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String fechaFormateada = fechaActual.format(formatter);

    public entrevista_rutina() {
        setUndecorated(true);
        initComponents();

        //    setExtendedState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(this);
        SetImageButton("src/Image/X.png", Salirbtn);
        SetImageButton("src/Image/regresar.png", Regresarbtn);

        /*IMAGENES*/
        Document doc = imctxt.getDocument();
        doc.addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                actualizarImagen();
                System.out.println("Insert");
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                actualizarImagen();
                System.out.println("Eliminar");
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                actualizarImagen();
                System.out.println("Cambio");
            }

            public void actualizarImagen() {
                try {
                    // Obtener el valor como un número

                    double imc = Double.parseDouble(imctxt.getText());

                    // Determinar qué imagen mostrar según el valor ingresado
                    ImageIcon icon;
                    ImageIcon imagen;
                    if (imc < 18.5) {

                        icon = new ImageIcon("src/Image/1azul.png");
                        Image images = icon.getImage().getScaledInstance(LabelIMC.getWidth(), LabelIMC.getHeight(), Image.SCALE_SMOOTH);
                        imagen = new ImageIcon(images);

                        System.out.println("Inserto 1");
                    } else if (imc <= 24.9) {
                        icon = new ImageIcon("src/Image/2Verde.png");
                        Image images = icon.getImage().getScaledInstance(LabelIMC.getWidth(), LabelIMC.getHeight(), Image.SCALE_SMOOTH);
                        imagen = new ImageIcon(images);

                        System.out.println("Inserto 2");
                    } else if (imc <= 29.9) {
                        icon = new ImageIcon("src/Image/3Amarillo.png");
                        Image images = icon.getImage().getScaledInstance(LabelIMC.getWidth(), LabelIMC.getHeight(), Image.SCALE_SMOOTH);
                        imagen = new ImageIcon(images);

                        System.out.println("Inserto 3");
                    } else if (imc <= 34.9) {
                        icon = new ImageIcon("src/Image/4Naranja.png");
                        Image images = icon.getImage().getScaledInstance(LabelIMC.getWidth(), LabelIMC.getHeight(), Image.SCALE_SMOOTH);
                        imagen = new ImageIcon(images);

                        System.out.println("Inserto 4");
                    } else if (imc <= 39.9) {
                        icon = new ImageIcon("src/Image/5Anaranjado.png");
                        Image images = icon.getImage().getScaledInstance(LabelIMC.getWidth(), LabelIMC.getHeight(), Image.SCALE_SMOOTH);
                        imagen = new ImageIcon(images);

                        System.out.println("Inserto 5");
                    } else {
                        icon = new ImageIcon("src/Image/6Rojo.png");
                        Image images = icon.getImage().getScaledInstance(LabelIMC.getWidth(), LabelIMC.getHeight(), Image.SCALE_SMOOTH);
                        imagen = new ImageIcon(images);

                        System.out.println("Inserto 6");
                    }

                    // Establecer la imagen en el JLabel
                    LabelIMC.setIcon(imagen);

                } catch (NumberFormatException ex) {
                    // En caso de que el texto no sea un número válido, no se actualiza la imagen
                    LabelIMC.setIcon(null);
                    System.out.println(ex);
                }
            }
        });
         ID.setText(Variables.getIDU());
        Buscardatos(ID);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        LPeso = new javax.swing.JLabel();
        LAltura = new javax.swing.JLabel();
        LIMC = new javax.swing.JLabel();
        pesotxt = new javax.swing.JTextField();
        alturatxt = new javax.swing.JTextField();
        imctxt = new javax.swing.JTextField();
        LCondiciones = new javax.swing.JLabel();
        LNivel = new javax.swing.JLabel();
        C1 = new javax.swing.JCheckBox();
        C2 = new javax.swing.JCheckBox();
        NivelConFisBOX = new javax.swing.JComboBox<>();
        LLesiones = new javax.swing.JLabel();
        L1 = new javax.swing.JCheckBox();
        L3 = new javax.swing.JCheckBox();
        C5 = new javax.swing.JCheckBox();
        Lcliente = new javax.swing.JLabel();
        nomClitxt = new javax.swing.JTextField();
        LSexo = new javax.swing.JLabel();
        sexotxt = new javax.swing.JTextField();
        L6 = new javax.swing.JCheckBox();
        L2 = new javax.swing.JCheckBox();
        L7 = new javax.swing.JCheckBox();
        L8 = new javax.swing.JCheckBox();
        L4 = new javax.swing.JCheckBox();
        L10 = new javax.swing.JCheckBox();
        C3 = new javax.swing.JCheckBox();
        C6 = new javax.swing.JCheckBox();
        LObjetivos = new javax.swing.JLabel();
        Ob1 = new javax.swing.JRadioButton();
        Ob3 = new javax.swing.JRadioButton();
        Ob5 = new javax.swing.JRadioButton();
        Ob2 = new javax.swing.JRadioButton();
        LabelIMC = new javax.swing.JLabel();
        LLesionesIma = new javax.swing.JLabel();
        completarbtn = new javax.swing.JButton();
        Salirbtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Regresarbtn = new javax.swing.JButton();
        Lcliente1 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));

        jPanel1.setBackground(new java.awt.Color(244, 238, 238));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Eras Demi ITC", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 145, 77));
        jLabel6.setText("Diseña tu Plan de Ejercicio");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 460, -1));

        LPeso.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LPeso.setForeground(new java.awt.Color(0, 0, 0));
        LPeso.setText("Peso:");
        jPanel1.add(LPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        LAltura.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LAltura.setForeground(new java.awt.Color(0, 0, 0));
        LAltura.setText("Altura:");
        jPanel1.add(LAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, -1));

        LIMC.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LIMC.setForeground(new java.awt.Color(0, 0, 0));
        LIMC.setText("IMC:");
        jPanel1.add(LIMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, -1, -1));

        pesotxt.setText("0");
        jPanel1.add(pesotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 80, -1));

        alturatxt.setText("0");
        alturatxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alturatxtActionPerformed(evt);
            }
        });
        alturatxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                alturatxtKeyReleased(evt);
            }
        });
        jPanel1.add(alturatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 80, -1));

        imctxt.setEditable(false);
        imctxt.setBackground(new java.awt.Color(204, 204, 204));
        imctxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        imctxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imctxtActionPerformed(evt);
            }
        });
        imctxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                imctxtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                imctxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                imctxtKeyTyped(evt);
            }
        });
        jPanel1.add(imctxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 56, -1));

        LCondiciones.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LCondiciones.setForeground(new java.awt.Color(0, 0, 0));
        LCondiciones.setText("Condiciones médicas crónicas");
        jPanel1.add(LCondiciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 270, 30));

        LNivel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LNivel.setForeground(new java.awt.Color(0, 0, 0));
        LNivel.setText("Nivel de condicion fisica:");
        jPanel1.add(LNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        C1.setText("Asma");
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        jPanel1.add(C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        C2.setText("Artritis");
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });
        jPanel1.add(C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, -1, -1));

        NivelConFisBOX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Principiante", "Intermedio", "Avanzado" }));
        NivelConFisBOX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NivelConFisBOXActionPerformed(evt);
            }
        });
        NivelConFisBOX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NivelConFisBOXKeyPressed(evt);
            }
        });
        jPanel1.add(NivelConFisBOX, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 120, 30));

        LLesiones.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LLesiones.setForeground(new java.awt.Color(0, 0, 0));
        LLesiones.setText("Lesiones previas");
        jPanel1.add(LLesiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, -1, -1));

        L1.setText("Esguince de tobillo");
        L1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L1ActionPerformed(evt);
            }
        });
        jPanel1.add(L1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, -1, -1));

        L3.setText("Dislocación del hombro");
        L3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L3ActionPerformed(evt);
            }
        });
        jPanel1.add(L3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, -1, -1));

        C5.setText("Diabetes ");
        C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C5ActionPerformed(evt);
            }
        });
        jPanel1.add(C5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, -1, -1));

        Lcliente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Lcliente.setForeground(new java.awt.Color(0, 0, 0));
        Lcliente.setText("Nombre del cliente:");
        jPanel1.add(Lcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 180, -1));

        nomClitxt.setEditable(false);
        nomClitxt.setBackground(new java.awt.Color(204, 204, 204));
        nomClitxt.setForeground(new java.awt.Color(0, 0, 0));
        nomClitxt.setCaretColor(new java.awt.Color(153, 153, 153));
        nomClitxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(nomClitxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 510, -1));

        LSexo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LSexo.setForeground(new java.awt.Color(0, 0, 0));
        LSexo.setText("Sexo:");
        jPanel1.add(LSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        sexotxt.setEditable(false);
        sexotxt.setBackground(new java.awt.Color(204, 204, 204));
        sexotxt.setForeground(new java.awt.Color(0, 0, 0));
        sexotxt.setCaretColor(new java.awt.Color(153, 153, 153));
        sexotxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(sexotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 38, -1));

        L6.setText("Fractura de muñeca");
        L6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L6ActionPerformed(evt);
            }
        });
        jPanel1.add(L6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, -1, -1));

        L2.setText("Tendinitis rotuliana");
        L2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L2ActionPerformed(evt);
            }
        });
        jPanel1.add(L2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, -1, -1));

        L7.setText("Fractura de clavícula ");
        L7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L7ActionPerformed(evt);
            }
        });
        jPanel1.add(L7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, -1, -1));

        L8.setText("Distensión muscular del cuello");
        L8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L8ActionPerformed(evt);
            }
        });
        jPanel1.add(L8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, -1, -1));

        L4.setText("Desgarro del tendón de Aquiles");
        L4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L4ActionPerformed(evt);
            }
        });
        jPanel1.add(L4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, -1));

        L10.setText("Ninguno");
        L10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L10ActionPerformed(evt);
            }
        });
        jPanel1.add(L10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 88, -1));

        C3.setText("Hipertensión");
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });
        jPanel1.add(C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, -1, -1));

        C6.setText("Ninguno");
        C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C6ActionPerformed(evt);
            }
        });
        jPanel1.add(C6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 510, -1, -1));

        LObjetivos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LObjetivos.setForeground(new java.awt.Color(0, 0, 0));
        LObjetivos.setText("Objetivos de fitness");
        jPanel1.add(LObjetivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        Ob1.setText("Perder peso");
        Ob1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ob1ActionPerformed(evt);
            }
        });
        jPanel1.add(Ob1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        Ob3.setText("Ganar masa muscular");
        Ob3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ob3ActionPerformed(evt);
            }
        });
        jPanel1.add(Ob3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        Ob5.setText("Mejorar mi rendimiento deportivo");
        Ob5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ob5ActionPerformed(evt);
            }
        });
        jPanel1.add(Ob5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        Ob2.setText("Mejorar mi salud");
        Ob2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ob2ActionPerformed(evt);
            }
        });
        jPanel1.add(Ob2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 132, -1));

        LabelIMC.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(LabelIMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 330, 670));

        LLesionesIma.setBackground(new java.awt.Color(255, 255, 255));
        LLesionesIma.setForeground(new java.awt.Color(255, 255, 255));
        LLesionesIma.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(LLesionesIma, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 480, 220));

        completarbtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        completarbtn.setText("Guardar");
        completarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completarbtnActionPerformed(evt);
            }
        });
        jPanel1.add(completarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 620, 260, -1));

        Salirbtn.setBackground(new java.awt.Color(193, 86, 14));
        Salirbtn.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        Salirbtn.setForeground(new java.awt.Color(255, 255, 255));
        Salirbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salirbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirbtnActionPerformed(evt);
            }
        });
        jPanel1.add(Salirbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 50, 50));

        jLabel7.setFont(new java.awt.Font("Eras Demi ITC", 0, 36)); // NOI18N
        jLabel7.setText("Generador de Rutinas:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 680, -1));

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
        jPanel1.add(Regresarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 40, 40));

        Lcliente1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Lcliente1.setForeground(new java.awt.Color(0, 0, 0));
        Lcliente1.setText("ID:");
        jPanel1.add(Lcliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 30, -1));

        ID.setEditable(false);
        ID.setBackground(new java.awt.Color(204, 204, 204));
        ID.setForeground(new java.awt.Color(0, 0, 0));
        ID.setCaretColor(new java.awt.Color(153, 153, 153));
        ID.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        jPanel1.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 150, -1));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1123, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alturatxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alturatxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alturatxtActionPerformed

    private void alturatxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_alturatxtKeyReleased
        // TODO add your handling code here:

        double peso = Double.parseDouble(pesotxt.getText());
        double altura = Double.parseDouble(alturatxt.getText());

        double imc = peso / (altura * altura);
        DecimalFormat formato = new DecimalFormat("#.##");
        String numeroFormateado = formato.format(imc);

        imctxt.setText(numeroFormateado);

    }//GEN-LAST:event_alturatxtKeyReleased

    private void imctxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imctxtActionPerformed
        // TODO add your handling code here:(

        /*
            try {
                double imc = Double.parseDouble(imctxt.getText());
                if (imc < 18.5) {
                    /*Bajo Peso*//*
                    LabelIMC.setIcon(new ImageIcon("Image/1azul.jpg"));
                } else if (imc <= 18.5 && imc >= 24.9) {

                    LabelIMC.setIcon(new ImageIcon("Image/2Verde.jpg"));
                } else if (imc <= 25.0 && imc >= 29.9) {

                    LabelIMC.setIcon(new ImageIcon("Image/3Amarillo.jpg"));
                } else if (imc <= 30.0 && imc >= 34.9) {

                    LabelIMC.setIcon(new ImageIcon("Image/4Naranja.jpg"));
                } else if (imc <= 35.0 && imc >= 39.9) {

                    LabelIMC.setIcon(new ImageIcon("Image/5Anaranjado.jpg"));
                } else if (imc > 40) {

                    LabelIMC.setIcon(new ImageIcon("Image/6Rojo.jpg"));
                }
            } catch (Exception e) {
                System.out.println(e);
            }
         */

    }//GEN-LAST:event_imctxtActionPerformed

    private void imctxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_imctxtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_imctxtKeyPressed

    private void imctxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_imctxtKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_imctxtKeyReleased

    private void imctxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_imctxtKeyTyped

    }//GEN-LAST:event_imctxtKeyTyped

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        // TODO add your handling code here:
        try {
            ImageIcon icon = new ImageIcon("src/Image/C1.jpg"); // Cambia la ruta por la de tu imagen
            // Escalar la imagen al tamaño del JLabel
            Image images = icon.getImage().getScaledInstance(LLesionesIma.getWidth(), LLesionesIma.getHeight(), Image.SCALE_SMOOTH);

            // Crear un ImageIcon con la imagen escalada
            ImageIcon imagen = new ImageIcon(images);

            //    ImageIcon imagen = new ImageIcon("src/Image/C1.jpg");
            LLesionesIma.setIcon(imagen);
        } catch (Exception e) {
            System.err.println("Error al cargar la imagen: " + e.getMessage());
        }

        if (C1.isSelected()) {
            C2.setSelected(false);
            C3.setSelected(false);
            C5.setSelected(false);
            C6.setSelected(false);
        }

        condiciones = C1.getText();
    }//GEN-LAST:event_C1ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        // TODO add your handling code here:
        try {

            ImageIcon icon = new ImageIcon("src/Image/C2.jpg"); // Cambia la ruta por la de tu imagen
            // Escalar la imagen al tamaño del JLabel
            Image images = icon.getImage().getScaledInstance(LLesionesIma.getWidth(), LLesionesIma.getHeight(), Image.SCALE_SMOOTH);

            // Crear un ImageIcon con la imagen escalada
            ImageIcon imagen = new ImageIcon(images);
            LLesionesIma.setIcon(imagen);
        } catch (Exception e) {
            System.err.println("Error al cargar la imagen: " + e.getMessage());
        }
        if (C2.isSelected()) {
            C1.setSelected(false);
            C3.setSelected(false);
            C5.setSelected(false);
            C6.setSelected(false);
        }
        condiciones = C2.getText();
    }//GEN-LAST:event_C2ActionPerformed

    private void NivelConFisBOXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NivelConFisBOXActionPerformed

        nivel = (String) NivelConFisBOX.getSelectedItem();

    }//GEN-LAST:event_NivelConFisBOXActionPerformed

    private void NivelConFisBOXKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NivelConFisBOXKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_NivelConFisBOXKeyPressed

    private void L1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L1ActionPerformed

        try {

            ImageIcon icon = new ImageIcon("src/Image/L1.jpg");
            Image images = icon.getImage().getScaledInstance(LLesionesIma.getWidth(), LLesionesIma.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imagen = new ImageIcon(images);
            LLesionesIma.setIcon(imagen);

        } catch (Exception e) {
            System.err.println("Error al cargar la imagen: " + e.getMessage());
        }
        if (L1.isSelected()) {
            L2.setSelected(false);
            L3.setSelected(false);
            L4.setSelected(false);
            L6.setSelected(false);
            L7.setSelected(false);
            L8.setSelected(false);
            L10.setSelected(false);
        }

        lesiones = L1.getText();

    }//GEN-LAST:event_L1ActionPerformed

    private void L3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L3ActionPerformed
        // TODO add your handling code here:
        try {
            if (!L3.isSelected()) {
                //    LLesionesIma.setIcon(null);
            } else {
                ImageIcon icon = new ImageIcon("src/Image/L3.jpg");
                Image images = icon.getImage().getScaledInstance(LLesionesIma.getWidth(), LLesionesIma.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon imagen = new ImageIcon(images);
                LLesionesIma.setIcon(imagen);
                //    System.out.println("L3");
            }

        } catch (Exception e) {
            System.err.println("Error al cargar la imagen: " + e.getMessage());
        }
        if (L3.isSelected()) {
            L2.setSelected(false);
            L8.setSelected(false);
            L4.setSelected(false);
            L1.setSelected(false);
            L7.setSelected(false);
            L6.setSelected(false);
            L10.setSelected(false);
        }

        lesiones = L3.getText();
    }//GEN-LAST:event_L3ActionPerformed

    private void C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C5ActionPerformed
        // TODO add your handling code here:
        try {

            ImageIcon icon = new ImageIcon("src/Image/C5.jpg"); // Cambia la ruta por la de tu imagen
            // Escalar la imagen al tamaño del JLabel
            Image images = icon.getImage().getScaledInstance(LLesionesIma.getWidth(), LLesionesIma.getHeight(), Image.SCALE_SMOOTH);

            // Crear un ImageIcon con la imagen escalada
            ImageIcon imagen = new ImageIcon(images);
            LLesionesIma.setIcon(imagen);
        } catch (Exception e) {
            System.err.println("Error al cargar la imagen: " + e.getMessage());
        }
        if (C5.isSelected()) {
            C2.setSelected(false);
            C3.setSelected(false);
            C1.setSelected(false);
            C6.setSelected(false);
        }
        condiciones = C5.getText();

    }//GEN-LAST:event_C5ActionPerformed

    private void L6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L6ActionPerformed
        // TODO add your handling code here:

        try {

            ImageIcon icon = new ImageIcon("src/Image/L6.jpg");
            Image images = icon.getImage().getScaledInstance(LLesionesIma.getWidth(), LLesionesIma.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imagen = new ImageIcon(images);
            LLesionesIma.setIcon(imagen);
        } catch (Exception e) {
            System.err.println("Error al cargar la imagen: " + e.getMessage());
        }
        if (L6.isSelected()) {
            L2.setSelected(false);
            L3.setSelected(false);
            L4.setSelected(false);
            L1.setSelected(false);
            L7.setSelected(false);
            L8.setSelected(false);
            L10.setSelected(false);
        }
        lesiones = L6.getText();
    }//GEN-LAST:event_L6ActionPerformed

    private void L2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L2ActionPerformed
        // TODO add your handling code here:

        try {

            ImageIcon icon = new ImageIcon("src/Image/L2.jpg");
            Image images = icon.getImage().getScaledInstance(LLesionesIma.getWidth(), LLesionesIma.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imagen = new ImageIcon(images);
            LLesionesIma.setIcon(imagen);
            //    System.out.println("L2");

        } catch (Exception e) {
            System.err.println("Error al cargar la imagen: " + e.getMessage());
        }
        if (L2.isSelected()) {
            L8.setSelected(false);
            L3.setSelected(false);
            L4.setSelected(false);
            L1.setSelected(false);
            L7.setSelected(false);
            L6.setSelected(false);
            L10.setSelected(false);
        }
        lesiones = L2.getText();
    }//GEN-LAST:event_L2ActionPerformed

    private void L7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L7ActionPerformed
        // TODO add your handling code here:

        try {

            ImageIcon icon = new ImageIcon("src/Image/L7.jpg");
            Image images = icon.getImage().getScaledInstance(LLesionesIma.getWidth(), LLesionesIma.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imagen = new ImageIcon(images);
            LLesionesIma.setIcon(imagen);
        } catch (Exception e) {
            System.err.println("Error al cargar la imagen: " + e.getMessage());
        }
        if (L7.isSelected()) {
            L2.setSelected(false);
            L3.setSelected(false);
            L4.setSelected(false);
            L1.setSelected(false);
            L8.setSelected(false);
            L6.setSelected(false);
            L10.setSelected(false);
        }
        lesiones = L7.getText();
    }//GEN-LAST:event_L7ActionPerformed

    private void L8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L8ActionPerformed
        // TODO add your handling code here:

        try {

            ImageIcon icon = new ImageIcon("src/Image/L8.jpg");
            Image images = icon.getImage().getScaledInstance(LLesionesIma.getWidth(), LLesionesIma.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imagen = new ImageIcon(images);
            LLesionesIma.setIcon(imagen);
        } catch (Exception e) {
            System.err.println("Error al cargar la imagen: " + e.getMessage());
        }

        if (L8.isSelected()) {
            L2.setSelected(false);
            L3.setSelected(false);
            L4.setSelected(false);
            L1.setSelected(false);
            L7.setSelected(false);
            L10.setSelected(false);
            L6.setSelected(false);
        }
        lesiones = L8.getText();
    }//GEN-LAST:event_L8ActionPerformed

    private void L4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L4ActionPerformed
        // TODO add your handling code here:
        try {

            ImageIcon icon = new ImageIcon("src/Image/L4.jpg");
            Image images = icon.getImage().getScaledInstance(LLesionesIma.getWidth(), LLesionesIma.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imagen = new ImageIcon(images);

            LLesionesIma.setIcon(imagen);
        } catch (Exception e) {
            System.err.println("Error al cargar la imagen: " + e.getMessage());
        }
        if (L4.isSelected()) {
            L2.setSelected(false);
            L3.setSelected(false);
            L8.setSelected(false);
            L1.setSelected(false);
            L7.setSelected(false);
            L6.setSelected(false);
            L10.setSelected(false);
        }
        lesiones = L4.getText();
    }//GEN-LAST:event_L4ActionPerformed

    private void L10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L10ActionPerformed
        // TODO add your handling code here:
        LLesionesIma.setIcon(null);

        if (L10.isSelected()) {
            L2.setSelected(false);
            L3.setSelected(false);
            L4.setSelected(false);
            L1.setSelected(false);
            L7.setSelected(false);
            L6.setSelected(false);
            L8.setSelected(false);

        }
        lesiones = L10.getText();


    }//GEN-LAST:event_L10ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        // TODO add your handling code here:

        try {

            ImageIcon icon = new ImageIcon("src/Image/C3.png"); // Cambia la ruta por la de tu imagen
            // Escalar la imagen al tamaño del JLabel
            Image images = icon.getImage().getScaledInstance(LLesionesIma.getWidth(), LLesionesIma.getHeight(), Image.SCALE_SMOOTH);

            // Crear un ImageIcon con la imagen escalada
            ImageIcon imagen = new ImageIcon(images);
            LLesionesIma.setIcon(imagen);
        } catch (Exception e) {
            System.err.println("Error al cargar la imagen: " + e.getMessage());
        }
        if (C3.isSelected()) {
            C2.setSelected(false);
            C1.setSelected(false);
            C5.setSelected(false);
            C6.setSelected(false);
        }
        condiciones = C3.getText();
    }//GEN-LAST:event_C3ActionPerformed

    private void C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C6ActionPerformed
        // TODO add your handling code here:
        LLesionesIma.setIcon(null);
        if (C6.isSelected()) {
            C2.setSelected(false);
            C1.setSelected(false);
            C5.setSelected(false);
            C3.setSelected(false);
        }
        condiciones = C6.getText();


    }//GEN-LAST:event_C6ActionPerformed

    private void Ob5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ob5ActionPerformed
        // TODO add your handling code here:

        if (Ob5.isSelected()) {
            Ob2.setSelected(false);
            Ob3.setSelected(false);
            Ob1.setSelected(false);
        }
        objetivos = Ob5.getText();

    }//GEN-LAST:event_Ob5ActionPerformed

    private void Ob1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ob1ActionPerformed
        // TODO add your handling code here:

        if (Ob1.isSelected()) {
            Ob2.setSelected(false);
            Ob3.setSelected(false);
            Ob5.setSelected(false);
        }

        objetivos = Ob1.getText();


    }//GEN-LAST:event_Ob1ActionPerformed

    private void Ob2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ob2ActionPerformed
        // TODO add your handling code here:

        if (Ob2.isSelected()) {
            Ob1.setSelected(false);
            Ob3.setSelected(false);
            Ob5.setSelected(false);
        }
        objetivos = Ob2.getText();
    }//GEN-LAST:event_Ob2ActionPerformed

    private void Ob3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ob3ActionPerformed
        // TODO add your handling code here:

        if (Ob3.isSelected()) {
            Ob2.setSelected(false);
            Ob1.setSelected(false);
            Ob5.setSelected(false);
        }
        objetivos = Ob3.getText();

    }//GEN-LAST:event_Ob3ActionPerformed

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

    private void SalirbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirbtnActionPerformed
        // 0 Aceptar
        //2 cancelar

        int R = JOptionPane.showConfirmDialog(null, "Estas Seguro de SALIR?", "Salir", JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE);

        if (R == 0) {
            System.exit(0);
        }


    }//GEN-LAST:event_SalirbtnActionPerformed

    private void RegresarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarbtnActionPerformed
        // TODO add your handling code here:

        int R = JOptionPane.showConfirmDialog(null, "Estas Seguro de regresar?", "Regresar", JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE);

        if (R == 0) {
            Perfil_Segi Perfil = new Perfil_Segi();
            Perfil.setVisible(true);
            this.setVisible(false);
        }
        
    }//GEN-LAST:event_RegresarbtnActionPerformed

    private void completarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completarbtnActionPerformed
        // guardar lesiones y enfermedades
        if (L1.isSelected()) {
            GuardarLesiones(ID, L1);
        } else if (L2.isSelected()) {
            GuardarLesiones(ID, L2);
        } else if (L3.isSelected()) {
            GuardarLesiones(ID, L3);
        } else if (L6.isSelected()) {
            GuardarLesiones(ID, L6);
        } else if (L7.isSelected()) {
            GuardarLesiones(ID, L7);
        } else if (L8.isSelected()) {
            GuardarLesiones(ID, L8);
        } else if (L4.isSelected()) {
            GuardarLesiones(ID, L4);
        } else if (L10.isSelected()) {
            GuardarLesiones(ID, L10); }
        if (C1.isSelected()) {
            GuardarEnfermedad(ID, C1);
        } else if (C2.isSelected()) {
            GuardarEnfermedad(ID, C2);
        } else if (C3.isSelected()) {
            GuardarEnfermedad(ID, C3);
        } else if (C5.isSelected()) {
            GuardarEnfermedad(ID, C5);
        } else if (C6.isSelected()) {
            GuardarEnfermedad(ID, C6); }
        //Actualizar datos del cleinte y la GENERACION DE RUTINAS
        if (Ob1.isSelected()) {
            ActualizarDatos4(ID, pesotxt, alturatxt, imctxt, NivelConFisBOX, Ob1,java.sql.Date.valueOf(fechaActual));
            generarRutina(ID, NivelConFisBOX, Ob1);
        } else if (Ob2.isSelected()) {
            ActualizarDatos4(ID, pesotxt, alturatxt, imctxt, NivelConFisBOX, Ob2,java.sql.Date.valueOf(fechaActual));
            generarRutina(ID, NivelConFisBOX, Ob2);
        } else if (Ob3.isSelected()) {
            ActualizarDatos4(ID, pesotxt, alturatxt, imctxt, NivelConFisBOX, Ob3,java.sql.Date.valueOf(fechaActual));
            generarRutina(ID, NivelConFisBOX, Ob3);
        } else if (Ob5.isSelected()) {
            ActualizarDatos4(ID, pesotxt, alturatxt, imctxt, NivelConFisBOX, Ob5,java.sql.Date.valueOf(fechaActual));
            generarRutina(ID, NivelConFisBOX, Ob5);}
        //mostrar su perfil
        Perfil_Segi Perfil = new Perfil_Segi();
            Perfil.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_completarbtnActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        mPoint=evt.getPoint(); 
        getComponentAt(mPoint);
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        int  CX = this.getLocation().x;
        int  CY = this.getLocation().y;
        
        
        int MoveX =((CX+evt.getX()) - (CX+mPoint.x));
        int MoveY =((CY+evt.getY()) - (CY+mPoint.y));

        
        int x = CX+MoveX;
        int y = CY+MoveY;
        
        
        this.setLocation(x, y);
    }//GEN-LAST:event_jPanel1MouseDragged

    public void GuardarLesiones(JTextField ID, JCheckBox tipoLes) {
        try {
            conectar ObjetoConexion = new conectar();

            String insertar = "INSERT INTO detalles_Les (id_Cliente, id_lesion) VALUES (?,?);";
            String mostrar = "SELECT id_lesion FROM lesion WHERE tipo_lesion = ?;";

            PreparedStatement ps1 = ObjetoConexion.prepareStatement(mostrar);
            ps1.setString(1, tipoLes.getText());

            ResultSet resultado = ps1.executeQuery();

            if (resultado.next()) {
                int IdLes = resultado.getInt("id_lesion");

                PreparedStatement ps2 = ObjetoConexion.prepareStatement(insertar);
                ps2.setString(1, ID.getText());
                ps2.setInt(2, IdLes);

                ps2.executeUpdate();

                System.out.println("Se logro Les");

            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }

    }

    public void GuardarEnfermedad(JTextField ID, JCheckBox tipoEn) {

        try {
            conectar ObjetoConexion = new conectar();

            String insertar = "INSERT INTO detalles_Enf (id_Cliente, id_enfermedadCron) VALUES (?,?);";
            String mostrar = "SELECT id_enfermedadCron FROM enfermedadCron WHERE tipo_enfermedadCron = ?;";

            PreparedStatement ps1 = ObjetoConexion.prepareStatement(mostrar);
            ps1.setString(1, tipoEn.getText());

            ResultSet resultado = ps1.executeQuery();

            if (resultado.next()) {
                int IdEnfermedad = resultado.getInt("id_enfermedadCron");

                PreparedStatement ps2 = ObjetoConexion.prepareStatement(insertar);
                ps2.setString(1, ID.getText());
                ps2.setInt(2, IdEnfermedad);

                ps2.executeUpdate();

                System.out.println("Se logro ENF");

            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }

    }
    
    public void ActualizarDatos4(JTextField ID, JTextField peso, JTextField altura, JTextField imc, JComboBox nivel, JRadioButton motivo, Date fecha) {

        try {
            conectar ObjetoConexion = new conectar();
                //ACTUALIZAR DATOS DEL CLIENTE
            String actualizar = "update cliente set peso_inicial =?,estatura = ?,imc = ?,motivo_entre= ?"
                    + ",NivelCondicionFisica = ? where id_cliente= ?;";
            //INSERTARLOS EN LA SEMANA  0 DE SEGUIMIENTO
             String insertSeCl = "INSERT INTO seguimientoCl (id_Cliente, fecha, semana, pesoActual,imcActual) VALUES (?,?,?,?,?);";

            PreparedStatement ps = ObjetoConexion.prepareStatement(actualizar);
            PreparedStatement ps2 = ObjetoConexion.prepareStatement(insertSeCl);

            ps.setDouble(1, Double.parseDouble(peso.getText()));
            ps.setDouble(2, Double.parseDouble(altura.getText()));
            ps.setDouble(3, Double.parseDouble(imc.getText()));
            ps.setString(4, motivo.getText());
            ps.setString(5, nivel.getSelectedItem().toString());
            ps.setString(6, ID.getText());
            
            ps2.setString(1, ID.getText());
            ps2.setDate(2, fecha);
            ps2.setInt(3, 0);
            ps2.setDouble(4, Double.parseDouble(peso.getText()));
            ps2.setDouble(5, Double.parseDouble(imc.getText()));
            
            ps2.execute();
            

            // Ejecutar la sentencia SQL de actualización
            int filasActualizadas = ps.executeUpdate();

            // Verificar si se actualizaron filas y mostrar un mensaje
            if (filasActualizadas > 0) {
                System.out.println("Se actualizaron " + filasActualizadas + " filas.");
            } else {
                System.out.println("No se realizaron actualizaciones.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error A: " + e.toString());
        }

    }

    public void Buscardatos(JTextField ID) {
        try {
            conectar ObjetoConexion = new conectar();

            String cosulta = "SELECT nombreC,apellidoPC,apellidoMC,sexo FROM cliente WHERE id_cliente=?";

            PreparedStatement ps = ObjetoConexion.prepareStatement(cosulta);

            ps.setString(1, ID.getText());

            ResultSet resultado = ps.executeQuery();

            if (resultado.next()) {
                String nombre = resultado.getString("nombreC");
                String apellidoP = resultado.getString("apellidoPC");
                String apellidoM = resultado.getString("apellidoMC");
                String sexo = resultado.getString("sexo");

                nomClitxt.setText(nombre + " " + apellidoP + " " + apellidoM);
                sexotxt.setText(sexo);

            } else {
                JOptionPane.showMessageDialog(null, "No se pudo encontrar al usuario");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }

    }

    public void generarRutina(JTextField ID, JComboBox Nivel, JRadioButton objetivo) {
        try {
            conectar ObjetoConexion = new conectar();

            String Rutina = "INSERT INTO detalles_rutina (id_Rutina, id_Cliente)\n"
                    + "SELECT r.id_rutina, ?\n"
                    + "FROM rutina r\n"
                    + "JOIN cliente c ON r.objetivo = ? AND r.nivel = ?\n"
                    + "WHERE c.id_cliente = ? \n"
                    + "AND (\n"
                    + "    (c.id_cliente NOT IN (SELECT id_Cliente FROM detalles_Les WHERE id_lesion = 8) \n"
                    + "    OR \n"
                    + "    c.id_cliente NOT IN (SELECT id_Cliente FROM detalles_Enf WHERE id_enfermedadCron = 8))\n"
                    + "    OR \n"
                    + "    (c.id_cliente IN (SELECT id_Cliente FROM detalles_Les WHERE id_lesion <> 8)) \n"
                    + "    OR \n"
                    + "    (c.id_cliente IN (SELECT id_Cliente FROM detalles_Enf WHERE id_enfermedadCron <> 8))\n"
                    + ")\n"
                    + "AND adecuado_EyL = CASE \n"
                    + "    WHEN (c.id_cliente NOT IN (SELECT id_Cliente FROM detalles_Les WHERE id_lesion = 8) \n"
                    + "    OR \n"
                    + "    c.id_cliente NOT IN (SELECT id_Cliente FROM detalles_Enf WHERE id_enfermedadCron = 8)) THEN 'No'\n"
                    + "    ELSE 'Si'\n"
                    + "    END;";
            PreparedStatement ps = ObjetoConexion.prepareStatement(Rutina);
            ps.setString(1, ID.getText());
            ps.setString(2, objetivo.getText());
            ps.setString(3, Nivel.getSelectedItem().toString());
            ps.setString(4, ID.getText());

            ps.execute();

            JOptionPane.showMessageDialog(null, "Guardado EXITOSO");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
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
            java.util.logging.Logger.getLogger(entrevista_rutina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(entrevista_rutina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(entrevista_rutina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(entrevista_rutina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new entrevista_rutina().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox C1;
    private javax.swing.JCheckBox C2;
    private javax.swing.JCheckBox C3;
    private javax.swing.JCheckBox C5;
    private javax.swing.JCheckBox C6;
    private javax.swing.JTextField ID;
    private javax.swing.JCheckBox L1;
    private javax.swing.JCheckBox L10;
    private javax.swing.JCheckBox L2;
    private javax.swing.JCheckBox L3;
    private javax.swing.JCheckBox L4;
    private javax.swing.JCheckBox L6;
    private javax.swing.JCheckBox L7;
    private javax.swing.JCheckBox L8;
    private javax.swing.JLabel LAltura;
    private javax.swing.JLabel LCondiciones;
    private javax.swing.JLabel LIMC;
    private javax.swing.JLabel LLesiones;
    private javax.swing.JLabel LLesionesIma;
    private javax.swing.JLabel LNivel;
    private javax.swing.JLabel LObjetivos;
    private javax.swing.JLabel LPeso;
    private javax.swing.JLabel LSexo;
    private javax.swing.JLabel LabelIMC;
    private javax.swing.JLabel Lcliente;
    private javax.swing.JLabel Lcliente1;
    private javax.swing.JComboBox<String> NivelConFisBOX;
    private javax.swing.JRadioButton Ob1;
    private javax.swing.JRadioButton Ob2;
    private javax.swing.JRadioButton Ob3;
    private javax.swing.JRadioButton Ob5;
    private javax.swing.JButton Regresarbtn;
    private javax.swing.JButton Salirbtn;
    private javax.swing.JTextField alturatxt;
    private javax.swing.JButton completarbtn;
    private javax.swing.JTextField imctxt;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomClitxt;
    private javax.swing.JTextField pesotxt;
    private javax.swing.JTextField sexotxt;
    // End of variables declaration//GEN-END:variables
}
