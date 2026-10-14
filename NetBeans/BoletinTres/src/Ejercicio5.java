import java.math.*; // IMPORTAMOS LA LIBRERIA MATH
import java.util.Scanner; // IMPORTAMOS LA LIBRERIA SCANNER
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // DECLARAMOS LA VARIABLE SCANNER
        
        System.out.print("\n-----EJERCICIO 5-----\n");
        
        // DECLARAMOS VARIABLES Y CONSTANTES
        
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int mayor = 0;
        
        // ENTRADA DE DATOS
        
        System.out.print("Introduce el primer numero: ");
        num1 = sc.nextInt();
        System.out.print("Introduce el segundo numero: ");
        num2 = sc.nextInt();
        System.out.print("Introduce el tercer numero: ");
        num3 = sc.nextInt();
        
        // OPERACIONES Y BLOQUES LOGICOS
        
        if (num1 > num2 && num1 > num3) {
            mayor = num1;
        }
        else if (num2 > num1 && num2 > num3) {
            mayor = num2;
        }
        else {
            mayor = num3;
        }
        
        // SALIDA DE DATOS
        
        System.out.printf("El número mayor es el %d", mayor);
        
        System.out.print("\n-----FIN-----\n");
    }
}