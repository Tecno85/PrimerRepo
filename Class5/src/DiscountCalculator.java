
/*Calculadora de descuento:
  Pídele al usuario que ingrese el precio original de un producto.
  Pídele al usuario que ingrese el porcentaje de descuento.
  Calcula el precio final después de aplicar el descuento
  utilizando la fórmula: precioFinal = precioOriginal - (precioOriginal * descuento / 100).
  Muestra el precio final al usuario

 */
import java.util.Scanner;
public class DiscountCalculator {
    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);

        System.out.print("\nIngrese el precio original del producto: ");
        double originalPrice = enter.nextDouble();

        System.out.print("Ingrese el porcentaje de descuento: ");
        double discount = enter.nextDouble();

        double finalPrice = originalPrice - (originalPrice * (discount / 100));

        System.out.println("El precio Final del producto es: " + finalPrice);
    }
}



