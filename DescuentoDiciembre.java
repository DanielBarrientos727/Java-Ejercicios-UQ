import javax.swing.JOptionPane;

public class DescuentoDiciembre {

    public static void main(String[] args) {

        String mes = ingresarTexto("¿Cuál es el mes en el que se realizó la compra?");
        double valorCompra = ingresarRealD("¿Cuál es el valor total de la compra?");
        double descuento = calcularDescuento(mes, valorCompra);

        generarMensaje(valorCompra, descuento, mes);
    }

    public static double ingresarRealD(String mensaje) {

        double valor = Double.parseDouble(
                JOptionPane.showInputDialog(mensaje)
        );

        return valor;
    }

    public static String ingresarTexto(String mensaje) {

        String texto = JOptionPane.showInputDialog(mensaje);

        return texto;
    }

    public static double calcularDescuento(String mes, double valorCompra) {

        double descuento;

        if (mes.toLowerCase().equals("diciembre")) {

            descuento = valorCompra * 0.20;

        } else {

            descuento = 0;
        }

        return descuento;
    }

    public static void generarMensaje(
            double valorCompra,
            double descuento,
            String mes) {

        String mensaje;
        double valorDescuento = valorCompra - descuento;

        if (mes.toLowerCase().equals("diciembre")) {

            mensaje = "Eres beneficiario de un descuento, "
                    + "el valor a pagar es: " + valorDescuento;

        } else {

            mensaje = "No eres beneficiario de un descuento, "
                    + "el valor a pagar es: " + valorCompra;
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }
}