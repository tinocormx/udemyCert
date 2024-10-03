package strings.examples;

public class EjemploStringArchivoExtension {
    public static void main(String[] args) {
        String nombreArchivo ="salida.txt";
        System.out.println("nombreArchivo.length() = " + nombreArchivo.length());
        System.out.println("nombreArchivo.lastIndexOf(\".\") = " + nombreArchivo.lastIndexOf("."));
        System.out.println("nombreArchivo.substring(nombreArchivo.lastIndexOf(\".\") ) = " + nombreArchivo.substring(nombreArchivo.lastIndexOf(".") ));
    }
}
