import java.util.Random;

public class Main {
    public static void main(String[] args) throws MojaIzjema {
        MojaIzjema.delitelj = 6;

        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            int n = r.nextInt(1000);

            try {
                MojaIzjema.test(n);
            }
            catch (MojaIzjema e){
                System.out.println(e);
            }
        }
    }

    public static void test() {
        int a = 42;
        int d = 0;
        try {
            a = a / d;
            System.out.println("To ne bo sprintano.");
        }
        catch (ArithmeticException e){
            System.out.println("Division by zero not possible");
        }
        catch (RuntimeException e){
            System.out.println(e);
        }
        System.out.println("After catch");
    }
}