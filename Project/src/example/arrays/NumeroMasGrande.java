package example.arrays;

public class NumeroMasGrande {


    public static void main(String[] args) {
        int x [ ] = {14, 33, 15, 36, 78, 21, 43};
        int masAlto= x[0];
        for (int i = 0; i <x.length ; i++) {
            if(  x[i] > masAlto){
                masAlto = x[i];
            }
        }
        System.out.println("El numero mas grande es: " +masAlto);
    }
}
