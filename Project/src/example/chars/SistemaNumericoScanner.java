package example.chars;

import javax.swing.*;
import java.util.Scanner;

public class SistemaNumericoScanner {
    public static void main(String[] args) {
        //String numeroStr= JOptionPane.showInputDialog(null, "Tu dame un numero pero rapido");
        Scanner scanner = new Scanner( System.in );
        System.out.println(" Ingresa el usuario: " );
        String numeroStr = scanner.nextLine();
        int numeroDecimal = Integer.parseInt(numeroStr);
        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println("numeroDecimal: "+ numeroDecimal + " numero binario "+ Integer.toBinaryString( numeroDecimal));
        int binarioExample= 0b111110100;
        System.out.println("binarioExample = " + binarioExample);
        System.out.println("binarioExample  = " + binarioExample + " numero en octal "+ Integer.toOctalString( binarioExample));
        int numeroOctal= 0764;
        System.out.println("numeroOctal = " + numeroOctal);
        System.out.println("numeroOctal = " + numeroOctal + " numero Hexadecimal "+ Integer.toHexString( numeroOctal));
        int numeroHexadecimal= 0x1f4;
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);

        String mensaje = "Numero Decimal= " + numeroDecimal;
        mensaje +=  "\nNumero binario= "+ Integer.toBinaryString( numeroDecimal );
        mensaje += "\nNumero en octal= "+ Integer.toOctalString( numeroDecimal );
        mensaje += "\nNumero Hexadecimal= "+ Integer.toHexString( numeroHexadecimal );

        System.out.println(mensaje);
    }
}

