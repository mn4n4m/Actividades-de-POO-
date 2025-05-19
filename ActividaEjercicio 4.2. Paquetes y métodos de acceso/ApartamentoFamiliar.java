package Inmuebles;

public class ApartamentoFamiliar extends Apartamento {
    protected static double valorArea = 2000000;
    protected int valorAdministración;

    public ApartamentoFamiliar(int id, int área, String dirección, int habitaciones, int baños, int valorAdministración) {
        super(id, área, dirección, habitaciones, baños);
        this.valorAdministración = valorAdministración;
    }

    void imprimir() {
        super.imprimir();
        System.out.println("Valor de la administración = $" + valorAdministración);
        System.out.println();
    }
}
