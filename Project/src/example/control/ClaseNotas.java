package example.control;

import java.util.Scanner;

public class ClaseNotas {
    public static void main(String[] args) {
        float f []  = new  float[20];
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        do{
            System.out.println("Dame la nota "+  ( i + 1) );
            f[ i ] = scanner.nextLong();
            if(  f [ i ] == 0){
                System.out.println("Finalizando el programa");
                break;
            }else if  ( f [i ]>=1 && f [ i]<=7 ){
                    i++;
            }else{
                System.out.println("nota invalida = " + f[i]);
            }
        }while (i < 20);

        // calcular promedio
        float promedio = 0;
        int notasUno = 0;
        int notasMayoresA5 = 0;
        float sumaNotasMayoresA5 = 0.0f;
        int notasInferioresA4 = 0;
        float sumaNotasInferioresA4 = 0.0f;

        for (float nota: f){
            promedio += nota;
            if ( nota == 1 ){
                notasUno ++;
            }
            if  ( nota > 5 ){
                notasMayoresA5++;
                sumaNotasMayoresA5 += nota;
            } else if ( nota < 4) {
                notasInferioresA4++;
                sumaNotasInferioresA4 += nota;
            }
        }
        if ( notasMayoresA5 >0 ){
            System.out.println("Notas MAyores a 5 =" +( sumaNotasMayoresA5 / notasMayoresA5));
        }
        if ( notasInferioresA4 > 0 ){
            System.out.println("Notas Menores a 4 =" +( sumaNotasInferioresA4 / notasInferioresA4));
        }
        System.out.println("Unos encontrados = " + notasUno);
        System.out.println("Promedio total " + (promedio/f.length ));
    }
}
