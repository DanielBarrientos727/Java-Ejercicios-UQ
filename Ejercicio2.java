import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double valorProducto;
        double porcentajeDescuento;
        double valorDescuento;
        double valorFinal;

        System.out.print("Ingrese el valor del producto: ");
        valorProducto = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje de descuento (ejemplo: 0.20): ");
        porcentajeDescuento = scanner.nextDouble();

        valorDescuento = valorProducto * porcentajeDescuento;

        valorFinal = valorProducto - valorDescuento;

        System.out.println("Valor del descuento: $" + valorDescuento);
        System.out.println("Valor final: $" + valorFinal);

        scanner.close();
    }
}