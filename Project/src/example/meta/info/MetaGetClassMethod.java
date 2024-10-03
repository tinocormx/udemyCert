package example.meta.info;

import java.lang.reflect.Method;

public class MetaGetClassMethod {
    public static void main(String[] args) {
        String texto ="Hola Mundo";
        Class strClass =  texto.getClass();
        System.out.println("strClass = " + strClass);
        System.out.println("strClass = " + strClass.getName());
        System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName());
        System.out.println("strClass.getPackageName()= " + strClass.getPackageName());
        for (Method method: strClass.getMethods() ){
            System.out.println("method.getName() = " + method.getName());
        }
        Integer  integer = 1;
        Class intgertClass =  integer.getClass();
        System.out.println("intgertClass.getName() = " + intgertClass.getName());
        System.out.println("intgertClass.getName() = " + intgertClass.getSimpleName());
        System.out.println("intgertClass.getSuperclass() = " + intgertClass.getSuperclass());

        for (Method method: intgertClass.getMethods() ){
            System.out.println("method.getName() = " + method.getName());
        }
    }
}
