package Visitas;

import gestion_animales.*;

import java.util.Scanner;

public class MostrarTerrestres {
    public void mostrarInformacion() {
        System.out.println("=== Información sobre Animales Terrestres ===");

        // Aquí podríamos crear instancias de animales terrestres y mostrar información general
        // Por ejemplo:
        System.out.println("1. Lobo Siberiano");
        System.out.println("2. Otro animal terrestre");
        System.out.print("Elije un animal para ver más detalles: ");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        switch (opcion) {
            case 1:
                mostrarDetallesLoboSiberiano();
                break;
            // Agregar más casos para otros animales terrestres si es necesario
            default:
                System.out.println("Opción inválida.");
        }
    }

    private void mostrarDetallesLoboSiberiano() {
        // Aquí podríamos crear una instancia de un lobo siberiano y mostrar sus características únicas
        LoboSiberiano loboSiberiano = new LoboSiberiano("Francisco", "Blanco", 14, true);
        System.out.println("=== Detalles del Lobo Siberiano ===");
        System.out.println("Nombre: " + loboSiberiano.getNombre());
        System.out.println("Edad: " + loboSiberiano.getEdad());
        System.out.println("Color de pelaje: " + loboSiberiano.getColorPelaje());
        System.out.println("¿Es una manada?: " + (loboSiberiano.isEsManada() ? "Sí" : "No"));
    }
}