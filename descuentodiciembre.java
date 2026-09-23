import java.util.Scanner;

public class descuentodiciembre {

    public static void main(String[] args) {

        String mes = ingresarTexto("Cual es el mes en el que se realizo la compra? ");
        double valorCompra = ingresarRealD("Cual es el valor total de la compra? ");
        double descuento = calcularDescuento(mes, valorCompra);
        generarMensaje(valorCompra, descuento, mes);
    }

    public static String ingresarTexto(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        String texto = sc.nextLine();
        return texto;
    }
    public static double ingresarRealD(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        double valor = sc.nextDouble();
        return valor;
    }
    public static double calcularDescuento (String mes, double valorCompra){
        
        double descuento;

        if (mes.toLowerCase().equals("diciembre")){

            descuento = valorCompra * 0.20;
        }
        else {

            descuento = valorCompra;
        }
        return descuento;
    }
    public static void generarMensaje (double valorCompra, double descuento, String mes){

        String mensaje;
        double valorDescuento = valorCompra - descuento;

        if (mes.toLowerCase().equals("diciembre")){

            mensaje = "Eres beneficiario de un descuento, el valor a pagar es: " + valorDescuento;
            System.out.print(mensaje);
        }
        else {

            mensaje = "No eres beneficiario de un descuento, el valor a pagar es: " + valorCompra;
            System.out.print(mensaje);
        }
    }
}