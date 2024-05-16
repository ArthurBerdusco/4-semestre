package exemplo;

public class Teste {
    public static void main(String[] args) {
        Exibir exibir=new Exibir() {
            @Override
            public void nome() {
                System.out.println("Arthur");    
            }

            @Override
            public void sobreNome() {
                System.out.println("Silva");    
            }
        };
        
        exibir.nome();
        exibir.sobreNome();
    }
}
