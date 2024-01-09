public abstract class GeometrijskaOblika {
    //ASBTRAKTNI razred
    //NI MOC INSTANCIRAT!!!

    public String ime;
    public String barva;

    //konstruktor
    public GeometrijskaOblika(String ime, String barva){
        this.ime = ime;
        this.barva = barva;
    }

    public void opis(){
        System.out.println("Geo oblika: "+ime + " barva: "+barva);
    }

    //abstraktna metoda
    //metoda ki nima implementacije
    public abstract boolean sePrekrivata(GeometrijskaOblika oblika);

    //Vgnezden razred
    static class Tocka{
        int x;
        int y;

        public Tocka(int x , int y){
            this.x = x;
            this.y = y;
        }
    }



}
