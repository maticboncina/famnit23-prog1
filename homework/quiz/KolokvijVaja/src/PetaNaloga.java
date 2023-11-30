import java.util.Scanner;

public class PetaNaloga {
    public static void main(String[] args) {
        Scanner bralnik = new Scanner(System.in);

        System.out.println("Vnesi poljuben string:");
        String niz = bralnik.nextLine();

        String obrnjenNiz = new StringBuilder(niz).reverse().toString();
        System.out.println("Obrnjen niz je ločen s presledkom: " + obrnjenNiz);

        String[] poljeBesed = niz.split(" ");

        int tvojaMamiJeDebela[] = new int[poljeBesed.length];

        // Print words starting with 'a' or 'A'
        for (int i = 0; i < poljeBesed.length; i++) {
            if (poljeBesed[i].length() > 0 && (poljeBesed[i].charAt(0) == 'a' || poljeBesed[i].charAt(0) == 'A')){
                System.out.println(poljeBesed[i]);
            }
        }

        // Print words longer than 5 characters
        for (int i = 0; i < poljeBesed.length; i++) {
            if (poljeBesed[i].length() > 5){
                System.out.println(poljeBesed[i]);
            }
        }
    }
}
