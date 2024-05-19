public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Alumno
        Alumno alumno = new Alumno("Juan", 20);

        // Mostrar los datos del alumno
        System.out.println("Nombre del alumno: " + alumno.getNombre());
        System.out.println("Edad del alumno: " + alumno.getEdad());
    }
}