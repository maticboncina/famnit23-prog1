public class box extends PostalBox{
    double width; double height; double depth;
    public box(double width, double height, double depth){
        this.width = width;
        this.depth = depth;
        this.height = height;
    }

    public double getVolume(){
        return width * height * depth;
    }
    public void describeBox(){
        System.out.println("ŠkatLJa velikost: "+width+"x"+height+"x"+depth);

    }

    }