package loja;

import java.util.List;

public interface Estoque {
    
    public void carregarProdutos();
    public boolean remover(int id, int quantidade);
    public List verEstoque();
    
    
}
