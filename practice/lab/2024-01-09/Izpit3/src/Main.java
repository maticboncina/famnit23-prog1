class Tree {
    Tree levo, srednje, desno;
    int glava;

    public Tree(int head) {
        this.glava = head;
        this.levo = null;
        this.srednje = null;
        this.desno = null;
    }

    public boolean vstavi(int elt) {
        if (this.glava > elt) {
            if (this.levo == null) {
                this.levo = new Tree(elt);
                return true;
            } else {
                return this.levo.vstavi(elt);
            }
        } else if (elt < this.glava * this.glava) {
            if (this.srednje == null) {
                this.srednje = new Tree(elt);
                return true;
            } else {
                return this.srednje.vstavi(elt);
            }
        } else {
            if (this.desno == null) {
                this.desno = new Tree(elt);
                return true;
            } else {
                return this.desno.vstavi(elt);
            }
        }
    }
}