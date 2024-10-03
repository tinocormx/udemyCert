package example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExampleJavaParser {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        Date fecha = format.parse("2020/03/13");
        System.out.println("fecha = " + fecha);
        System.out.println("format = " + format.format( fecha));
        Date fecha1 =  new Date();
        if(  fecha1.after( fecha) ){
            System.out.println("La fecha parseda es  posterior");
        }
        else{
            System.out.println("La fecha actual anterior");
        }
    }
}
