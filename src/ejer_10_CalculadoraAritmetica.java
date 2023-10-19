//programa que lea un carácter y dos números enteros por
//teclado. Si el carácter leído es un operador aritmético, calcular la operación
//correspondiente, si es cualquier otro debe mostrar un error.

import java.util.Scanner;

public class ejer_10_CalculadoraAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un carácter: ");
        char operador = scanner.next().charAt(0);

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        int resultado = 0;

        if (operador == '+') {
            resultado = num1 + num2;
        } else if (operador == '-') {
            resultado = num1 - num2;
        } else if (operador == '*') {
            resultado = num1 * num2;
        } else if (operador == '/') {
            resultado = num1 / num2;
        } else {
            System.out.println("Error: Carácter inválido.");
            return;
        }

        System.out.println("El resultado es: " + resultado);
    }
}