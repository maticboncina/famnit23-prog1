/*
preberi dve polji stevil iste dolzine
izpisi razliko elementov na istih mestih v poljih
najdi najmanjši element v novem polju (razlike elementov)
*/

import java.util.Scanner;

public class TretjaNalogaDrugic {
    public static void main(String[] args){
        Scanner bralnik = new Scanner(System.in);

        System.out.println("Vnesi prvo polje celih stevil, ki jih ločiš z vejico:");
        String prviNiz = bralnik.nextLine();

        System.out.println("Vnesi drugo polje celih stevil, ki jih ločiš z vejico:");
        String drugiNiz = bralnik.nextLine();

        String stevilaIzPrvegaNiza[] = prviNiz.split(",");
        String stevilaIzDrugegaNiza[] = drugiNiz.split(",");

        if (stevilaIzPrvegaNiza.length != stevilaIzDrugegaNiza.length){
            System.out.println("Nisi vnesel nizov iste dolžine. Exiting.");
            System.exit(1);
        }
        else {
            System.out.println("Vnesel si enako dolgo niza, hvala, da me nisi zaklal.");
        }

        System.out.println("Izpisujem razliko stevil na istih mestih v arrayjih ločene z ', '");
        for (int i = 0; i < stevilaIzDrugegaNiza.length; i++) {
            System.out.print(Integer.parseInt(stevilaIzPrvegaNiza[i]) - Integer.parseInt(stevilaIzDrugegaNiza[i]));
            System.out.print(", ");
        }

        System.out.println("");
        int razlikaElementovPolj[] = new int[stevilaIzPrvegaNiza.length];
        for (int i = 0; i < stevilaIzDrugegaNiza.length; i++) {
            razlikaElementovPolj[i] = Integer.parseInt(stevilaIzPrvegaNiza[i]) - Integer.parseInt(stevilaIzDrugegaNiza[i]);
        }

        int najmanjsaPizdarija = Integer.MAX_VALUE;

        for (int i = 0; i < razlikaElementovPolj.length; i++) {
            if (razlikaElementovPolj[i] < najmanjsaPizdarija){
                najmanjsaPizdarija = razlikaElementovPolj[i];
            }
        }

        System.out.printf("Najmanjse stevilo v polju je:"+najmanjsaPizdarija);
    }
}
