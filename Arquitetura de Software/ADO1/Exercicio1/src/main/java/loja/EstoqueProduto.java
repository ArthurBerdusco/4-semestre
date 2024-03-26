package loja;

import java.util.ArrayList;
import java.util.List;

public class EstoqueProduto implements Estoque {

    private List<ProdutoQuantidade> produtosEstoque;

    public EstoqueProduto() {
        this.produtosEstoque = new ArrayList<>();
    }

    @Override
    public void carregarProdutos() {

        Produto produto1 = new Produto(1, 23, "Trena");
        Produto produto2 = new Produto(2, 125, "Chave Fenda");

        var p1Qnt = new ProdutoQuantidade(produto1, 14);
        var p2Qnt = new ProdutoQuantidade(produto2, 17);


        produtosEstoque.add(p1Qnt);
        produtosEstoque.add(p2Qnt);
    }

    @Override
    public boolean remover(int id, int quantidade) {
        for (ProdutoQuantidade produto : produtosEstoque) {
            if (produto.getProduto().getCodigo() == id) {
                produto.setQuantidade(produto.getQuantidade() - quantidade);
                return true;
            }
        }

        System.out.println("Produto não encontrado!");
        return false;
    }

    @Override
    public List verEstoque() {
        System.out.println("<============== PRODUTOS EM ESTOQUE ==============>");
        for (ProdutoQuantidade produto : produtosEstoque) {
            System.out.println(produto);
        }
        System.out.println("");
        return produtosEstoque;
    }

    public class ProdutoQuantidade {

        private Produto produto;
        private int quantidade;

        public ProdutoQuantidade(Produto produto, int quantidade) {
            this.produto = produto;
            this.quantidade = quantidade;
        }

        public Produto getProduto() {
            return produto;
        }

        public void setProduto(Produto produto) {
            this.produto = produto;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }

        @Override
        public String toString() {
            return "ProdutoQuantidade{" + "produto=" + produto + ", quantidade=" + quantidade + '}';
        }

    }

}
