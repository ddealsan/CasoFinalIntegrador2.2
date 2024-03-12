package gestion_animales;

public abstract class Acuática extends Animal {

    private String tipoAletas;
    private boolean poseeEscamas;

    public Acuática(String nombre, String especie, int edad, String tipoAletas, boolean poseeEscamas) {
        super(nombre, especie, edad);
        this.tipoAletas = tipoAletas;
        this.poseeEscamas = poseeEscamas;
    }

    public Acuática(String nombre, String especie, double peso) {
    }


    public String getTipoAletas() {
        return tipoAletas;
    }

    public void setTipoAletas(String tipoAletas) {
        this.tipoAletas = tipoAletas;
    }

    public boolean isPoseeEscamas() {
        return poseeEscamas;
    }

    public void setPoseeEscamas(boolean poseeEscamas) {
        this.poseeEscamas = poseeEscamas;
    }
    public abstract void reproducirse ();

}