package example.operadores;

import java.util.Scanner;

public class ValidacionTanques {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println(" Cuantos litros tiene el tanque ?");
        double volumenTanque =  scanner.nextDouble();
        String out= "Insuficiente";
        if ( volumenTanque >=  70 ){
            out= "Estanque Lleno";
        } else if ( volumenTanque >= 60 && volumenTanque  <70 ) {
            out= "Estanque casi lleno";
        } else if (volumenTanque >= 40 && volumenTanque  <60) {
            out= "Estanque  3/4";
        } else if ( volumenTanque >= 35 && volumenTanque  <40 ) {
            out= "Medio Estanque ";
        }
        else if ( volumenTanque >= 20 && volumenTanque  <35 ) {
            out= "MSuficiente ";
        }
        System.out.println("out = " + out);

    }
}
