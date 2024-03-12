package AdministradorDeRecursos;

import java.util.*;

// Clase para representar un proveedor de recursos
class Proveedor {
    private String nombre;
    private List<Recurso> recursosSuministrados;

    public Proveedor(String nombre) {
        this.nombre = nombre;
        this.recursosSuministrados = new ArrayList<>();
    }

    public void agregarRecurso(Recurso recurso) {
        recursosSuministrados.add(recurso);
    }

    public void removerRecurso(Recurso recurso) {
        recursosSuministrados.remove(recurso);
    }
}