package Visitas;

import gestion_animales.*;

import java.util.Scanner;

public class MostrarAcuaticos {
    public void mostrarInformacion() {
        System.out.println("=== Información sobre Animales Acuáticos ===");

        // Aquí podríamos crear instancias de animales acuáticos y mostrar información general
        // Por ejemplo:
        System.out.println("1. Delfín");
        System.out.println("2. Otro animal acuático");
        System.out.print("Elije un animal para ver más detalles: ");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        switch (opcion) {
            case 1:
                mostrarDetallesDelfin();
                break;
            // Agregar más casos para otros animales acuáticos si es necesario
            default:
                System.out.println("Opción inválida.");
        }
    }

    private void mostrarDetallesDelfin() {
        // Aquí podríamos crear una instancia de un delfín y mostrar sus características únicas
        Delfín delfin = new Delfín("Serafin", "2Metros", 10, true);
        System.out.println("=== Detalles del Delfín ===");
        System.out.println("Nombre: " + delfin.getNombre());
        System.out.println("Edad: " + delfin.getEdad());
        System.out.println("Tamaño: " + delfin.getTamaño());
        System.out.println("¿Es inteligente?: " + (delfin.isEsInteligente() ? "Sí" : "No"));
    }
}