package example.control;

public class SentenciaForEachExample {
    public static void main(String[] args) {
        int numeros [] = {1, 3, 5, 7, 9};
       for ( int num : numeros ){
           System.out.println("num = " + num);
       }
        String nombres [] = {"Tino", "PEpe", "MAria", "hugo"};
       for ( String nombre: nombres ){
           System.out.println("nombre = " + nombre);
       }
    }
}
