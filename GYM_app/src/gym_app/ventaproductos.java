
package gym_app;

import gym_app.DetalleVentas;
import gym_app.ProductoDAO;
import gym_app.productos;
import gym_app.Cliente;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Point;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ventaproductos extends javax.swing.JFrame {
    
    
    
DetalleVentas dv=new DetalleVentas();
//Cliente cliente=new Cliente();
    productos p=new productos();
Ventas v=new Ventas();
    DefaultTableModel modelo=new DefaultTableModel();
    ClienteDAO cdao=new ClienteDAO();
    ProductoDAO pdao=new ProductoDAO();
    VentasDAO vdao=new VentasDAO();
    int idpr;
    int cant;
    double pre;
    double tpagar;
     private JPanelConFondo fondo;
    public File archivoSeleccionado;
    private Point mPoint;
    
    public ventaproductos() {
        setUndecorated(true);
        initComponents();
        fondo = new JPanelConFondo("src/Image/perfilF.png");
        Fondo.setLayout(new BorderLayout());
        Fondo.add(fondo);
        generarserie();
        Calendar calendario=new GregorianCalendar();
        fecha.setText(""+calendario.get(Calendar.YEAR)+"-"+calendario.get(Calendar.MONTH)+"-"+calendario.get(Calendar.DAY_OF_MONTH));
        SetImageButton("src/Image/X.png", Salir);
        SetImageButton("src/Image/regresar.png", Regresarbtn);
        this.setLocationRelativeTo(null);
        
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Cantidad = new javax.swing.JSpinner();
        Idcliente = new javax.swing.JTextField();
        Idproducto = new javax.swing.JTextField();
        Precio = new javax.swing.JTextField();
        BuscarCliente = new javax.swing.JButton();
        BuscarProducto = new javax.swing.JButton();
        Agregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NombreCliente = new javax.swing.JTextField();
        Producto = new javax.swing.JTextField();
        Stock = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablaventa = new javax.swing.JTable();
        Cancelar = new javax.swing.JButton();
        Venta = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Total = new javax.swing.JTextField();
        Fondo = new javax.swing.JPanel();
        Salir = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        Regresarbtn = new javax.swing.JButton();
        fecha = new javax.swing.JTextField();
        series = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(251, 250, 248));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("ID Cliente:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 100, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("ID producto:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Precio:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, 66, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Cantidad:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        Cantidad.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel2.add(Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 88, -1));

        Idcliente.setBackground(new java.awt.Color(251, 250, 248));
        Idcliente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel2.add(Idcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 160, -1));

        Idproducto.setBackground(new java.awt.Color(251, 250, 248));
        Idproducto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel2.add(Idproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 91, -1));

        Precio.setEditable(false);
        Precio.setBackground(new java.awt.Color(224, 223, 222));
        Precio.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel2.add(Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, 126, -1));

        BuscarCliente.setBackground(new java.awt.Color(255, 145, 77));
        BuscarCliente.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        BuscarCliente.setText("Buscar Cliente");
        BuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarClienteActionPerformed(evt);
            }
        });
        jPanel2.add(BuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 170, -1));

        BuscarProducto.setBackground(new java.awt.Color(255, 145, 77));
        BuscarProducto.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        BuscarProducto.setText("Buscar Producto");
        BuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarProductoActionPerformed(evt);
            }
        });
        jPanel2.add(BuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 200, -1));

        Agregar.setBackground(new java.awt.Color(255, 145, 77));
        Agregar.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        Agregar.setText("Agregar al carrito");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        jPanel2.add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 500, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Cliente:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, 20));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Produto:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        NombreCliente.setEditable(false);
        NombreCliente.setBackground(new java.awt.Color(224, 223, 222));
        NombreCliente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel2.add(NombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 360, 30));

        Producto.setEditable(false);
        Producto.setBackground(new java.awt.Color(224, 223, 222));
        Producto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel2.add(Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 300, -1));

        Stock.setEditable(false);
        Stock.setBackground(new java.awt.Color(224, 223, 222));
        Stock.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel2.add(Stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 140, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Stock:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jPanel3.setBackground(new java.awt.Color(251, 250, 248));

        Tablaventa.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        Tablaventa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro", "ID Prod", "Producto", "Cantidad", "Precio unitario", "Total"
            }
        ));
        Tablaventa.setSelectionBackground(new java.awt.Color(255, 145, 77));
        jScrollPane1.setViewportView(Tablaventa);

        Cancelar.setBackground(new java.awt.Color(255, 145, 77));
        Cancelar.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        Cancelar.setText("Nueva Venta");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        Venta.setBackground(new java.awt.Color(255, 145, 77));
        Venta.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        Venta.setText("Generar Venta");
        Venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Total a pagar:");

        Total.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(Venta, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancelar)
                    .addComponent(Venta)
                    .addComponent(jLabel8)
                    .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 21, Short.MAX_VALUE))
        );

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
        Fondo.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 60, 53));

        jLabel21.setFont(new java.awt.Font("Eras Demi ITC", 1, 48)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Venta de Productos");
        Fondo.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 39, 540, -1));

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
        Fondo.add(Regresarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 50, 50));

        fecha.setEditable(false);
        fecha.setBackground(new java.awt.Color(224, 223, 222));
        fecha.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Fondo.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, 182, -1));

        series.setEditable(false);
        series.setBackground(new java.awt.Color(224, 223, 222));
        series.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        series.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seriesActionPerformed(evt);
            }
        });
        Fondo.add(series, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 500, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarClienteActionPerformed
       buscarCliente();
    }//GEN-LAST:event_BuscarClienteActionPerformed

    private void BuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarProductoActionPerformed
buscarproducto();        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarProductoActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
agregarproducto();        // TODO add your handling code here:
    }//GEN-LAST:event_AgregarActionPerformed

    private void VentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentaActionPerformed
     if(Total.getText().equals("")){
         JOptionPane.showMessageDialog(this, "Ingrese datos ");
     }else{
         JOptionPane.showMessageDialog(this, "venta exitosa ");
        guardarventa();
     guardardetalle();
     actualizarstock();
   
     }
        
        
        
    }//GEN-LAST:event_VentaActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
 limpiar();
     nuevo();
        generarserie();        // TODO add your handling code here:
    }//GEN-LAST:event_CancelarActionPerformed

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

    private void seriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seriesActionPerformed
void  nuevo(){
  Idcliente.setText("");
  NombreCliente.setText("");
  Idproducto.setText("");
  Producto.setText("");
  Precio.setText("");
  Stock.setText("");
  Total.setText("");
  Idcliente.requestFocus();
  
}
  void limpiar(){
      for (int i = 0; i < modelo.getRowCount(); i++) {
          modelo.removeRow(i);
          i=i-1;
          
      }
  }  
    
    
    
    
    void actualizarstock(){
    
    for (int i = 0; i < modelo.getRowCount(); i++) {
    productos pr = new productos();
    idpr = Integer.parseInt(modelo.getValueAt(i, 1).toString());
    cant = Integer.parseInt(modelo.getValueAt(i, 3).toString());
    pr = pdao.listarID(idpr);
    int sa = pr.getStock() - cant;
    pdao.actualizarstock(sa, idpr);
}
}
    
    
    
    
    
    
    void guardarventa(){
   
    String idc=Idcliente.getText();
   String serie=series.getText();
   String fechas=fecha.getText();
   double monto=tpagar;
   String estado="1";
   v.setIdCliente(idc);
   v.setSerie(serie);
   v.setFecha(fechas);
   v.setMonto(monto);
   v.setEstado(estado);
   vdao.GuardarVentas(v);
}
    void guardardetalle(){
        String idv=vdao.IdVentas();
        int idve=Integer.parseInt(idv);
        for (int i = 0; i < Tablaventa.getRowCount(); i++) {
         int idp=Integer.parseInt(Tablaventa.getValueAt(i, 1).toString());
         int cant=Integer.parseInt(Tablaventa.getValueAt(i, 3).toString());
        double pre=Double.parseDouble(Tablaventa.getValueAt(i, 4).toString());
        dv.setIdVentas(idve);
        dv.setIdProducto(idp);
        dv.setCantidad(cant);
        dv.setPrecioVenta(pre);
        vdao.GuardarDetalleV(dv);
        }
    }
    void generarserie(){
        String serie=null;
        if(serie==null){
            series.setText("0000001");
       }else {
           int increment=Integer.parseInt(serie);
            increment=increment+1;
            series.setText("000000" + increment);
        }
    }
    
   public void agregarproducto() {
    int item = 0;
    double total;
    int id;
    modelo = (DefaultTableModel) Tablaventa.getModel();
    item = item + 1;
    String idProductoText = Idproducto.getText().trim();
    if (!idProductoText.isEmpty()) { // Verificar si el campo Idproducto no está vacío
        id = Integer.parseInt(idProductoText);
        productos p = pdao.listarID(id);
        idpr = p.getID();
        String nomp = Producto.getText();
        pre = Double.parseDouble(Precio.getText());
        cant = Integer.parseInt(Cantidad.getValue().toString());
        int stock = Integer.parseInt(Stock.getText());
        total = cant * pre;
        ArrayList<Object> lista = new ArrayList<>();
        if (stock > 0) {
            lista.add(item);
            lista.add(idpr);
            lista.add(nomp);
            lista.add(cant);
            lista.add(pre);
            lista.add(total);
            Object[] ob = new Object[6];
            ob[0] = lista.get(0);
            ob[1] = lista.get(1);
            ob[2] = lista.get(2);
            ob[3] = lista.get(3);
            ob[4] = lista.get(4);
            ob[5] = lista.get(5);
            modelo.addRow(ob);
            Tablaventa.setModel(modelo);
            calculartotal();
        } else {
            JOptionPane.showMessageDialog(this, "Dificultades tecnicas ");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, ingresa un ID de producto.");
    }
}
  void calculartotal(){
    tpagar=0;
      for (int i = 0; i < Tablaventa.getRowCount(); i++) {
         cant=Integer.parseInt(Tablaventa.getValueAt(i, 3).toString());
         pre=Double.parseDouble(Tablaventa.getValueAt(i, 4).toString());
         tpagar=tpagar+(cant*pre);
      }
      Total.setText(""+tpagar);
  }  
    
    
    
    
    
    
   void buscarproducto() {
    String idText = Idproducto.getText().trim(); // Obtener el texto del campo Idproducto y eliminar los espacios en blanco
    if (idText.isEmpty()) { // Verificar si el campo Idproducto está vacío
        JOptionPane.showMessageDialog(this, "Por favor, ingresa un ID.");
    } else {
        try {
            int id = Integer.parseInt(idText); // Convertir el texto del campo Idproducto a un entero
            productos p = pdao.listarID(id); // Obtener el producto correspondiente al ID ingresado
            if (p.getID() != 0) { // Verificar si se encontró un producto con el ID ingresado
                Producto.setText(p.getNombres());
                Stock.setText(Integer.toString(p.getStock())); // Convertir el stock a String antes de asignarlo al campo de texto
                Precio.setText(Double.toString(p.getPrecio())); // Convertir el precio a String antes de asignarlo al campo de texto
            } else {
                JOptionPane.showMessageDialog(this, "Este producto no existe. Por favor, prueba con otro ID.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El ID ingresado no es válido. Por favor, ingresa un número entero.");
        }
    }
}
    
    
    
    
    
    
   void buscarCliente(){
     
      String cod= Idcliente.getText();
      if(Idcliente.getText().equals("")){
          JOptionPane.showMessageDialog(this, "Ingresa un ID ");
      }else{
        Cliente cliente=cdao.listarID(cod);
        if(cliente.getIdc()!=null){
         NombreCliente.setText(cliente.getNom() +" "+ cliente.getApellidoP()+" "+ cliente.getApellidoM());
        }else{
          JOptionPane.showMessageDialog(this, "Este cliente no existe, pruebe con otro ");  
        }
      }
   }
   
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
            java.util.logging.Logger.getLogger(ventaproductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventaproductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventaproductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventaproductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventaproductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton BuscarCliente;
    private javax.swing.JButton BuscarProducto;
    private javax.swing.JButton Cancelar;
    private javax.swing.JSpinner Cantidad;
    private javax.swing.JPanel Fondo;
    private javax.swing.JTextField Idcliente;
    private javax.swing.JTextField Idproducto;
    private javax.swing.JTextField NombreCliente;
    private javax.swing.JTextField Precio;
    private javax.swing.JTextField Producto;
    private javax.swing.JButton Regresarbtn;
    private javax.swing.JButton Salir;
    private javax.swing.JTextField Stock;
    private javax.swing.JTable Tablaventa;
    private javax.swing.JTextField Total;
    private javax.swing.JButton Venta;
    private javax.swing.JTextField fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField series;
    // End of variables declaration//GEN-END:variables
}
