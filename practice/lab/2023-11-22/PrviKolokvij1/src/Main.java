import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner bralnik = new Scanner(System.in);

        int prvo = bralnik.nextInt();
        int drugo = bralnik.nextInt();

        System.out.println(prvo * drugo);
    }
}