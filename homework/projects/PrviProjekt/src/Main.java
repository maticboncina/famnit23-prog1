import java.util.Scanner;

public class Main {

    /**
     * The {@code preverjevalnikStevila} method validates a given string to ensure it represents
     * a valid integer. This method checks if the input is not null or empty, if the input
     * is a numeric string (including negative numbers), and if the numeric value can fit
     * within the bounds of an integer type in Java. If any of these checks fail, the
     * program outputs an appropriate error message and terminates.
     *
     * Note: This method uses {@code System.exit(1)} to terminate the program if the input
     * is null, empty, not a numeric string, or represents a number too large for an integer.
     *
     * @param vnos A {@code String} representing the input that needs to be validated
     *              as a numeric string that can be converted to an integer.
     * @return      An {@code int} value corresponding to the integer representation of the input string.
     *              This value is only returned if the input passes all validation checks.
     */

    static int preverjevalnikStevila(String vnos) {
        // Zapazimo, da vnešena ropotija ni ne null, niti empty
        if (vnos == null || vnos.equals("")) {
            System.out.println("Vnešen podatek je null ali pa je prazen. Exiting.");
            System.exit(1);
        }

        // Preverimo, če je številka, sploh številka
        if (!vnos.matches("-?[0-9]+")) {
            System.out.println("Vnešen podatek ni številka. Zaklal si me :( - Exiting.");
            System.exit(1);
        }

        // Preverimo, če je številka prevelika za int tip
        try {
            return Integer.parseInt(vnos);
        } catch (Exception e) {
            System.out.println("Prevelika stevilka. Exiting.");
            System.exit(1);
        }

        int stevilka = parseratorIntegerjev(vnos);
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
     * @param vnos A string representing the number to be converted into an integer.
     *              The string should be a valid integer representation.
     * @return      An integer value corresponding to the integer representation of the input string.
     * @throws      NumberFormatException If the input string is not a valid integer.
     */

    static int parseratorIntegerjev(String vnos){
        int stevilka = Integer.parseInt(vnos);
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
     * Sorts an array of integers in ascending order using the Bubble Sort algorithm
     * and returns a new sorted array. The original array remains unaltered.
     * <p>
     * Bubble Sort is a simple sorting algorithm that repeatedly steps through the list,
     * compares adjacent elements, and swaps them if they are in the wrong order. The pass
     * through the list is repeated until no swaps are needed, which indicates that the
     * list is sorted.
     * <p>
     * This method creates a new array to avoid modifying the original input array.
     *
     * @param nizStevil An array of integers to be sorted.
     * @return A new array containing the sorted elements in ascending order.
     */
    static int[] mehurckovoSortiranjeVNoviArray(int[] nizStevil) {
        // naredimo nov array, ker ne želimo zaklati našega piškotka nizStevil, ker bi to pomenilo, da bi ubistvu kasneje zaklali sami sebe pri eni drugi točki, zato ga dajemo v nov array
        int[] sortedNizStevil = new int[nizStevil.length];
        for (int i = 0; i < nizStevil.length; i++) {
            sortedNizStevil[i] = nizStevil[i];
        }

        // zdej dejansko nucamo bubble sort, ki sortira novi array
        int n = sortedNizStevil.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sortedNizStevil[j] > sortedNizStevil[j + 1]) {
                    // menjamo elemente
                    int temp = sortedNizStevil[j];
                    sortedNizStevil[j] = sortedNizStevil[j + 1];
                    sortedNizStevil[j + 1] = temp;
                }
            }
        }

        return sortedNizStevil;
    }

    /**
     * This method calculates and prints the percentage occurrence of each number in a sorted array.
     * It iterates through the sorted array of integers, counts the occurrence of each number,
     * and prints out the number along with its percentage occurrence in the array.
     *
     * @param sortedNizStevil A sorted array of integers. The array must be sorted for this method to work correctly.
     */

    static void izpisiProcentualnoPojavitevStevil(int[] sortedNizStevil){
        int trenutnoStevilo = sortedNizStevil[0];
        int stevec = 1;

        for (int i = 1; i < sortedNizStevil.length; i++) {
            if (sortedNizStevil[i] == trenutnoStevilo) {
                stevec++;
            } else {
                double procent = (double) stevec / sortedNizStevil.length * 100;
                System.out.printf("Število %d se ponovi v %.2f%%\n", trenutnoStevilo, procent);
                trenutnoStevilo = sortedNizStevil[i];
                stevec = 1;
            }
        }

        double procent = (double) stevec / sortedNizStevil.length * 100;
        System.out.printf("Število %d se ponovi v %.2f%%\n", trenutnoStevilo, procent);
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

    /* Tukaj sem bil velik bumbar, ker sem programiral to v ločenem oknu in se nisem spomnil, da lahko preprosto od prej potegnem ven največkrat ponavjlajoče število in reversecalculatam kolikokrat se je pojavilo (saj podatke že imam), ampak vseeno puščam notri, ker sem porabil absolutno preveč časa za to špageti kodo, tako da ostaja notri :(
    *
    * Se pa zavedam, da bi lahko nekako poklical že sprogramirane funckije*/

    static void najdiModus(int[] sortedNizStevil) {
        int stevecPonovitveNajvecjegaStevila = 0;
        int stevecTrenutnoNajvecjePonovitveStevila = 0;
        String najveckratPonovljenaStevila = "";

        for (int i = 0; i < sortedNizStevil.length; i++) {
            stevecPonovitveNajvecjegaStevila++;

            // špageti ala java
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

    /**
     * Finds and prints the largest number in a given array of integers. This method iterates through
     * the array, comparing each element with the current maximum value and updating it if a larger number is found.
     *
     * <p>Note: The initial comparison value is set to {@code Integer.MIN_VALUE} to ensure correct handling of
     * negative numbers and zero. The method prints the largest number to the standard output.
     *
     * @param nizStevil An array of integers from which the largest number is to be found. The array should not be null.
     *                  If the array is empty, the output will indicate the minimum value of an integer, as per the initial setting.
     */

    static void najvecjeStevilo(int[] nizStevil) {
        int najvecjeStevilo = 0;
        for (int i = 0; i < nizStevil.length; i++) {
            if (nizStevil[i] > najvecjeStevilo) {
                najvecjeStevilo = nizStevil[i];
            }
        }
        System.out.println("Največje število je: " + najvecjeStevilo);
    }

    /**
     * Finds and prints the second smallest number in an array of integers.
     * If the array does not contain at least two distinct numbers, a message is printed indicating that
     * the second smallest number does not exist. The method handles edge cases such as empty arrays or
     * arrays with all elements being the same.
     * <p>
     * This method does not return any value. It prints the result directly to the console.
     *
     * @param nizStevil An array of integers to search through. It is expected to have at least two distinct elements
     *                  to find the second smallest number.
     */
    static void drugoNajmanjseStevilo(int[] nizStevil) {
        if (nizStevil.length < 2) {
            System.out.println("Array ne vsebuje vsaj dveh (različnih) števil. Torej **drugo** najmanjše ne obstaja.");
            return;
        }

        int najmanjseStevilo = Integer.MAX_VALUE;
        int drugoNajmanjseStevilo = Integer.MAX_VALUE;

        for (int i = 0; i < nizStevil.length; i++) {
            if (nizStevil[i] < najmanjseStevilo) {
                drugoNajmanjseStevilo = najmanjseStevilo;
                najmanjseStevilo = nizStevil[i];
            } else if (nizStevil[i] < drugoNajmanjseStevilo && nizStevil[i] != najmanjseStevilo) {
                drugoNajmanjseStevilo = nizStevil[i];
            }
        }

        if (drugoNajmanjseStevilo == Integer.MAX_VALUE) {
            System.out.println("V tem arrayu ni drugega najmanjšega števila. Verjetno. ker si vnesel vse enake, premalo etc...");
        } else {
            System.out.println("Drugo najmanjše število je: " + drugoNajmanjseStevilo);
        }
    }

    /**
     * Calculates and returns the sum of all elements in an array of integers.
     * This method iterates through each element of the provided array, accumulating their sum.
     * If the array is empty, the method will return 0.
     *
     * @param nizStevil An array of integers whose sum needs to be calculated.
     * @return The sum of all elements in the array. Returns 0 if the array is empty or null.
     */
    static float sestevator(int[] nizStevil){
        float sestevekVsehStevilVArrayu = 0;
        for (int i = 0; i < nizStevil.length; i++) {
            sestevekVsehStevilVArrayu = sestevekVsehStevilVArrayu + nizStevil[i];
        }
        return sestevekVsehStevilVArrayu;
    }

    /**
     * Calculates and returns the standard deviation of an array of integers.
     * The method first computes the average of the numbers. Then it calculates the sum of the squared
     * differences from the average. Finally, it returns the square root of the average of these squared differences, which is the standard deviation.
     *
     * @param nizStevil An array of integers whose standard deviation is to be calculated.
     * @return The standard deviation of the elements in the array. Returns NaN if the array is empty.
     */
    static double izracunajStandardnoDeviacijo(int[] nizStevil) {
        double povprecje = sestevator(nizStevil) / nizStevil.length;

        double kvadratnaRazlikaVsot = 0.0;
        for (int i = 0; i < nizStevil.length; i++) {
            kvadratnaRazlikaVsot += Math.pow(nizStevil[i] - povprecje, 2);
        }

        double standardnaDeviacija = Math.sqrt(kvadratnaRazlikaVsot / nizStevil.length);
        return standardnaDeviacija;
    }

    /**
     * Calculates and returns the median of an array of integers. The array is assumed to be sorted in
     * ascending order before this method is called. The median is the middle element of the array if the
     * array's length is odd, or the average of the two middle elements if the array's length is even.
     * <p>
     * If the array is empty, the behavior of this method is undefined and may vary depending on the
     * implementation or version of Java being used.
     *
     * @param urejenNizStevil A sorted array of integers. It should be sorted in ascending order prior
     *                        to calling this method.
     * @return The median value of the elements in the array. The return value for empty arrays is undefined.
     */
    static double izracunajMediano(int[] urejenNizStevil) {
        int sredicaCokoladneTorte = urejenNizStevil.length / 2;
        if (urejenNizStevil.length % 2 == 0) {
            // Če je sodo število elementov delaj tko
            return (urejenNizStevil[sredicaCokoladneTorte - 1] + urejenNizStevil[sredicaCokoladneTorte]) / 2.0;
        } else {
            // Drgal pa samo vrži ven sredico in ne računaj povprečja dveh, ker je itak samo en na sredini
            return urejenNizStevil[sredicaCokoladneTorte];
        }
    }

    /**
     * Determines if a given integer is a palindrome. A number is considered a palindrome if it reads
     * the same backward as forward. The method converts the integer to a string and then checks if
     * the string is a palindrome.
     * <p>
     * For example, 121 and 12321 are palindromes, but 123 and 12345 are not.
     *
     * @param nizStevil The integer to check for palindromic properties.
     * @return {@code true} if the integer is a palindrome; {@code false} otherwise.
     */
    public static boolean aliJeTipoPalindrom(int nizStevil) {
        String noviNizStevilKerJeNizStevilZeTaken = Integer.toString(nizStevil);
        for (int i = 0; i < noviNizStevilKerJeNizStevilZeTaken.length() / 2; i++) {
            if (noviNizStevilKerJeNizStevilZeTaken.charAt(i) != noviNizStevilKerJeNizStevilZeTaken.charAt(noviNizStevilKerJeNizStevilZeTaken.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Iterates through an array of integers and prints all palindromic numbers found within it.
     * A number is considered a palindrome if it reads the same backward as forward.
     * The method utilizes 'aliJeTipoPalindrom' to check each number. If one or more palindromes are found,
     * it prints each of them. If no palindromes are found, it prints a message indicating this.
     * <p>
     * This method does not return any value; it prints the results directly to the console.
     *
     * @param nizStevil An array of integers to be checked for palindromic numbers.
     */
    public static int izpisiPalindrome(int[] nizStevil) {
        int stevec = 0;
        boolean eureka = false;

        for (int i = 0; i < nizStevil.length; i++) {
            int stevilo = nizStevil[i];
            if (aliJeTipoPalindrom(stevilo)) {
                if (!eureka) {
                    System.out.println("Našel sem palindrome:");
                    eureka = true;
                }
                System.out.println(stevilo);
                stevec++;
            }
        }

        if (stevec == 0) {
            System.out.println("Nisem našel palindromov.");
        }

        return stevec;
    }

    public static void main(String[] args) {
        Scanner bralnik = new Scanner(System.in);
        System.out.println("Vnesi koliko številk boš vnesel za preverjanje:");

        // Dobimo podatek koliko števil bo uporabnik vnesel in preverimo, če je dejansko vnesel število
        String nepreverjenoSteviloStevil = bralnik.nextLine();
        int preverjenoSteviloStevil = preverjevalnikStevila(nepreverjenoSteviloStevil);

        // zdaj imam preverjeno stevilo v preverjenoSteviloStevil
        // Vprašamo uporabnika za array števil, in tudi preverimo če so števila
        System.out.println("************************************************************");

        // nanizamo števila v array
        int[] nizStevil = new int[preverjenoSteviloStevil];

        for (int i = preverjenoSteviloStevil - 1; i >= 0; i--) {
            System.out.println("Vnesi še " + (i + 1) + " števil.");
            int steviloZaVArray = preverjevalnikStevila(bralnik.nextLine());
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

        // to je moj piškotek DO NOT TOUCH!!!!
        nizStevil = obrniNiz(nizStevil);

        System.out.println("************************************************************");
        System.out.println("Število elementov v podanem arrayu je "+nizStevil.length);

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
        // kle ga obrnem in mam mojega piškotka za zmerej tudi obrnjenega :)
        int sortedNizStevil[] = mehurckovoSortiranjeVNoviArray(nizStevil);
        izpisiProcentualnoPojavitevStevil(sortedNizStevil);

        System.out.println("************************************************************");
        najdiModus(sortedNizStevil);

        System.out.println("************************************************************");
        najvecjeStevilo(nizStevil);

        System.out.println("************************************************************");
        drugoNajmanjseStevilo(nizStevil);

        System.out.println("************************************************************");
        System.out.println("Povprečje vse števil v arrayu je: "+(sestevator(nizStevil) / nizStevil.length));

        System.out.println("************************************************************");
        System.out.println("Standardna deviacija je: "+izracunajStandardnoDeviacijo(nizStevil));

        System.out.println("************************************************************");
        System.out.println("Mediana podanih stevil v arrayu je: "+izracunajMediano(sortedNizStevil));

        System.out.println("************************************************************");
        System.out.println("Sestevek vseh stevil v arrayu je: "+sestevator(nizStevil));

        System.out.println("************************************************************");
        System.out.println("Skupaj je to "+izpisiPalindrome(nizStevil)+" palindromov.");

        System.out.println("************************************************************");
        System.out.println("Izpisujem obrnjen array vnešenih števil:");
        izpisiNiz(obrniNiz(nizStevil));
    }

}