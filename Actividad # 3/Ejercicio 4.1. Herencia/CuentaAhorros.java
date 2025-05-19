public class CuentaAhorros extends Cuenta {
    private boolean activa;

    public CuentaAhorros(float saldo, float tasa) {
        super(saldo, tasa);
        activa = saldo >= 10000;
    }

    @Override
    public void consignar(float cantidad) {
        if (activa) {
            super.consignar(cantidad);
        }
    }

    @Override
    public void retirar(float cantidad) {
        if (activa) {
            super.retirar(cantidad);
        }
    }

    @Override
    public void extractoMensual() {
        if (númeroRetiros > 4) {
            comisiónMensual += (númeroRetiros - 4) * 1000;
        }
        super.extractoMensual();
        activa = saldo >= 10000;
    }

    public void imprimir() {
        System.out.println("Saldo = $" + saldo);
        System.out.println("Comisión mensual = $" + comisiónMensual);
        System.out.println("Número de transacciones = " + (númeroConsignaciones + númeroRetiros));
        System.out.println();
    }
}
