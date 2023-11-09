public abstract class PostalBox {

    boolean isPacked = false;

    public void pack(){
        System.out.printf("Pakiranje skatLJe...");
        this.isPacked = true;
    }
    abstract double getWeight();

    abstract double getVolume();
}
