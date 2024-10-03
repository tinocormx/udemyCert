package objects.example;

import java.util.Objects;

public class Automovil {
    private String fabricante;
    private String modelo;
    private Color color = Color.AMARILLO ;
    private String cilindrada;
    private static int id;
    private TipoAuto tipoAuto= TipoAuto.SEDAN;

    public static int VELOCIDAD_MAXIMA_CARRETERA=120;

    private static String PATENTE ="Red";
    public Automovil(String fabricante, String modelo, Color color, String cilindrada) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil() {

    }

    public  String detalle(){
        StringBuilder sb = new StringBuilder();
        sb.append("this.fabricante = " + this.fabricante);
        sb.append("\nthis.modelo = " + this.modelo);
        sb.append("\nthis.cilindrada = " + this.cilindrada);
        sb.append("\nthis.color = " + this.color.getColor());
        sb.append("\n Patente= "+Automovil.PATENTE);
        sb.append("\n Velocidad Maxima Carretera= "+Automovil.VELOCIDAD_MAXIMA_CARRETERA);
        return sb.toString();
    }

    public String aceletar( int rpm ){
        return "El auto "+ fabricante +" acelera a:"+rpm+ "rpm";
    }

    public String frenar( ){
        return "El auto "+ fabricante +" esta Frenando";
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public static String getPATENTE() {
        return PATENTE;
    }

    public static void setPATENTE(String PATENTE) {
        Automovil.PATENTE = PATENTE;
    }

    @Override
    public boolean equals(Object o) {
        Automovil automovil = (Automovil) o;


        return this.fabricante!=null && this.modelo!=null && this.fabricante.equals( automovil.getFabricante()) &&  this.modelo.equals( automovil.getModelo() );
     }

    public TipoAuto getTipoAuto() {
        return tipoAuto;
    }

    public void setTipoAuto(TipoAuto tipoAuto) {
        this.tipoAuto = tipoAuto;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "modelo='" + modelo + '\'' +
                ", color='" + color.getColor() + '\'' +
                ", cilindrada='" + cilindrada + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", Tipo Auto='" + tipoAuto + '\'' +
                '}';
    }
}