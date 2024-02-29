package cliente;

import singleton.Cenario;

public class UsaSingleton extends Thread {

    public static void main(String[] args) {
        
        UsaSingleton t1 = new UsaSingleton();
        UsaSingleton t2 = new UsaSingleton();
        UsaSingleton t3 = new UsaSingleton();
        UsaSingleton t4 = new UsaSingleton();
        UsaSingleton t5 = new UsaSingleton();
        UsaSingleton t6 = new UsaSingleton();
        UsaSingleton t7 = new UsaSingleton();
        UsaSingleton t8 = new UsaSingleton();
        UsaSingleton t9 = new UsaSingleton();
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();

    }

    @Override
    public void run() {
         Cenario cenario = Cenario.getInstance();
         System.out.println(cenario);
         System.out.println(Cenario.configuracoes());
    }
}
