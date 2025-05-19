package Inmuebles;

public class Apartaestudio extends Apartamento {
    protected static double valorArea = 1500000;

    public Apartaestudio(int id, int área, String dirección, int habitaciones, int baños) {
        super(id, área, dirección, 1, 1); // siempre 1 habitación, 1 baño
    }

    void imprimir() {
        super.imprimir();
        System.out.println();
    }
}
