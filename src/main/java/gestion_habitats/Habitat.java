package gestion_habitats;

public abstract class Habitat {
    private String nombre;
    private double tamaño;

    public Habitat(String nombre, double tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTamaño() {
        return tamaño;
    }

    public abstract String getTipo();

}
