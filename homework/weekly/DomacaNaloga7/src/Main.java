import java.util.Scanner;

public class Main {
    static int koeficient(int n, int k) {
        return koeficient(n - 1, k - 1) + koeficient(n - 1, k);
    }

    public static void main(String[] args) {

        Scanner bralnik = new Scanner(System.in);
        System.out.println("Vpisi stevilo n:");
        int n = bralnik.nextInt();

        System.out.println("Vpisi stevilo k:");
        int k = bralnik.nextInt();

        if (!(n >= k && k >= 0)){
            System.out.println("Nisi upošteval pogoja 'n >= k && k >= 0'. Exiting.");
            System.exit(1);
        }

        System.out.println("Rezultat je: "+ koeficient(n, k));
    }
}