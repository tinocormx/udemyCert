package object.two;

import objects.example.Color;

public class AutomovilExample {
    public static void main(String[] args) {

        Rueda ruedaUno[] = new Rueda[5];
        for (int i = 0; i < ruedaUno.length; i++) {
            ruedaUno[ i ]= new Rueda("Michelin", i+1, 255);
        }
        Automovil auto = new Automovil("Mazda","CX5", Color.AZUL,
                new Motor(5.5, TipoMotor.BENCINA), new Estanque(30),
                new Persona("Florentino","Cortez"), ruedaUno);

        System.out.println("auto = " + auto.toString());
        Rueda rueda [] = {new Rueda("Michelin", 15, 10),new Rueda("Michelin", 15, 10)};
        Automovil auto2 = new Automovil("Mazda 2","CX5", Color.AZUL,
                new Motor(5.5, TipoMotor.BENCINA), new Estanque(30),
                new Persona("Florentino","Cortez"), rueda);

        System.out.println("auto = " + auto2.toString());
    }
}
