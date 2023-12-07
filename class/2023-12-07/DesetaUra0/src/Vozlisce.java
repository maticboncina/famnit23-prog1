public class Vozlisce {

    int vrednost;

    Vozlisce levo;
    Vozlisce desno;

    Vozlisce(int vrednost){
        this.vrednost = vrednost;
    }

    public boolean vstavi(int v){
        if (v < this.vrednost){ //vstavimo v levo poddrevo
            if(levo == null){
                levo = new Vozlisce(v);
                return true;
            }
            else{
                return levo.vstavi(v);
            }

        } else if (v > this.vrednost) { //vstavimo v desno poddrevo
            if(desno == null){
                desno = new Vozlisce(v);
                return true;
            }
            else{
                return desno.vstavi(v);
            }
        }
        else{ //če je vrednost = potem ne vstavimo
            return false;
        }
    }

    public boolean vsebuje(int v){
        if (v < this.vrednost){//iscemo v levem poddrevesu
            if (levo == null){
                return false;
            }
            else{
                return levo.vsebuje(v);
            }
        } else if (v > this.vrednost) {
            if (desno == null){
                return false;
            }
            else {
                return desno.vsebuje(v);
            }

        }
        else{
            return true;
        }
    }

    public void premiPregled(){
        if (levo != null){
            levo.premiPregled();
        }
        System.out.println(this.vrednost + " ");
        if (desno !=null){
            desno.premiPregled();
        }
    }

    public int visina(){
        int l_visina = 0;
        int d_visina = 0;
        if (levo != null){
            l_visina = levo.visina();
        }
        if (desno != null){
            d_visina = desno.visina();
        }
        return Math.max(l_visina, d_visina) + 1;
    }

}
