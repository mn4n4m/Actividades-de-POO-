package TiendaMascotas;

public class PerroGrande extends Perro {
    private String raza;

    public PerroGrande(String nombre, int edad, String color, float peso, boolean muerde, String raza) {
        super(nombre, edad, color, peso, muerde);
        this.raza = raza;
    }

    @Override
    public void imprimir() {
        System.out.println("🐕 Perro Grande");
        super.imprimir();
        System.out.println("Raza: " + raza);
    }
}
