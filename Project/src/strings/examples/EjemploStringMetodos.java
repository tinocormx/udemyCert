package strings.examples;

public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre= "Florentino Cortez Balderas";
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nnombre.equals(\"Florentino Cortez Balderas\")ombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Florentino Cortez Balderas\") = " +nombre.equals("Florentino Cortez Balderas") );
        System.out.println("nombre.equalsIgnoreCase(\"Florentino Cortez Balderas\") = " + nombre.equalsIgnoreCase("Florentino Cortez Balderas"));
        System.out.println("nombre.compareTo(\"Florentino Cortez Balderas\") = " + nombre.compareTo("Florentino Cortez Balderas"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println(" nombre.charAt( nombre.length()-1) = " +  nombre.charAt( nombre.length()-1));
        System.out.println("nombre.substring(2, 8) = " + nombre.substring(2, 8));

        String trabalenguas ="trabalenguas";
        System.out.println("trabalenguas.replace(\"a\",\".\") = " + trabalenguas.replace("a","."));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('z') = " + trabalenguas.lastIndexOf('z'));
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t"));
        System.out.println("trabalenguas.startsWith(\"b\") = " + trabalenguas.startsWith("b"));
        System.out.println("trabalenguas.endsWith(\"lenguals\") = " + trabalenguas.endsWith("lenguals"));
        System.out.println(" = " );
        System.out.println(" = ".trim() );
    }
}
