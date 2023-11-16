public class Vozlisce {
    int podatek;
    Vozlisce next;

    public Vozlisce(int v){
        this.podatek = v;
    }

    public void vstavi(int v){
        if(next == null){
            // ustavitveni pogoj
            next = new Vozlisce(v);
        }
        else {
            next.vstavi(v); // rekurzivni korak
        }
    }

    public boolean isci (int v){
        if(podatek == v){
            // tukaj smo dosegli ustavitveni pogoj in nasli element
            return true;
        }
        if (next == null){
            // smo prišli do konca seznama
            return false;
        }
        else {
            return next.isci(v);
        }
    }

    public boolean brisi(int v){
        if(next == null){
            // konec seznama
            return false;
        } else if (next.podatek == v) {
            //naslednje vozlišče bomo zbrisali
            next = next.next;
            return true;
        }
        else {
            return next.brisi(v);
        }
    }

}
