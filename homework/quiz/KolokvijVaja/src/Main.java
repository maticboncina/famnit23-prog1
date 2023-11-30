// preberi dva niza in ju izpisi v isti vrstici ločena z znakom “-“
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner bralnik = new Scanner(System.in);

        System.out.println("Vpiši prvi niz:");
        String prviNiz = bralnik.nextLine();

        System.out.printf("Vpiši drugi niz:");
        String drugiNiz = bralnik.nextLine();

        System.out.println(prviNiz+"-"+drugiNiz);

    }
}