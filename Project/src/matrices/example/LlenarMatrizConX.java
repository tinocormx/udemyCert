package matrices.example;

import java.util.Scanner;

public class LlenarMatrizConX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        System.out.println("Dame el tamaño de la matriz:");
        int x =0;
        x = scanner.nextInt();

        String matriz [][] = new String[x][x];

        int aux =0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    matriz[i][j] = "X";
                }else {
                    matriz[i][j] = "_";
                }
            }
            matriz[i][matriz.length-aux -1 ]= "X";
            aux++;
        }


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print( matriz[i][j] +"\t");
            }
            System.out.println();
        }


    }
}
