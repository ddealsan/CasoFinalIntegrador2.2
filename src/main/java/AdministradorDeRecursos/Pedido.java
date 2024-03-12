package AdministradorDeRecursos;
import java.util.*;


public class Pedido {
    private Map<Recurso, Integer> items;

    public Pedido() {
        this.items = new HashMap<>();
    }


    public void agregarItem(Recurso recurso, int cantidad) {
        items.put(recurso, cantidad);
    }

    // Método para procesar el pedido y actualizar inventarios
    public void procesarPedido(Map<String, Recurso> inventario) {
        for (Map.Entry<Recurso, Integer> entry : items.entrySet()) {
            Recurso recurso = entry.getKey();
            int cantidadPedido = entry.getValue();
            int cantidadDisponible = inventario.get(recurso.getNombre()).getCantidadDisponible();
            inventario.get(recurso.getNombre()).setCantidadDisponible(cantidadDisponible + cantidadPedido);
        }
    }
}