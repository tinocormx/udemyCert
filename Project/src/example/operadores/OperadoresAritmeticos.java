package example.operadores;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int i = 5;
        int j = i +4;
        System.out.println("j = " + j);

        i +=2;
        System.out.println("j = " + j);
        i +=5;
        System.out.println(" = " + i);
        
        j -=4;
        System.out.println("j = " + j);

        String sql= "Selece * from c";
        sql+=" where c.nombre='FCB'";
        System.out.println("sql = " + sql);
    }
}
