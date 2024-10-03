package example.arrays;

import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Dame 5 enteros");
        for (int i = 0; i <a.length ; i++) {

            System.out.println("Dame el numero ["+i+"]");
            a[i]=scan.nextInt();
        }
        int mayor =  a [0];
        for (int i = 1; i <a.length ; i++) {
            if ( mayor < a[i] ){
                mayor = a[i];
            }
        }
        System.out.println("mayor = " + mayor);
    }
}
