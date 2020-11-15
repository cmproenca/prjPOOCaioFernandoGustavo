package fatec.poo.model;

/**
 *
 * @author Gustavo
 */
public class ItemPedido {

    private final int sequencia;
    private double qtdeVendida;
    private Produto produto;
    private Pedido pedido;

    public ItemPedido(int sequencia, double qtdeVendida, Produto produto) {
        this.sequencia = sequencia;
        this.qtdeVendida = qtdeVendida;
        this.produto = produto;
    }

    public void setQtdeVendida(double qtdeVendida) {
        this.qtdeVendida = qtdeVendida;
    }

    public int getSequencia() {
        return sequencia;
    }

    public double getQtdeVendida() {
        return qtdeVendida;
    }

    public Pedido getPedido() {
        return pedido;
    }
    
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    public Produto getProduto() {
        return produto;
    }
    
    public double totalPreco(){
        return(produto.getPreco()* this.qtdeVendida);
    }
    
    public void atualizaEstoque(){
        double quantidade;
        
        quantidade = produto.getQtdeEstoque() - qtdeVendida;
        produto.setQtdeEstoque(quantidade);
    }  
}
