import java.util.Scanner;

public class PruebaCuenta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Cuenta de ahorros");
        System.out.print("Ingrese saldo inicial = $");
        float saldoInicial = input.nextFloat();

        System.out.print("Ingrese tasa de interés = ");
        float tasa = input.nextFloat();

        CuentaAhorros cuenta1 = new CuentaAhorros(saldoInicial, tasa);

        System.out.print("Ingresar cantidad a consignar: $");
        float deposito = input.nextFloat();
        cuenta1.consignar(deposito);

        System.out.print("Ingresar cantidad a retirar: $");
        float retiro = input.nextFloat();
        cuenta1.retirar(retiro);

        cuenta1.extractoMensual();
        cuenta1.imprimir();

        input.close();
    }
}
