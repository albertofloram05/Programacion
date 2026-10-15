import java.math.*; // IMPORTAMOS LA LIBRERIA MATH
import java.util.Scanner; // IMPORTAMOS LA LIBRERIA SCANNER
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // DECLARAMOS LA VARIABLE SCANNER
        
        System.out.print("\n-----EJERCICIO 11-----\n");
        
        // DECLARAMOS VARIABLES Y CONSTANTES
        
        double num = 0;
        double nuevoNum = 0;
        int len = 0;
        double media = 0;
        
        // ENTRADA DE DATOS
        
        System.out.print("Introduce un numero: ");
        num = sc.nextDouble();
        
        // OPERACIONES Y BLOQUES LOGICOS
        
        while (nuevoNum >= 0) {
            num = num + nuevoNum;
            len += 1;
            System.out.print("Introduce otro: ");
            nuevoNum = sc.nextDouble();
        }
        
        media = (double) num / len;
        // SALIDA DE DATOS
        
        System.out.printf("Media: %.1f", media);
        
        System.out.print("\n-----FIN-----\n");
    }
}