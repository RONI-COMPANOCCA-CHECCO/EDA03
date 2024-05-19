package Ejercicio03;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de cada subclase
        Pato pato = new Pato("Donald", 3, "Blanco");
        Ganzo ganzo = new Ganzo("Gustavo", 5, 1.2);
        Gallina gallina = new Gallina("Clara", 2, true);

        // Llamar a los métodos de Pato
        System.out.println("Pato:");
        pato.volar();
        pato.hacerSonido();
        pato.nadar();

        // Llamar a los métodos de Ganzo
        System.out.println("\nGanzo:");
        ganzo.volar();
        ganzo.hacerSonido();
        ganzo.migrar();

        // Llamar a los métodos de Gallina
        System.out.println("\nGallina:");
        gallina.volar();
        gallina.hacerSonido();
        gallina.ponerHuevo();
    }
}