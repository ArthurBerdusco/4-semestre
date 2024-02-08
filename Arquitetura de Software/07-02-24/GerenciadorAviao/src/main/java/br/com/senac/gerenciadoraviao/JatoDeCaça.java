package br.com.senac.gerenciadoraviao;

public class JatoDeCaça extends Aeronave{

    private String armamento;

    public JatoDeCaça() {
    }

    public JatoDeCaça(String armamento) {
        this.armamento = armamento;
    }

    public JatoDeCaça(String armamento, int numeroOcupantes, float capadidadeCarga) {
        super(numeroOcupantes, capadidadeCarga);
        this.armamento = armamento;
    }

    public String getArmamento() {
        return armamento;
    }

    public void setArmamento(String armamento) {
        this.armamento = armamento;
    }

    @Override
    public String toString() {
        return "JatoDeCaça{" + "numeroOcupantes=" + getNumeroOcupantes() + ", capadidadeCarga=" + getCapadidadeCarga() + ", armamento=" + armamento + '}';
    }
    
    

}
