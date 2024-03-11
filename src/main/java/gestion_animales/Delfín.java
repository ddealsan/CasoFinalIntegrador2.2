package gestion_animales;

public class Delfín extends Acuática {

    private String tamaño;
    private boolean esInteligente;

    public Delfín(String nombre, String tamaño, int edad, boolean esInteligente) {
        super(nombre, "delfín", edad, "natación", true);
        this.tamaño = tamaño;
        this.esInteligente = esInteligente;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public boolean isEsInteligente() {
        return esInteligente;
    }

    public void setEsInteligente(boolean esInteligente) {
        this.esInteligente = esInteligente;
    }

    @Override
    public void respirar() {

    }

    @Override
    public void reproducirse() {
        System.out.println("El delfín " + nombre + " da a luz a una cría.");
    }

    @Override
    public void moverse() {

    }

    public void realizarSaltosAcrobaticos() {
        System.out.println("El delfín " + nombre + " está realizando saltos acrobáticos.");
    }

}