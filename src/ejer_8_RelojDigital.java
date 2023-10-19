//Realizar un programa que lea por teclado dos marcaciones de un reloj
//digital (horas, minutos, segundos) comprendidas entre las 0:0:0 y las
//23:59:59 e informe cual de ellas es mayor.
//Ejemplo:
//Hora 1: 12:35:37
//Hora 2: 12:38:36
//“Hora 2 es mayor”

import java.util.Scanner;

public class ejer_8_RelojDigital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la primera marcación (hh:mm:ss): ");
        String marcacion1 = scanner.nextLine();

        System.out.print("Ingrese la segunda marcación (hh:mm:ss): ");
        String marcacion2 = scanner.nextLine();

        String[] partesMarcacion1 = marcacion1.split(":");
        String[] partesMarcacion2 = marcacion2.split(":");

        int horas1 = Integer.parseInt(partesMarcacion1[0]);
        int minutos1 = Integer.parseInt(partesMarcacion1[1]);
        int segundos1 = Integer.parseInt(partesMarcacion1[2]);

        int horas2 = Integer.parseInt(partesMarcacion2[0]);
        int minutos2 = Integer.parseInt(partesMarcacion2[1]);
        int segundos2 = Integer.parseInt(partesMarcacion2[2]);

        if (horas1 < 0 || horas1 > 23 || minutos1 < 0 || minutos1 > 59 || segundos1 < 0 || segundos1 > 59 ||
                horas2 < 0 || horas2 > 23 || minutos2 < 0 || minutos2 > 59 || segundos2 < 0 || segundos2 > 59) {
            System.out.println("Error: Marcación inválida.");
        } else {
            if (horas1 > horas2 || (horas1 == horas2 && minutos1 > minutos2) ||
                    (horas1 == horas2 && minutos1 == minutos2 && segundos1 > segundos2)) {
                System.out.println("La segunda marcación es mayor.");
            } else if (horas1 == horas2 && minutos1 == minutos2 && segundos1 == segundos2) {
                System.out.println("Ambas marcaciones son iguales.");
            } else {
                System.out.println("La primera marcación es mayor.");
            }
        }
    }
}