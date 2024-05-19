package Ejercicio02;

public class Objeto {
    private Color color;
    private Material material;
    private String nombre;

    public Objeto(String nombre, Color color, Material material) {
        this.nombre = nombre;
        this.color = color;
        this.material = material;
    }

    public Color getColor() {
        return color;
    }

    public Material getMaterial() {
        return material;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return  nombre + " de Color " + color + " y material de " + material;
    }
}
