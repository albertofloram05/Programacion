import java.math.*; // IMPORTAMOS LA LIBRERIA MATH
import java.util.Scanner; // IMPORTAMOS LA LIBRERIA SCANNER
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // DECLARAMOS LA VARIABLE SCANNER
        
        System.out.print("\n-----EJERCICIO 6-----\n");
        
        // DECLARAMOS VARIABLES Y CONSTANTES
        
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        String orden = " ";
        
        // ENTRADA DE DATOS
        
        System.out.print("Introduce el primer numero: ");
        num1 = sc.nextInt();
        System.out.print("Introduce el segundo numero: ");
        num2 = sc.nextInt();
        System.out.print("Introduce el tercer numero: ");
        num3 = sc.nextInt();
        
        // OPERACIONES Y BLOQUES LOGICOS
        
        if (num1 <= num2 && num1 <= num3) {
            if (num2 <= num3)
                orden = num1 + " < " + num2 + " < " + num3;
            else
                orden = num1 + " < " + num3 + " < " + num2;
        } 
        else if (num2 <= num1 && num2 <= num3) {
            if (num1 <= num3)
                orden = num2 + " < " + num1 + " < " + num3;
            else
                orden = num2 + " < " + num3 + " < " + num1;
        } 
        else {
            if (num1 <= num2)
                orden = num3 + " < " + num1 + " < " + num2;
            else
                orden = num3 + " < " + num2 + " < " + num1;
        }
        
        // SALIDA DE DATOS
        
        System.out.println(orden);
        
              
        System.out.print("\n-----FIN-----\n");
    }
}