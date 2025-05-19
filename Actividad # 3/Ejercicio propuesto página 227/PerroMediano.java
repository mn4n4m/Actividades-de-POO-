package TiendaMascotas;

public class PerroMediano extends Perro {
    private String raza;

    public PerroMediano(String nombre, int edad, String color, float peso, boolean muerde, String raza) {
        super(nombre, edad, color, peso, muerde);
        this.raza = raza;
    }

    @Override
    public void imprimir() {
        System.out.println("🐕 Perro Mediano");
        super.imprimir();
        System.out.println("Raza: " + raza);
    }
}
