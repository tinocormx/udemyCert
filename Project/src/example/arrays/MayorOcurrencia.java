package example.arrays;

import java.util.*;

public class MayorOcurrencia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer arreglo [] = new Integer[ 10];
        System.out.println("Dame 10  numeros");
        for (int i = 0; i <  arreglo.length; i++) {
            System.out.println("Dame un numero en la posicion[  " +  ( i+1 ) +"]");
            arreglo [i] = scan.nextInt();
        }
        List aLista = Arrays.asList(arreglo);
        Set<Integer> set  = new HashSet<Integer>( aLista);
        for ( Integer s: set ){
            System.out.println(s.toString()
                    + " " +Collections.frequency(aLista,s));
        }
    }
}
