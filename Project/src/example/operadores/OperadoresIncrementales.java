package example.operadores;

public class OperadoresIncrementales {
    public static void main(String[] args) {
        // pre incremento
        int i= 1;
        System.out.println("i = " + i);
        int j = ++i;
        System.out.println("j = " + j);
        System.out.println("i = " + i);

        //post incremento
        j = 2;
        System.out.println("j = " + j);
        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //pre decremento
        i=5;
        j= --i;
        System.out.println("i = " + i);
        System.out.println("i = " + i);
        
        //post decrement
        
        i = 11;
        j=  i --;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("j = " + (++j));
        System.out.println("j = " + (j++));
        System.out.println("j = " + (j));
    }
}
