package MantenimientoYSeguridad;

import java.util.Date;

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
    public String getNombreInstalacion() {
        return nombreInstalacion;
    }

    public void setNombreInstalacion(String nombreInstalacion) {
        this.nombreInstalacion = nombreInstalacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "RegistroMantenimiento{" +
                "nombreInstalacion='" + nombreInstalacion + '\'' +
                ", fecha=" + fecha +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}