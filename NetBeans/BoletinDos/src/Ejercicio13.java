import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // DECLARAMOS LA VARIABLE SCANNER
        
        System.out.println("\n------EJERCICIO 13------\n");
        
        // DECLARAMOS VARIABLES Y CONSTANTES
        final double IVA = 0.21;
        String nombreProducto = " ";
        int unidadesProducto = 0;
        double precioProducto = 0;
        double factura = 0;
        
        // ENTRADA DE DATOS
        System.out.print("Introduce el nombre del producto: ");
        nombreProducto = sc.nextLine();
        System.out.print("\nIntroduce las unidades del producto: ");
        unidadesProducto = sc.nextInt();
        System.out.print("Introduce el precio del producto: ");
        precioProducto = sc.nextDouble();
        
        // OPERACIONES
        factura = (double) unidadesProducto * precioProducto * (1 + IVA);
        
        // SALIDA DE DATOS
        System.out.printf("Nombre del producto: %s\n", nombreProducto);
        System.out.printf("Unidades del producto: %d\n", unidadesProducto);
        System.out.printf("Precio del producto: %.2f\n", precioProducto);
        System.out.printf("Total con IVA: %.2f\n", factura);
        
        System.out.println("\n------FIN------\n");
    }
}