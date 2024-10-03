package example.arrays;

import java.util.Scanner;

public class Promedios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double promedio =0;
        System.out.println("Promedio de clases");
        double calificaciones[]  = new double[7];
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println(" dame la calificacion : = " + (i+1));
            calificaciones[i]= scan.nextDouble();
        }
        for (int i = 0; i < calificaciones.length ; i++) {
            promedio += calificaciones[i];
        }
        System.out.println("promedio = " + ( promedio / calificaciones.length ));
    }
}

