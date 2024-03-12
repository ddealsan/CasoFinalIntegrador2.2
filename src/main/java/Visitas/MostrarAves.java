package Visitas;


import gestion_animales.*;

import java.util.Scanner;

public class MostrarAves {
    public void mostrarInformacion() {
        System.out.println("=== Información sobre Aves ===");

        // Aquí podríamos crear instancias de aves y mostrar información general
        // Por ejemplo:
        System.out.println("1. Loro");
        System.out.println("2. Otro tipo de ave");
        System.out.print("Elije un ave para ver más detalles: ");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        switch (opcion) {
            case 1:
                mostrarDetallesLoro();
                break;
            // Agregar más casos para otras aves si es necesario
            default:
                System.out.println("Opción inválida.");
        }
    }

    private void mostrarDetallesLoro() {
        // Aquí podríamos crear una instancia de un loro y mostrar sus características únicas
        Loro loro = new Loro("Moises", "Amarillo y verde", 7, "Puede hablar");
        System.out.println("=== Detalles del Loro ===");
        System.out.println("Nombre: " + loro.getNombre());
        System.out.println("Edad: " + loro.getEdad());
        System.out.println("Color de plumaje: " + loro.getColorPlumaje());
        System.out.println("Capacidad de hablar: " + loro.getCapacidadHablar());
    }
}