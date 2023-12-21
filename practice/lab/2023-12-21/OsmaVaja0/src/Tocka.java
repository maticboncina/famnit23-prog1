public class Tocka {
    int x, y;
    Tocka(){

    }
    Tocka(int x, int y){
        this.x = x;
        this.y = y;
    }
    void print(){
        System.out.println(x + "-" + y);
    }

    double razdalja(Tocka druga){
        return Math.sqrt(((x - druga.x)*(x - druga.x)) + ((y - druga.y)*(y - druga.y)));
    }
}
