/**
 * Abstraktni razred SahovskaFigura predstavlja trdanjavo.
 * Določa lastnosti in zahteva implementacijo metode za premikanje.
 */

public abstract class SahovskaFigura {
    String barva;
    boolean jezik;
    int steviloPotez;
    Pozicija pozicija;

    public SahovskaFigura(String barva, boolean jezik, int steviloPotez, Pozicija pozicija) {
        this.barva = barva;
        this.jezik = jezik;
        this.steviloPotez = steviloPotez;
        this.pozicija = pozicija;
    }

    public abstract void premakni(int x, int y);
}