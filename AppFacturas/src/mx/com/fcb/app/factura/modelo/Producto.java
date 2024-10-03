package mx.com.fcb.app.factura.modelo;

public class Producto {
    private int codig;
    private String nombre;
    private float precio;


    public Producto(int codig, String nombre, float precio) {
        this.codig = codig;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getCodig() {
        return codig;
    }

    public void setCodig(int codig) {
        this.codig = codig;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
