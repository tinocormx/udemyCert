package example.operadores;

import java.util.Scanner;

public class EjemploLogin {
    public static void main(String[] args) {
        String user="fcb";
        String password="12345";
        Scanner scanner = new Scanner( System.in );
        System.out.println(" Usuario  " );
        String userIn = scanner.next();
        System.out.println("Password: " );
        String passwordIn = scanner.next();

        boolean isAuth = false;
        if (  user.equals( userIn) && password.equals( passwordIn)){
            isAuth = true;
        }
        System.out.println("isAuth = " + isAuth);
    }
}
