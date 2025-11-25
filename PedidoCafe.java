public class PedidoCafe implements Pedido {

    private Cafetera cafetera;

    public PedidoCafe(Cafetera cafetera) {
        this.cafetera = cafetera;
    }

    @Override
    public void ejecutar() {
        cafetera.prepararCafe();
    }

    @Override
    public void cancelar() {
        cafetera.cancelarCafe();
    }
}
