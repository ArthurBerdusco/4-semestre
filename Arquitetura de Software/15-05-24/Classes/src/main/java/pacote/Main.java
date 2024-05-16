package pacote;

import pacote.Externa.Interna;

public class Main {

    public static void main(String[] args) {
        Externa externa = new Externa();
        externa.exibir();
        
        Interna interna = externa.new Interna();
        interna.exibir();
    }
}
