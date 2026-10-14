import java.math.*; // IMPORTAMOS LA LIBRERIA MATH
import java.util.Scanner; // IMPORTAMOS LA LIBRERIA SCANNER
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // DECLARAMOS LA VARIABLE SCANNER
        
        System.out.print("\n-----EJERCICIO 1-----\n");
        
        // DECLARAMOS VARIABLES Y CONSTANTES
        
        int edad = 0;
        String mensaje = " ";
        
        // ENTRADA DE DATOS
        
        System.out.print("Introduce tu edad: ");
        edad = sc.nextInt();
        
        // OPERACIONES Y BLOQUES LOGICOS
        
        if (edad >= 18) {
            mensaje = "Eres mayor de edad.";
        }
        
        // SALIDA DE DATOS
        
        System.out.println(mensaje);
        
        System.out.print("\n-----FIN-----\n");
    }
}
