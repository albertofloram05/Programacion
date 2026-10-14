import java.math.*; // IMPORTAMOS LA LIBRERIA MATH
import java.util.Scanner; // IMPORTAMOS LA LIBRERIA SCANNER
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // DECLARAMOS LA VARIABLE SCANNER
        
        System.out.print("\n-----EJERCICIO 8-----\n");
        
        // DECLARAMOS VARIABLES Y CONSTANTES
        
        double temp = 0;
        String mensaje = " ";
        
        // ENTRADA DE DATOS
        
        System.out.print("Introduce la temperatura de hoy (ºC): ");
        temp = sc.nextDouble();
        
        // OPERACIONES Y BLOQUES LOGICOS
        
        if (temp <= 10) {
            mensaje = "Frio";
        }
        else if (temp > 10 && temp <= 20) {
            mensaje = "Templado";
        }
        else if (temp > 20 && temp <= 30) {
            mensaje = "Caluroso";
        }
        else {
            mensaje = "Tropical";
        }
        
        // SALIDA DE DATOS
        
        System.out.println(mensaje);
        
        System.out.print("\n-----FIN-----\n");
    }
}