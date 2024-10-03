package example;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println("Dame una fecha de nacimiento en formato dd/MM/yyyy");
        String fecha = scanner.nextLine();
        System.out.println("fecha  ingresada= " + fecha);
        SimpleDateFormat  sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date fechaNacimiento  = sdf.parse( fecha );
            Date fActual = new Date();
            int anyos=  fActual.getYear() - fechaNacimiento.getYear();
            System.out.println("Tienes  = " + anyos +" años");
        } catch (Exception e) {
            System.out.println(" Error en el formato de la fecha = " + fecha);
            throw new RuntimeException(e);
        }


    }
}
