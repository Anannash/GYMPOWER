
package gym_app;

public class Ventas {
  int id;
int idCliente;
String serie;
String Fecha;
double monto;
String estado;

public Ventas(){
    
}

    public Ventas(int id, int idCliente, String serie, String Fecha, double monto, String estado) {
        this.id = id;
        this.idCliente = idCliente;
        this.serie = serie;
        this.Fecha = Fecha;
        this.monto = monto;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
