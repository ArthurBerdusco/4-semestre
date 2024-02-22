package principal;

public class NumerosMultiplos5 extends Thread {

    @Override
    public void run() {
        for (int i = 5; i <= 100; i += 5) {
            System.out.println(i + " --> Multiplo 5");
        }
    }

}
