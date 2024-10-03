package example;

public class OperadorAritmetico {
    public static void main(String[] args) {
        int i = 5;
        int j = 4;
        int suma = i +j;
        System.out.println("suma = " + suma);
        System.out.println("i+j = " + i+j);
        System.out.println(  i+j +" i+j = " );

        int resta = i-j;
        System.out.println("resta = " + resta);
        System.out.println("(i - j) = " + (i - j));

        int multi = i +j ;
        System.out.println("multi = " + multi);

        double div= (float)i /j ;
        System.out.println("div = " + div);

        int resto  = i % j ;

        System.out.println("resto = " + resto);
    }
}
