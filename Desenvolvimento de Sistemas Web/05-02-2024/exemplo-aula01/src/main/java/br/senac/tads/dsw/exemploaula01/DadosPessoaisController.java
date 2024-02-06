package br.senac.tads.dsw.exemploaula01;

import java.time.LocalDate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DadosPessoaisController {

    @GetMapping("/exemplo-dinamico")
    public String mostrarTela(Model model) {
        var dados = new DadosPessoais();

        dados.setNome("Kanye West");
        dados.setDataNascimento(LocalDate.parse("1977-06-08"));
        dados.setTelefone("(11) 93204-5718");
        dados.setEmail("kanye@gmail.com");

        model.addAttribute("dados", dados);
        model.addAttribute("dataHora", LocalDate.now());

        return "dados-template";
    }
    
    

}
