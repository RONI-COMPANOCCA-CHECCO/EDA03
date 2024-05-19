package Ejercicio02;

public class Main {
    public static void main(String[] args) {
        Color color1 = new Color("Marron");
        Material material1 = new Material("madera");
        Objeto objeto1 = new Objeto("mesa", color1, material1);
        System.out.println(objeto1);

        Color color2 = new Color("Celeste");
        Material material2 = new Material("vidrio");
        Objeto objeto2 = new Objeto("ventana", color2, material2);
        System.out.println(objeto2);
    }
}
