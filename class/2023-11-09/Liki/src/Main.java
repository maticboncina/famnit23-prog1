import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner bralnik = new Scanner(System.in);

        System.out.printf("Vnesi velikost trikotnika: ");
        int velikost = bralnik.nextInt();
        // enakokratki trikotnik na levi strani
        for (int i = 0; i < velikost; i++){
            for (int j = 0; j < velikost; j++){
                if (j <= i){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println("+++++++++++++++");
        // enakokratki trikonik na desni strani // popravi

        for (int i = 0; i < velikost; i++){
            for (int j = 0; j < velikost; j++){
                if (i + j == velikost - 1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
        }

        // nariši pravokotnik
        System.out.println("+++++++++++++++");
        System.out.println("");

        for (int i = 0; i < velikost; i++){
            System.out.print("*");
        }

        for (int i = 0; i < velikost; i++){
            System.out.print("*");
        }

        // nariši kvadrat s križem
        System.out.println("+++++++++++++++");
        System.out.println("");

        int b = bralnik.nextInt();
        for (int i = 0; i < velikost; i++){
            for (int j = 0; j < velikost; j++){
                if (i == velikost - 1 || i == 0 || j == b - 1 || j == 0 || i == velikost - j || i == j){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
        }

        // nariši šahovnico
        System.out.println("+++++++++++++++");
        System.out.println("");

        int b = bralnik.nextInt();
        for (int i = 0; i < velikost; i++){
            for (int j = 0; j < velikost; j++){
                if (i == velikost - 1 || i == 0 || j == b - 1 || j == 0 || i == velikost - j || i == j){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
        }


    }
}