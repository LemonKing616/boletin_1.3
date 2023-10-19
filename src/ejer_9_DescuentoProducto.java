//En un establecimiento en rebajas, hay 3 tipos de productos (A, B y C). El
//porcentaje de rebaja que se aplicará sobre el precio original del producto se
//calcula de la siguiente forma:
//● Si el producto es de tipo A, independientemente de su precio se
//aplica un 7% de descuento.
//● Si el producto es de tipo C o bien el precio es inferior a 500€ se
//aplicará un porcentaje del 12% de descuento.
//● En el resto de casos se aplica un 9% de descuento.
//Realizar un programa que solicite los datos necesarios (tipo de producto y precio
//original) y calcule el precio rebajado. Debe comprobarse que los datos de entrada
//son correctos, y si no lo son mostrar un mensaje de error.

import java.util.Scanner;

public class ejer_9_DescuentoProducto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tipo de producto (A, B o C): ");
        char tipoProducto = scanner.next().charAt(0);

        System.out.print("Ingrese el precio original: ");
        double precioOriginal = scanner.nextDouble();

        double porcentajeDescuento = 0;

        if (tipoProducto == 'A') {
            porcentajeDescuento = 7;
        } else if (tipoProducto == 'C' || precioOriginal < 500) {
            porcentajeDescuento = 12;
        } else {
            porcentajeDescuento = 9;
        }

        double descuento = (precioOriginal * porcentajeDescuento) / 100;
        double precioRebajado = precioOriginal - descuento;

        if (precioRebajado < 0) {
            System.out.println("Error: Datos ingresados inválidos. Por favor, verifique el tipo de producto y el precio.");
        } else {
            System.out.println("El precio rebajado es: " + precioRebajado);
        }
    }
}