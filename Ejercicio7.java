import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        int numero = aleatorio.nextInt(100) + 1;
        int intento = 0;

        System.out.println("=== ADIVINA EL NUMERO ===");
        System.out.println("Estoy pensando en un número del 1 al 100.");

        while (intento != numero) {

            System.out.print("Tu intento: ");
            intento = entrada.nextInt();

            if (intento < numero) {
                System.out.println("Muy bajo.");
            } else if (intento > numero) {
                System.out.println("Muy alto.");
            } else {
                System.out.println("¡Correcto! Ganaste.");
            }
        }

        entrada.close();
    }
}