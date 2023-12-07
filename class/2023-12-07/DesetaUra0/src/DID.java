public class DID {

    Vozlisce koren;

    public boolean vstavi(int v){
        if(koren == null){
            koren = new Vozlisce(v); // ustvarimo novo drevo
            return true;
        }
        else{
            return koren.vstavi(v);
        }
    }

    public boolean vsebuje(int v){
        if(koren == null){
            return false;
        }
        else {
            return koren.vsebuje(v);
        }
    }

    public void premiPregled(){
        if(koren != null){
            koren.premiPregled();
        }
    }

    public int visinaDrevesa(){
        if(koren != null){
            return koren.visina();
        }
        else {
            return 0;
        }

    }
}
