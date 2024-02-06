package br.senac.tads.dsw.exercicioaula01;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PessoaController {
    
    @GetMapping("home")
    public String mostrarTela(Model model){
        var dados = new Pessoa();

        dados.setNome("Arthur Silva");
        dados.setEmail("arthur@gmail.com");
        dados.setDataNascimento(LocalDate.parse("2000-06-06"));
        dados.setTelefone("(11) 93204-5718");

        model.addAttribute("dados", dados);
        model.addAttribute("dataHora", LocalDate.now());

        return "home";
    }

}
