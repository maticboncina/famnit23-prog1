public class NaklonjenKovanec extends Kovanec {
    double bias;

    NaklonjenKovanec(double bias){
        this.bias = bias;
    }

    @Override
    int flip() {
        if (r.nextDouble() > bias){
            return 1;
        }
        else{
            return 0;
        }
    }
}
