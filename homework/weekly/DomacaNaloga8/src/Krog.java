public class Krog {
    private Tocka sredisce;
    private Tocka kroznica;

    // konstruktor??? - Upam :)
    public Krog (Tocka sredisce, Tocka kroznica) {
        this.sredisce = sredisce;
        this.kroznica = kroznica;
    }

    // obsezna metoda (metoda za izracun obsega)
        public double obseg() {
        double radius = sredisce.razdalja(kroznica);
        return 2 * Math.PI * radius;
    }

    // povrsinska metoda (metoda za izracun povrsine)
    public double ploscina() {
        double radius = sredisce.razdalja(kroznica);
        return Math.PI * Math.pow(radius, 2);
    }
}
