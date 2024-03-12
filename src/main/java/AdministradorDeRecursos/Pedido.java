package AdministradorDeRecursos;
import java.util.*;
// Clase para representar un pedido de recursos
class Pedido {
    private Map<Recurso, Integer> items;

    public Pedido() {
        this.items = new HashMap<>();
    }

    public void agregarItem(Recurso recurso, int cantidad) {
        items.put(recurso, cantidad);
    }

}