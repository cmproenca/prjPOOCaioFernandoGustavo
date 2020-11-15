package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Fernando, Caio
 */
public class Pedido {
    private final String numero;
    private final String dataEmissao;
    private String dataPagto;
    private boolean formaPagto;
    private boolean situacao;
    private Cliente cliente;
    private Vendedor vendedor;
    private final ArrayList<ItemPedido> itens;

    public Pedido(String numero, String dataEmissao) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        itens = new ArrayList<>();
    }

    public void setDataPagto(String dataPagto) {
        this.dataPagto = dataPagto;
    }

    public void setFormaPagto(boolean formaPagto) {
        this.formaPagto = formaPagto;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public String getNumero() {
        return numero;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public String getDataPagto() {
        return dataPagto;
    }

    public boolean isFormaPagto() {
        return formaPagto;
    }

    public boolean isSituacao() {
        return situacao;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Vendedor getVendedor() {
        return vendedor;
    }
    
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
    // Retornar Iterable garante que não será possível modificar a lista
    public Iterable<ItemPedido> getItens() {
        return itens;
    }
    
    public void addItem(ItemPedido item){ 
        itens.add(item);
        item.setPedido(this);
        cliente.retiraLimite(item.totalPreco());
    }
}
