package example.control;

import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {
        int num = 0;

        switch ( num ) {
            case 0:
                System.out.println("num = " + num);
                break;
            case 1:
                System.out.println("num = " + num);
                break;
            case 2:
                System.out.println("num = " + num);
                break;
            case 3:
                System.out.println("num = " + num);
                break;
            default:
                System.out.println(" default  num = " + num);
        }

        String nombre = "Hugo";
        switch ( nombre ){
            case "maria":
                System.out.println("nombre = " + nombre);
                break;
            case "Hugo":
                System.out.println("nombre = " + nombre);
                break;
            default:
                System.out.println("nombre por default = " + nombre );
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("DAme un numero");
        int numeroDeMes = scan.nextInt();
        switch (numeroDeMes){
            case 1:
                System.out.println("Enero  " );
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo ");
                break;
            case 4:
                System.out.println("Abril ");
                break;
            case 5:
                System.out.println("Mayo ");
                break;
            case 6:
                System.out.println("Junio ");
                break;
            default:
                System.out.println(" Indefinido " );
        }

    }
}
