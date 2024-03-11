package gestion_animales;

public class Perro extends Animal {

    private String raza;

    public Perro(String nombre, String raza, int edad) {
        super(nombre, "perro", edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void comer() {
        // Implementar la lógica para que el perro coma
    }

    @Override
    public void dormir() {
        // Implementar la lógica para que el perro duerma
    }

    @Override
    public void jugar() {
        // Implementar la lógica para que el perro juegue
    }

}