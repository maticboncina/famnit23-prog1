import java.util.Random;

public abstract class Kovanec implements StohasticniPredmet{

    String tip = "kovanec";
    Random r = new Random();

    abstract int flip();

    @Override
    public void opis(){
        System.out.println("Stohasticni Predmet:"+tip);
    }

    @Override
    public int rezultat(){
        return flip();
    }
}
