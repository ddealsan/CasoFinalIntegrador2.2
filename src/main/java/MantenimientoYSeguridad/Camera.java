package MantenimientoYSeguridad;

public class Camera {
    private String ubicacion;
    private boolean activada;

    public Camera(String ubicacion) {
        this.ubicacion = ubicacion;
        this.activada = false;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean isActivada() {
        return activada;
    }

    public void activar() {
        activada = true;
    }

    public void desactivar() {
        activada = false;
    }
}