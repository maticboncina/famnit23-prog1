public class Start {
    public static void main(String a[]){
        System.out.println("START");
        Tocka ttt = new Tocka();
        // mi lahko nekdo razlozi kaj je tocka in kako se to prevede za nazja
        // tocka je kle nova reč
        Tocka tt1 = new Tocka();

        ttt.x = 10;
        ttt.y = 20;

        System.out.println(ttt.x + " " + ttt.y);
        System.out.println(tt1.x + " " + tt1.y);
        ttt.narisi();
        tt1.narisi();

        Tocka maloVecKotNicla = new Tocka(1, 1);
        maloVecKotNicla.narisi();

        System.out.println(maloVecKotNicla.razdalja(ttt));
    }
}
