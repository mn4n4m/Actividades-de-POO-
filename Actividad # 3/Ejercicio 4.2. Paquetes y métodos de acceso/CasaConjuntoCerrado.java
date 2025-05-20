package Inmuebles;

public class CasaConjuntoCerrado extends CasaUrbana {
    protected static double valorArea = 2500000;
    protected int valorAdministracion;
    protected boolean tienePiscina;
    protected boolean tieneCamposDeportivos;

    public CasaConjuntoCerrado(int id, int area, String direccion, int hab, int banos, int pisos,
                               int administracion, boolean piscina, boolean deportivos) {
        super(id, area, direccion, hab, banos, pisos);
        this.valorAdministracion = administracion;
        this.tienePiscina = piscina;
        this.tieneCamposDeportivos = deportivos;
    }

    void imprimir() {
        super.imprimir();
        System.out.println("Valor administración = $" + valorAdministracion);
        System.out.println("¿Tiene piscina? = " + tienePiscina);
        System.out.println("¿Tiene campos deportivos? = " + tieneCamposDeportivos);
        System.out.println();
    }
}
