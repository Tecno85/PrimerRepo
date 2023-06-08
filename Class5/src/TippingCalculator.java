
/*Calculadora de propinas:
  Pídele al usuario que ingrese el total de la cuenta en un restaurante.
  Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
  Calcula el monto de la propina utilizando la fórmula: propina = totalCuenta * (porcentajePropina / 100).
 */
import java.util.Scanner;
public class TippingCalculator {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        System.out.print("\nPor favor ingrese el valor total de la cuenta: ");
        float fullValue = enter.nextFloat();

        System.out.print("Por favor ingrese el porcentaje de propina que desee dejar: ");
        float tip = enter.nextFloat();

        float tipAmount = fullValue * (tip / 100);

        System.out.println("La propina es: " + tipAmount);
    }
}







