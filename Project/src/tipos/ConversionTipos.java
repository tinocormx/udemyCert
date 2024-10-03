package tipos;

public class ConversionTipos {
    public static void main(String[] args) {
        String str = "30";

        int numeroInt = Integer.parseInt(str);
        System.out.println("numeroInt = " + numeroInt);
        
        String strDouble ="1222.34e-2";
        double doubleNumber=  Double.parseDouble(strDouble);
        System.out.println("doubleNumber = " + doubleNumber);

        String strBoolean ="true";
        boolean flag =  Boolean.parseBoolean(strBoolean);
        System.out.println("flag = " + flag);

        int otroNumeroInt=110;
        System.out.println("otroNumeroInt = " + otroNumeroInt);
        String otroInteger=  Integer.toBinaryString( otroNumeroInt );
        System.out.println("otroInteger = " + otroInteger);

        otroInteger = String.valueOf( otroNumeroInt );
        System.out.println("otroInteger = " + otroInteger);

        double otroRealDouble= 1.23456e2;
        String otroRealStr =Double.toString( otroRealDouble );
        System.out.println("otroRealStr = " + otroRealStr);
        otroRealStr= String.valueOf(23232.33f);
        System.out.println("otroRealStr = " + otroRealStr);

        int i = Short.MAX_VALUE+1;
        short s =(short) i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        
        float  f =  i;
        System.out.println("f = " + f);
    }
}
