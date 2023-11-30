/*
preberi dve polji stevil iste dolzine
izpisi razliko elementov na istih mestih v poljih
najdi najmanjši element v novem polju (razlike elementov)
*/

import java.util.Arrays;
import java.util.Scanner;

public class TretjaNaloga {
    public static void main(String[] args){

        // bralnik
        Scanner bralnik = new Scanner(System.in);

        // transformacija
        System.out.println("Vnesi prvo polje števil, ki jih ločiš z vejico (,):");
        String prviNiz = bralnik.nextLine();

        // transformacija
        String stevilaIzPrvegaNiza[] = prviNiz.split(",");

        // vhodne reči
        System.out.println("Vnesi drugi polje števil, ki jih ločiš z vejico (,). Mora biti enake dolzine!!!:");
        String drugiNiz = bralnik.nextLine();

        // transformacija
        String stevilaIzDrugegaNiza[] = drugiNiz.split(",");

        // preverjanje enakosti dolzine

        if (stevilaIzPrvegaNiza.length != stevilaIzDrugegaNiza.length){
            System.out.printf("Nisi napisal enako dolgih nizov. Exiting");
            System.exit(1);
        }
        else {
            System.out.println("Napisal si enako dolga stringa. Hvala, da me nisi zaklal. Nadaljujem.");
        }

        // izpisovalec razlike
        System.out.println("Izpisujem razliko na enakih mestih v poljih v isti vrstici ločeno z ', ':");
        System.out.println("");
        for (int i = 0; i < stevilaIzDrugegaNiza.length; i++) {
            System.out.print(Integer.parseInt(stevilaIzPrvegaNiza[i]) - Integer.parseInt(stevilaIzDrugegaNiza[i]));
            System.out.print(", ");
        }

        // zdaj pa hitro na novo polje

        //definator

        String[] razlikaPrejsnjihNizov = new String[stevilaIzPrvegaNiza.length];
        int najmanjsaRec = Integer.MAX_VALUE;
        // reč

        for (int i = 0; i < Integer.parseInt(String.valueOf(razlikaPrejsnjihNizov.length)) - 1; i++) {
            if (Integer.parseInt(razlikaPrejsnjihNizov[i]) < najmanjsaRec){
                najmanjsaRec = Integer.parseInt(razlikaPrejsnjihNizov[i]);
            }
        }
        System.out.println("");
        System.out.println("Najmanjsi element v arryu razlik je: "+najmanjsaRec);

    }
}
