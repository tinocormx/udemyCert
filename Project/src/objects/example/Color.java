package objects.example;

public enum Color {
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    NARANJO("Naranjo");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
