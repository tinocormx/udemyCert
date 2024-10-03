package example.control;

public class CalcularNumeroDiasDelMes {
    public static void main(String[] args) {
        int mes =  9;
        int numeroDias=  0;
        if ( mes ==1 || mes == 3 || mes == 5 || mes ==  7 || mes == 8 || mes == 10 || mes == 12 ){
            numeroDias = 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            numeroDias = 30;
        }else if( mes == 2 ) {
            numeroDias = 28;
        }
        System.out.println("numeroDias = " + numeroDias);
    }
}
