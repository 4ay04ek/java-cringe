import objects.*;

public class Main{
    public static void main (String args[]){
        ConcreteFactory complex = new ConcreteFactory();
        System.out.println(complex.createComplex());
        System.out.println(complex.createComplex(5, 8));
    }
}