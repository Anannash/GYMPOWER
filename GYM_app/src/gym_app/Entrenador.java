/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym_app;

public class Entrenador {
   String IdE;
String nombreE;
String apellidoME;
String apellidoPE; 

    public Entrenador() {
    }

    public Entrenador(String IdE, String nombreE, String apellidoME, String apellidoPE) {
        this.IdE = IdE;
        this.nombreE = nombreE;
        this.apellidoME = apellidoME;
        this.apellidoPE = apellidoPE;
    }

    public String getIdE() {
        return IdE;
    }

    public void setIdE(String IdE) {
        this.IdE = IdE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getApellidoME() {
        return apellidoME;
    }

    public void setApellidoME(String apellidoME) {
        this.apellidoME = apellidoME;
    }

    public String getApellidoPE() {
        return apellidoPE;
    }

    public void setApellidoPE(String apellidoPE) {
        this.apellidoPE = apellidoPE;
    }

}
