import java.math.*; // IMPORTAMOS LA LIBRERIA MATH
import java.util.Scanner; // IMPORTAMOS LA LIBRERIA SCANNER
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // DECLARAMOS LA VARIABLE SCANNER
        
        System.out.print("\n-----EJERCICIO 3-----\n");
        
        // DECLARAMOS VARIABLES Y CONSTANTES
        
        int num1 = 0;
        int num2 = 0;
        int mayor = 0;
        
        // ENTRADA DE DATOS
        
        System.out.print("Introduce el primer numero: ");
        num1 = sc.nextInt();
        System.out.print("Introduce el segundo numero: ");
        num2 = sc.nextInt();
        
        // OPERACIONES Y BLOQUES LOGICOS
        
        if (num1 > num2) {
            mayor = num1;
        }
        else if (num1 < num2) {
            mayor = num2;
        }
        else {
            System.out.println("Ambos numeros son iguales");
        }
        // SALIDA DE DATOS
        
        System.out.println(mayor);
        
        System.out.print("\n-----FIN-----\n");
    }
}