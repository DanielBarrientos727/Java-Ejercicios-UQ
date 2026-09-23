import java.util.Scanner;

public class Ejercicio1 {

    public static double calcularDevuelta(double valorTotal, double dineroEntregado) {
        return dineroEntregado - valorTotal;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double valorTotal;
        double dineroEntregado;
        double devuelta;

        System.out.print("Ingrese el valor total de la factura: ");
        valorTotal = scanner.nextDouble();

        System.out.print("Ingrese el dinero entregado por el cliente: ");
        dineroEntregado = scanner.nextDouble();

        devuelta = calcularDevuelta(valorTotal, dineroEntregado);

        System.out.println("La devuelta es: $" + devuelta);

        scanner.close();
    }
}