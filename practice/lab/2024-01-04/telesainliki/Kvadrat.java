public class Kvadrat extends Pravokotnik{


    public Kvadrat(String barva, Tocka spodnjaLeva, Tocka zgornjaDesna) {
        super(barva, spodnjaLeva, zgornjaDesna);
        this.ime = "kvadrat";
        if(stranicaA() != stranicaB()){
            System.out.println("To ni kvadrat!!!");
            System.exit(1); ////zakljuci v trenutku program s statusno kodo 1 (napaka)
        }
    }
}
