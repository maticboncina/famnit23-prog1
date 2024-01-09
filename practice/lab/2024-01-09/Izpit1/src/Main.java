public class Main {
    interface Racun{
        String beri(int idDokumenta);
        int pisi(String besedilo);
        void brisi(int idDokumenta);
    }

    class A implements Racun{
        String beri(int idDokumenta){
            return ("bla");
        }

        int pisi(String besedilo){
            return(6);
        }

        void brisi(int idDokumenta){

        }
    }
    
    public static void main(String[] args) {

    }
}