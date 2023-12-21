public class Fibonacci {
    static int f(int n){
        if (n==0 || n ==1){
            return 1;
        } else if (n==1){
            return 1;
        }
        else{
            return f(n-1) + f(n - 2);
        }
    }

    static int f1(int n){
        int prejsnji = 1;
        int predprejsnji = 1;
        int vsota = 0;

        for (int i = 2; i <= 2; i++) {
            predprejsnji =prejsnji;
            prejsnji = vsota;
            vsota = prejsnji + predprejsnji;
        }
        return vsota;
    }
    public static void main(String[] args) {
        System.out.println(f1(6));
    }
}
