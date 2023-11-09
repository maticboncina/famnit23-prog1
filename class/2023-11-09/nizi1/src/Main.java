import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Vpisi stavek: ");
        Scanner bralnik = new Scanner(System.in);

        String stavek = bralnik.nextLine();

        System.out.println(stavek.charAt(0));
        System.out.println(stavek.length());
        System.out.println(stavek.charAt(stavek.length() - 1));
        String resitev = "";

        // koda, ki vsak tretji znak spremeni v "a". Mora izpisat spremenjen niz.

        System.out.println("Original: "+stavek);

        for (int i = 0; i < stavek.length(); i++) {
            if (i % 3 == 2) {
                resitev += "a";
            }
            else {
                resitev += stavek.charAt(i);
            }
        }

        System.out.println("Spremenjeni niz je: "+resitev);

        // izpisi string v obratnem vrstnem redu


        String obratno = "";
        for (int i = 0; i < stavek.length(); i++){
            System.out.print(stavek.charAt(stavek.length() - i -1));
        }

        for (int i = stavek.length(); i > 0; i--){
            System.out.print(stavek.charAt(i - 1));
        }

        //razdeli niz na besede
        System.out.println();
        System.out.println("++++++++++++++++++++++++++");

        String posamicneBesede[] = stavek.split(" ");

        for (int i = 0; i < posamicneBesede.length; i++){
            System.out.println(posamicneBesede[i]);
        }


    }
}

// ena naloga, s stringi, ena s arrayi, ena s števili
// dvojne enojne fgor zanke (praštevila)