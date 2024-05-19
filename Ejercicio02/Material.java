package Ejercicio02;

public class Material {
    private String material;

    public Material(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return material;
    }
}