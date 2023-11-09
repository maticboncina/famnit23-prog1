public class Main{
    public static void main(String argv[]){
        int a = 869;
        int b = 85;
        for(int i = 0; i < a; i++){
            b += b;
        }
        System.out.println(b);
    }
}