import java.util.Scanner;

// naredi kalkulator
public class Main {
    public static void main(String[] args) {
        String operator;
        float steviloEna;
        float steviloDva;
        Scanner scanner = new Scanner(System.in);
        Scanner scannerOperator = new Scanner(System.in);

        System.out.println("Vpisi prvo stevilo");
        steviloEna = scanner.nextFloat();
        System.out.println("Vnesi operator + - ÷ *");
        operator = scannerOperator.nextLine();
        System.out.println("Vnesi drugo stevilo");
        steviloDva = scanner.nextFloat();

        if(operator.equals("*")){
            System.out.println(steviloEna * steviloDva);
        }
        else if (operator.equals("+")) {
            System.out.println(steviloEna + steviloDva);
        }
        else if (operator.equals("-")) {
            System.out.println(steviloEna - steviloDva);
        }
        else if (operator.equals("÷")) {
            System.out.println(steviloEna / steviloDva);
        }
    }
}

