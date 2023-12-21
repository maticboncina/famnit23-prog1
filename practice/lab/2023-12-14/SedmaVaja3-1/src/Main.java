public class Main {

    static void hanoi (int n, char from, char inter, char to){
        if(n==1){
            System.out.println("Premakni iz "+from+" na "+to);
        }
        else{
            hanoi(n-1, from, inter, to);
            System.out.println("Premakni iz "+from+" na "+to);
            hanoi(n-1, inter, from, to);
        }
    }

    public static void main(String[] args) {
        hanoi(4, 'L', 'S', 'D');
    }
}