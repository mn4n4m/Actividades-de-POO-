package Inmuebles;

public class InmuebleVivienda extends Inmueble {
    protected int númeroHabitaciones;
    protected int númeroBaños;

    public InmuebleVivienda(int id, int área, String dirección, int habitaciones, int baños) {
        super(id, área, dirección);
        this.númeroHabitaciones = habitaciones;
        this.númeroBaños = baños;
    }

    void imprimir() {
        super.imprimir();
        System.out.println("Número de habitaciones = " + númeroHabitaciones);
        System.out.println("Número de baños = " + númeroBaños);
    }
}
