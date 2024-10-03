package example.operadores;

import java.util.Scanner;

public class EjerciciosBasicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in );
        System.out.println("Dame un numero ");
        int  a = scanner.nextInt();
        System.out.println("Dame otro numero ");
        int  b = scanner.nextInt();

        int mayor =  a >b ? a: b;
        int menor =  a < b ? a: b;
        System.out.println("el mayo es = " + mayor);
        System.out.println("el menor es = " + menor);


    }
}
