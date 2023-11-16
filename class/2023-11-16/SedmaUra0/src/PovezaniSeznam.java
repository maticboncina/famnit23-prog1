public class PovezaniSeznam {

    Vozlisce glava;

    Vozlisce rep;

    /**
     * Inserts one element in the linked list
     * fast insert in constant time 0(1)
     *
     * @param v an integer to be inserted
     * @author Matic Boncina
     */

    public void vstavi(int v){
        if(glava == null){
            //prazen seznam
            //ustvari prvi element
            glava = new Vozlisce(v);
            rep = glava;
        }
        else{
            //ustvarimo naslednik repa
            rep.next = new Vozlisce(v);
            rep = rep.next;
            // z repom smo pohitrili vstavljanje zato ni več zamika +140ms za vsak 1000 dodatni člen
        }
    }

    /**
     * Search for amn element in th elinked list
     * Slow search 0(n)
     *
     * @param v the integer to seach for
     * @return true if found / else return false
     * @author Matic Boncina
     */
    public boolean isci(int v){
        if (glava == null){
            //prazen seznam
            return false;
        }
        else {
            return glava.isci(v);
        }
    }

    public boolean brisi(int v){
        if (glava == null){
            //prazen seznam
            return false;
        }
        else if (glava.podatek == v){
            glava = glava.next;
            return true;
        }
        else{
            return glava.brisi(v);
        }
    }


}
