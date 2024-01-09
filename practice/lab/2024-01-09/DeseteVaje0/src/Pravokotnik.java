public class Pravokotnik extends GeometrijskaOblika implements Lik{
    //Vertikalno poravnani pravokotniki
    //Dedovanje, razred pravokotnik deduje lastnosti in metode super razreda (geometrijska oblika)
    //razred lahko deduje samo iz enega razreda, lahko pa implemenitra vec interfacov

    public Tocka spodnjaLeva;
    public Tocka zgornjaDesna;

    //konstruktor
    public Pravokotnik(String barva,Tocka spodnjaLeva, Tocka zgornjaDesna){
        super("pravokotnik",barva);//klicemo konstruktor SUPER razred, !!To mora bit vedno prvi ukaz konstruktorja!!
        this.spodnjaLeva = spodnjaLeva;
        this.zgornjaDesna = zgornjaDesna;
    }

    public int stranicaA(){
        return zgornjaDesna.x - spodnjaLeva.x;
    }
    public int stranicaB(){
        return zgornjaDesna.y - spodnjaLeva.y;
    }

    @Override
    public double obseg() {
        return 2*stranicaA() + 2*stranicaB();
    }

    @Override
    public double ploscina() {
        return stranicaA() * stranicaB();
    }


    @Override
    public boolean sePrekrivata(GeometrijskaOblika oblika) {
        Pravokotnik drugi;
        if( oblika instanceof Pravokotnik ){//vrne true ce oblika je instanca razreda pravokotnik
            drugi = (Pravokotnik) oblika; //typecasting
        }else{
            System.out.println("Ni pravokotnik!!");
            return false;
        }
        //preverjamo ali se NE prekrivata
        //OB STRANEH
        if( this.zgornjaDesna.x < drugi.spodnjaLeva.x ||
                drugi.zgornjaDesna.x < this.spodnjaLeva.x ){
            return false;
        }
        //VERTIKALNO
        if(this.spodnjaLeva.y > drugi.zgornjaDesna.y ||
                drugi.spodnjaLeva.y > this.zgornjaDesna.y){
            return false;
        }
        return true;
    }


}
