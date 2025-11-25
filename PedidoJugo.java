public class PedidoJugo implements Pedido {

    private Exprimidor exprimidor;

    public PedidoJugo(Exprimidor exprimidor) {
        this.exprimidor = exprimidor;
    }

    @Override
    public void ejecutar() {
        exprimidor.prepararJugo();
    }

    @Override
    public void cancelar() {
        exprimidor.cancelarJugo();
    }
}
