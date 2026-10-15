import java.util.Scanner; // IMPORTAMOS LA LIBRERIA SCANNER
public class MedacPark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // DECLARAMOS LA VARIABLE SCANNER
        
        // DECLARAMOS VARIABLES Y CONSTANTES
        
        int opcion1 = 0;
        int opcion2 = 0;
        double precioBase = 0;
        String opcionElegida = " ";
        int edad = 0;
        double precioTotal = 0;
        String dia = " ";

        
        
        // ENTRADA DE DATOS
        System.out.println("-----BIENVENIDO A MEDAC PARK-----");
        System.out.print("\nOpcion 1: Pase Estandar (Acceso general a atracciones) -- Precio base: 40.00 eur\n");
        System.out.println("Opcion 2: Pase Acuatico (Acceso general + Parque Acuatico) -- Precio base: 55.00 eur");
        System.out.println("Opcion 3: Pase Total VIP (Acceso general + Acuatico + Acceso Rapido sin colas) -- Precio base: 80.00 eur");
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.print("\nElige una de las 3 opciones: ");
        opcion1 = sc.nextInt();
        
        
        switch (opcion1) {
            case 1:
                precioBase = 40.0;
                opcionElegida = "Pase Estandar";
                System.out.println("Has elegido el Pase Estandar!");
                break;
                
            case 2:
                precioBase = 55.0;
                opcionElegida = "Pase Acuatico";
                System.out.println("Has elegido el Pase Acuatico!");
                break;
                
            case 3:
                precioBase = 80.0;
                opcionElegida = "Pase Total VIP";
                System.out.println("Has elegido el Pase Total VIP!");
                break;
                
            default:
                opcionElegida = "ERROR. No se ha seleccionado ninguna opcion.";
                System.out.println(opcionElegida);
                System.exit(0);
                
        }
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.print("Dinos tu edad: ");
        edad = sc.nextInt();
        
        if (edad < 0 || edad > 120) {
            System.out.print("Edad invalida.");
            System.exit(0);
        }
        else if (edad < 4) {
            System.out.println("-----TICKET-----");
            System.out.printf("\nPase -- %s", opcionElegida);
            System.out.print("\nPrecio -- GRATIS");
            System.exit(0);
        }
        else if (edad >= 4 && edad <= 12) {
            precioTotal = precioBase * 0.75;
        }
        else if (edad >= 13 && edad <= 64) {
            precioTotal = precioBase;
        }
        else {
            precioTotal = precioBase * 0.70;
        }
        System.out.print("Elige un dia de la semana en formato numerico (1 al 7): ");
        opcion2 = sc.nextInt();
        switch (opcion2) {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            
            case 3:
                dia = "Miercoles";
                precioTotal -= 5;
                break;
                
            case 4:
                dia = "Jueves";
                break;
                
            case 5:
                dia = "Viernes";
                break;
                
            case 6:
                dia = "Sabado";
                precioTotal *= 1.10;
                break;
                
            case 7:
                dia = "Domingo";
                precioTotal *= 1.10;
                break;
                
            default:
                System.out.print("ERROR. Dia no reconocible");
                System.exit(0);
        }
        System.out.print("\n-----TICKET-----\n");
        System.out.printf("\nPase -- %s", opcionElegida);
        System.out.printf("\nDia -- %s", dia);
        System.out.printf("\nPrecio -- %.2f", precioTotal);
    }
}
