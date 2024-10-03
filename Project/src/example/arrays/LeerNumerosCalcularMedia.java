package example.arrays;

import java.util.Scanner;

public class LeerNumerosCalcularMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arreglo [] = new int[ 10];
        int totalCeros =0;
        int totalNumeroPositivos = 0;
        int totalNumeroNegativo = 0;
        double sumaNumerosPositivos =0;
        double sumaNumeroNegativo =0;

        System.out.println("Dame 10  numeros");
        for (int i = 0; i <  arreglo.length; i++) {
            System.out.println("Dame un numero en la posicion[  " +  ( i+1 ) +"]");
            arreglo [i] = scan.nextInt();
        }
        for (int i = 0; i <  arreglo.length; i++) {
            if (   arreglo[i] == 0 ){
                totalNumeroPositivos++;
                totalCeros++;
            }else if ( arreglo[i] > 0 )
            {
                totalNumeroPositivos++;
                sumaNumerosPositivos += arreglo[i];
            } else if (  arreglo[i] < 0) {
                totalNumeroNegativo++;
                sumaNumeroNegativo += arreglo[i];
            }

        }
        System.out.println( "Promedio Numeros positivos: " + (  totalNumeroPositivos > 0? sumaNumerosPositivos/totalNumeroPositivos: " N/A"));
        System.out.println( "Promedio Numeros negativos: " + (  totalNumeroNegativo > 0? sumaNumeroNegativo /totalNumeroNegativo: " N/A"));
        System.out.println("Cuenta de ceros = " +totalCeros);

    }
}
