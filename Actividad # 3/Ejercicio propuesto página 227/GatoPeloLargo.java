package TiendaMascotas;

public class GatoPeloLargo extends Gato {
    private String raza;

    public GatoPeloLargo(String nombre, int edad, String color, float alturaSalto, float longitudSalto, String raza) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
        this.raza = raza;
    }

    @Override
    public void imprimir() {
        System.out.println("🐱 Gato de pelo largo");
        super.imprimir();
        System.out.println("Raza: " + raza);
    }
}
 
