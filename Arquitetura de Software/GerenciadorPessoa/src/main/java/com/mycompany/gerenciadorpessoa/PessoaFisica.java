package com.mycompany.gerenciadorpessoa;

public class PessoaFisica extends Pessoa{
    private long cpf;

    public PessoaFisica() {
    }

    public PessoaFisica(String nome, long cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" + "nome=" + getNome() + ", cpf=" + cpf + '}';
    }
    
    
    
}
