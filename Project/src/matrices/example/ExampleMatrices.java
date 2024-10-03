package matrices.example;

public class ExampleMatrices {
    public static void main(String[] args) {
        String  vars  [][] = new String[10][10];

        for (int i = 0; i < vars.length; i++) {
            for (int j = 0; j <vars[i].length ; j++) {
                vars[i][j] =  String.valueOf( ""+i +j);
            }
        }


        for (int i = 0; i < vars.length; i++) {
            for (int j = 0; j <vars[i].length ; j++) {
                System.out.println("vars["+i+"]["+j+"] = " + vars[i][j]);
            }
        }
        String nombres[][] = {{"a", "b"}, {"c", "d"}, {"e", "f"}};
        for ( String datos[]: nombres){
            for ( String name: datos){
                System.out.print(" " + name);
            }
            System.out.print("\n");
        }
        
    }
}
