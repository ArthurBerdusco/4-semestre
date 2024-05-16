package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class CadastroFuncionario {
    public static void main(String[] args) {
        List<Funcionario> lista = new ArrayList<>();
        
        lista.add(new Funcionario ("Arthur", "Engenheiro", 999999.85));
        lista.add(new Funcionario ("Ana", "Adm", 35419.15));
        lista.add(new Funcionario ("Caio", "Gerente", 29199.83));
        
        Consumer<Funcionario> consumer=new Consumer<Funcionario>() {
            @Override
            public void accept(Funcionario t) {
                if(t.getSalario() < 1000){
                    t.setSalario(t.getSalario() * 1.5);
                }
                System.out.println("Salario: " + t.getSalario());
            }
        };
        
        lista.forEach(consumer);
        
        
    }
}
