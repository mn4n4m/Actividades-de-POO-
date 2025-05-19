package TiendaMascotas;

public class Gato extends Mascota {
    protected float alturaSalto;
    protected float longitudSalto;

    public Gato(String nombre, int edad, String color, float alturaSalto, float longitudSalto) {
        super(nombre, edad, color);
        this.alturaSalto = alturaSalto;
        this.longitudSalto = longitudSalto;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Altura de salto: " + alturaSalto + " cm");
        System.out.println("Longitud de salto: " + longitudSalto + " cm");
    }

    public static void sonido() {
        System.out.println("Los gatos maúllan y ronronean");
    }
}
