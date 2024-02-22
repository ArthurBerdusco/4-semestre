package principal;

public class Principal {

    public static void main(String[] args) {
        var impar = new NumerosImpares();
        var par = new NumerosPares();
        var multCinco = new NumerosMultiplos5();
        
        
        impar.start();
        par.start();
        multCinco.start();

    }
}
