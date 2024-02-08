package br.com.senac.gerenciadoraviao;

public abstract class Aeronave {

    private int numeroOcupantes;
    private float capadidadeCarga;

    public Aeronave() {
    }

    public Aeronave(int numeroOcupantes, float capadidadeCarga) {
        this.numeroOcupantes = numeroOcupantes;
        this.capadidadeCarga = capadidadeCarga;
    }

    public int getNumeroOcupantes() {
        return numeroOcupantes;
    }

    public void setNumeroOcupantes(int numeroOcupantes) {
        this.numeroOcupantes = numeroOcupantes;
    }

    public float getCapadidadeCarga() {
        return capadidadeCarga;
    }

    public void setCapadidadeCarga(float capadidadeCarga) {
        this.capadidadeCarga = capadidadeCarga;
    }

    @Override
    public String toString() {
        return "Aeronave{" + "numeroOcupantes=" + numeroOcupantes + ", capadidadeCarga=" + capadidadeCarga + '}';
    }

    
}
