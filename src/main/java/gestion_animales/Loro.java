package gestion_animales;

public class Loro extends Ave {

    private String colorPlumaje;
    private String capacidadHablar;

    public Loro(String nombre, String colorPlumaje, int edad, String capacidadHablar) {
        super(nombre, "loro", edad, colorPlumaje, "curvo");
        this.capacidadHablar = capacidadHablar;
    }

    public String getCapacidadHablar() {
        return capacidadHablar;
    }

    public void setCapacidadHablar(String capacidadHablar) {
        this.capacidadHablar = capacidadHablar;
    }

    @Override
    public void respirar() {
        System.out.println("El loro " + nombre + " respira por pulmones.");
    }

    public void hablar() {
        System.out.println("El loro " + nombre + " está hablando.");
    }

}
