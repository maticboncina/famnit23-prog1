public class Main {

    static int fib(int n){
        if (n == 0){
            return 0;
        }
        else if (n == 1){
            return 1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }
    static int f1(int n){
        int vsota = 0;
        int prejsnjaVrednost = 1;
        int predPrejsnjaVrednost = 1;
        for (int i = 2; i < n; i++) {
            vsota = predPrejsnjaVrednost + prejsnjaVrednost;
            predPrejsnjaVrednost = prejsnjaVrednost;
            prejsnjaVrednost = vsota;
        }
        return vsota;
    }
    public static void main(String[] args) {
        System.out.println("Fibonnacijevo stevilo je: "+f1(7));
        System.out.println("Fibonnacijevo stevilo je: "+fib(7));

    }
}