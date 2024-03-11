package br.com.senac.exercicio1;

//Uma empresa estabeleceu uma regra para cálculo dos salários dos seus funcionários. 
//Os salários serão calculados com base em um fator, que é diferenciado para cada departamento. 
//Essa regra tem o objetivo de incrementar o plano de carreiras da empresa. 
//Desenvolvimento - bônus 5%
//Suporte - bônus 4%
//Demais departamentos - bônus 3%
//Aplicar o pattern Strategy para esse caso e retorne o salário bonificado. 
//Faça testes para determinar o salário em cada departamento mencionado.
interface SalarioStrategy {

    double calcularSalario(double salario);
}

class BonusSuporte implements SalarioStrategy {

    private static final double BONUS = 0.05;

    @Override
    public double calcularSalario(double salario) {
        return salario + (salario * BONUS);
    }
}

class BonusDesenvolvimento implements SalarioStrategy {

    private static final double BONUS = 0.04;

    @Override
    public double calcularSalario(double salario) {
        return salario + (salario * BONUS);
    }
}

class BonusDepartamento implements SalarioStrategy {

    private static final double BONUS = 0.03;

    @Override
    public double calcularSalario(double salario) {
        return salario + (salario * BONUS);
    }
}

class FolhaRecursosHumanos {

    private SalarioStrategy salarioStrategy;

    public void setSalarioStrategy(SalarioStrategy salarioStrategy) {
        this.salarioStrategy = salarioStrategy;
    }

    public double calculaSalarioBonificado(double salario) {
        if (salarioStrategy == null) {
            throw new IllegalStateException("A estratégia de entrega não foi definida.");
        }

        return salarioStrategy.calcularSalario(salario);
    }
}

public class Exercicio1 {

    public static void main(String[] args) {

        //FUNCIONARIO SUPORTE
        var folha1 = new FolhaRecursosHumanos();
        folha1.setSalarioStrategy(new BonusSuporte());
        double salarioFolha1 = 3500;
        System.out.println("Funcionario Suporte 5% - Salario bonificado: " + folha1.calculaSalarioBonificado(salarioFolha1));

        //FUNCIONARIO DESENVOLVIMENTO
        var folha2 = new FolhaRecursosHumanos();
        folha2.setSalarioStrategy(new BonusDesenvolvimento());
        double salarioFolha2 = 3100;
        System.out.println("Funcionario Desenvolvimento 4% - Salario bonificado: " + folha2.calculaSalarioBonificado(salarioFolha2));

        //FUNCIONARIO OUTROS DEPARTAMENTOS
        var folha3 = new FolhaRecursosHumanos();
        folha3.setSalarioStrategy(new BonusDepartamento());
        double salarioFolha3 = 2400;
        System.out.println("Funcionario Suporte 3% - Salario bonificado: " + folha3.calculaSalarioBonificado(salarioFolha3));

    }
}
