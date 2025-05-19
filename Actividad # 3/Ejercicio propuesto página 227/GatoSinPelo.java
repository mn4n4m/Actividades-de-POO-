package TiendaMascotas;

public class GatoSinPelo extends Gato {
    private String raza;

    public GatoSinPelo(String nombre, int edad, String color, float alturaSalto, float longitudSalto, String raza) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
        this.raza = raza;
    }

    @Override
    public void imprimir() {
        System.out.println("🐈 Gato sin pelo");
        super.imprimir();
        System.out.println("Raza: " + raza);
    }
}
