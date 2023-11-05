import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int leto;

        Scanner sc = new Scanner(System.in);
        System.out.print("Vpisi stevilo: ");
        leto = sc.nextInt();
// = je assignment, == je primerjanje
        // primerjanje vrednosti s spremenljivko in spremenljivko z vrednostjo (pri boolean to pomaga, ker assignement ne dela v tej smeri)
        if (leto % 4 == 0){
            if (leto % 100 == 1){
                System.out.println("Leto ni prestopjo");
            }
            else{
                if (leto % 400 == 0){
                    System.out.println("Leto je prestopno");
                }
                else {
                    System.out.println("Leto ni prestopno");
                }
            }
        }
        else{
            System.out.println("leto ni prestopno");
        }
    }
}