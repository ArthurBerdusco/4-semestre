package composicao;

public class Folha implements Componente{
    
    private String nome;
    private double preco;

    public Folha(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    
    public double getPreco(){
        return preco;
    }

    @Override
    public String toString() {
        return "Folha{" + "nome=" + nome + ", preco=" + preco + '}';
    }
    
    
}
