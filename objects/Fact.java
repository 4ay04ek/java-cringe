package objects;

public class Fact{
    private int fact;
    private int calc(int n){
        if (n == 0) return 1;
        return n * calc(n - 1);
    }
    public Fact(int n){
        fact = calc(n);
    }
    public int getFactorial(){
        return fact;
    }
    public void recalculate(int n){
        fact = calc(n);
    }
}