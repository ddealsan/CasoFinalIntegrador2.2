package gestion_animales;

public class LoboSiberiano extends Terrestre {

    private String colorPelaje;
    private boolean esManada;

    public LoboSiberiano(String nombre, String colorPelaje, int edad, boolean esManada) {
        super(nombre, "lobo siberiano", edad, 4, "pelaje grueso");
        this.colorPelaje = colorPelaje;
        this.esManada = esManada;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    public boolean isEsManada() {
        return esManada;
    }

    public void setEsManada(boolean esManada) {
        this.esManada = esManada;
    }

    @Override
    public void reproducirse() {
        System.out.println("El lobo siberiano " + nombre + " da a luz a cachorros.");
    }

    public void aullar() {
        System.out.println("El lobo siberiano " + nombre + " está aullando.");
    }

}