import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner bralnik = new Scanner(System.in);

        System.out.print("Vpisi ime: ");
        String ime = bralnik.nextLine();

        System.out.print("Vpisi priimek: ");
        String priimek = bralnik.nextLine();

        System.out.println("Lepo pozdravljen "+ime+" "+priimek+", kako si kaj?");

    }
}