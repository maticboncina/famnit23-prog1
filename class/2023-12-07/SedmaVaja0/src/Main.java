public class Main {

    static int metoda(int a, int b){
        return 77;
    }
    static int metoda(int a){
        if(a < 20){
            return 77;
        }
        else {
            metoda(a-1);
        }
        return 9;
    }
    public static void main(String[] args) {
        System.out.println(metoda(88));
    }
}