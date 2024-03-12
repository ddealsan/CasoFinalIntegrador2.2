package MantenimientoYSeguridad;

// Clase para representar una cámara
public class Camera {
    private String ubicacion;
    private boolean activada;

    public Camera(String ubicacion) {
        this.ubicacion = ubicacion;
        this.activada = false; // Por defecto, la cámara está desactivada
    }

    public void activar() {
        activada = true;
    }

    public void desactivar() {
        activada = false;
    }

    // Otros métodos relacionados con el funcionamiento de la cámara
}