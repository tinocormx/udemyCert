package example;

public class ReadArguments {
    public static void main(String[] args) {
        System.out.println("Argumentos desde linea de comandos");
        for (String arg: args ){
            System.out.println("arg = " + arg);
        }
    }
}
