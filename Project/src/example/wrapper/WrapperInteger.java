package example.wrapper;

public class WrapperInteger {
    public static void main(String[] args) {
        Integer  integer = new Integer("45000");
        System.out.println("integer = " + integer);
        integer = Integer.valueOf("2");
        System.out.println("integer with string = " + integer);

        integer = Integer.valueOf(333563);
        System.out.println("integer  with string = " + integer);
        int i  = integer;
        i  = integer.intValue();
        System.out.println("i = " + i);
        System.out.println("integer.intValue()= " + integer.intValue());
        System.out.println("integer.longValue() = " + integer.longValue());
        System.out.println("integer.byteValue() = " + integer.byteValue());
        System.out.println("integer.shortValue() = " + integer.shortValue());
    }
}
