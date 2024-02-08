package com.mycompany.gerenciadorpessoa;

public class Funcionario extends PessoaFisica {

    private int matricula;
    private String cargo;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, long cpf, int matricula, String cargo, double salario) {
        super(nome, cpf);
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + getNome() + ", cpf=" + getCpf() + ", matricula=" + matricula + '}';
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String alterarSalario(Funcionario funcionario, double novoSalario) {
        if (this.cargo.equals("Gerente") && this.matricula != funcionario.getMatricula()) {
            funcionario.setSalario(novoSalario);
            return "Sucesso - Salário do funcionario alterado com sucesso";
        } else if (this.cargo.equals("Gerente") && this.matricula == funcionario.getMatricula()) {
            return "Falha - O gerente não pode alterar o proprio salário";
        } 
        return "Falha - Este cargo não tem permissão para alterar o salária";
    }

}
