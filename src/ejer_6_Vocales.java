//programa que solicite un carácter por teclado e informe por pantalla
// si el carácter es una vocal o no lo es. Si es una vocal,
// mostrará el mensaje "Es la primera vocal (A)" o "Es la segunda vocal (E)", etc.

import java.util.Scanner;

public class ejer_6_Vocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un carácter: ");
        char caracter = scanner.next().charAt(0);

        if (caracter == 'A' || caracter == 'a') {
            System.out.println("Es la primera vocal (A).");
        } else if (caracter == 'E' || caracter == 'e') {
            System.out.println("Es la segunda vocal (E).");
        } else if (caracter == 'I' || caracter == 'i') {
            System.out.println("Es la tercera vocal (I).");
        } else if (caracter == 'O' || caracter == 'o') {
            System.out.println("Es la cuarta vocal (O).");
        } else if (caracter == 'U' || caracter == 'u') {
            System.out.println("Es la quinta vocal (U).");
        } else {
            System.out.println("No es una vocal.");
        }
    }
}