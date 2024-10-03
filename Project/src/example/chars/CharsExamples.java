package example.chars;

public class CharsExamples {
    public static void main(String[] args) {
        char caracter= 's';
        System.out.println("caracter = " + caracter);

        char dos ='\u0040';

        System.out.println("dos = " + dos);

        char tres =64;

        System.out.println("tres = " + tres);
        System.out.println("( tres == dos ) = " + ( tres == dos ));
        char simbolo ='@';
        System.out.println("simbolo = " + simbolo);

        System.out.println("char corresponde en byte "+ Character.BYTES);
        System.out.println("char corresponde en bites "+ Character.SIZE);
        System.out.println("char Character.MIN_VALUE "+ Character.MIN_VALUE);
        System.out.println("char Character.MAX_VALUE "+ Character.MAX_VALUE);
        
//        for ( char x  = Character.MIN_VALUE; x < Character.MAX_VALUE; x++ ){
//            System.out.println("x = " + x);
//        }
        char espacio= ' ';
        System.out.println("espacio = " + espacio);

        char retrocedo = '\b';

        System.out.println("retrocedo ==" + retrocedo);

        char tabulador ='\t';
        System.out.println("tabulador = " + tabulador+" aqui0") ;
        
        char nuevaLinea= '\n';
        System.out.println("nuevaLinea = " + nuevaLinea + " en otro linea");

        char retonorCarro = '\r';
        System.out.println("retonorCarro = " + retonorCarro);
    }
}
