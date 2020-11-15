package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class Vendedor extends Pessoa {
    private double salarioBase;
    private double taxaComissao;
    private final ArrayList<Pedido> pedidos;

    public Vendedor(String cpf, String nome, double salarioBase) {
        super(cpf, nome);
        this.salarioBase = salarioBase;
        pedidos = new ArrayList<>();
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }
    
    // Retornar Iterable garante que não será possível modificar a lista
    public Iterable<Pedido> getPedidos() {
        return pedidos;
    }
    
    public void addPedido(Pedido pedido) {
        pedidos.add(pedido);
        pedido.setVendedor(this);
    }
    
}
