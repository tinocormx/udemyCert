package example.control;

import java.util.Scanner;

public class NumeroMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elementos[] = new int[10];
        int menor = 0;
        for (int i = 0; i <10 ; i++) {
            System.out.println("Dame un numero");
            elementos [ i ] = scanner.nextInt();
        }
        menor = elementos[ 0 ];
        for ( int x : elementos ){
            if ( menor > x ){
                menor = x;
            }
        }
        if( menor < 10 ) {
            System.out.println("El numero es menor que 10");
        }else {
            System.out.println("El numero es igual a 10 o mayor");
        }
    }
}
