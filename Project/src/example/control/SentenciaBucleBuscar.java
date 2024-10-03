package example.control;

public class SentenciaBucleBuscar {
    public static void main(String[] args) {
        String frase ="Anita lava la tina";
        int cantidad = 0;
        for (int i = 0; i < frase.length() ; i++) {
            if( frase.charAt( i ) != 'A'){
                continue;
            }
            cantidad ++;

        }
        System.out.println("cantidad  de veces encontrada= " + cantidad);
    }
}
