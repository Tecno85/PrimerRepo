
import java.util.Scanner;
public class RandomNumber {
    public static void main(String[] args) {
        int numeroAleatorio = (int) (Math.random() * 100) + 1;

        Scanner scanner = new Scanner(System.in);
        int intentos = 0;
        int numeroAdivinado = 0;

        System.out.println("¡Adivina el número entre 1 y 100!");

        while (numeroAdivinado != numeroAleatorio) {
            System.out.print("Ingrese un número: ");
            numeroAdivinado = scanner.nextInt();
            intentos++;

            if (numeroAdivinado < numeroAleatorio) {
                System.out.println("El número a adivinar es mayor.");
            } else if (numeroAdivinado > numeroAleatorio) {
                System.out.println("El número a adivinar es menor.");
            } else {
                System.out.println("¡Felicitaciones! Has adivinado el número " + numeroAleatorio + " en " + intentos + " intentos.");
            }
        }
        scanner.close();
    }
}
