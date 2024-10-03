package example;

public class EjemploClaseMath {
    public static void main(String[] args) {
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        double max = Math.max(3.5, 1.2);
        System.out.println("max = " + max);

        double redondeo  = Math.ceil( 5.6);
        System.out.println(redondeo);

        double potencia = Math.pow(10,3);
        System.out.println("potencia = " + potencia);

        double  grados  = Math.toDegrees(1.56);
        System.out.println(grados);
    }
}