package loja;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private double valorTotal;
    private List<ItemPedido> itensPedido;

    public Pedido() {
        this.itensPedido = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item) {
        itensPedido.add(item);
    }

    public double calcularTotal() {

        double total = 0;

        for (ItemPedido item : itensPedido) {
            total += (item.getProduto().getPreco() * item.getQuantidade());
        }

        return total;
    }
    
    public void cupomFiscal(){
        System.out.println("************************************ CUPOM FISCAL ************************************");
        for(ItemPedido item: itensPedido){
            System.out.println(item);
        }
        
        System.out.println("Total: " + calcularTotal());
        System.out.println("**************************************************************************************");
    }

    @Override
    public String toString() {
        return "Pedido{" + "valorTotal=" + valorTotal + ", itensPedido=" + itensPedido + '}';
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<ItemPedido> getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(List<ItemPedido> itensPedido) {
        this.itensPedido = itensPedido;
    }

}
