// preberi besedilo in izpisi koliko besed je manjših od 5 znakov

import java.util.Scanner;

public class DrugaNaloga {
    public static void main(String[] args){
        Scanner bralnik = new Scanner(System.in);

        System.out.println("Vpiši besedilo, v katerem želiš preveriti koliko besed je manjših od 5 znakov:");
        String besedilo = bralnik.nextLine();

        String besede[] = besedilo.split(" ");
        int steviloBesed = besede.length;
        int stevecBesedManjsihOdPetZnakov = 0;

        for (int i = 0; i < besede.length; i++) {
            if (besede[i].length() < 5){
                stevecBesedManjsihOdPetZnakov = stevecBesedManjsihOdPetZnakov + 1;
            }
        }
        System.out.println("V tvojem stringi je "+stevecBesedManjsihOdPetZnakov+" besed, ki so manjsa od 5 znakov.");
    }
}
