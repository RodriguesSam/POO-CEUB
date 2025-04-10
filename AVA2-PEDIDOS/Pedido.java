import java.sql.Date;
import java.util.List;

public class Pedido {
    private int idPedido;
    private Date dataPedido;
    private Vendedor vendedorPedido;
    private Cliente clientePedido;
    private String statusPedido;
    private double valorPedido;
    private List<Item> itensPedido;

    //Métodos

    public void atualizarStatus(int indice){
        switch (indice) {
            case 1:
                statusPedido = "Processamento";
                break;
            case 2:
                statusPedido = "Enviado";
                break;
            case 3:
                statusPedido = "Entregue";
                break;
            case 4:
                statusPedido = "Cancelado";
            default:
                break;
        }
    }

    public void adicionarItem(Item item){
        itensPedido.add(item);
    }

    public void removerItem(int index){
        itensPedido.remove(index);
    }

    public void calcularTotal() {
        double total = 0;
        for (Item item : itensPedido) {
            double valorItem = item.getPrecoItem();
            total += valorItem;
        }
        valorPedido = total;
    }

    public void aplicarDesconto(int percentualDesconto){
        valorPedido = valorPedido - valorPedido*percentualDesconto;
    }
}