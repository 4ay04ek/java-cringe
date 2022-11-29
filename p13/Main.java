import objects.*;

public class Main{
    public static void main (String args[]){
        Complex complex = new ConcreteFactory().createComplex(3, 5);
        System.out.println(complex);
    }
}