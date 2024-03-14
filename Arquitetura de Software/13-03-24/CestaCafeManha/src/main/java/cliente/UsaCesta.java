package cliente;

import composicao.Composicao;
import composicao.Folha;

public class UsaCesta {

    public static void main(String[] args) {

        Composicao cesta = new Composicao("Cesta");
        Folha pao = new Folha("Pao", 10);
        Folha arroz = new Folha("Arroz", 25);
        Folha cafe = new Folha("Cafe", 20);

        Composicao caixaBombom = new Composicao("Caixa de bombom");
        Folha bombom1 = new Folha("Cereja", 4.5);
        Folha bombom2 = new Folha("Chocolate", 4.2);
        Folha bombom3 = new Folha("Amargo", 5.6);

        caixaBombom.adicionar(bombom1);
        caixaBombom.adicionar(bombom2);
        caixaBombom.adicionar(bombom3);

        cesta.adicionar(pao);
        cesta.adicionar(arroz);
        cesta.adicionar(cafe);
        
        cesta.adicionar(caixaBombom);
        
        

        System.out.println(cesta.getPreco());
    }
}
