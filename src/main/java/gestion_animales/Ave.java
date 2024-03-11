package gestion_animales;

public abstract class Ave extends Animal {

    public Ave(String nombre, String especie, int edad) {
        super(nombre, especie, edad);
    }

    public abstract void volar();

    public abstract void cantar();

}