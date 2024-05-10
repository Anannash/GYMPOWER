/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gym_app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author ANDY
 */
public class GYM_app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        conectar conecta = new conectar();

        Connection con = conecta.getConexion();

        Runnable run = () -> {
            Splash splash = new Splash();
            splash.setVisible(true);

            try {
                //timepo que tarda la pantalla de carga
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(GYM_app.class.getName()).log(Level.SEVERE, null, ex);
            }

            splash.dispose();

            login incio = new login();
            incio.setVisible(true);

        };

        Thread hiloSplash = new Thread(run);
        hiloSplash.start();

    }
    

}
