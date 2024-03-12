package AdministradorDeRecursos;

import java.util.*;

// Clase para representar un recurso genérico
public class Recurso {
    private String nombre;
    private int cantidadDisponible;

    public Recurso(String nombre, int cantidadDisponible) {
        this.nombre = nombre;
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
}