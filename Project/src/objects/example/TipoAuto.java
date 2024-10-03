package objects.example;

public enum TipoAuto {
    SEDAN ("Sedan", "Auto Mediano", 4),
    PICKUP ("Station", "Auto Grande", 5),
   HATCHBACK ("Compacto", "" , 3),
    STATION_VAGON("x", "y",1),
    COUPE ("w","x", 9),
    FURGON ("1", "3", 9);

    private final String  nombre;
    private  final int  numeroPuertas;
    private  final String  description;

    TipoAuto(String nombre, String description, int numeroPuertas) {
        this.nombre = nombre;
        this.numeroPuertas = numeroPuertas;
        this.description = description;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public String getDescription() {
        return description;
    }
}
