package example.operadores;

public class OperadorInstanceOfGenericos {
    public static void main(String[] args) {
        Object texto = "Hola";

        Number  number= 2;
        boolean b = texto instanceof  String;
        System.out.println("b = " + b);

        boolean b1 = texto instanceof  Integer;
        System.out.println("b1 = " + b1);
        System.out.println("number es tipo integer = " + ( number instanceof  Integer) );
        System.out.println("number es tipo Number = " + ( number instanceof  Number) );
        System.out.println("number es tipo Object = " + ( number instanceof  Object) );
        System.out.println("number es tipo Long = " + ( number instanceof  Long) );
        System.out.println("number es tipo Double = " + ( number instanceof  Double) );

        Number decimal = 34.3;
        System.out.println("decimal instances of Double = " + (decimal instanceof Double) );
        System.out.println("decimal instances of Float = " + (decimal instanceof Float) );
        System.out.println("decimal instances of Iteger = " + (decimal instanceof Integer) );
    }
}
