import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner bralnik = new Scanner(System.in);
        System.out.println("Vpisi stevilo: ");
        int prvo = bralnik.nextInt();

        int vsota = 0;
        for (int i = 0; i <= prvo; i++) {
            if (i % 5 == 0){
                vsota += i;
            }
        }

        System.out.println(vsota);
    }
}
