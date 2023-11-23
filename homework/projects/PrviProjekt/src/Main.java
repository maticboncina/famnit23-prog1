import java.util.Scanner;

public class Main {

    /**
     * Metoda numberChecker:
     * Preveri ali je ropotija, ki jo end user vnesel res ""cela"" številka
     * Kličemo ob:
     * - Vnosu števila koliko elementov gre v array
     * - Pred vnosom elementov v array
     */

    static int numberChecker(String input) {
        // Zapazimo, da vnešeno ni null niti empty
        if (input == null || input.equals("")) {
            System.out.println("Vnešen podatek je null ali pa je prazen. Exiting.");
            System.exit(1);
        }

        // Prevereimo, če je številka, sploh številka
        if (!input.matches("-?[0-9]+")) {
            System.out.println("Vnešen podatek ni številka. Exiting.");
            System.exit(1);
        }

        // Preverimo, če je številka prevelika za int tip
        try {
            return Integer.parseInt(input);
        } catch (Exception e) {
            System.out.println("Prevelika stevilka. Exiting.");
            System.exit(1);
        }

        int stevilka = Integer.parseInt(input);
        return stevilka;
    }

    public static void main(String[] args) {
        Scanner bralnik = new Scanner(System.in);
        /* */


        System.out.println("Vnesi koliko številk boš vnesel za preverjanje:");

        String input = bralnik.nextLine();
        System.out.println(numberChecker(input));

    }
}


/**
 * Kaj rabim narest tuki
 * 1. Definiraj bralnik za koliko stevil
 * 1.1 Naredi edge case, če mona notri vrže karkoli kar ni število
 * 2. Naredi funkcijo, ki naredi array toliko velik, kot je bilo vpisano število
 * 2.1 Naredi for loop ki bo bral kaj uporabnik vnesel in ga poknil v array vsakič + 1 mesto naprej do konca
 * 3. funkcija, ki izpiše število elementov v tem arrayu
 * 4. funckija, ki izpiše število različnih števil
 * 5. funkcija, ki izpiše število sodih števil
 * 6. funkcija, ki izpiše število lihih števil
 * 7. funkcija, ki izpiše frekvenco pojavitev vsakega števila (v procentih)
 * 8. funkcija, ki izpiše število, ki se največkrat ponovi
 * 9. funkcija, ki izpiše največje število
 * 10. funkcija, ki izpiše drugo najmanjšo vrednost števil
 * 11. funkcija, ki izpiše povprečje vseh števil
 * 12. funkcija, ki izpiše standardno deviacijo
 * 13. funkcija, ki izpiše mediano
 * 14. funkcija, ki izpiše vsoto vseh števil
 * 15. funkcija, ki izpiše koliko je palindromnih števil
 * 16. funkcija, ki izpiše največje palindromno število, ki je manjše od največjega števila v polju in hkrati palindrom (število ni nujno element polja)
 * 17. Program naj na koncu še izpiše vsa števila, ki so v polju, ločena z vejicami, v obratnem vrstnem redu kot so bila vnešena.
 * <p>
 * Good to do:
 * Funkcijo, ki se sprehaja skozi array?
 * Funckije naj kličejo ena druga...
 * Kakšen funkcije za basic job, kot je sesštevek vseh števil v arrayu etc...
 * <p>
 * Good to do:
 * Funkcijo, ki se sprehaja skozi array?
 * Funckije naj kličejo ena druga...
 * Kakšen funkcije za basic job, kot je sesštevek vseh števil v arrayu etc...
 * <p>
 * Good to do:
 * Funkcijo, ki se sprehaja skozi array?
 * Funckije naj kličejo ena druga...
 * Kakšen funkcije za basic job, kot je sesštevek vseh števil v arrayu etc...
 * <p>
 * Good to do:
 * Funkcijo, ki se sprehaja skozi array?
 * Funckije naj kličejo ena druga...
 * Kakšen funkcije za basic job, kot je sesštevek vseh števil v arrayu etc...
 * <p>
 * Good to do:
 * Funkcijo, ki se sprehaja skozi array?
 * Funckije naj kličejo ena druga...
 * Kakšen funkcije za basic job, kot je sesštevek vseh števil v arrayu etc...
 * <p>
 * Good to do:
 * Funkcijo, ki se sprehaja skozi array?
 * Funckije naj kličejo ena druga...
 * Kakšen funkcije za basic job, kot je sesštevek vseh števil v arrayu etc...
 */

/**
 * Good to do:
 * Funkcijo, ki se sprehaja skozi array?
 * Funckije naj kličejo ena druga...
 * Kakšen funkcije za basic job, kot je sesštevek vseh števil v arrayu etc...
 */