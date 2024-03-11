package br.com.senac.exercicio2;

//ip1 - 10%
//ip2 - 15%
//ip3 - 25%
//Escreva um projeto Java, tendo como base o padrão de projeto strategy, 
//que determine o cálculo de orçamento que envolva serviço ou produto considerando 
//as incidências dos impostos listados acima.
//Cálculo: orcamento*imposto


// Interface para as estratégias de imposto
interface ImpostoStrategy {
    double calcularImposto(double orcamento);
}

// Implementações específicas para cada imposto
class ImpostoIP1 implements ImpostoStrategy {
    private static final double TAXA = 0.10;

    @Override
    public double calcularImposto(double orcamento) {
        return orcamento * TAXA;
    }
}

class ImpostoIP2 implements ImpostoStrategy {
    private static final double TAXA = 0.15;

    @Override
    public double calcularImposto(double orcamento) {
        return orcamento * TAXA;
    }
}

class ImpostoIP3 implements ImpostoStrategy {
    private static final double TAXA = 0.25;

    @Override
    public double calcularImposto(double orcamento) {
        return orcamento * TAXA;
    }
}

class CalculadoraImpostos {

    private ImpostoStrategy impostoStrategy;

    public void setImpostoStrategy(ImpostoStrategy impostoStrategy) {
        this.impostoStrategy = impostoStrategy;
    }

    public double calcularImpostoTotal(double orcamento) {
        if (impostoStrategy == null) {
            throw new IllegalStateException("A estratégia de imposto não foi definida.");
        }

        return impostoStrategy.calcularImposto(orcamento);
    }
}

public class Exercicio2 {

    public static void main(String[] args) {

        // ORÇAMENTO DE PRODUTO OU SERVIÇO COM IMPOSTO IP1
        var calculadora1 = new CalculadoraImpostos();
        calculadora1.setImpostoStrategy(new ImpostoIP1());
        double orcamento1 = 1000;
        System.out.println("Orçamento com IP1 - Imposto: " + calculadora1.calcularImpostoTotal(orcamento1));

        // ORÇAMENTO DE PRODUTO OU SERVIÇO COM IMPOSTO IP2
        var calculadora2 = new CalculadoraImpostos();
        calculadora2.setImpostoStrategy(new ImpostoIP2());
        double orcamento2 = 1500;
        System.out.println("Orçamento com IP2 - Imposto: " + calculadora2.calcularImpostoTotal(orcamento2));

        // ORÇAMENTO DE PRODUTO OU SERVIÇO COM IMPOSTO IP3
        var calculadora3 = new CalculadoraImpostos();
        calculadora3.setImpostoStrategy(new ImpostoIP3());
        double orcamento3 = 2000;
        System.out.println("Orçamento com IP3 - Imposto: " + calculadora3.calcularImpostoTotal(orcamento3));
    }
}
