package example;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ExampleJavaUtilCalendar {
    public static void main(String[] args) {
        Calendar  calendar = Calendar.getInstance();
        calendar.set( 1980, 3, 13, 5,0, 1);
        calendar.set(Calendar.MINUTE,3);
        calendar.set( Calendar.AM_PM,Calendar.AM);
        Date fecha = calendar.getTime();
        System.out.println("fecha = " + fecha);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MMMM-dd HH:mmm:ss a");
        String strFecha =  sdf.format(fecha);
        System.out.println("strFecha = " + strFecha);

    }
}
