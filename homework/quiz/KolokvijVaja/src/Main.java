// preberi dva niza in ju izpisi v isti vrstici ločena z znakom “-“
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner bralnik = new Scanner(System.in);

        System.out.println("Vpiši prvi niz:");
        int prviNiz = bralnik.nextInt();

        System.out.printf("Vpiši drugi niz:");
        int drugiNiz = bralnik.nextInt();

        if (prviNiz % 5 == 0){
            System.out.println(prviNiz+" je deljiv s 5");
        }
        if (drugiNiz % 5 == 0){
            System.out.println(drugiNiz+" je deljiv s 5");
        }

    }
}