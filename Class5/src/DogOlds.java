
//1) Calculadora de edad de perros:

import java.util.Scanner;

public class DogOlds {
    public static void main(String[] args) {
        Scanner income = new Scanner(System.in);

        System.out.print("\nPor favor ingrese la edad de su perro: ");
        int humanOld = income.nextInt();

        int dogOld = (humanOld * 7);
        System.out.println("La edad en años humanos de su perro es: " + dogOld);

    }
}
