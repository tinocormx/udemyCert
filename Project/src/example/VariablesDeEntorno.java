package example;

import java.util.Map;

public class VariablesDeEntorno {
    public static void main(String[] args) {
        Map<String, String> varaiableEntorno  = System.getenv();
        System.out.println("varaiableEntorno = " + varaiableEntorno);
        String userName = System.getenv("USERNAME");
        System.out.println("userName = " + userName);
        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        System.out.println("Listando variables de ambiente");
        for( String key :  varaiableEntorno.keySet()){
            System.out.println("" + key  + " = "+ varaiableEntorno.get(key));
        }
        System.out.println("Llamando al gc");
        System.gc();


    }
}
