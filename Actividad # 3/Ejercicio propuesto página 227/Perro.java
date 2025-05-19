package TiendaMascotas;

public class Perro extends Mascota {
    protected float peso;
    protected boolean muerde;

    public Perro(String nombre, int edad, String color, float peso, boolean muerde) {
        super(nombre, edad, color);
        this.peso = peso;
        this.muerde = muerde;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Peso: " + peso + " kg");
        System.out.println("¿Muerde?: " + (muerde ? "Sí" : "No"));
    }

    public static void sonido() {
        System.out.println("Los perros ladran");
    }
}
