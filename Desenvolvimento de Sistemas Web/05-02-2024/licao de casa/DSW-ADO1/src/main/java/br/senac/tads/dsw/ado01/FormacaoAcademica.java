package br.senac.tads.dsw.ado01;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FormacaoAcademica {
    private String nomeInstituto;
    private String curso;
    public FormacaoAcademica(String nomeInstituto, String curso) {
        this.nomeInstituto = nomeInstituto;
        this.curso = curso;
    }
    
}
