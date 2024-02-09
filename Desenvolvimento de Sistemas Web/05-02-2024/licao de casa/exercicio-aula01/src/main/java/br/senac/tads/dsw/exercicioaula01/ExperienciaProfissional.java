package br.senac.tads.dsw.exercicioaula01;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ExperienciaProfissional {
    private String nomeEmpresa;
    private String cargo;
    private LocalDate inicio;
    private LocalDate fim;

    public ExperienciaProfissional(String nomeEmpresa, String cargo, LocalDate inicio, LocalDate fim) {
        this.nomeEmpresa = nomeEmpresa;
        this.cargo = cargo;
        this.inicio = inicio;
        this.fim = fim;
    }

    


    

}
