import java.util.ArrayList;
import java.util.List;

public class Mesero {

    private List<Pedido> pedidosPendientes = new ArrayList<>();

    public void tomarPedido(Pedido p) {
        pedidosPendientes.add(p);
        System.out.println("📌 Pedido agregado");
    }

    public void cancelarPedido(int index) {
        if (index >= 0 && index < pedidosPendientes.size()) {
            pedidosPendientes.get(index).cancelar();
            pedidosPendientes.remove(index);
            System.out.println("🗑️ Pedido cancelado antes de enviarlo a cocina");
        }
    }

    public void modificarPedido(int index, Pedido nuevoPedido) {
        if (index >= 0 && index < pedidosPendientes.size()) {
            System.out.println("✏️ Pedido modificado");
            pedidosPendientes.set(index, nuevoPedido);
        }
    }

    public void enviarPedidosACocina() {
        System.out.println("👨‍🍳 Enviando pedidos a cocina...");
        for (Pedido p : pedidosPendientes) {
            p.ejecutar();
        }
        pedidosPendientes.clear();
    }
}
