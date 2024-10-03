package example.chars;

public class PrimitivosBooleanos {
    public static void main(String[] args) {
        boolean datoLogic = true;
        System.out.println("datoLogic = " + datoLogic);

        double d = 98765.43e-3; // 98.76543
        float f = 1.2345e2f;  //123.45  siempre se debe colocar la f, porque por default se toma la letr d
        datoLogic =  d > f;
        System.out.println("datoLogic = " + datoLogic);
    }
}
