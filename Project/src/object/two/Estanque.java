package object.two;

public class Estanque {
    private int capacidad;

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Estanque(int capacidad) {
        this.capacidad = capacidad;
    }

    public Estanque() {
        this.capacidad = 40;
    }

    @Override
    public String toString() {
        return "Estanque{" +
                "capacidad=" + capacidad +
                '}';
    }
}
