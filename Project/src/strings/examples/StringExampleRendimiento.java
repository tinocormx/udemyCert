package strings.examples;

public class StringExampleRendimiento {

    public static void main(String[] args) {
       String a = "a";
       String b = "b";
       String c= a;
       StringBuilder sb = new StringBuilder(a );
       long initial = System.currentTimeMillis();

        for( int i =0; i <500; i++ ){
            //c= c.concat(a).concat(b).concat("\n"); //mejor
            //c= c+a+b+"\n"; // lento
            sb.append(a).append(b).append("\n"); // mas eficiente
        }
       long end = System.currentTimeMillis();

        System.out.println( end  - initial);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}
