package matrices.example;

import java.util.Scanner;

public class ImprimirSilla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        System.out.println("Dame el tamaño de la matriz:");
        int x =0;
        x = scanner.nextInt();

        String matriz [][] = new String[x][x];


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if ( j == 0)
                matriz[i][j] = "1";
                else
                    matriz[i][j]="0";
            }
        }

        int mitad = (int) Math.ceil(  matriz.length / 2 ) +1;

        System.out.println("mitad = " + mitad);

        for( int k= mitad -1; k < mitad ; k++ )
            for (int i = 0; i < matriz[mitad-1].length  ; i++) {
                matriz[k][i]="1";
            }

        for( int k= mitad -1; k < matriz.length ; k++ )
        {
            matriz[ k][x-1]="1";
        }


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print( matriz[i][j] +"\t");
            }
            System.out.println();
        }


    }
}
