package MantenimientoYSeguridad;

import java.util.Date;

// Clase para representar una reparación urgente
public class ReparacionUrgente {
    private String nombreInstalacion;
    private Date fecha;
    private String descripcion;

    public ReparacionUrgente(String nombreInstalacion, Date fecha, String descripcion) {
        this.nombreInstalacion = nombreInstalacion;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    // Getters y setters
}