import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double temperaturaCelsius;
        double temperaturaKelvin;
        double temperaturaFahrenheit;

        System.out.print("Ingrese la temperatura en grados Celsius: ");
        temperaturaCelsius = scanner.nextDouble();

        temperaturaKelvin = temperaturaCelsius + 273.15;

        temperaturaFahrenheit = (temperaturaCelsius * 9 / 5) + 32;

        System.out.println("Temperatura en Kelvin: " + temperaturaKelvin);
        System.out.println("Temperatura en Fahrenheit: " + temperaturaFahrenheit);

        scanner.close();
    }
}