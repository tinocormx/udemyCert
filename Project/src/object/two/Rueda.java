package object.two;

public class Rueda {
    private String fabricante;
    private int aro;
    private int ancho;

    public String getFabricante() {
        return fabricante;
    }



    public int getAro() {
        return aro;
    }



    public int getAncho() {
        return ancho;
    }



    public Rueda(String fabricante, int aro, int ancho) {
        this.fabricante = fabricante;
        this.aro = aro;
        this.ancho = ancho;
    }
}
