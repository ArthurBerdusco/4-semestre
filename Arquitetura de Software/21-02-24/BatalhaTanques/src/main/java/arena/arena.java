package arena;

import roboTanque.CoresRGB;
import roboTanque.TanqueRobo;

public class arena {

    public static void main(String[] args) {
        TanqueRobo tanque = new TanqueRobo(0, 0, "Crazy", CoresRGB.BLUE, CoresRGB.RED);

        try {
            tanque.atirar(7);
        } catch (IllegalArgumentException erro) {
            System.out.println("Digite um valor entre 1 e 5");
        }

        tanque.movLeste();
        tanque.movLeste();
        System.out.println(tanque.retirarPosX());

    }
}
