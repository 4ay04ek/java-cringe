import objects.*;

public class Main{
    public static void main (String args[]){
        DishType1 dt1 = new DishType1();
        DishType2 dt2 = new DishType2();
        System.out.println("DishType1 price: " + dt1.getPrice());
        System.out.println("DishType2 price: " + dt2.getPrice());
    }
}