package Inmuebles;

public class Apartamento extends InmuebleVivienda {
    public Apartamento(int id, int área, String dirección, int habitaciones, int baños) {
        super(id, área, dirección, habitaciones, baños);
    }

    void imprimir() {
        super.imprimir();
    }
}
