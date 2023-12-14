public class MojaIzjema extends Exception {

    public static int delitelj;
    private int stevilo;

    MojaIzjema(int stevilo){
        this.stevilo = stevilo;
    }

    public String toString(){
        return MojaIzjema.delitelj + " je delitelj stevila " + stevilo;
    }

    public static void test(int n) throws MojaIzjema{
        if (n % delitelj == 0){
            throw new MojaIzjema(n);
        }
    }
}
