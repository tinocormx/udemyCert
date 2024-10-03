package example.control;

import java.util.Scanner;

public class DiasWithSwitchCase {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Dame el numero del mes");
        int mes = scan.nextInt();
        int numeroDias =0;
        switch ( mes ){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numeroDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11 :
                numeroDias = 30;
                break;
            case 2:
                numeroDias = 28;
                break;
        }
        System.out.println("numeroDias = " + numeroDias);
    }
}
