import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // DECLARAMOS LA VARIABLE SCANNER
        
        System.out.println("------EJERCICIO 1------\n");
        // DECLARAMOS VARIABLES Y CONSTANTES
        double numHoras = 0;
        int numAños = 0;
        
        // ENTRADA DE DATOS
        System.out.print("Introduce los años: ");
        numAños = sc.nextInt();
        
        // OPERACIONES
        numHoras = numAños * 365 * 24;
        
        // SALIDA DE DATOS
        System.out.printf("%d años equivalen a %.2f horas.", numAños, numHoras);
        
        System.out.println("\n------FIN------\n");
    }
}
