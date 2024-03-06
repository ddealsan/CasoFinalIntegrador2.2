package gestion_habitats;

import java.util.HashMap;
import java.util.Map;

public class SistemaMonitoreo {
    private Map<String, Double> temperaturas;
    private Map<String, Double> humedades;
    private Map<String, Boolean> limpiezas;

    public SistemaMonitoreo() {
        temperaturas = new HashMap<>();
        humedades = new HashMap<>();
        limpiezas = new HashMap<>();
    }

    public void registrarTemperatura(String nombreHabitat, double temperatura) {
        temperaturas.put(nombreHabitat, temperatura);
    }

    public void registrarHumedad(String nombreHabitat, double humedad) {
        humedades.put(nombreHabitat, humedad);
    }

    public void registrarLimpieza(String nombreHabitat, boolean limpio) {
        limpiezas.put(nombreHabitat, limpio);
    }

    public double obtenerTemperatura(String nombreHabitat) {
        return temperaturas.getOrDefault(nombreHabitat, 0.0);
    }

    public double obtenerHumedad(String nombreHabitat) {
        return humedades.getOrDefault(nombreHabitat, 0.0);
    }

    public boolean estaLimpio(String nombreHabitat) {
        return limpiezas.getOrDefault(nombreHabitat, false);
    }

    // Puedes agregar más métodos de análisis según sea necesario
}