package gym_app;

import gym_app.ProductoDAO;
import gym_app.productos;
import java.awt.Image;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ventaproductos extends javax.swing.JFrame {

    DetalleVentas dv = new DetalleVentas();
    Cliente cliente = new Cliente();
    productos p = new productos();
    Ventas v = new Ventas();
    DefaultTableModel modelo = new DefaultTableModel();
    ClienteDAO cdao = new ClienteDAO();
    ProductoDAO pdao = new ProductoDAO();
    VentasDAO vdao = new VentasDAO();
    int idpr;
    int cant;
    double pre;
    double tpagar;

    public ventaproductos() {
        initComponents();
//        generarserie();
        Calendar calendario = new GregorianCalendar();
        fecha.setText("" + calendario.get(Calendar.YEAR) + "-" + calendario.get(Calendar.MONTH) + "-" + calendario.get(Calendar.DAY_OF_MONTH));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        series = new javax.swing.JTextField();
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
        jLabel7 = new javax.swing.JLabel();
        NombreCliente = new javax.swing.JTextField();
        Producto = new javax.swing.JTextField();
        Stock = new javax.swing.JTextField();
        fecha = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablaventa = new javax.swing.JTable();
        Total = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Venta = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Lucida Sans", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Venta de productos ");

        series.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(series, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(series, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("ID Cliente");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("ID producto");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Precio");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Cantidad");

        Cantidad.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        Idcliente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        Idproducto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        Precio.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioActionPerformed(evt);
            }
        });

        BuscarCliente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BuscarCliente.setText("BuscarCliente");
        BuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarClienteActionPerformed(evt);
            }
        });

        BuscarProducto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BuscarProducto.setText("BuscarProducto");
        BuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarProductoActionPerformed(evt);
            }
        });

        Agregar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Cliente");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Produto");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Stock");

        NombreCliente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        Producto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        Stock.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StockActionPerformed(evt);
            }
        });

        fecha.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(Idproducto))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Precio))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Idcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(BuscarCliente)
                                .addGap(46, 46, 46)
                                .addComponent(jLabel5))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BuscarProducto)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(Agregar)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Producto)
                            .addComponent(Stock, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                            .addComponent(NombreCliente)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Idcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarCliente)
                    .addComponent(jLabel5)
                    .addComponent(NombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Idproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarProducto)
                    .addComponent(jLabel6)
                    .addComponent(Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Agregar)
                    .addComponent(jLabel7)
                    .addComponent(Stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Tablaventa.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        Tablaventa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro", "ID Prod", "Producto", "Cantidad", "Precio unitario", "Total"
            }
        ));
        jScrollPane1.setViewportView(Tablaventa);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Total.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Total a pagar");

        Venta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Venta.setText("Generar Venta");
        Venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentaActionPerformed(evt);
            }
        });

        Cancelar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Cancelar.setText("Nueva Venta");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Venta)
                .addGap(67, 67, 67)
                .addComponent(jLabel8)
                .addGap(75, 75, 75)
                .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(Cancelar)
                    .addComponent(Venta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarClienteActionPerformed
        // buscarCliente();
        
        try {
            conectar ObjetoConexion = new conectar();
            
            String cosulta = "SELECT * FROM cliente WHERE id_cliente=?";
            
            PreparedStatement ps = ObjetoConexion.prepareStatement(cosulta);
            
            ps.setString(1, Idcliente.getText());
            
            ResultSet resultado = ps.executeQuery();
            
            if (resultado.next()) {
                String nombre = resultado.getString("nombreC");
                String apellidoP = resultado.getString("apellidoPC");
                String apellidoM = resultado.getString("apellidoMC");
                
                String nombreCP = nombre + "" + apellidoP + "" + apellidoM;
                NombreCliente.setText(nombreCP);
                // fecha_cumpletxt.setText(contra);
                
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo encontrar al usuario");
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }

    }//GEN-LAST:event_BuscarClienteActionPerformed

    private void BuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarProductoActionPerformed
        //buscarproducto(); 
        
        
        try {
            conectar ObjetoConexion = new conectar();

            String cosulta = "select * from producto where id_producto=?";

            PreparedStatement ps = ObjetoConexion.prepareStatement(cosulta);

            ps.setInt(1, Integer.parseInt(Idproducto.getText()));

            ResultSet resultado = ps.executeQuery();

            if (resultado.next()) {
                String nombrePro = resultado.getString("nombrePro");
                double precioPro = resultado.getDouble("precioPro");
                String tipoPro = resultado.getString("tipoPro");
                int  stock = resultado.getInt("stock");
                
                Producto.setText(nombrePro);
                Stock.setText(String.valueOf(stock)  );
                Precio.setText(String.valueOf(precioPro));

            } else {
                JOptionPane.showMessageDialog(null, "No se pudo encontrar el Producto");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }


// TODO add your handling code here:
    }//GEN-LAST:event_BuscarProductoActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        agregarproducto();        // TODO add your handling code here:
    }//GEN-LAST:event_AgregarActionPerformed

    private void VentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentaActionPerformed
        if (Total.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese datos ");
        } else {
            JOptionPane.showMessageDialog(this, "venta exitosa ");
            guardarventa();
            guardardetalle();
            actualizarstock();
            
        }
        

    }//GEN-LAST:event_VentaActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        limpiar();
        nuevo();
//        generarserie();        // TODO add your handling code here:
    }//GEN-LAST:event_CancelarActionPerformed

    private void PrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecioActionPerformed

    private void fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaActionPerformed

    private void StockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StockActionPerformed
    void nuevo() {
        Idcliente.setText("");
        NombreCliente.setText("");
        Idproducto.setText("");
        Producto.setText("");
        Precio.setText("");
        Stock.setText("");
        Total.setText("");
        Idcliente.requestFocus();
        
    }

    void limpiar() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
            
        }
    }    
    
    void actualizarstock() {
        
        for (int i = 0; modelo.getRowCount() < 10; i++) {
            productos pr = new productos();
            idpr = Integer.parseInt(Tablaventa.getValueAt(i, 1).toString());
            cant = Integer.parseInt(Tablaventa.getValueAt(i, 3).toString());
            pr = pdao.listarID(idpr);
            int sa = pr.getStock() - cant;
            pdao.actualizarstock(sa, idpr);
        }
    }
    
    void guardarventa() {
        
        int idc = Integer.parseInt(Idcliente.getText());
        String serie = series.getText();
        String fechas = fecha.getText();
        double monto = tpagar;
        String estado = "1";
        v.setIdCliente(idc);
        v.setSerie(serie);
        v.setFecha(fechas);
        v.setMonto(monto);
        v.setEstado(estado);
        vdao.GuardarVentas(v);
    }

    void guardardetalle() {
        String idv = vdao.IdVentas();
        int idve = Integer.parseInt(idv);
        for (int i = 0; i < Tablaventa.getRowCount(); i++) {
            int idp = Integer.parseInt(Tablaventa.getValueAt(i, 1).toString());
            int cant = Integer.parseInt(Tablaventa.getValueAt(i, 3).toString());
            double pre = Double.parseDouble(Tablaventa.getValueAt(i, 4).toString());
            dv.setIdVentas(idve);
            dv.setIdProducto(idp);
            dv.setCantidad(cant);
            dv.setPrecioVenta(pre);
            vdao.GuardarDetalleV(dv);
        }
    }

    /*
    void generarserie(){
        String serie=vdao.NoVentas();
        if(serie==null){
            series.setText("0000001");
       }else {
           int increment=Integer.parseInt(serie);
            increment=increment+1;
            series.setText("000000" + increment);
        }
    }*/
    
    public void agregarproducto() {
        int item = 0;
        double total;
        int id;
        modelo = (DefaultTableModel) Tablaventa.getModel();
        item = item + 1;
        id = Integer.parseInt(Idproducto.getText());
        productos p = pdao.listarID(id);
        idpr = p.getID();
        String nomp = Producto.getText();
        pre = Double.parseDouble(Precio.getText());
        cant = Integer.parseInt(Cantidad.getValue().toString());
        int stock = Integer.parseInt(Stock.getText());
        total = cant * pre;
        ArrayList lista = new ArrayList();
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
        
    }

    void calculartotal() {
        tpagar = 0;
        for (int i = 0; i < Tablaventa.getRowCount(); i++) {
            cant = Integer.parseInt(Tablaventa.getValueAt(i, 3).toString());
            pre = Double.parseDouble(Tablaventa.getValueAt(i, 4).toString());
            tpagar = tpagar + (cant * pre);
        }
        Total.setText("" + tpagar);
    }    
    
    void buscarproducto() {
        int id = Integer.parseInt(Idproducto.getText());
        if (Idproducto.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingresa un ID ");
        } else {
            productos p1 = pdao.listarID(id);
            if (p1.getID() != 0) {
                Producto.setText(p1.getNombres());
                Stock.setText("" + p1.getStock());
                Precio.setText("" + p1.getPrecio());
                
            } else {
                JOptionPane.showMessageDialog(this, "Este producto no existe, pruebe con otro ");                
            }
        }        
    }
    
    void buscarCliente() {
        
        String cod = Idcliente.getText();
        if (Idcliente.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingresa un ID ");
        } else {
            Cliente clientee = cdao.listarID(cod);
            if (clientee.getIdc() == null) {
                JOptionPane.showMessageDialog(this, "Este cliente no existe, pruebe con otro ");
            } else {
                NombreCliente.setText(clientee.getNom() + " " + clientee.getApellidoP() + " " + clientee.getApellidoM());                
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
    private javax.swing.JTextField Idcliente;
    private javax.swing.JTextField Idproducto;
    private javax.swing.JTextField NombreCliente;
    private javax.swing.JTextField Precio;
    private javax.swing.JTextField Producto;
    private javax.swing.JTextField Stock;
    private javax.swing.JTable Tablaventa;
    private javax.swing.JTextField Total;
    private javax.swing.JButton Venta;
    private javax.swing.JTextField fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField series;
    // End of variables declaration//GEN-END:variables
}
