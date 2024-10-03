package strings.examples;

public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;
        boolean isNull= curso == null;
        System.out.println("isNull = " + isNull);
        if(!isNull) {
            System.out.println("curso.toUpperCase() = " + curso.toUpperCase());
        }
        
        String curso2="";
        System.out.println("curso2.isEmpty() = " + curso2.isEmpty());
        System.out.println("curso2.length() = " + curso2.length());
        System.out.println("curso2.isBlank() = " + curso2.isBlank());
    }
}
