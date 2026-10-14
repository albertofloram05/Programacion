import java.math.*; // IMPORTAMOS LA LIBRERIA MATH
import java.util.Scanner; // IMPORTAMOS LA LIBRERIA SCANNER
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // DECLARAMOS LA VARIABLE SCANNER
        
        System.out.print("\n-----EJERCICIO 9-----\n");
        
        // DECLARAMOS VARIABLES Y CONSTANTES
        
        int num = 0;
        String mensaje = " ";
        
        // ENTRADA DE DATOS
        
        System.out.print("Introduce un numero cuya raiz cuadrada sea entera: ");
        num = sc.nextInt();
        
        // OPERACIONES Y BLOQUES LOGICOS
        
        if (((int) Math.sqrt(num)) * ((int) Math.sqrt(num)) == num) {
            mensaje = "La raiz cuadrada de " + num + " es entera, y es " + (int) Math.sqrt(num);
        }
        else {
            mensaje = "La raiz cuadrada de " + num + " no es entera";
        }
        
        // SALIDA DE DATOS
        
        System.out.println(mensaje);
        
        System.out.print("\n-----FIN-----\n");
    }
}