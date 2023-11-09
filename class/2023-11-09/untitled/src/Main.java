import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner bralnik = new Scanner(System.in);
        System.out.println("Vnesi dolzino stranice a: ");
        int a = bralnik.nextInt();

        System.out.println("Vnesi dolzino stranice b: ");
        int b = bralnik.nextInt();

        for (int i = a; i >= a; a++){
            for (int j = b; j >= b; b++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}