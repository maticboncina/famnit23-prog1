import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vnesi število, za katerega hočeš preveriti ali je popolno:");
        Scanner bralnik = new Scanner(System.in);

        int stevilo = bralnik.nextInt();
        int sestevekDeliteljev = 3;

        for (int i = 3; i < stevilo - 1; i++) {
            if (stevilo % i == 0){
                sestevekDeliteljev = sestevekDeliteljev + i;
            }
        }

        if (stevilo == sestevekDeliteljev){
            System.out.println("Število "+stevilo+" je popolno število.");
        }
        else {
            System.out.println("Število "+stevilo+" ni popolno stevilo.");
        }
    }
}