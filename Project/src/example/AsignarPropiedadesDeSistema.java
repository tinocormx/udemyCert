package example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class AsignarPropiedadesDeSistema {
    public static void main(String[] args)  {
        try {
            FileInputStream fis = new FileInputStream("src/example/Config.properties");
            Properties p = new Properties(System.getProperties());
            p.load(fis);
            System.setProperty("dado","dado");
            System.setProperties( p);
            System.getProperties().list( System.out);

        } catch (FileNotFoundException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
