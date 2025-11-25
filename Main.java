public class Main {
    public static void main(String[] args) {

        // Receivers
        Cafetera cafetera = new Cafetera();
        Tostadora tostadora = new Tostadora();
        Exprimidor exprimidor = new Exprimidor();

        // Invoker
        Mesero mesero = new Mesero();

        // Tomar pedidos
        mesero.tomarPedido(new PedidoCafe(cafetera));
        mesero.tomarPedido(new PedidoTostada(tostadora));
        mesero.tomarPedido(new PedidoJugo(exprimidor));

        // Modificar un pedido (ej: cambiar tostada por café)
        mesero.modificarPedido(1, new PedidoCafe(cafetera));

        // Cancelar el jugo
        mesero.cancelarPedido(2);

        // Enviar pedidos a cocina
        mesero.enviarPedidosACocina();
    }
}