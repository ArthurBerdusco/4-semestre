package br.senac.tads.dsw.exercicioaula01;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Conhecimento {
    private String nome;

    public Conhecimento(String nome) {
        this.nome = nome;
    }
    
}
