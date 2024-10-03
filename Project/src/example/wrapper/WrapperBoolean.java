package example.wrapper;

public class WrapperBoolean {
    public static void main(String[] args) {
        Integer numer1 = 1;
        Integer numero2 = 2;

        boolean primBoolean = numer1> numero2;
        System.out.println("primBoolean = " + primBoolean);

        Boolean objBoolean = false;
        System.out.println("objBoolean = " + objBoolean);
        objBoolean = Boolean.FALSE;
        System.out.println("objBoolean = " + objBoolean);
        objBoolean = Boolean.valueOf( primBoolean );
        System.out.println("objBoolean = " + objBoolean);
        Boolean objBoolean2 = false;
        System.out.println("(objBoolean2 == objBoolean = " + (objBoolean2 == objBoolean ));
    }
}
