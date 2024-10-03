package objects.example;

public class EjemploAutomovilEnum {
    public static void main(String[] args) {
        Automovil auto = new Automovil("Ford", "Ranger", Color.AZUL, "1");
        Automovil auto2 = new Automovil("Ford", "Ranger", Color.NARANJO, "1");
        System.out.println("auto.fabricante = " + auto.getFabricante());
        System.out.println("auto.modelo = " + auto.getModelo());
        System.out.println("auto.cilindrada = " + auto.getCilindrada());
        System.out.println("auto.color = " + auto.getColor().getColor());
        System.out.println();
        String detalle =  auto.detalle();
        auto2.setTipoAuto(TipoAuto.PICKUP);
        auto.setTipoAuto( TipoAuto.SEDAN);
        System.out.println(detalle);
        System.out.println( auto.aceletar(2));
        System.out.println( auto.frenar());

        System.out.println( auto == auto2);
        System.out.println( auto.equals( auto2)  );

        System.out.println( auto );
        System.out.println( auto2);

        switch ( auto.getTipoAuto() ){
            case SEDAN :
                System.out.println("Es un sedan");
                break;
            case PICKUP:
                System.out.println(" Es una pickup ");
                break;
            case COUPE:
                System.out.println("Es un coupe");
                break;
            case FURGON:
                System.out.println("Es un furgon");
                break;
            case HATCHBACK:
                System.out.println("es un corto");
                break;
            case STATION_VAGON:
                System.out.println("Es un statio");
                break;
        }

        switch ( auto.getTipoAuto() ){
            case SEDAN ->
                System.out.println("Es un sedan");

            case PICKUP ->
                System.out.println(" Es una pickup ");

            case COUPE ->
                System.out.println("Es un coupe");

            case FURGON ->
                System.out.println("Es un furgon");

            case HATCHBACK ->
                System.out.println("es un corto");

            case STATION_VAGON ->
                System.out.println("Es un statio");

        }

        TipoAuto[] tipo =  TipoAuto.values();

        for (TipoAuto ta : tipo ){
            System.out.println( ta +" =>"+ ta.name() + ", " +ta.getNombre()+", "+ ta.getNumeroPuertas());
        }

    }
}