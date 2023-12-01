import java.util.Scanner;
import java.util.Arrays;

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

    /**
     * Counts the number of even elements in a given array of integers. This method iterates through
     * the array, checking each element to determine if it is even. The count of even elements is
     * incremented each time an even number is encountered.
     *
     * <p>Note: This method does not print the count or modify the input array. It simply returns the count
     * of even numbers found in the array.
     *
     * @param nizStevil An array of integers to be examined for even numbers. The array should not be null.
     * @return          The count of even integers in the array. Returns 0 if the array contains no even numbers.
     */

    static int izpisiSteviloSodihStevil(int[] nizStevil){

        int stevecSodihStevil = 0;
        for (int i = 0; i < nizStevil.length; i++) {
            if (nizStevil[i] % 2 == 0){
                stevecSodihStevil++;
            }
        }
        return stevecSodihStevil;
    }

    /**
     * Counts the number of odd elements in a given array of integers. This method iterates through
     * the array, checking each element to determine if it is odd. The count of odd elements is
     * incremented each time an odd number is encountered.
     *
     * <p>Note: This method does not print the count or modify the input array. It simply returns the count
     * of odd numbers found in the array.
     *
     * @param nizStevil An array of integers to be examined for odd numbers. The array should not be null.
     * @return          The count of odd integers in the array. Returns 0 if the array contains no odd numbers.
     */
    static int izpisiSteviloLihihStevil(int[] nizStevil){

        int stevecLihihStevil = 0;
        for (int i = 0; i < nizStevil.length; i++) {
            if (nizStevil[i] % 2 != 0){
                stevecLihihStevil++;
            }
        }
        return stevecLihihStevil;
    }

    /**
     * Sorts a given array of integers using the bubble sort algorithm and returns the sorted array.
     * This method first creates a copy of the input array, then applies the bubble sort algorithm
     * to the copy. This ensures that the original array remains unmodified.
     *
     * <p>Note: The sorting is done in ascending order. The method does not modify the original array
     * but returns a new sorted array.
     *
     * @param nizStevil The original array of integers to be sorted. This array is not modified.
     * @return          A new array containing the elements of the original array, sorted in ascending order.
     */
    static int[] bubbleSortToNewArray(int[] nizStevil) {
        // Copy the original array to a new array
        int[] sortedNizStevil = Arrays.copyOf(nizStevil, nizStevil.length);

        // Now, sort the new array
        int n = sortedNizStevil.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sortedNizStevil[j] > sortedNizStevil[j + 1]) {
                    // Swap elements
                    int temp = sortedNizStevil[j];
                    sortedNizStevil[j] = sortedNizStevil[j + 1];
                    sortedNizStevil[j + 1] = temp;
                }
            }
        }

        return sortedNizStevil;
    }

    /**
     * Prints the percentage of occurrences of a specific number within a total count.
     * This method calculates the percentage of times a given number appears (as indicated by the counter)
     * out of a total number of instances (the total count) and prints this information formatted as a percentage.
     *
     * <p>Note: This method prints the result to the standard output using {@code System.out.printf}.
     * The percentage is formatted to two decimal places.
     *
     * @param stevilo The specific number whose occurrences are being measured.
     * @param stevec  The count of how many times {@code stevilo} occurs.
     * @param skupek  The total count of instances or elements within which {@code stevilo} could occur.
     */
    static double izpisiPojavitve(int stevilo, int stevec, int skupek) {
        double procent = 100.0 * stevec / skupek;
        System.out.printf("Število %d se ponovi v %.2f%%\n", stevilo, procent);
        return procent;
    }

    /**
     * Calculates and prints the percentage occurrence of each unique number in a given array of integers.
     * The method iterates through the sorted array, counting occurrences of each number and then using
     * the {@code izpisiPojavitve} method to print out the percentage occurrence of each unique number.
     *
     * <p>Note: This method assumes that the input array is sorted. It prints the percentage occurrence of each
     * unique number to the standard output. For the percentage calculation, it uses the length of the array as the total count.
     *
     * @param nizStevil A sorted array of integers. Each unique number's occurrence is calculated as a percentage
     *                  of the total number of elements in the array.
     */
    static void izpisiProcentualnoPojavitevStevil(int[] nizStevil){
        int trenutnoStevilo = nizStevil[0];
        int stevec = 1;

        for (int i = 1; i < nizStevil.length; i++) {
            if (nizStevil[i] == trenutnoStevilo) {
                stevec++;
            } else {
                izpisiPojavitve(trenutnoStevilo, stevec, nizStevil.length);
                trenutnoStevilo = nizStevil[i];
                stevec = 1;
            }
        }
        // Še za zadnje stevilo
        izpisiPojavitve(trenutnoStevilo, stevec, nizStevil.length);
    }

    /**
     * Finds and prints the mode(s) of a given sorted array of integers. The mode is the number(s)
     * that appear most frequently in the array. If there are multiple modes (numbers with the same
     * highest frequency), the method prints all of them.
     *
     * <p>Note: This method assumes that the input array is sorted. It prints the mode(s) and their frequency
     * to the standard output. If the array is empty, it prints a message indicating that the array is empty.
     *
     * @param sortedNizStevil A sorted array of integers. The method finds the number(s) that appear most frequently
     *                        in this array. The array should not be null.
     */

    /* Tukaj sem bil velik bumbar, in se nisem spomnil, da lahko samo iz prej potegnem ven največkrat ponavjlajoče število in reversecalculatam kolikokrat se je pojavilo, ampak vseeno pustim notri, ker sem porabil absolutno preveč časa za to špageti kodo in izgubil veliko preveč možganskih celic :( */

    static void najdiModus(int[] sortedNizStevil) {
        int stevecPonovitveNajvecjegaStevila = 0;
        int stevecTrenutnoNajvecjePonovitveStevila = 0;
        String najveckratPonovljenaStevila = "";

        for (int i = 0; i < sortedNizStevil.length; i++) {
            stevecPonovitveNajvecjegaStevila++;

            if (i == sortedNizStevil.length - 1 || sortedNizStevil[i] != sortedNizStevil[i + 1]) {
                if (stevecPonovitveNajvecjegaStevila > stevecTrenutnoNajvecjePonovitveStevila) {
                    stevecTrenutnoNajvecjePonovitveStevila = stevecPonovitveNajvecjegaStevila;
                    najveckratPonovljenaStevila = Integer.toString(sortedNizStevil[i]);
                } else if (stevecPonovitveNajvecjegaStevila == stevecTrenutnoNajvecjePonovitveStevila) {
                    if (!najveckratPonovljenaStevila.isEmpty()) {
                        najveckratPonovljenaStevila += ", ";
                    }
                    najveckratPonovljenaStevila += sortedNizStevil[i];
                }
                stevecPonovitveNajvecjegaStevila = 0;
            }
        }

        System.out.println("Stevila " + najveckratPonovljenaStevila + " se pojavijo najveckrat. Pojavijo se " + stevecTrenutnoNajvecjePonovitveStevila + " krat.");
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

        // preverimo še edge case, če je uporabik rekel, da bo vnesel 0 števil
        if (nizStevil.length == 0){
            System.out.println("Nisi se odločil vnesti vnesel nobenega stevila in si me zaklal :( - Exiting");
            System.out.println("************************************************************");
            System.exit(1);
        }

        System.out.println("************************************************************");
        System.out.println("Končal sem z vnosom števil. Hvala, da me nisi vmes zaklal :)");

        // to je moj piškotek DO NOT TOUCH!!!! NIZ ŠTEVIL JE GOOD BOY z njim lahko zdaj operiram kolokor hočem
        nizStevil = obrniNiz(nizStevil);

        // izpiše array števil
        System.out.println("************************************************************");
        System.out.println("Izpisujem array vnešenih števil");
        int[] izpisaniArray = izpisiNiz(nizStevil);

        System.out.println("************************************************************");

        int steviloUniqueStevil = izpisiSteviloUniqueStevil(nizStevil);
        System.out.println("Število različnih števil je: " + steviloUniqueStevil);

        System.out.println("************************************************************");
        int steviloSodihStevil = izpisiSteviloSodihStevil(nizStevil);
        System.out.println("Število sodih števil je: "+steviloSodihStevil);

        System.out.println("************************************************************");
        int steviloLihihStevil = izpisiSteviloLihihStevil(nizStevil);
        System.out.println("Število lihih števil je: "+steviloLihihStevil);

        System.out.println("************************************************************");
        int sortedNizStevil[] = bubbleSortToNewArray(nizStevil);
        izpisiProcentualnoPojavitevStevil(nizStevil);

        System.out.println("************************************************************");
        najdiModus(sortedNizStevil);

        System.out.println("************************************************************");

    }
}
/**
 * Kaj rabim narest tuki
 *
 * 9. funkcija, ki izpiše največje število
 * 10. funkcija, ki izpiše drugo najmanjšo vrednost števil
 * 11. funkcija, ki izpiše povprečje vseh števil
 * 12. funkcija, ki izpiše standardno deviacijo
 * 13. funkcija, ki izpiše mediano
 * 14. funkcija, ki izpiše vsoto vseh števil
 * 15. funkcija, ki izpiše koliko je palindromnih števil
 * 16. funkcija, ki izpiše največje palindromno število, ki je manjše od največjega števila v polju in hkrati palindrom (število ni nujno element polja)
 * 17. Program naj na koncu še izpiše vsa števila, ki so v polju, ločena z vejicami, v obratnem vrstnem redu kot so bila vnešena.
 */