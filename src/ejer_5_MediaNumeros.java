//Realizar un programa que solicite 4 números e imprima la media de los números.
// Modifícalo para que también imprima aquellos números que son superiores a la media.

import java.util.Scanner;
public class ejer_5_MediaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese cuatro números:");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int numero3 = scanner.nextInt();
        int numero4 = scanner.nextInt();

        double media = (numero1 + numero2 + numero3 + numero4) / 4.0;
        System.out.println("La media de los números es: " + media);

        System.out.println("Números superiores a la media:");
        if (numero1 > media) {
            System.out.println(numero1);
        }
        if (numero2 > media) {
            System.out.println(numero2);
        }
        if (numero3 > media) {
            System.out.println(numero3);
        }
        if (numero4 > media) {
            System.out.println(numero4);
        }
    }
}