//programa que lea el estado civil de una persona (S-Soltero, C-Casado, V-Viudo y D-Divorciado) y su edad.
// Después debe mostrar por pantalla el porcentaje de retención que debe aplicársele de acuerdo con las siguientes reglas:
//- A los solteros o divorciados menores de 35 años, se les aplica un 12%.
//- A todas las personas mayores de 50 años, se les aplica un 8.5%.
//- A los viudos o casados menores de 35 años, se les aplica un 11.3%.
//- Al resto de casos se les aplica un 10.5%.

import java.util.Scanner;

public class ejer_7_RetencionImpuestos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el estado civil (S-Soltero, C-Casado, V-Viudo, D-Divorciado): ");
        char estadoCivil = scanner.next().charAt(0);

        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();

        double porcentajeRetencion = 0;

        if (estadoCivil == 'S' || estadoCivil == 'D') {
            if (edad < 35) {
                porcentajeRetencion = 12;
            }
        } else if (estadoCivil == 'C' || estadoCivil == 'V') {
            if (edad < 35) {
                porcentajeRetencion = 11.3;
            }
        }

        if (edad > 50) {
            porcentajeRetencion = 8.5;
        }

        if (porcentajeRetencion == 0) {
            porcentajeRetencion = 10.5;
        }

        System.out.println("El porcentaje de retención a aplicar es: " + porcentajeRetencion + "%.");
    }
}