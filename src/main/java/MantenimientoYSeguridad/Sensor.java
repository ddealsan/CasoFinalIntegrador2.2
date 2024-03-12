package MantenimientoYSeguridad;

// Clase para representar un sensor
public class Sensor {
    private String ubicacion;
    private boolean activado;

    public Sensor(String ubicacion) {
        this.ubicacion = ubicacion;
        this.activado = false; // Por defecto, el sensor está desactivado
    }

    public void activar() {
        activado = true;
    }

    public void desactivar() {
        activado = false;
    }

    // Otros métodos relacionados con el funcionamiento del sensor
}