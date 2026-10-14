import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // DECLARAMOS LA VARIABLE SCANNER
        
        System.out.println("\n------EJERCICIO 4------\n");
        // DECLARAMOS VARIABLES Y CONSTANTES
        final double pi = 3.14159265358979;
        double radio = 0;
        double perimetro = 0;
        double areaCirculo = 0;
        double volumen = 0;
        
        // ENTRADA DE DATOS
        System.out.print("Introduce el radio de la circunferencia: ");
        radio = sc.nextDouble();
        
        // OPERACIONES
        perimetro = 2 * pi * radio;
        areaCirculo = pi * radio * radio;
        volumen = (4 * pi * radio * radio * radio) / 3;
        
        // SALIDA DE DATOS
        System.out.printf("\nPerimetro: %.1f metros\n", perimetro);
        System.out.printf("Area: %.1f metros cuadrados\n", areaCirculo);
        System.out.printf("Volumen: %.1f metros cubicos\n", volumen);
        
        System.out.println("\n------FIN------\n");
    }
}