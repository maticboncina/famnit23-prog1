public class Main {
    public static void main(String[] args) {
        PovezaniSeznam ps = new PovezaniSeznam();
        ps.vstavi(5);
        ps.vstavi(4);
        ps.vstavi(3);
        ps.vstavi(8);
        ps.vstavi(2);

        System.out.println(ps.isci(4));
        System.out.println(ps.isci(2));
        System.out.println(ps.isci(7));;

        System.out.println("+++++++++++++++++++++");

        long t0 = System.currentTimeMillis();
        long t;

        for (int i = 0; i < 1000000; i++){
            ps.vstavi(i);
            if (i%1000==0){
                t = System.currentTimeMillis() - t0;
                System.out.println("Cas vstavljanja 1000 elementov: "+t+"ms");
                t0 = System.currentTimeMillis();
            }
        }
        System.out.println(ps.isci(9999));
    }

}
