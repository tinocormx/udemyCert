package example.control;

import java.util.Scanner;

public class MultiplicarNumeros {
    public static void main(String[] args) {
        int suma = 0;
        int numeroUno =0;
        int numeroDos =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un un numero a multiplicar");
         numeroUno = scanner.nextInt();
        System.out.println("Dame un un numero a multiplicar");
        numeroDos = scanner.nextInt();
        String resultado ="";
        resultado = (numeroUno <0 && numeroDos<0)  ? "": numeroUno<0 || numeroDos <0? "-": "";
        System.out.println("Signo de la multiplicacion = " + resultado);

        numeroUno = Math.abs( numeroUno );
        numeroDos = Math.abs( numeroDos );

        for (int i = 0; i < numeroUno; i++) {
            suma += numeroDos;
        }
        System.out.println("La multiplicacion es :  " + resultado + suma);
    }
}
