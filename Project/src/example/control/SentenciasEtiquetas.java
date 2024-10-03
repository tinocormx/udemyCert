package example.control;

public class SentenciasEtiquetas {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if ( i == 2 ){
                continue;
            }
            System.out.println("i = " + i);
        }
        System.out.println("\n");
        label1:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ( i == 2 ){
                    continue label1;
                }
                System.out.println("i = " + i +" j = "+ j);
            }


        }
        System.out.println("break example ");
        label2ForBreak:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ( i == 2 ){
                    continue label2ForBreak;
                }
                System.out.println("i = " + i +" j = "+ j);
            }


        }
    }
}
