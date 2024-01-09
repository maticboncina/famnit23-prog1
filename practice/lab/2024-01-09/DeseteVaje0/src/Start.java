public class Start {

    public static void main(String[] args) {
        Pravokotnik prvi = new Pravokotnik("rdeca",
                new GeometrijskaOblika.Tocka(0,5),
                new GeometrijskaOblika.Tocka(5,10));

        System.out.println(prvi.obseg());
        System.out.println(prvi.ploscina());

        Pravokotnik drugi = new Pravokotnik("rumen",
                new GeometrijskaOblika.Tocka(6,10),
                new GeometrijskaOblika.Tocka(8,14));

        Pravokotnik tri = new Pravokotnik("zelen",
                new GeometrijskaOblika.Tocka(0,3),
                new GeometrijskaOblika.Tocka(4,8));

        System.out.println(prvi.sePrekrivata(drugi));

        System.out.println(prvi.sePrekrivata(tri));


        Kvadrat k = new Kvadrat("modri",
                new GeometrijskaOblika.Tocka(0,5),
                new GeometrijskaOblika.Tocka(5,10));

        System.out.println(k.ploscina());
        System.out.println(k.sePrekrivata(prvi));


        Kvader k1 = new Kvader("beli",
                new GeometrijskaOblika.Tocka(0,5),
                new GeometrijskaOblika.Tocka(5,10),
                3);

        System.out.println(k1.volumen());
        System.out.println(k1.povrsina());
        System.out.println(k1.ploscina());

    }
}
