import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // DECLARAMOS LA VARIABLE SCANNER
        
        System.out.println("\n------EJERCICIO 5------\n");
        
        // DECLARAMOS VARIABLES Y CONSTANTES
        double millas = 0;
        double metros = 0;
        
        // ENTRADA DE DATOS
        System.out.print("Introduce las millas: ");
        millas = sc.nextDouble();
        
        // OPERACIONES
        metros = millas * 1.852;
        
        // SALIDA DE DATOS
        System.out.printf("%.1f millas = %.1f metros", millas, metros);
 
        System.out.println("\n------FIN------\n");
    }
}