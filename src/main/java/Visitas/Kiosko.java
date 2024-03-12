package Visitas;

import java.util.Scanner;

public class Kiosko {
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al Kiosko de Visitas. ¿Qué tipo de animales te gustan más?");
        System.out.println("1. Acuáticos");
        System.out.println("2. Terrestres");
        System.out.println("3. Aves");
        System.out.print("Elije una opción (1-3): ");

        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        switch (opcion) {
            case 1:
                mostrarAcuaticos();
                break;
            case 2:
                mostrarTerrestres();
                break;
            case 3:
                mostrarAves();
                break;
            default:
                System.out.println("Opción inválida. Por favor, elija una opción del 1 al 3.");
        }
    }

    private void mostrarAcuaticos() {
        // Aquí se redirigiría a la clase que muestra información de animales acuáticos
    }

    private void mostrarTerrestres() {
        // Aquí se redirigiría a la clase que muestra información de animales terrestres
    }

    private void mostrarAves() {
        // Aquí se redirigiría a la clase que muestra información de aves
    }
}