package caixa;

import loja.Estoque;
import loja.EstoqueProduto;
import loja.ItemPedido;
import loja.Pedido;
import loja.Produto;

public class LojaVendas {

    public static void main(String[] args) {
        EstoqueProduto estoque = new EstoqueProduto();
        estoque.carregarProdutos();

        estoque.verEstoque();

        //Venda
        Produto produto1 = new Produto(1, 23, "Trena");
        Produto produto2 = new Produto(2, 125, "Chave catraca");

        Pedido pedido = new Pedido();
        ItemPedido item1 = new ItemPedido(11, produto1);
        ItemPedido item2 = new ItemPedido(9, produto2);

        estoque.remover(item1.getProduto().getCodigo(), item1.getQuantidade());
        estoque.remover(item2.getProduto().getCodigo(), item2.getQuantidade());

        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);

        pedido.cupomFiscal();
        
        estoque.verEstoque();

    }
}
