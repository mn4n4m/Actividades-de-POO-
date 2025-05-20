package universidad;

public class PruebaUniversidad {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Laura Gómez", "Calle 123", "Ingeniería de Sistemas", 6);
        Profesor profesor = new Profesor("Carlos Pérez", "Av. 45", "Ciencias Básicas", "Titular");

        System.out.println("📘 Estudiante:");
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Dirección: " + estudiante.getDireccion());
        System.out.println("Carrera: " + estudiante.getCarrera());
        System.out.println("Semestre: " + estudiante.getSemestre());

        System.out.println();

        System.out.println("📗 Profesor:");
        System.out.println("Nombre: " + profesor.getNombre());
        System.out.println("Dirección: " + profesor.getDireccion());
        System.out.println("Departamento: " + profesor.getDepartamento());
        System.out.println("Categoría: " + profesor.getCategoria());
    }
}
