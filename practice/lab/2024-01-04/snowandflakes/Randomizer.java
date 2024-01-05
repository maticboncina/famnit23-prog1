import java.util.Random;

public class Randomizer {
    public static void main(String[] args) {
        Random rr = new Random();
        int n = rr.nextInt(11) + 10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(rr.nextInt(9)+1);
            }
        }
        int maxStPotez = rr.nextInt(20) + 50;
        int maxVsota = rr.nextInt(100) + (n*100);

    }
}
