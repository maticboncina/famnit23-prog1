public class Main {
    public static void main(String[] args) {
        DID drevo = new DID();

        int elt[] = {10,5,2,7,18,13,20};

        for (int i = 0; i < elt.length; i++) {
            drevo.vstavi(elt[i]);
        }

        System.out.println("Drevo vsebuje element 7: "+drevo.vsebuje(7));

        System.out.println("Drevo vsebuje element 13: "+drevo.vsebuje(13));
        System.out.println("Drevo vsebuje element 11: "+drevo.vsebuje(11));

        drevo.vstavi(11);

        System.out.println("Drevo vsebuje element 11: "+drevo.vsebuje(11));

        drevo.premiPregled();
        System.out.println("Visina drevesa: "+drevo.visinaDrevesa());

        drevo.vstavi(8);
        System.out.println("Visina drevesa: "+drevo.visinaDrevesa());

        drevo.vstavi(12);
        System.out.println("Visina drevesa: "+drevo.visinaDrevesa());
    }
}