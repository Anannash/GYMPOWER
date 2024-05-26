
package gym_app;

/**
 *
 * @author as
 */
public class productos {
   int ID;
   String Nombres;
   Double Precio;
   int stock;
   String Estado;

public productos(){

}

    public productos(int ID, String Nombres, Double Precio, int stock, String Estado) {
        this.ID = ID;
        this.Nombres = Nombres;
        this.Precio = Precio;
        this.stock = stock;
        this.Estado = Estado;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }





}