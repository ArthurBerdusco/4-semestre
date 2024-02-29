package br.senac.tads.dsw.ado01;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PessoaController {

    @GetMapping("/")
    public String mostrarTela(Model model) {
        model.addAttribute("dados", this.dados());
        return "index";
    }

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("dados", this.dados());
        return "index";
    }

    @GetMapping("/index2")
    public String index2() {
        return "index2";
    }

    public Pessoa dados() {
        var dados = new Pessoa();

        dados.setNome("Arthur Silva");
        dados.setEmail("arthur@gmail.com");
        dados.setDataNascimento(LocalDate.parse("2000-06-06"));
        dados.setTelefone("(11) 93204-5718");
        dados.setLinkedin("https://www.linkedin.com/in/arthur-silva-26008318b/");
        dados.setGithub("https://github.com/ArthurBerdusco/");

        dados.adicionarExpProf(new ExperienciaProfissional("Johnson Controls", "Técnico de sistemas",
                LocalDate.parse("2019-09-12"), LocalDate.parse("2024-02-24")));
        dados.adicionarExpProf(new ExperienciaProfissional("Diebold Nixdorf", "Estagiário Qualidade",
                LocalDate.parse("2018-01-12"), LocalDate.parse("2019-08-19")));

        dados.adicionarFormacao(
                new FormacaoAcademica("Centro Universitário Senac", "Análise e desenvolvimento de sistemas"));
        dados.adicionarFormacao(new FormacaoAcademica("Etec Guaracy Silveira", "Técnico em Eletrônica"));

        dados.adicionarIdioma(
                new Idioma("Inglês", NivelHabilidade.Bom, NivelHabilidade.Intermediario, NivelHabilidade.Ruim));
        dados.adicionarIdioma(
                new Idioma("Espanhol", NivelHabilidade.Intermediario, NivelHabilidade.Ruim, NivelHabilidade.Ruim));

        dados.adicionarConhecimento(new Conhecimento("Java"));
        dados.adicionarConhecimento(new Conhecimento("Spring"));
        dados.adicionarConhecimento(new Conhecimento("Javascript"));
        dados.adicionarConhecimento(new Conhecimento("React"));
        dados.adicionarConhecimento(new Conhecimento("Node"));
        dados.adicionarConhecimento(new Conhecimento("Banco de dados"));
        dados.adicionarConhecimento(new Conhecimento("Infraestrutura"));

        return dados;
    }

}
