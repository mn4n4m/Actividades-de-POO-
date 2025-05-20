package Inmuebles;

public class Oficina extends Local {
    protected static double valorArea = 3500000;
    protected boolean esGobierno;

    public Oficina(int id, int area, String direccion, tipo tipoLocal, boolean esGobierno) {
        super(id, area, direccion, tipoLocal);
        this.esGobierno = esGobierno;
    }

    void imprimir() {
        super.imprimir();
        System.out.println("¿Es gubernamental? = " + esGobierno);
        System.out.println();
    }
}
