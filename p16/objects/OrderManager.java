package objects;

import java.util.HashMap;

public class OrderManager {
    private HashMap<Integer, Order> orders;
    public void add(Order order, int tableNumber) {
        orders.put(tableNumber, order);
    }
    public Order getOrder(int tableNumber) {
        return orders.get(tableNumber);
    }
    public void addDish(Dish dish, int tableNumber){
        orders.get(tableNumber).add(dish);
    }
    public void removeOrder(int tableNumber){
        orders.remove(tableNumber);
    }
    public HashMap<Integer, Order> getOrders(){
        return orders;
    }
    public double ordersCostSummary(){
        double r = 0;
        for (var entry: orders.entrySet()){
            r += entry.getValue().costTotal();
        }
        return r;
    }
    public int dishQuantity(String dishName){
        int r = 0;
        for (var entry: orders.entrySet()){
            r += entry.getValue().dishQuantity(dishName);
        }
        return r;
    }
}
