// Conversor de millas a Kilómetros

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner milesTotal = new Scanner(System.in);

        System.out.print("\nIngrese las millas a convertir: ");
        double miles = milesTotal.nextDouble();

        double kilometres = (miles * 1.60934);
        System.out.println("La distancia en Kilómetros es: " + kilometres);

    }
}
