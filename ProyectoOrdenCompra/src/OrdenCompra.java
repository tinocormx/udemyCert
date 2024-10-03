import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class OrdenCompra {
    private static  int identificador;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto productos[];

    public static int getIdentificador() {
        return identificador;
    }



    public String getDescripcion() {
        return descripcion;
    }



    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }



    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;

    }
    public void addProducto (Producto producto){
        if( productos == null){
            productos = new Producto[1];
            productos[0]= producto;
        }else{
            Producto tmpP[] = new Producto [productos.length +1];

            System.arraycopy(productos, 0, tmpP, 0, productos.length);
            tmpP[tmpP.length-1] = producto;
            productos = tmpP;
        }
    }

    public  long getGranTotal()
    {
        long total = 0;
        for ( Producto p: productos){
            total += p.getPrecio();
        }
        return total;
    }
}
