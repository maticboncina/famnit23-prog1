public class Main {
    public static void main(String[] args) {
        hanoi(4, 'L','S','D');{

        }
    }

    static void hanoi(int n, char from, char inter, char to){
        if(n == 1){
            System.out.println("Premakni "+from+" na "+to);
        }
        else {
            hanoi(n -1, from, to, inter);
            System.out.println("Premakni "+from+" na "+to);
            hanoi(n - 1, inter, from, to);
        }
    }
}