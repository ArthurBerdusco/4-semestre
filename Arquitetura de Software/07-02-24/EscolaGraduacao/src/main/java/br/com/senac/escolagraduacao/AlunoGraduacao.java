package br.com.senac.escolagraduacao;

public class AlunoGraduacao extends Aluno{
    private String unidade;

    public AlunoGraduacao() {
    }

    public AlunoGraduacao(String unidade, String nome, int ra) {
        super(nome, ra);
        this.unidade = unidade;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    @Override
    public String toString() {
        return "AlunoGraduacao{" + "nome=" + getNome() + ", ra=" + getRa() + ", unidade=" + unidade + '}';
    }
    
    
}
