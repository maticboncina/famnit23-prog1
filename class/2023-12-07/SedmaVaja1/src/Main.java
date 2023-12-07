public class Main {
    static int sestejDoN(int n){
        if(n == 0){
            return 0;
        }
        return sestejDoN(n - 1) + n;
    }

    static int fakulteta(int n){
        if (n == 1){
            return 1;
        }
        else {
            return fakulteta(n-1)+n;
        }
    }

    static int zmnozek(int a, int b){
        if (b == 0){
            return 0;
        }
        else{
            return(a + zmnozek(a, b - 1));
        }
    }
    public static void main(String[] args) {
        System.out.println(sestejDoN(3));
        System.out.println(zmnozek(5, 6));
    }
}