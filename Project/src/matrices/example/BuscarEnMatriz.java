package matrices.example;

public class BuscarEnMatriz {

    public static void main(String[] args) {
        int  data[][]= {{1,2}, {3}, {3}};
        int key = 1;
        boolean encontrado = false;

        for (int i = 0; i <data.length && encontrado == false  ; i++) {
            for (int j = 0; j < data[i].length && encontrado == false ; j++) {
                if( key ==  data[i][j])
                {
                    encontrado = true;
                }
            }

        }
        System.out.println("encontrado = " + encontrado);
    }
}
