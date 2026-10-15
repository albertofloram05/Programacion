import java.math.*; // IMPORTAMOS LA LIBRERIA MATH
import java.util.Scanner; // IMPORTAMOS LA LIBRERIA SCANNER
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // DECLARAMOS LA VARIABLE SCANNER
        
        System.out.print("\n-----EJERCICIO 4-----\n");
        
        // DECLARAMOS VARIABLES Y CONSTANTES
        
        int num = 0;
        String mensaje = " ";
        
        // ENTRADA DE DATOS
        
        System.out.print("Introduce un numero: ");
        num = sc.nextInt();
        
        // OPERACIONES Y BLOQUES LOGICOS
        
        if (num >= 0) {
            mensaje = "Es positivo.";
        }
        else {
            mensaje = "Es negativo.";
        }
        // SALIDA DE DATOS
        
        System.out.println(mensaje);
        
        System.out.print("\n-----FIN-----\n");
    }
}