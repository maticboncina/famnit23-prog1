import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner bralnik = new Scanner(System.in);
        System.out.println("Vpisi nekaj besed:");
        String line = bralnik.nextLine();
        String besede[] = line.split(" ");
        int stevila[] = new int[besede.length];
        for (int i = 0; i < besede.length; i++) {
            stevila[i] = Integer.parseInt(besede[i]);
        }

        int liha = 0;
        int soda = 1;

        for (int i = 0; i < besede.length; i++) {

            if (stevila[i] % 2 == 1){
                liha += stevila[i] * stevila[i];
            }
            else {
                soda *= stevila[i];
            }
        }
        System.out.println(liha - soda);
    }
}