package AdministradorDeRecursos;

import java.util.*;

public class ManejoRecursosZoologico {
    private Map<String, Recurso> inventario;
    private List<Pedido> pedidos;
    private List<Proveedor> proveedores;

    public ManejoRecursosZoologico() {
        this.inventario = new HashMap<>();
        this.pedidos = new ArrayList<>();
        this.proveedores = new ArrayList<>();
    }

    // Agregar un recurso al inventario
    public void agregarRecurso(Recurso recurso) {
        inventario.put(recurso.getNombre(), recurso);
    }

    // Realizar un pedido de recursos
    public void realizarPedido(Pedido pedido) {
        pedidos.add(pedido);
        pedido.procesarPedido(inventario); // Llamamos al método procesarPedido de Pedido
    }

    // Agregar un proveedor
    public void agregarProveedor(Proveedor proveedor) {
        proveedores.add(proveedor);
    }

    // Obtener el inventario completo
    public Map<String, Recurso> getInventario() {
        return inventario;
    }

    // Obtener la lista de pedidos pendientes
    public List<Pedido> getPedidosPendientes() {
        return pedidos;
    }

    // Obtener la lista de proveedores
    public List<Proveedor> getProveedores() {
        return proveedores;
    }
}