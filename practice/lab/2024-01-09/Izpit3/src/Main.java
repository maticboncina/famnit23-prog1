class Tree {
    Tree levo, srednje, desno;
    int glava;

    // Constructor for the Tree class
    public Tree(int glava) {
        this.levo = null;
        this.srednje = null;
        this.desno = null;
        this.glava = glava;
    }

    boolean vstavi(int elt) {
        if (elt < glava) {
            if (levo == null) {
                levo = new Tree(elt);
                return true;
            } else {
                return levo.vstavi(elt);
            }
        } else if (elt >= glava && elt < (glava * glava)) {
            if (srednje == null) {
                srednje = new Tree(elt);
                return true;
            } else {
                return srednje.vstavi(elt);
            }
        } else {
            if (desno == null) {
                desno = new Tree(elt);
                return true;
            } else {
                return desno.vstavi(elt);
            }
        }
    }
}
