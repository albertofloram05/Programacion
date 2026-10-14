import java.math.*; // IMPORTAMOS LA LIBRERIA MATH
import java.util.Scanner; // IMPORTAMOS LA LIBRERIA SCANNER
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // DECLARAMOS LA VARIABLE SCANNER
        
        System.out.print("\n-----EJERCICIO 7-----\n");
        
        // DECLARAMOS VARIABLES Y CONSTANTES
        
        int numCaso = 0;
        String mensaje = " ";
        
        // ENTRADA DE DATOS
        
        System.out.print("Introduce un numero del 1 al 7: ");
        numCaso = sc.nextInt();
        
        
        // OPERACIONES Y BLOQUES LOGICOS
        
        switch (numCaso) {
            case 1:
                mensaje = "Lunes";
                break;
                
            case 2:
                mensaje = "Martes";
                break;
                
            case 3:
                mensaje = "Miercoles";
                break;
                
            case 4:
                mensaje = "Jueves";
                break;
                
            case 5:
                mensaje = "Viernes";
                break;
                
            case 6:
                mensaje = "Sabado";
                break;
                
            case 7:
                mensaje = "Domingo";
                break;
                
            default:
                mensaje = "Error, numero fuera de rango";
        }
        
        // SALIDA DE DATOS
        
        System.out.println(mensaje);
        
        System.out.print("\n-----FIN-----\n");
    }
}