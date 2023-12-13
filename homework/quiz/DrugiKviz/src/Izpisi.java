public class Izpisi {
        public static final String ime = "Matic"; // konstanta

        public static void main(String[] args) {
            izpisiImeInObrnjenoIme();
        }

        static void izpisiImeInObrnjenoIme() {
            // Izpis imena
            System.out.println(ime);

            // Izpis obrnjenega imena
            String obrnjenoIme = new StringBuilder(ime).reverse().toString();
            System.out.println(obrnjenoIme);
        }
    }