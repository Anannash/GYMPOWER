
package gym_app;

public class Cliente {
  String idc;
String nom;
String apellidoM;
String apellidoP;

    public Cliente() {
    }

    public Cliente(String idc, String nom, String apellidoM, String apellidoP) {
        this.idc = idc;
        this.nom = nom;
        this.apellidoM = apellidoM;
        this.apellidoP = apellidoP;
    }

    public String getIdc() {
        return idc;
    }

    public void setIdc(String idc) {
        this.idc = idc;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }


}
