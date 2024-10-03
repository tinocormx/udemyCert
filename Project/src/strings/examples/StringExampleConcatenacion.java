package strings.examples;

public class StringExampleConcatenacion {

    public static void main(String[] args) {
        String curso = "Programacion Java";
        String profesor ="Florentino Cortez Balderas ";
        String detalle = curso + " Profesor: " + profesor;
        System.out.println("detalle = " + detalle);

        int numeroA=10;
        int numeroB=11;
        System.out.println(detalle +  numeroA + numeroB);
        System.out.println(detalle +  ( numeroA + numeroB ));
        System.out.println( numeroA + numeroB + detalle);
        String detalle2= curso.concat( profesor );
        System.out.println("detalle2 = " + detalle2);
        detalle2= curso.concat(": ".concat( profesor ) );
        System.out.println("detalle2 = " + detalle2);
    }
}
