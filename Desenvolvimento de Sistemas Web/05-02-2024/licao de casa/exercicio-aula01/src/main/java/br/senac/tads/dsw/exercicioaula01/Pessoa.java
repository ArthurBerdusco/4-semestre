package br.senac.tads.dsw.exercicioaula01;

import java.time.LocalDate;
import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pessoa {
    private String nome;
    private String email;
    private LocalDate dataNascimento;
    private String telefone;

    private String linkedin;
    private String github;

    private ArrayList<ExperienciaProfissional> experienciasProfissionais;
    private ArrayList<FormacaoAcademica> formacoes;
    private ArrayList<Idioma> idiomas;
    private ArrayList<Conhecimento> conhecimentos;

    

    public Pessoa() {
        experienciasProfissionais = new ArrayList<ExperienciaProfissional>();
        formacoes = new ArrayList<FormacaoAcademica>();
        idiomas = new ArrayList<Idioma>();
        conhecimentos = new ArrayList<Conhecimento>();
    }

    public void adicionarExpProf(ExperienciaProfissional exp){
        this.experienciasProfissionais.add(exp);
    }

    public void adicionarFormacao(FormacaoAcademica formacao){
        this.formacoes.add(formacao);
    }

    public void adicionarIdioma(Idioma idioma){
        this.idiomas.add(idioma);
    }

    public void adicionarConhecimento(Conhecimento conhecimento){
        this.conhecimentos.add(conhecimento);
    }


    
}
