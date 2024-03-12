// SistemaSeguridad.java
package MantenimientoYSeguridad;

import java.util.ArrayList;
import java.util.List;

public class SistemaSeguridad {
    private List<Camera> cameras;
    private List<Sensor> sensors;

    public SistemaSeguridad() {
        this.cameras = new ArrayList<>();
        this.sensors = new ArrayList<>();
    }

    public List<Camera> getCameras() {
        return cameras;
    }

    public void agregarCamera(Camera camera) {
        cameras.add(camera);
    }

    public List<Sensor> getSensors() {
        return sensors;
    }

    public void agregarSensor(Sensor sensor) {
        sensors.add(sensor);
    }
}