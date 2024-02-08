package br.com.senac.gerenciadoraviao;

public class GerenciadorAviao {

    public static void main(String[] args) {
        var asasRotativas = new AeronaveAsasRotativas(true, 8, 2500f);
        var jato = new JatoDeCaça("Míssel balistico", 4, 350f);
        
        System.out.println(asasRotativas);
        System.out.println(jato);

    }
}
