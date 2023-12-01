import java.util.Scanner;

public class Main {

    /**
     * The {@code numberChecker} method validates a given string to ensure it represents
     * a valid integer. This method checks if the input is not null or empty, if the input
     * is a numeric string (including negative numbers), and if the numeric value can fit
     * within the bounds of an integer type in Java. If any of these checks fail, the
     * program outputs an appropriate error message and terminates.
     *
     * Note: This method uses {@code System.exit(1)} to terminate the program if the input
     * is null, empty, not a numeric string, or represents a number too large for an integer.
     *
     * @param input A {@code String} representing the input that needs to be validated
     *              as a numeric string that can be converted to an integer.
     * @return      An {@code int} value corresponding to the integer representation of the input string.
     *              This value is only returned if the input passes all validation checks.
     */

    static int numberChecker(String input) {
        // Zapazimo, da vnešeno ni null niti empty
        if (input == null || input.equals("")) {
            System.out.println("Vnešen podatek je null ali pa je prazen. Exiting.");
            System.exit(1);
        }

        // Prevereimo, če je številka, sploh številka
        if (!input.matches("-?[0-9]+")) {
            System.out.println("Vnešen podatek ni številka. Zaklal si me :( - Exiting.");
            System.exit(1);
        }

        // Preverimo, če je številka prevelika za int tip
        try {
            return Integer.parseInt(input);
        } catch (Exception e) {
            System.out.println("Prevelika stevilka. Exiting.");
            System.exit(1);
        }

        int stevilka = parseratorIntegerjev(input);
        return stevilka;
    }

    /**
     * Converts a given string into an integer. This method uses the {@code Integer.parseInt}
     * method to perform the conversion. It assumes that the input string is a valid
     * representation of an integer.
     *
     * Note: This method does not include input validation. It expects that the input string
     * has already been validated as a numeric string that can be converted to an integer.
     * A {@code NumberFormatException} will be thrown if the string is not a valid integer.
     * @param input A string representing the number to be converted into an integer.
     *              The string should be a valid integer representation.
     * @return      An integer value corresponding to the integer representation of the input string.
     * @throws      NumberFormatException If the input string is not a valid integer.
     */

    static int parseratorIntegerjev(String input){
        int stevilka = Integer.parseInt(input);
        return stevilka;
    }

    /**
     * Reverses the elements of a given array. This method swaps the elements of the array
     * such that the first element becomes the last, the second element becomes the second to last, and so on.
     * The swapping continues until it reaches the middle of the array.
     *
     * Note: This method modifies the original array in place and also returns the modified array.
     *
     * {}@param niz An array of integers that is to be reversed. The array should not be null.
     *            If the array is empty or contains only one element, it will be returned as is.
     * @return    The same array passed as input, but with its elements reversed.
     */

    static int[] obrniNiz(int[] niz) {
        int zacetek = 0;
        int konec = niz.length - 1;

        while(zacetek < konec) {
            int temp = niz[zacetek];
            niz[zacetek] = niz[konec];
            niz[konec] = temp;

            zacetek++;
            konec--;
        }
        return niz;
    }

    /**
     * Prints the elements of a given array of integers to the standard output (console),
     * with each element separated by a space. After printing all elements, it moves to a new line.
     *
     * <p>Note: This method does not modify the input array. It only prints the elements to the console.
     *
     * @param nizStevil An array of integers to be printed. The array should not be null.
     *                  If the array is empty, it will result in only a new line being printed.
     * @return          The same array passed as input, unmodified.
     */
    static int[] izpisiNiz(int[] nizStevil){
        for (int i = 0; i < nizStevil.length; i++) {
            System.out.print(nizStevil[i] + " ");
        }
        System.out.println(); // To move to the next line after printing
        return nizStevil;
    }

    /**
     * Calculates and prints the number of unique elements in a given array of integers.
     * This method assumes that the array is sorted and counts the number of distinct elements.
     * It then prints this count to the standard output (console).
     *
     * <p>Note: If the array contains only one element, the method acknowledges this by printing a specific message.
     * The method assumes the array is sorted; hence, it only compares each element with its predecessor to check for uniqueness.
     *
     * @param nizStevil An array of integers, presumed to be sorted. The method counts the number of unique elements in this array.
     * @return          The count of unique elements in the array. If the array has only one element, the method returns 1.
     */
    static int izpisiSteviloUniqueStevil(int[] nizStevil){
        int stevecRazlicnihStevil = 1;
        // če je samo en element bo ta itak edinstven
        if (nizStevil.length == 1) {
            System.out.println("V array si vnesel samo eno število. Obstaja samo eno (1) edinstevno število.");
        }
        else {
            for (int i = 1; i < nizStevil.length; i++) {
                if (nizStevil[i] != nizStevil[i - 1]) {
                    stevecRazlicnihStevil++;
                }
            }
        }
        return stevecRazlicnihStevil;
    }

    public static void main(String[] args) {
        Scanner bralnik = new Scanner(System.in);
        System.out.println("Vnesi koliko številk boš vnesel za preverjanje:");

        // Dobimo podatek koliko števil bo uporabnik vnesel in preverimo, če je dejansko vnesel število
        String nepreverjenoSteviloStevil = bralnik.nextLine();
        int preverjenoSteviloStevil = numberChecker(nepreverjenoSteviloStevil);

        // zdaj imam preverjeno stevilo v preverjenoSteviloStevil
        // Vprašamo uporabnika za array števil, in tudi preverimo če so števila
        System.out.println("************************************************************");

        // nanizamo števila v array
        int[] nizStevil = new int[preverjenoSteviloStevil];

        for (int i = preverjenoSteviloStevil - 1; i >= 0; i--) {
            System.out.println("Vnesi še " + (i + 1) + " števil.");
            int steviloZaVArray = numberChecker(bralnik.nextLine());
            nizStevil[i] = steviloZaVArray;
        }

        System.out.println("************************************************************");
        System.out.println("Končal sem z vnosom števil. Hvala, da me nisi vmes zaklal :)");

        // to je moj piškotek DO NOT TOUCH!!!! NIZ ŠTEVIL JE GOOD BOY z njim lahko zdaj operiram kolokor hočem
        nizStevil = obrniNiz(nizStevil);

        // izpiše array števil
        System.out.println("************************************************************");
        System.out.println("Izpisujem array vnešenih števil");
        System.out.println();
        int[] izpisaniArray = izpisiNiz(nizStevil);

        System.out.println("************************************************************");
        System.out.println("Izpisujem število različnih števil v podanem arrayu");

        int steviloUniqueStevil = izpisiSteviloUniqueStevil(nizStevil);
        System.out.println("Število različnih števil je: " + steviloUniqueStevil);



    }
}


/**
 * Kaj rabim narest tuki
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