/*  preveri dve stevili in izpise razliko kvadratov*/
import java.util.Scanner;

public class CetrtaNaloga {
    public static void main(String[] args) {
        Scanner bralnik = new Scanner(System.in);

        System.out.println("Vnesi prvo stevilo:");
        int prvoStevilo = bralnik.nextInt();

        System.out.println("Vnesi drugo stevilo");
        int drugoStevilo = bralnik.nextInt();

        int kvadratPrvegaStevila = prvoStevilo * prvoStevilo;
        int kvadratDrugegaStevila = drugoStevilo * drugoStevilo;

        int razlikaKvadratov = kvadratPrvegaStevila - kvadratDrugegaStevila;
        System.out.println("Razlika kvadratov je: "+razlikaKvadratov);
    }
}
