package example;

public class PasarPorReferencia {
    public static void main(String[] args) {
        int arreglo [] = {1,2,3,4,3,5 };
        System.out.println("Antes de invocar al metodo");
        for ( int edad: arreglo){
            System.out.print(" " + edad);
        }
        test( arreglo );
        System.out.println("Despues de invocar al metodo");
        for ( int edad: arreglo){
            System.out.print(" " + edad);
        }
    }
    public  static   void test ( int x[] ){
        for ( int i = 0; i < x.length;  i++){
            x[ i ] = x[ i ]+i;
        }
    }
}
