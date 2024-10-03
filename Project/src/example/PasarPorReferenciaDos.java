package example;

class Persona{
    private  String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

public class PasarPorReferenciaDos {
    public static void main(String[] args) {
       Persona persona = new Persona();
       persona.setNombre("Andres");

        System.out.println("Antes de invocar al metodo persona.getNombre() = " + persona.getNombre());
        test( persona );
        System.out.println("Despues de invocar al metodo persona.getNombre() = " + persona.getNombre());

    }
    public  static   void test ( Persona persona ){
        System.out.println("Iniciamos metodo test: persona.getNombre() = " + persona.getNombre());
        persona.setNombre("FCB");
        System.out.println(" Terminamos metodo test:persona.getNombre() = " + persona.getNombre());
    }
}
