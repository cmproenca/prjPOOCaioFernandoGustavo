package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class Cliente extends Pessoa {
    private double limiteCred;
    private double limiteDisp;
    private final ArrayList<Pedido> pedidos;

    public Cliente(String cpf, String nome, double limiteCred) {
        super(cpf, nome);
        this.limiteCred = limiteCred;
        limiteDisp = limiteCred;
        pedidos = new ArrayList<>();
    }

    public double getLimiteCred() {
        return limiteCred;
    }

    public void setLimiteCred(double limiteCred) {
        double novoCred = limiteCred - this.limiteCred;
        this.limiteCred = limiteCred;
        this.limiteDisp += novoCred;
    }

    public double getLimiteDisp() {
        return limiteDisp;
    }
    
    public void retiraLimite(double valor){
        this.limiteDisp -= valor;
    }
    
    // Retornar Iterable garante que não será possível modificar a lista
    public Iterable<Pedido> getPedidos() {
        return pedidos;
    }
    
    public void addPedido(Pedido pedido) {
        pedidos.add(pedido);
        pedido.setCliente(this);
    }
}
