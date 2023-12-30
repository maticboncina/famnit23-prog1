public class Tocka {
    private int x;
    private int y;

    // konstruktor??? - Upam :)
    public Tocka(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // getterja
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // metoda za razdaljo od sredisca do tocke
    public double razdalja(Tocka other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }
}
