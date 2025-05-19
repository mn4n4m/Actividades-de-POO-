package TiendaMascotas;

public class PerroPequeño extends Perro {
    private String raza;

    public PerroPequeño(String nombre, int edad, String color, float peso, boolean muerde, String raza) {
        super(nombre, edad, color, peso, muerde);
        this.raza = raza;
    }

    @Override
    public void imprimir() {
        System.out.println("🐶 Perro Pequeño");
        super.imprimir();
        System.out.println("Raza: " + raza);
    }
}
