package carroautonomo;
import carroeletricoautonomo.Tesla;
public class CriarCarro {

    public static void main(String[] args) {
        var tesla = new Tesla(25,"Campo limpo", "Berrini", true);
        tesla.definirRota("Berrini", "Campo limpo");
        tesla.carregar();
        tesla.desligarModoAutonomo();
        tesla.ligarModoAutonomo();
        tesla.monitorarBateria();
        System.out.println("\n" + tesla);
    }
}
