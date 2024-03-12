package MantenimientoYSeguridad;

public class Sensor {
    private String ubicacion;
    private boolean activado;

    public Sensor(String ubicacion) {
        this.ubicacion = ubicacion;
        this.activado = false;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean isActivado() {
        return activado;
    }

    public void setActivado(boolean activado) {
        this.activado = activado;
    }

    public void activar() {
        activado = true;
    }

    public void desactivar() {
        activado = false;
    }
}
