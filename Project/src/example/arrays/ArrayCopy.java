package example.arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int x [] =  {1,2,3,5,6};
        int []y = new int[  x.length ];
        for (int i = 0; i < x.length ; i++) {
            System.out.println("y[i] = " + y[i]);
        }
        System.arraycopy(x,0,y,0, x.length);
        for (int i = 0; i < x.length ; i++) {
            System.out.println("y[i] = " + y[i]);
        }
    }
}
