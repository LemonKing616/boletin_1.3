//programa que lea la edad de una persona menor a 100 años e informe si es un niño,
// un adolescente, un joven o un adulto.

import java.util.Scanner;

public class ejer_4_ClasificacionEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();

        if (edad >= 0 && edad <= 12) {
            System.out.println("Es un niño.");
        } else if (edad >= 13 && edad <= 17) {
            System.out.println("Es un adolescente.");
        } else if (edad >= 18 && edad <= 29) {
            System.out.println("Es un joven.");
        } else if (edad >= 30 && edad <= 99) {
            System.out.println("Es un adulto.");
        } else {
            System.out.println("La edad ingresada no es válida.");
        }
    }
}