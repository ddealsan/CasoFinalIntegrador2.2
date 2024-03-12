package MantenimientoYSeguridad;

import java.util.ArrayList;
import java.util.List;

// Clase para representar un sistema de seguridad
public class SistemaSeguridad {
    private List<Camera> cameras;
    private List<Sensor> sensors;

    public SistemaSeguridad() {
        this.cameras = new ArrayList<>();
        this.sensors = new ArrayList<>();
    }

    public void agregarCamera(Camera camera) {
        cameras.add(camera);
    }

    public void agregarSensor(Sensor sensor) {
        sensors.add(sensor);
    }

    // Otros métodos para monitorear accesos y movimientos dentro del zoológico
}