package br.senac.tads.dsw.exercicioaula01;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pessoa {
    private String nome;
    private String email;
    private LocalDate dataNascimento;
    private String telefone;
}
