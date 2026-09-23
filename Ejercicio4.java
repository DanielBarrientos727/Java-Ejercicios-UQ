import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double kilometrosRecorridos;
        double litrosConsumidos;
        double precioPorLitro;
        double rendimiento;
        double costoTotal;

        System.out.print("Ingrese los kilómetros recorridos: ");
        kilometrosRecorridos = scanner.nextDouble();

        System.out.print("Ingrese los litros de gasolina consumidos: ");
        litrosConsumidos = scanner.nextDouble();

        System.out.print("Ingrese el precio por litro: ");
        precioPorLitro = scanner.nextDouble();

        rendimiento = kilometrosRecorridos / litrosConsumidos;

        costoTotal = litrosConsumidos * precioPorLitro;

        System.out.println("Rendimiento: " + rendimiento + " km/L");
        System.out.println("Costo total del viaje: $" + costoTotal);

        scanner.close();
    }
}