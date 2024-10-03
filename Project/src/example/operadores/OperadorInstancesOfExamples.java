package example.operadores;

public class OperadorInstancesOfExamples {
    public static void main(String[] args) {
        String cadena ="Operador";
        Integer number = 1;

        boolean b = cadena instanceof String;
        System.out.println(" cadena es de tipo String ?: " + b);

        boolean b2 =  number instanceof  Integer;
        System.out.println("es de tipo entero = " + b2);

        Double d = 12.5d;
        boolean b3 = d instanceof  Double;
        System.out.println("es instancia de double = " + b3);
        System.out.println(" double es parte de number " + (d instanceof  Number ));
        System.out.println(" Integer es parte de number " + (number instanceof  Number ));



    }
}
