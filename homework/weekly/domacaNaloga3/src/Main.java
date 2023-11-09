import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner bralnikOcen = new Scanner(System.in);
        System.out.println("Vpisi oceno:");

        int ocena = bralnikOcen.nextInt();

        if (ocena == 1){
            System.out.println("Nezadostno");
        }

        else if (ocena == 2){
            System.out.println("Zadostno");
        }

        else if (ocena == 3){
            System.out.println("Dobro");
        }

        else if (ocena == 4){
            System.out.println("Pravdobro");
        }

        else if (ocena == 5){
            System.out.println("Odlično");
        }

        else {
            System.out.println("Nepravilna ocena");
        }

    }
}