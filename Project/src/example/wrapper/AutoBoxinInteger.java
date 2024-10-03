package example.wrapper;

public class AutoBoxinInteger {
    public static void main(String[] args) {
        Integer integer[] = { 1, 2,4, 5,6,6 ,7,8 ,9, 10, 11};
        int suma = 0;

        for ( Integer x : integer ){
            if ( x.intValue() %2 == 0 )
                suma +=  x.intValue();
        }
        System.out.println("suma = " + suma);
    }
}
