import java.util.Scanner;

// preberi niz
// in preveri ali je palindrom

public class Main {

    static boolean palindrom(String beseda){
        for (int i = 0; i < beseda.length()/2; i++) {
            if (beseda.charAt(i) != beseda.charAt(beseda.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }

    static String obrni(String niz){
        String tmp = "";
        for (int i = niz.length(); i >= 0; i--) {
            tmp += niz.charAt(i);
        }
        return tmp;
    }

    static boolean palindromInzinirski(String niz){
        // return(niz.equals(obrni(niz)));
        boolean rez = niz.equals(obrni(niz));
        return rez;
    }

    public static void main(String[] args) {

        Scanner bralnik = new Scanner(System.in);
        System.out.println("Vnesi palindrom: ");
        String niz = bralnik.nextLine();

        if(palindrom /*palindromInzinirski*/(niz)){
            System.out.println("Je palindrom");
        }
        else {
            System.out.println("Ni palindrom");
        }
    }
}