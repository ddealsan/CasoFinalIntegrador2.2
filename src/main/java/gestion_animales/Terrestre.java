package gestion_animales;

public abstract class Terrestre extends Animal {

    private int numeroPatas;
    private String tipoPelajePiel;

    public Terrestre(String nombre, String especie, int edad, int numeroPatas, String tipoPelajePiel) {
        super(nombre, especie, edad);
        this.numeroPatas = numeroPatas;
        this.tipoPelajePiel = tipoPelajePiel;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getTipoPelajePiel() {
        return tipoPelajePiel;
    }

    public void setTipoPelajePiel(String tipoPelajePiel) {
        this.tipoPelajePiel = tipoPelajePiel;
    }

    @Override
    public void respirar() {
        System.out.println("El animal terrestre " + nombre + " respira por pulmones.");
    }

    @Override
    public abstract void reproducirse();

    @Override
    public void moverse() {
        System.out.println("El animal terrestre " + nombre + " camina o corre.");
    }

}