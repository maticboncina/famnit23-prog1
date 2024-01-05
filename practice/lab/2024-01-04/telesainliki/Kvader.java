public class Kvader extends Pravokotnik implements Telo{
    //3D pravokotnik, dodamo globino
    int g;

    public Kvader(String barva, Tocka spodnjaLeva, Tocka zgornjaDesna, int globina) {
        super(barva, spodnjaLeva, zgornjaDesna);
        this.ime = "kvader";
        this.g = globina;
    }


    @Override
    public double volumen() {
        return super.ploscina() * g; //super se nanasa na metode super razreda!!!
    }

    @Override
    public double povrsina() {
        return 2* (super.ploscina() + stranicaA() * g + stranicaB() * g);
    }

    //POLYMORFIZEM
    //metoda lahko ima enako ime a vec oblik implementacije

    //OVERRIDING
    //redefinaramo metodo, ki je ze definirana v super razredu
    public double ploscina(){
        return -1;
    }
    public double obseg(){
        return -1;
    }

    //OVERLOADING
    //metoda z enakim imenom se obnasa razlicno v odvisnosti od sprejetih argumentov
    public double volumen(int a , int b , int c){
        return a * b * c;
    }
    public double volumen(double a , double b , double c){
        return a * b * c;
    }
    /* Tako ne velja!
    public int volumen(int a , int b , int c){
        return a * b * c;
    }*/

    //vaja:
    //implementiraj 3D prekrivanje
    //ustvari razred Kocka ki deduje iz razreda kvader
    public boolean sePrekrivata(GeometrijskaOblika oblika){
        return super.sePrekrivata(oblika);
    }


}
