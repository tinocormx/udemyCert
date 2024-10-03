package object.two;

import objects.example.Color;

import java.util.Arrays;

public class AutomovilArreglo {
    public static void main(String[] args) {

        Automovil auto1 = new Automovil("Mazda 1","CX5", Color.AZUL,
                new Motor(5.5, TipoMotor.BENCINA), new Estanque(30),
                new Persona("Florentino","Cortez"), null);

        Automovil auto2 = new Automovil("Mazda 2","CX5", Color.AZUL,
                new Motor(5.5, TipoMotor.BENCINA), new Estanque(30),
                new Persona("Florentino","Cortez"), null);

        Automovil auto3 = new Automovil("Audi","CX5", Color.AZUL,
                new Motor(5.5, TipoMotor.BENCINA), new Estanque(30),
                new Persona("Florentino","Cortez"), null);

        Automovil aut[] = new Automovil[3];
    aut[0]=auto1;
    aut[1] =auto2;
    aut[2]= auto3;
        System.out.println("Before");
        for ( Automovil a: aut ){
            System.out.println("a.getFabricante() +\" \" +a.getModelo() = " + a.getFabricante() +" " +a.getModelo());
        }
        Arrays.sort(aut);
        System.out.println("After");
        for ( Automovil a: aut ){
            System.out.println("a.getFabricante() +\" \" +a.getModelo() = " + a.getFabricante() +" " +a.getModelo());
        }

    }
}
