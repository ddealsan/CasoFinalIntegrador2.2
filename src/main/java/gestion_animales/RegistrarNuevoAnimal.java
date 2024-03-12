package gestion_animales;

import java.util.*;

public class RegistrarNuevoAnimal {
    private List<Animal> animalesRegistrados;

    public RegistrarNuevoAnimal() {
        this.animalesRegistrados = new ArrayList<>();
    }

    public void registrarAnimal(String nombre, String especie, double peso, String tipo) {
        Animal nuevoAnimal = crearAnimal(nombre, especie, peso, tipo);
        if (nuevoAnimal != null) {
            animalesRegistrados.add(nuevoAnimal);
            System.out.println("Nuevo animal registrado:");
            System.out.println(nuevoAnimal);
        } else {
            System.out.println("No se pudo registrar el animal. Tipo de animal desconocido.");
        }
    }

    private Animal crearAnimal(String nombre, String especie, double peso, String tipo) {
        switch (tipo.toLowerCase()) {
            case "acuatico":
                return new Acuática(nombre, especie, peso) {
                    @Override
                    public void reproducirse() {

                    }

                    @Override
                    public void respirar() {

                    }

                    @Override
                    public void moverse() {

                    }
                };
            case "terrestre":
                return new Terrestre(nombre, especie, peso) {
                    @Override
                    public void reproducirse() {

                    }
                };
            case "ave":
                return new Ave(nombre, especie, peso) {
                    @Override
                    public void respirar() {

                    }
                };
            default:
                return null;
        }
    }

    public List<Animal> getAnimalesRegistrados() {
        return animalesRegistrados;
    }

    // Método para mostrar todos los animales registrados
    public void mostrarAnimalesRegistrados() {
        System.out.println("Animales registrados:");
        for (Animal animal : animalesRegistrados) {
            System.out.println(animal);
        }
    }
}