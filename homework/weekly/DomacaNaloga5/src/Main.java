import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vpišite število n;");

        Scanner bralnik = new Scanner(System.in);

        int stevilo = bralnik.nextInt();
        int sestevek = 0;

        for (int i = 0; i < stevilo + 1; i++) {

            if (i % 2 == 0){
                sestevek = sestevek + i;
            }

        }

        System.out.println("Vsota sodih števil med 0 in "+stevilo+" je: "+sestevek);
    }
}