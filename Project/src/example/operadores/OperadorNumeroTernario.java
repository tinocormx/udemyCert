package example.operadores;

import java.util.Scanner;

public class OperadorNumeroTernario {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" Ingrese el un numero " );
        int a =  s.nextInt();

        System.out.println(" Ingrese el un numero " );
        int b =  s.nextInt();

        System.out.println(" Ingrese el un numero " );
        int c =  s.nextInt();
        int max = a > b ? a: b;
        max = max>c? max: c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("max = " + max);
    }
}
