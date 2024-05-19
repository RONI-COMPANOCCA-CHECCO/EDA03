package Ejercicio03;

public class Gallina extends Ave {
    private boolean puedePonerHuevos;

    public Gallina(String nombre, int edad, boolean puedePonerHuevos) {
        super(nombre, edad);
        this.puedePonerHuevos = puedePonerHuevos;
    }

    public void ponerHuevo() {
        if (puedePonerHuevos) {
            System.out.println("La gallina ha puesto un huevo.");
        } else {
            System.out.println("Esta gallina no puede poner huevos.");
        }
    }

    @Override
    public void hacerSonido() {
        System.out.println("La gallina hace cloc cloc.");
    }
}
