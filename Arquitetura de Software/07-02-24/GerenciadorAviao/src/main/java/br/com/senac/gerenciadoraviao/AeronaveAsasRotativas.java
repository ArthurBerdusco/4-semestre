package br.com.senac.gerenciadoraviao;

public class AeronaveAsasRotativas extends Aeronave {

    private boolean rotorDeCalda;

    public AeronaveAsasRotativas() {
    }

    public AeronaveAsasRotativas( boolean rotorDeCalda, int numeroOcupantes, float capadidadeCarga) {
        super(numeroOcupantes, capadidadeCarga);
        this.rotorDeCalda = rotorDeCalda;
    }

    public boolean isRotorDeCalda() {
        return rotorDeCalda;
    }

    public void setRotorDeCalda(boolean rotorDeCalda) {
        this.rotorDeCalda = rotorDeCalda;
    }

    @Override
    public String toString() {
        return "AeronaveAsasRotativas{" + "numeroOcupantes=" + getNumeroOcupantes() + ", capadidadeCarga=" + getCapadidadeCarga() + ", rotorDeCalda=" + rotorDeCalda + '}';
    }

    
}
