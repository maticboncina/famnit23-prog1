/**
 * Class utilities vsebuje random number generatorje in podobne pizdarije
 */
public class Utilities {
    /**
     * Metoda, ki s pomočjo vrne linearno naključno distriburiano pojavitev števila med 10 in 20.
     * @return celo število med 10 in 20
     */

    int maxRange = 20;
    int minRange = 10;
    public int randomSizeGenerator(){
        return (int)(Math.random()*(maxRange - minRange +1)+ minRange);
    }

    /**
     * Metoda, ki s pomočjo vrne linearno naključno distriburiano pojavitev števila med 1 in 9 za gumbeke
     * @return
     */

    int maxNumber = 9;
    int minNumber = 1;
    public String randomNumberGenerator(){
        int randomNumber = (int)(Math.random() * (maxNumber - minNumber + 1) + minNumber);
        return Integer.toString(randomNumber);
    }

    public String difficultyGenerator(int minLimit, int maxLimit){
        int randomNumber = (int)(Math.random() * (maxLimit - minLimit + 1) + minLimit);
        return Integer.toString(randomNumber);
    }

    // smart to rewrite these two function into one, which takes max and min as input, thinking... oh well
    // ne pozabi implementirat nazaj v board, če si jih tam vem yeetnu
    // ne pozabi spremenit ime ropotije in spremenit kodo za vzame številki za inpout + update pogodbe
}
