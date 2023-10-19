//programa que lea un número por teclado y muestre un mensaje indicando si es múltiplo de 2,
// múltiplo de 3 o ambos.

import java.util.Scanner;

public class ejer_3_Multiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0 && numero % 3 == 0) {
            System.out.println("El número " + numero + " es múltiplo de 2 y de 3.");
        } else if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es múltiplo de 2.");
        } else if (numero % 3 == 0) {
            System.out.println("El número " + numero + " es múltiplo de 3.");
        } else {
            System.out.println("El número " + numero + " no es múltiplo de 2 ni de 3.");
        }
    }
}