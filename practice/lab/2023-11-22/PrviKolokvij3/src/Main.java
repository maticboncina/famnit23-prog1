import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner bralnik = new Scanner(System.in);

        System.out.println("Vpisi stevila");

        String vrstica = bralnik.nextLine();
        String besede[] = vrstica.split(" ");
        int stevila[] = new int[besede.length];

        for (int i = 0; i < besede.length; i++) {
            stevila[i] = Integer.parseInt(besede[i]);
        }

        // naj izpise soda števila
        for (int i = 0; i < stevila.length; i++) {
            if (stevila[i] % 2 == 0) {
                System.out.println(stevila[i]);
            }
        }

        // naj izpiše koloko negativnih
        int stevec = 0;
        for (int i = 0; i < stevila.length; i++) {
            if (stevila[i] < 0){
                stevec++;
            }
        }
        System.out.println(stevec);

        // program naj izpise koliko je negativnih
        int produkt = 1;
        for (int i = 1; i < stevila.length; i++) {
            if (i % 2 == 1){
                produkt *= stevila[i];
            }
        }
        System.out.println(produkt);
    }
}