package matrices.example;

public class Multidimensional{
    public static void main(String[] args) {
         int matriz [][] = new int[3][];

         matriz[0] = new int[3];
         matriz[1] = new int[2];
         matriz[2] = new int[9];

         for ( int x[]: matriz ){
             for ( int z:x){
                 System.out.print(" " + z);
             }
             System.out.println("");
         }
        for (int i = 0; i <matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {
                matriz [ i][j]= i*j;
            }

        }

        for ( int x[]: matriz ){
            for ( int z:x){
                System.out.print(" " + z);
            }
            System.out.println("");
        }
    }
}
