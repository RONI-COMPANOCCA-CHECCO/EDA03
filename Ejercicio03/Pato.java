package Ejercicio03;

public class Pato extends Ave {
    private String colorPlumas;

    public Pato(String nombre, int edad, String colorPlumas) {
        super(nombre, edad);
        this.colorPlumas = colorPlumas;
    }

    public void nadar() {
        System.out.println("El pato está nadando.");
    }

    @Override
    public void hacerSonido() {
        System.out.println("El pato hace cuac cuac.");
    }
}
