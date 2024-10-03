package example.control;

public class SentenciaWhile {
    public static void main(String[] args) {
        int i = 0;
        while ( i <= 5 )
        {
            System.out.println("i = " + i);
            i++;

        }
        boolean bandera = true;

        while (  bandera ){
            if ( i== 7 ){
                bandera = false;
            }
            System.out.println("i = " + i);
            i++;
        }

        do{
            System.out.println(" Desde dentro del while " );
        }while (bandera);
    }
}
