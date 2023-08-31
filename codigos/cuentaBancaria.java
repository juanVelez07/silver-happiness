import java.util.Scanner;

public class cuentaBancaria {

    String titular;
    double balance;

    public cuentaBancaria(String titular) {
        this.titular = titular;
        this.balance = 0.0;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            balance += cantidad;
            System.out.println("Se depositaron " + cantidad + " unidades. Nuevo balance: " + balance);
        } else {
            System.out.println("La cantidad a depositar debe ser mayor que cero.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && balance >= cantidad) {
            balance -= cantidad;
            System.out.println("Se retiraron " + cantidad + " unidades. Nuevo balance: " + balance);
        } else {
            System.out.println("No es posible retirar la cantidad especificada.");
        }
    }

    public double obtenerBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del titular de la cuenta: ");
        String titular = scanner.nextLine();

        cuentaBancaria cuenta = new cuentaBancaria(titular);

        System.out.println("Ingrese la cantidad a depositar: ");
        double cantidadDeposito = scanner.nextDouble();
        cuenta.depositar(cantidadDeposito);

        System.out.println("Ingrese la cantidad a retirar: ");
        double cantidadRetiro = scanner.nextDouble();
        cuenta.retirar(cantidadRetiro);

        double balanceActual = cuenta.obtenerBalance();
        System.out.println("Balance actual: " + balanceActual);

        scanner.close();
    }
}
