import objects.*;

public class Main{
    public static void main (String args[]){
        Dish d1 = new Dish();
        d1.setCost(30);
        d1.setName("Voda");
        d1.setDescription("Pityevaya");
        Dish d2 = new Dish();
        d2.setCost(100);
        d2.setName("Voda");
        d2.setDescription("Borjomi");
        Dish d3 = new Dish();
        d3.setCost(150);
        d3.setName("Coffee");
        d3.setDescription("Black");
        OrderManager om  = new OrderManager();
        Order order1 = new Order();
        order1.add(d1);
        order1.add(d1);
        order1.add(d2);
        Order order2  = new Order();
        order2.add(d2);
        order2.add(d3);
        order2.add(d3);
        om.add(order1, 1);
        om.add(order2, 2);
        System.out.println(om);
        System.out.println("Order 1 total cost: " + order1.costTotal());
        System.out.println("Order 2 count of dishes: " + order2.dishQuantity());
    }
}