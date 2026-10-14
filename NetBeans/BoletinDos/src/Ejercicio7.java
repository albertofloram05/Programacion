import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // DECLARAMOS LA VARIABLE SCANNER
        
        System.out.println("\n------EJERCICIO 7------\n");
        
        // DECLARAMOS VARIABLES Y CONSTANTES
        double peso = 0;
        double altura = 0;
        double imc = 0;
        
        // ENTRADA DE DATOS
        System.out.print("Introduce tu peso: ");
        peso = sc.nextDouble();
        System.out.print("Introduce tu altura: ");
        altura = sc.nextDouble();
        
        // OPERACIONES
        imc = peso / (altura * altura);
        
        // SALIDA DE DATOS
        System.out.printf("Tu IMC es: %.2f", imc);
        
        System.out.println("\n------FIN------\n");
    }
}