import java.util.Scanner;

public class SedmaNaloga {
    public static void main(String[] args) {
        Scanner bralnik = new Scanner(System.in);

        String besedilo = bralnik.nextLine();

        String obrnjeno = besedilo.replace("a", "b");
        System.out.println(obrnjeno);
    }
}
