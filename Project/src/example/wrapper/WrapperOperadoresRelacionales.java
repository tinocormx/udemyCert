package example.wrapper;

public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {
        Integer integer = Integer.valueOf(1000);
        Integer num2 = integer;
        System.out.println("num2 = " + num2);
        System.out.println("integer = " + integer);
        System.out.println("(num2==integer )     :" + (num2==integer ));

        num2 = 1000;
        System.out.println("num2 = " + num2);
        System.out.println("integer = " + integer);
        System.out.println("(num2==integer )     :" + (num2==integer ));
        System.out.println("tienen el mismo valor (num2.equals( integer ) )     :" + (num2.equals( integer ) ));
        System.out.println("(num2.intValue()==integer.intValue() )     :" + (num2.intValue()==integer.intValue() ));
        boolean condicion = num2< integer;
        System.out.println("condicion = " + condicion);
    }
}
