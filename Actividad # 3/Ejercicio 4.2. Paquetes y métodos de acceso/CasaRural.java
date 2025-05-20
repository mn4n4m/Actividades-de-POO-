package Inmuebles;

public class CasaRural extends Casa {
    protected static double valorArea = 1500000;
    protected int distanciaCabecera;
    protected int altitud;

    public CasaRural(int id, int area, String direccion, int hab, int banos, int pisos, int distancia, int altitud) {
        super(id, area, direccion, hab, banos, pisos);
        this.distanciaCabecera = distancia;
        this.altitud = altitud;
    }

    void imprimir() {
        super.imprimir();
        System.out.println("Distancia a cabecera municipal = " + distanciaCabecera + " km.");
        System.out.println("Altitud = " + altitud + " msnm.");
        System.out.println();
    }
}
