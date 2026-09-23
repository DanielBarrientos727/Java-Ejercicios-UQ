import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double pesoPaquete;
        double costoPorKilogramo;
        double costoFijo;
        double costoPorPeso;
        double valorTotal;

        System.out.print("Ingrese el peso del paquete en kilogramos: ");
        pesoPaquete = scanner.nextDouble();

        System.out.print("Ingrese el costo por kilogramo: ");
        costoPorKilogramo = scanner.nextDouble();

        System.out.print("Ingrese el costo fijo del servicio: ");
        costoFijo = scanner.nextDouble();

        costoPorPeso = pesoPaquete * costoPorKilogramo;

        valorTotal = costoPorPeso + costoFijo;

        System.out.println("Costo por peso: $" + costoPorPeso);
        System.out.println("Valor total a pagar: $" + valorTotal);

        scanner.close();
    }
}