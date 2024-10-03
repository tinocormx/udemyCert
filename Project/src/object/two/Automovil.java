package object.two;

import objects.example.Color;

import java.util.Arrays;

public class Automovil implements  Comparable<Automovil>{
    private static int id=0;
    private String fabricante;
    private String modelo;
    private Color color;

    private Motor motor;
    private Estanque tanque;

    private  Persona owner;

    private Rueda [] ruedas;

    public Automovil(){
        Automovil.id++;
        System.out.println("id = " + id);
    }


    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque tanque, Persona owner, Rueda[] ruedas) {
        this();


        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;

        this.motor = motor;
        this.tanque = tanque;
        this.owner = owner;
        this.ruedas = ruedas;
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



    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getTanque() {
        return tanque;
    }

    public void setTanque(Estanque tanque) {
        this.tanque = tanque;
    }

    public Persona getOwner() {
        return owner;
    }

    public void setOwner(Persona owner) {
        this.owner = owner;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "id='"+id+"'"+
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color=" + color +
                ", motor=" + motor +
                ", tanque=" + tanque +
                ", owner=" + owner +
                ", ruedas=" + Arrays.toString(ruedas) +
                '}';
    }

    @Override
    public int compareTo(Automovil aut) {


        return this.fabricante.compareTo(aut.getFabricante());
    }
}
