package Ejercicio03;

public class Ave {
    protected String nombre;
    protected int edad;

    public Ave(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void volar() {
        System.out.println("Esta ave está volando.");
    }

    public void hacerSonido() {
        System.out.println("Esta ave hace un sonido.");
    }
}
