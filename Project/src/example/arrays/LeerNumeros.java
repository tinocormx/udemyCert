package example.arrays;

import java.util.Scanner;

public class LeerNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arreglo [] = new int[ 10];
        System.out.println("Dame 10  numeros");
        for (int i = 0; i <  arreglo.length; i++) {
            System.out.println("Dame un numero en la posicion[  " +  ( i+1 ) +"]");
            arreglo [i] = scan.nextInt();
        }
        for (int i = 0; i <  arreglo.length; i++) {

            System.out.println(" "+ arreglo[ arreglo.length -1 -i] +" "+ arreglo[i]);
        }
    }
}
