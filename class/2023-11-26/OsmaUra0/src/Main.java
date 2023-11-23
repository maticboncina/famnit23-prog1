import java.util.Scanner;

public class Main {

    // prebere polje števil iz inputta

    public static void main(String[] args){

        Scanner bralnik = new Scanner(System.in);
        System.out.println("Vstavi poljubno število pozitivnih int vrednosti. Vnašanje prenehaj, tako da vstaviš negativno vrednost.");

        String vrstica = bralnik.nextLine();
        String[] poljeTokenov = vrstica.split(" ");
        int[] stevila = new int[poljeTokenov.length];

        for (int i = 0; i < stevila.length; i++) {
            stevila[i] = Integer.parseInt((poljeTokenov[i]));
        }

        System.out.println("Prebral sem polje: ");
        for (int i = 0; i < stevila.length; i++) {
            stevila[i] = Integer.parseInt(poljeTokenov[i]);

            if (i == stevila.length -1){
                System.out.print(stevila[i]);
            }
            else {
                System.out.print(stevila[i]+", ");
            }
        }

        long vsota = 0;
        for (int i = 0; i < stevila.length; i++) {
            if (stevila[i]%2==0){
                // iscemo soda števila
                vsota += stevila[i] * stevila[i];
            }
        }
        System.out.println("");
        System.out.println("Rezultat: "+vsota);
    }
}