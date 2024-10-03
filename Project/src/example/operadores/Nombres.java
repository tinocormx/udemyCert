package example.operadores;

import java.util.Scanner;

public class Nombres {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Dame el primer nombre");
        String nombre1 = scanner.nextLine();

        System.out.println("Dame el segundo nombre");
        String nombre2 = scanner.nextLine();

        System.out.println("Dame el tercer nombre");
        String nombre3 = scanner.nextLine();

        if  (  nombre1.length() > nombre2.length() && nombre1.length() > nombre3.length() ){
            System.out.println(" el nombre mayo es:  " + nombre1);
        } else if ( nombre2.length() > nombre3.length() ) {
            System.out.println(" el nombre mayo es:  " + nombre2);
        }else {
            System.out.println(" el nombre mayo es:  " + nombre3);
        }
    }
}
