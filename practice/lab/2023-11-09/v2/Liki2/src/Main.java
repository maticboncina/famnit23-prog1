import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner vnos = new Scanner(System.in);

        //System.out.print("a: ");
        int a = 10;//vnos.nextInt();

        //primer trikotnika
        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < a; j++)
            {
                //if (i < j)
                if (j < i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        //primer kvadrata

        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < a; j++)
            {
                /*if (i == 0 || i == a - 1 || j == 0 || j == a - 1) //kvadrat */
                /*if (i == 0 || i == a - 1 || j == 0 || j == a - 1 || i == j ) //kvadrat z diagonalo */
                /*if (i == 0 || i == a - 1 || j == 0 || j == a - 1 || i == j || i + j == a - 1 ) //kvadrat z x-om*/
                if (i == 0 || i == a - 1 || j == 0 || j == a - 1 || i == j || i + j == a - 1 || ((i >= j) && (i + j >= a - 1))) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }



    }
}