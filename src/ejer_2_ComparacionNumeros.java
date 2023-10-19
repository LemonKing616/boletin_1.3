//programa que solicite dos números por teclado e imprima en pantalla si son iguales,
// el primero mayor que el segundo o el primero más pequeño que el segundo.

import java.util.Scanner;

public class ejer_2_ComparacionNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1 == numero2) {
            System.out.println("Los números son iguales.");
        } else if (numero1 > numero2) {
            System.out.println("El primer número es mayor que el segundo.");
        } else {
            System.out.println("El primer número es menor que el segundo.");
        }
    }
}