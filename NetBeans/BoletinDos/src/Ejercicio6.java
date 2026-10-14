import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // DECLARAMOS LA VARIABLE SCANNER
        
        System.out.println("\n------EJERCICIO 6------\n");
        
        // DECLARAMOS VARIABLES Y CONSTANTES
        double celsius = 0;
        double fahrenheit = 0;
        
        // ENTRADA DE DATOS
        System.out.print("Introduce la temperatura en grados celsius (ºC): ");
        celsius = sc.nextDouble();
        
        // OPERACIONES
        fahrenheit = (celsius * 1.8) + 32;
        
        // SALIDA DE DATOS
        System.out.printf("%.1f ºC = %.1f ºF\n", celsius, fahrenheit);
        
        System.out.println("\n------FIN------\n");
    }
}