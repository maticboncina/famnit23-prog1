import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vpisi stevilo: ");
        int stevilo = scanner.nextInt();
        boolean toJePrastevilo = true;
        double meja = Math.sqrt((double) stevilo);
        for(int i = 2; i < meja; i++){
            if(stevilo % i == 0){
                toJePrastevilo = false;
            }
        }
        if(toJePrastevilo){
            System.out.println("JE PRAŠTEVILO");
        }
        else{
            System.out.println("NI PRAŠTEVILO");
        }
    }
}