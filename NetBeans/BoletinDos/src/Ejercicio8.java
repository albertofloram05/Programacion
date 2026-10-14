import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // DECLARAMOS LA VARIABLE SCANNER
        
        System.out.println("\n------EJERCICIO 8------\n");
        
        // DECLARAMOS VARIABLES Y CONSTANTES
        double notaEvaluacion1 = 0;
        double notaEvaluacion2 = 0;
        double notaEvaluacion3 = 0;
        double media = 0;
        
        // ENTRADA DE DATOS
        System.out.print("Introduce el nombre del alumno: ");
        String nombreAlumno = sc.nextLine();
        System.out.print("\nIntroduce la nota de la primera evaluacion: ");
        notaEvaluacion1 = sc.nextDouble();
        System.out.print("Introduce la nota de la segunda evaluacion: ");
        notaEvaluacion2 = sc.nextDouble();
        System.out.print("Introduce la nota de la tercera evaluacion: ");
        notaEvaluacion3 = sc.nextDouble();
        
        // OPERACIONES
        media = (notaEvaluacion1 + notaEvaluacion2 + notaEvaluacion3) / 3;
                
        // SALIDA DE DATOS
        System.out.printf("%s, tu nota final es: %.1f", nombreAlumno, media);
        
        System.out.println("\n------FIN------\n");
    }
}