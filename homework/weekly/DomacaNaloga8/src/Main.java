public class Main {
    public static void main(String[] args) {
        Tocka sredisce = new Tocka(0, 0);
        Tocka kroznica = new Tocka(3, 4);
        Krog krog = new Krog(sredisce, kroznica);

        System.out.println("Obseg kroga: " + krog.obseg());
        System.out.println("Ploščina kroga: " + krog.ploscina());
    }
}