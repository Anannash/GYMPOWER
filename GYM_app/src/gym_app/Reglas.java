/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym_app;

import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author ANDY
 */
public class Reglas {

    public Reglas() {
    }

    public void CargarImagen(JLabel label, File archivoSeleccionado) {//Este no sive pero es util como   Plantilla
        JFileChooser fileChooser = new JFileChooser();
        int resultado = fileChooser.showOpenDialog(null);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            archivoSeleccionado = fileChooser.getSelectedFile();
            String ruta = archivoSeleccionado.getName();
            System.out.println(ruta);

            try {
                Image imagenSeleccionada = ImageIO.read(archivoSeleccionado);
                ImageIcon Imagen = new ImageIcon(imagenSeleccionada);

                int labelancho = label.getWidth();
                int labellargo = label.getHeight();

                Image scaledImage = Imagen.getImage().getScaledInstance(labelancho, labellargo, Image.SCALE_SMOOTH);

                label.setIcon(new ImageIcon(scaledImage));
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Error: " + e.toString());
            }
        }
    }

    public String CrearID(String TipoUsuario, String fecha) {
        // C 2024 5 1-1000
        //Numero de la sucursal sera 5
        
        String numSucursal = "5";
        String[] fechac = fecha.split("-");
        String ano = fechac[0];

        // Instanciar la clase que contiene el método obtenerUltimoNumeroCliente
        BD_Movimientos numCl = new BD_Movimientos();

        // Llamar al método obtenerUltimoNumeroCliente para obtener el nuevo ID
        String nuevoNumeroCliente = numCl.obtenerUltimoNumeroCliente(TipoUsuario, fecha);

        // Construir el ID concatenando las partes
        String ID = TipoUsuario + ano + numSucursal + nuevoNumeroCliente;
        return ID;
    }

}
