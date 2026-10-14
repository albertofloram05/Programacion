import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // DECLARAMOS LA VARIABLE SCANNER
        
        System.out.println("------EJERCICIO 2------\n");
        
        // DECLARAMOS VARIABLES Y CONSTANTES
        double lado1 = 0;
        double lado2 = 0;
        double areaCuadrado = 0;
        
        // ENTRADA DE DATOS
        System.out.print("Introduce el valor del primer lado: ");
        lado1 = sc.nextDouble();
        System.out.print("Introduce el valor del segundo lado: ");
        lado2 = sc.nextDouble();
        
        // OPERACIONES
        areaCuadrado = lado1 * lado2;
        
        // SALIDA DE DATOS
        System.out.printf("Area: %.2f metros cuadrados\n", areaCuadrado);
        
        System.out.println("\n------FIN------\n");
    }
}