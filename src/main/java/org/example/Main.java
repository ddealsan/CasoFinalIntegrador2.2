package org.example;
import java.io.*;
import java.util.Scanner;
import java.util.Date;
import java.util.List;

import gestion_habitats.*;
import MantenimientoYSeguridad.*;
import AdministradorDeRecursos.*;
import Visitas.*;
import gestion_animales.*;

public class Main {
    private static final String NOMBRE_ARCHIVO = "animales.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Preguntar si es visitante o trabajador
        System.out.println("¿Eres visitante o trabajador? (Escribe 'visitante' o 'trabajador')");
        String tipoUsuario = scanner.nextLine();

        if (tipoUsuario.equalsIgnoreCase("visitante")) {
            // Mostrar opciones del kiosko para visitantes
            mostrarKiosko();
        } else if (tipoUsuario.equalsIgnoreCase("trabajador")) {
            // Mostrar opciones adicionales para trabajadores
            mostrarOpcionesTrabajador();
        } else {
            System.out.println("Tipo de usuario no reconocido. Saliendo del programa.");
        }

        scanner.close();
    }

    // Método para mostrar las opciones del kiosko para visitantes
    private static void mostrarKiosko() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al kiosko. ¿Qué deseas ver?");
        System.out.println("1. Animales acuáticos");
        System.out.println("2. Animales terrestres");
        System.out.println("3. Animales de aviario");
        System.out.print("Selecciona una opción: ");
        int opcion = scanner.nextInt();

        // Aquí podrías llamar a los métodos correspondientes según la opción elegida
        switch (opcion) {
            case 1:
                MostrarAcuaticos mostrarAcuaticos = new MostrarAcuaticos();
                mostrarAcuaticos.mostrarInformacion();
                break;
            case 2:
                MostrarTerrestres mostrarTerrestres = new MostrarTerrestres();
                mostrarTerrestres.mostrarInformacion();
                break;
            case 3:
                MostrarAves mostrarAves = new MostrarAves();
                mostrarAves.mostrarInformacion();
                break;
            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }

    // Método para mostrar las opciones adicionales para trabajadores
    private static void mostrarOpcionesTrabajador() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido, trabajador.");
        System.out.println("Opciones adicionales:");
        System.out.println("1. Datos de Administración de Recursos");
        System.out.println("2. Datos de Mantenimiento y Seguridad");
        System.out.println("3. Datos de Gestión de Hábitats");
        System.out.println("4. Registrar animal nuevo");
        System.out.print("Selecciona una opción: ");
        int opcion = scanner.nextInt();

        // Aquí podrías llamar a los métodos correspondientes según la opción elegida
        switch (opcion) {
            case 1:
                mostrarDatosAdministracionRecursos();
                break;
            case 2:
                mostrarDatosMantenimientoSeguridad();
                break;
            case 3:
                mostrarDatosGestionHabitats();
                break;
            case 4:
                registrarAnimalNuevo();
                break;
            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }

    // Métodos para mostrar datos específicos según la opción elegida
    private static void mostrarDatosAdministracionRecursos() {

        System.out.println("Mostrando datos de Administración de Recursos...\n");


       // Crear instancia del manejo de recursos del zoológico
        ManejoRecursosZoologico zooRecursos = new ManejoRecursosZoologico();

        // Crear algunos recursos
        Recurso alimento1 = new Recurso("Pienso para carnívoros", 100);
        Recurso alimento2 = new Recurso("Frutas", 50);
        Recurso medicina1 = new Recurso("Vitaminas", 30);

        // Agregar los recursos al inventario del zoológico
        zooRecursos.agregarRecurso(alimento1);
        zooRecursos.agregarRecurso(alimento2);
        zooRecursos.agregarRecurso(medicina1);

        // Mostrar el inventario antes del pedido
        System.out.println("Inventario antes del pedido:");
        mostrarInventario(zooRecursos);

        // Crear un pedido de recursos
        Pedido pedido = new Pedido();
        pedido.agregarItem(alimento1, 20);
        pedido.agregarItem(alimento2, 10);
        pedido.agregarItem(medicina1, 5);

        // Realizar el pedido de recursos
        zooRecursos.realizarPedido(pedido);

        // Mostrar el inventario después del pedido
        System.out.println("\nInventario después del pedido:");
        mostrarInventario(zooRecursos);
    }

    // Método para mostrar el inventario
    private static void mostrarInventario(ManejoRecursosZoologico zooRecursos) {
        zooRecursos.getInventario().forEach((nombre, recurso) -> {
            System.out.println(nombre + ": " + recurso.getCantidadDisponible());
        });

    }

    private static void mostrarDatosMantenimientoSeguridad() {
        // Aquí iría la lógica para mostrar los datos de Mantenimiento y Seguridad
        System.out.println("Mostrando datos de Mantenimiento y Seguridad...\n");

        // Crear cámaras
        Camera camera1 = new Camera("Entrada principal");
        Camera camera2 = new Camera("Jaula de leones");

        // Activar una cámara
        camera1.activar();

        // Crear sensores
        Sensor sensor1 = new Sensor("Puerta trasera");
        Sensor sensor2 = new Sensor("Valla de seguridad");

        // Activar un sensor
        sensor2.activar();

        // Crear un sistema de seguridad
        SistemaSeguridad sistemaSeguridad = new SistemaSeguridad();

        // Agregar cámaras y sensores al sistema de seguridad
        sistemaSeguridad.agregarCamera(camera1);
        sistemaSeguridad.agregarCamera(camera2);
        sistemaSeguridad.agregarSensor(sensor1);
        sistemaSeguridad.agregarSensor(sensor2);

        // Mostrar estado del sistema de seguridad
        System.out.println("Estado del sistema de seguridad:");
        System.out.println("Cámaras:");
        for (Camera camera : sistemaSeguridad.getCameras()) {
            System.out.println("Ubicación: " + camera.getUbicacion() + ", Activada: " + camera.isActivada());
        }
        System.out.println("\nSensores:");
        for (Sensor sensor : sistemaSeguridad.getSensors()) {
            System.out.println("Ubicación: " + sensor.getUbicacion() + ", Activado: " + sensor.isActivado());
        }

        // Crear registros de mantenimiento y reparaciones urgentes
        RegistroMantenimiento registro1 = new RegistroMantenimiento("Jaula de tigres", new Date(), "Revisión periódica");
        RegistroMantenimiento registro2 = new RegistroMantenimiento("Piscina de delfines", new Date(), "Reparación de filtración");
        ReparacionUrgente reparacion1 = new ReparacionUrgente("Cerca de osos", new Date(), "Arreglo urgente de valla dañada");

        // Mostrar registros de mantenimiento y reparaciones
        System.out.println("\nRegistros de mantenimiento: ");
        System.out.println(registro1);
        System.out.println(registro2);
        System.out.println("\nReparaciones urgentes: ");
        System.out.println(reparacion1);

    }

    private static void mostrarDatosGestionHabitats() {
        // Crear una instancia del sistema de monitoreo
        SistemaMonitoreo sistemaMonitoreo = new SistemaMonitoreo();

        // Registrar temperaturas, humedades y limpiezas para diferentes hábitats
        sistemaMonitoreo.registrarTemperatura("Jaula de leones", 28.5);
        sistemaMonitoreo.registrarHumedad("Jaula de leones", 60.0);
        sistemaMonitoreo.registrarLimpieza("Jaula de leones", true);

        sistemaMonitoreo.registrarTemperatura("Estanque de tortugas", 24.0);
        sistemaMonitoreo.registrarHumedad("Estanque de tortugas", 80.0);
        sistemaMonitoreo.registrarLimpieza("Estanque de tortugas", false);

        // Obtener y mostrar datos de un hábitat específico
        String habitat = "Jaula de leones";
        System.out.println("Datos del hábitat: " + habitat);
        System.out.println("Temperatura: " + sistemaMonitoreo.obtenerTemperatura(habitat));
        System.out.println("Humedad: " + sistemaMonitoreo.obtenerHumedad(habitat));
        System.out.println("Limpieza: " + (sistemaMonitoreo.estaLimpio(habitat) ? "Sí" : "No"));
    }

    private static void registrarAnimalNuevo() {
        // Crear un objeto de la clase RegistrarNuevoAnimal
        RegistrarNuevoAnimal registroAnimales = new RegistrarNuevoAnimal();

        // Cargar los animales desde el archivo al iniciar el programa
        cargarAnimalesDesdeArchivo(registroAnimales);

        // Pedir al usuario que ingrese los detalles del animal
        Scanner scanner = new Scanner(System.in);
        System.out.println("Registro de Nuevo Animal");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Especie: ");
        String especie = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Tipo (acuatico/terrestre/ave): ");
        String tipo = scanner.nextLine();

        // Registrar el nuevo animal con los detalles proporcionados por el usuario
        registroAnimales.registrarAnimal(nombre, especie, edad, tipo);

        // Guardar los animales en el archivo
        guardarAnimalesEnArchivo(registroAnimales);

        // Mostrar los animales registrados
        registroAnimales.mostrarAnimalesRegistrados();

        // Cerrar el scanner
        scanner.close();
    }

    private static void cargarAnimalesDesdeArchivo(RegistrarNuevoAnimal registroAnimales) {
        try (BufferedReader br = new BufferedReader(new FileReader(NOMBRE_ARCHIVO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                String nombre = partes[0];
                String especie = partes[1];
                int edad = Integer.parseInt(partes[2]);
                String tipo = partes[3];
                registroAnimales.registrarAnimal(nombre, especie, edad, tipo);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    private static void guardarAnimalesEnArchivo(RegistrarNuevoAnimal registroAnimales) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(NOMBRE_ARCHIVO))) {
            for (Animal animal : registroAnimales.getAnimalesRegistrados()) {
                bw.write(animal.getNombre() + "," + animal.getEspecie() + "," + animal.getEdad() + "," + animal.getTipo());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}