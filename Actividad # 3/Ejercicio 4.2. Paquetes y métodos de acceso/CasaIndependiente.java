package Inmuebles;

public class CasaIndependiente extends CasaUrbana {
    protected static double valorArea = 3000000;

    public CasaIndependiente(int id, int area, String direccion, int hab, int banos, int pisos) {
        super(id, area, direccion, hab, banos, pisos);
    }

    void imprimir() {
        super.imprimir();
        System.out.println();
    }
}
