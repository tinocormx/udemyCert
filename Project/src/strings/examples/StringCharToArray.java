package strings.examples;

public class StringCharToArray {
    public static void main(String[] args) {
        String trabalenguas ="trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char chars[] = trabalenguas.toCharArray();
        System.out.println("chars = " + chars);
        for (int i = 0; i < chars.length; i++) {
            System.out.println("chars["+i+"] = " + chars[i]);
            
        }
        System.out.println("trabalenguas = " + trabalenguas.split("a"));
        String arreglo2[] = trabalenguas.split("a");

        for (int i = 0; i <arreglo2.length ; i++) {
            System.out.println("arreglo2 = " + arreglo2[i]);
        }
        String archivo = "alguna_archivo.pdf";
        String arc [] = archivo.split("\\.");
        for (int i = 0; i < arc.length; i++) {
            System.out.println("arc[i] = " + arc[i]);
            
        }
    }
}
