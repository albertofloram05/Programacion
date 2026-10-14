import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // DECLARAMOS LA VARIABLE SCANNER
        
        System.out.println("\n------EJERCICIO 3------\n");
        
        // DECLARAMOS VARIABLES Y CONSTANTES
        int num1 = 0;
        int num2 = 0;
        int suma = 0;
        int resta = 0;
        int producto = 0;
        double division = 0;
        
        
        // ENTRADA DE DATOS
        System.out.print("Introduce el primer número (entero): ");
        num1 = sc.nextInt();
        System.out.print("Introduce el segundo número (entero): ");
        num2 = sc.nextInt();
        
        // OPERACIONES
        suma = num1 + num2;
        resta = num1 - num2;
        producto = num1 * num2;
        if (num2 != 0) {
            division = (double) num1 / num2;
        }
        
        // SALIDA DE DATOS
        System.out.printf("Suma: %d + %d = %d\n", num1, num2, suma);
        System.out.printf("Resta: %d - %d = %d\n", num1, num2, resta);
        System.out.printf("Producto: %d * %d = %d\n", num1, num2, producto);
        if (num2 != 0) {
            System.out.printf("Division: %d / %d = %.2f\n", num1, num2, division);
        }
        else {
            System.out.printf("Division: no se puede dividir entre 0\n");
        }
        
        System.out.println("\n------FIN------\n");
    }
}