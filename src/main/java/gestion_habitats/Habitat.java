package gestion_habitats;

public abstract class Habitat {
    private String nombre;
    private double tamaño;
    private String ubicacion;

    public Habitat(String nombre, double tamaño, String ubicacion) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTamaño() {
        return tamaño;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public abstract String getTipo();
}