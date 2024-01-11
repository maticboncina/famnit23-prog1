// Napisi program za uporabljanje Stohastičnih Parametrov, ki je sestavljen iz naslednje hiearhije razredov
// Stohastično je nekaj na kar vpliva naključnosti
// Interface StohastičnioPredmet => metode opis();, rezultat()
// Abstraktna Razreda  Kovanec in Kocka implementirata interface SP

/**
 * abstraktne metode flip() in roll()
 *
 * Iz abstraktnih razredov dedujejo naslednji razredi:
 * Pravičen kovanec, naključen kovanec, pravična kocak, naklkjučna kocka
 */

public class Main {
    public static void main(String[] args) {
        PravicniKovanec pk = new PravicniKovanec();
        pk.opis();

        NaklonjenKovanec nk = new NaklonjenKovanec(0.7);

        distribucija(pk);
        distribucija(nk);
    }

    public static void distribucija(Kovanec k){
        int ena = 0;
        int nic = 0;
        int n = 10000;

        for (int i = 0; i < n; i++) {
            if(k.rezultat() == 1){
                ena++;
            }
            else{
                nic++;
            }
        }
        System.out.println("Pojavitev 1: "+ena+" - Pojavitev 0: "+nic+" - Ratio 1: "+ena / (ena+nic+1.0));
    }
}