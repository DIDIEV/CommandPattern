public class PedidoTostada implements Pedido {

    private Tostadora tostadora;

    public PedidoTostada(Tostadora tostadora) {
        this.tostadora = tostadora;
    }

    @Override
    public void ejecutar() {
        tostadora.prepararTostada();
    }

    @Override
    public void cancelar() {
        tostadora.cancelarTostada();
    }
}
