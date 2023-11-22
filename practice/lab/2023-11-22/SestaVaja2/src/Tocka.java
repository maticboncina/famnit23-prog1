public class Tocka {
    int x;
    int y;

    Tocka(int xx, int yy){
        x = xx;
        y = yy;
    }

    Tocka(){

    }

    double razdalja(Tocka tocka){
        double rez = Math.sqrt((x - tocka.x) * (x - tocka.x) + (y - tocka.y) * (y - tocka.y));
        return rez;
    }

    void narisi(){
        System.out.println("Jaz sem: " + x + " " + y);
    }
}
