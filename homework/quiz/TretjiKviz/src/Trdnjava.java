/**
 * Razred Trdnjava predstavlja trdnjavo, šahovsko figuro, ki se premika po ravnih linijah gor/dol in levo/desno.
 * Razširja razred SahovskaFigura in implementira metodo za premikanje.
 */

public class Trdnjava extends SahovskaFigura {

    public Trdnjava(String barva, boolean jezik, Pozicija pozicija) {
        super(barva, jezik, 0, pozicija);
    }
    @Override
    public void premakni(int x, int y) {
        if (this.pozicija.x == x || this.pozicija.y == y) {
            this.pozicija.x = x;
            this.pozicija.y = y;
            this.steviloPotez++;
        } else {
            System.out.println("Neveljavna trdnjavina poteza");
        }
    }
}
