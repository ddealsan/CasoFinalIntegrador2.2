package MantenimientoYSeguridad;

import java.util.Date;

// Clase para representar un registro de mantenimiento
public class RegistroMantenimiento {
    private String nombreInstalacion;
    private Date fecha;
    private String descripcion;

    public RegistroMantenimiento(String nombreInstalacion, Date fecha, String descripcion) {
        this.nombreInstalacion = nombreInstalacion;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    // Getters y setters
}