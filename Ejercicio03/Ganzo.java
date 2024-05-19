package Ejercicio03;

public class Ganzo extends Ave {
    private double tamañoAlas;

    public Ganzo(String nombre, int edad, double tamañoAlas) {
        super(nombre, edad);
        this.tamañoAlas = tamañoAlas;
    }

    public void migrar() {
        System.out.println("El ganzo está migrando.");
    }

    @Override
    public void hacerSonido() {
        System.out.println("El ganzo hace honk honk.");
    }
}
