package example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {
        Date fecha  = new Date();
        System.out.println("fecha = " + fecha);
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM, yyyy 'at' HH:mm:ss z ");
        System.out.println("sdf = " + sdf);
        String strFecha =  sdf.format(fecha );
        System.out.println("strFecha = " + strFecha);
        long j = 0;
        for (int i = 0; i < 10000000; i++) {
            j+=i;

        }
        System.out.println("j = " + j);
        Date fecha2 = new Date();
        long tiempoDeProc = fecha2.getTime() - fecha.getTime();
        System.out.println("tiempoDeProc = " + tiempoDeProc);
    }
}
