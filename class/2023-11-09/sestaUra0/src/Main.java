import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        box b = new box(3, 3, 4);
        System.out.printf("Volumen skatLJe: %f\n"+b.getVolume());
        System.out.printf("Mass skatLJe: %f\n" +b.getWeight());
        System.out.printf("Packed: %b"+b.isPacked);
        b.pack();
        System.out.println("Packed: "+b.isPacked);
    }

}