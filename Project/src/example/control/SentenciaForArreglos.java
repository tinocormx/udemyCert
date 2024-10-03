package example.control;

public class SentenciaForArreglos {
    public static void main(String[] args) {
        String arreglo [] = new String [6];
        String nombres [] = {"Tino", "PEpe", "MAria", "hugo"};
        for ( int i = 0; i< nombres.length; i ++){
            System.out.println("nombre[" +i+"]  " + nombres[i]);
        }

    }
}
