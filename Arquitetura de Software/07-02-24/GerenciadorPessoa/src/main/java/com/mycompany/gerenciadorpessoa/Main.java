package com.mycompany.gerenciadorpessoa;

public class Main {
    public static void main(String[] args) {
        var pJuridica = new PessoaJuridica("Arthur", 0046065455546L);
        var pFisica = new PessoaFisica("João", 42819319882L);
        var gerente = new Funcionario("Carlos", 42819319882L , 11340, "Gerente", 9507);
        var engenharia = new Funcionario("Maria", 42819319882L , 24056, "Engenharia", 4300);
        
        System.out.println(gerente.alterarSalario(engenharia, 5000));
        System.out.println(gerente.alterarSalario(gerente, 5000));
        System.out.println(engenharia.alterarSalario(gerente, 3500));

    }
}
