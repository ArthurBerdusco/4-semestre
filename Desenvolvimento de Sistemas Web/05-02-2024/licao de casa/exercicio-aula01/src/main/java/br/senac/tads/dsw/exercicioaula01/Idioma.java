package br.senac.tads.dsw.exercicioaula01;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Idioma {
    private String lingua;
    private NivelHabilidade leitura;
    private NivelHabilidade escrita;
    private NivelHabilidade conversacao;
    public Idioma(String lingua, NivelHabilidade leitura, NivelHabilidade escrita,
            NivelHabilidade conversacao) {
        this.lingua = lingua;
        this.leitura = leitura;
        this.escrita = escrita;
        this.conversacao = conversacao;
    }

    
}

enum NivelHabilidade {
    Ruim,
    Intermediario,
    Bom
}