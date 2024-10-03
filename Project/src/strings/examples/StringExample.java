package strings.examples;

public class StringExample {

    public static void main(String[] args) {
        String curso = "Programacion Java";
        String curso2=  new String( "Programacion Java" );
        boolean compare = curso == curso2;
        System.out.println("curso == curso2= " + compare);

        compare = curso.equals( curso2);
        System.out.println("curso.equals( curso2) = " + compare);

        String curso3 = "Programacion Java";
        compare = curso.equals( curso3 );
        System.out.println("urso.equals( curso3 ) = " + compare);
    }
}
