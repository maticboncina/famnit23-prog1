public class Start {
    public static void main(String[] args) {
        Tocka prva = new Tocka();
        prva.x = 17;
        prva.y = 23;
        System.out.println(prva.x + " " + prva.y);
        prva.print();

        Tocka skorajNicla = new Tocka (0,1);
        skorajNicla.print();

        System.out.println(prva.razdalja(skorajNicla));
        System.out.println(skorajNicla.razdalja(prva));
        System.out.println(skorajNicla.razdalja(skorajNicla));

        prva.x = 100;
        System.out.println(prva.razdalja(skorajNicla));
        System.out.println(skorajNicla.razdalja(prva));
        System.out.println(skorajNicla.razdalja(skorajNicla));

        Tocka tocke[] = new Tocka[10000];
        for (int i = 0; i < 10000; i++) {
            tocke[i] = new Tocka(i, i+1);
        }
        for (int i = 1; i < 10000; i++) {
            System.out.println(tocke[i].razdalja(tocke[i - 1]));
        }
    }
}
