package example.arrays;

public class Histograma {
    public static void main(String[] args) {
        int alementos [] = {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1};
        int ocurrencias[] = new int[6];

        for (int i = 0; i <ocurrencias.length ; i++) {
           int aux =  i +1;
            for (int j = 0; j <alementos.length ; j++) {
                if ( aux == alementos[j]){
                    ocurrencias [i ]= ocurrencias [i ] +1;
                }
            }
        }

        for (int i = 0; i <ocurrencias.length ; i++) {
            System.out.println((i +1)+ " ocurrencias[i] = " + ocurrencias[i]);

        }
    }
}
