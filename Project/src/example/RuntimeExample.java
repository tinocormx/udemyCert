package example;

import java.io.IOException;

public class RuntimeExample {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        Process p ;

        if( !System.getProperty("os.name").equalsIgnoreCase("wind")){
            try {
                p  = rt.exec("gedit");
                p.waitFor();
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Se ejecuto el comando: gedit");
        }
    }
}
