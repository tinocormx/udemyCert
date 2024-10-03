package objects.example;

import java.awt.*;

public class EjemploAutomovil{
    public static void main(String[] args) {
        Automovil auto = new Automovil("Ford", "Ranger", Color.AZUL, "1");
        Automovil auto2 = new Automovil("Ford", "Ranger", Color.NARANJO, "1");
        System.out.println("auto.fabricante = " + auto.getFabricante());
        System.out.println("auto.modelo = " + auto.getModelo());
        System.out.println("auto.cilindrada = " + auto.getCilindrada());
        System.out.println("auto.color = " + auto.getColor().getColor());
        System.out.println();
        String detalle =  auto.detalle();
        System.out.println(detalle);
        System.out.println( auto.aceletar(2));
        System.out.println( auto.frenar());

        System.out.println( auto == auto2);
        System.out.println( auto.equals( auto2)  );

        System.out.println( auto );
        System.out.println( auto2);
    }
}