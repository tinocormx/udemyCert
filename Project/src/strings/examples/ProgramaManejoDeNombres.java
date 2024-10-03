package strings.examples;

import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println(" Ingresa  nombre uno: " );
        String nombreUno = scanner.nextLine();
        System.out.println(" Ingresa nombre dos: " );
        String nombreDos = scanner.nextLine();

        System.out.println(" Ingresa nombre tres: " );
        String nombreTres = scanner.nextLine();
        String segundoCarUno=nombreUno.substring(1,2).toUpperCase();
        String segundoCarDos=nombreDos.substring(1,2).toUpperCase();
        String segundoCarTres=nombreTres.substring(1,2).toUpperCase();

        String ultimosCarUno=nombreUno.substring( nombreUno.length()-2);
        String ultimosCarDos=nombreDos.substring(nombreDos.length() -2);
        String ultimosCarTres=nombreTres.substring(nombreTres.length()-2);

        String finalString = segundoCarUno.concat(".").concat(ultimosCarUno).concat("_").concat(segundoCarDos)
                .concat(".").concat(ultimosCarDos).concat("_").concat(segundoCarTres).concat(".").concat(ultimosCarTres);

        System.out.println("finalString = " + finalString);


    }
}
