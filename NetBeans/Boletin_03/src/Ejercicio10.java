import java.math.*; // IMPORTAMOS LA LIBRERIA MATH
import java.util.Scanner; // IMPORTAMOS LA LIBRERIA SCANNER
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // DECLARAMOS LA VARIABLE SCANNER
        
        System.out.print("\n-----EJERCICIO 10-----\n");
        
        // DECLARAMOS VARIABLES Y CONSTANTES
        
        int num = 0;
        int factorial = 0;
        
        // ENTRADA DE DATOS
        
        System.out.print("Introduce un numero: ");
        num = sc.nextInt();
        
        
        // OPERACIONES Y BLOQUES LOGICOS
        factorial = num;
        while (num != 2) {
            num -= 1;
            factorial = factorial * num;
            
        }
        // SALIDA DE DATOS
        
        System.out.println(factorial);
        
        System.out.print("\n-----FIN-----\n");
    }
}