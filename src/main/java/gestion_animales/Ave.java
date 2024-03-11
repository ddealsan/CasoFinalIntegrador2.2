package gestion_animales;

public abstract class Ave extends Animal {

    private String colorPlumaje;
    private String tipoPico;

    public Ave(String nombre, String especie, int edad, String colorPlumaje, String tipoPico) {
        super(nombre, especie, edad);
        this.colorPlumaje = colorPlumaje;
        this.tipoPico = tipoPico;
    }

    public String getColorPlumaje() {
        return colorPlumaje;
    }

    public void setColorPlumaje(String colorPlumaje) {
        this.colorPlumaje = colorPlumaje;
    }

    public String getTipoPico() {
        return tipoPico;
    }

    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }

    @Override
    public abstract void respirar();

    @Override
    public void reproducirse() {
        System.out.println("El ave " + nombre + " pone huevos para reproducirse.");
    }

    @Override
    public void moverse() {
        System.out.println("El ave " + nombre + " vuela.");
    }

}