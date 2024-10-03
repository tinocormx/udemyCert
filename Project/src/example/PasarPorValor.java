package example;

public class PasarPorValor {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("iniciamos con el valor de i = " + i);
        x(i);
        System.out.println(" finaliza el metodo test i = " + i);
    }

    public static  void x(int i){
        System.out.println("i como argumento = " + i);
        i =45;
        System.out.println("nuevo valor de i = " + i);
    }
}
