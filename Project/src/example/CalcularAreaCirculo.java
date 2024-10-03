package example;

import java.util.Scanner;

public class CalcularAreaCirculo {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Dame el radio para calcular el araa");
        double radio =  scan.nextDouble();
        double area = Math.PI * Math.pow( radio, 2);
        System.out.println("x = " + area);
    }
}
