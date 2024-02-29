package singleton;

public class Cenario {

    private static final int limite_ = 5;
    private static int quantidade = 0;
    private static Cenario cenario;

    private Cenario() {

    }

    //EX 5 - Escreva um método configuracoes que deve exibir uma mensagem. Esse método deve ser invocado pela instância dentro da classe Cenario. 
    public static String configuracoes() {
        return "Configurações singleton --> [...]";
    }

    public static Cenario getInstance() {
        if (cenario == null || quantidade < limite_) {
            cenario = new Cenario();
            quantidade++;
        }
        return cenario;
    }

}
