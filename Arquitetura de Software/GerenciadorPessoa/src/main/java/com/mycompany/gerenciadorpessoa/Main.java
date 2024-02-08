package com.mycompany.gerenciadorpessoa;

public class Main {
    public static void main(String[] args) {
        var pJuridica = new PessoaJuridica("Arthur", 0046065455546L);
        var pFisica = new PessoaFisica("João", 42819319882L);
        var pFuncionario = new Funcionario("Carlos", 42819319882L , 11340);
        
        System.out.println(pFuncionario);
        
        
    }
}
