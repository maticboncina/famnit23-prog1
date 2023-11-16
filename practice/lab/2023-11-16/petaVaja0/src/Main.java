import java.util.Scanner;

public class Main {
    static void izpisiPolje(int polje[]){
        for (int i = 0; i < polje.length; i++) {
            System.out.println(polje[i]);
        }
    }

    static int vsota(int polje[]){
        int sestevek = 0;
        for (int i = polje.length - 1; i >= 0; i--) {
            // vsota += stevilke[i];
            sestevek = sestevek + polje[i];
        }
        return sestevek;
    }

    static double povprecje(int polje[]){
        int sestevek = 0;
        return (double)vsota(polje) / polje.length;
    }

    static int[] beriPolje(){
        Scanner bralnik = new Scanner(System.in);
        String vrstica = bralnik.nextLine();
        String st[] = vrstica.split(" ");
        int stevila[] = new int [st.length];
        for (int i = 0; i < st.length; i++) {
            stevila[i] = Integer.parseInt(st[i]);
        }
        return stevila;
    }

    public static void main(String[] args) {
        int stevilke[]= {3, 2, 3, 456, 8 , 77, 999};
        int b = stevilke[3];
        b = stevilke[stevilke.length - 1];

        stevilke = new int [26];
        b = stevilke[2];
        System.out.println(b);

        int stevilke1[]= {3, 5, 3, 4};
        for (int i = 0; i < stevilke1.length; i++) {
            System.out.println(stevilke1[i]);
        }
        System.out.println("");
        System.out.println("+++ Izpise celo polje v obratnem vrstnem redu +++");

        for (int i = stevilke1.length - 1; i >= 0; i--) {
            System.out.print(stevilke1[i] + " ");
        }
        System.out.println("");
        System.out.println("+++ Vsota vseh elementov v arrayu +++");

        System.out.println(vsota(stevilke1));

        System.out.println();
        System.out.println("+++ Poisci najvecji element+++");

        int max = stevilke1[0];
        for (int i = stevilke1.length - 1; i >= 0; i--) {
            if (max < stevilke1[i]){
               max = stevilke1[i];
            }
        }
        System.out.println(max);

        System.out.println();
        System.out.println("+++ Poisci najmanjsi element+++");

        int min = stevilke1[0];
        for (int i = stevilke1.length - 1; i >= 0; i--) {
            if (min > stevilke1[i]){
                min = stevilke1[i];
            }
        }
        System.out.println(min);

        int stevilke2[]= {3, 5, 3, 4};

        System.out.println();
        System.out.println("+++ Preverjanje praznega arraya +++");

        System.out.println();
        System.out.println("+++ Izpise vsa soda števila v arrayu +++");

        int soda = stevilke2[0];
        int stSodih = 0;
        for (int i = stevilke2.length - 1; i >= 0; i--) {
            if (stevilke2[i] % 2 == 0){
                stSodih++;
            }
        }
        System.out.println(stSodih);

        System.out.println();
        System.out.println("+++ Izpise povprecje +++");

        int dolzina = stevilke2[0];
        int vsotaPovprecja = 0;
        System.out.println(povprecje(stevilke1));

        System.out.println("+++ Preberi polje in izpise +++");
        System.out.println("Vpisi polje s presledki, da locis");
        int noveStevilke[] = beriPolje();
        izpisiPolje(noveStevilke);

        System.out.println("Vpisi polje s presledki, da locis. Isto samo da funckija klice funkcijo");
        izpisiPolje(beriPolje()); // kličemo funkcijo,ki nam izpise

        System.out.println();
        System.out.println("+++ 2D polje +++");

        int slika[][] = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3},{1, 2, 3}};
        for (int i = 0; i < slika.length; i++) {
            for (int j = 0; j < slika[i].length; j++) {
                System.out.print(slika[i][j]);
            }
            System.out.println();
        }


    }
}