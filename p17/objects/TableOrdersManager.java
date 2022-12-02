package objects;
import java.util.HashMap;

import javax.sound.sampled.SourceDataLine;

public class TableOrdersManager implements OrdersManager {
    private HashMap<Integer, Order> orders;
    public void add(Order order, int tableNumber){
        orders.put(tableNumber, order);
    }
    public void addItem(MenuItem item, int tableNumber){
        orders.get(tableNumber).add(item);
    }
    public Order getOrder(int tableNumber){
        return orders.get(tableNumber);
    }
    public void remove(int tableNumber){
        orders.remove(tableNumber);
    }
    public void remove(Order order){
        for (var entry: orders.entrySet()){
            if (entry.getValue() == order) {
                orders.remove(entry.getKey());
                return;
            }
        }
    }
    public void removeAll(Order order){
        for (var entry: orders.entrySet()){
            if (entry.getValue() == order) orders.remove(entry.getKey());
        }
    }
    @Override
    public Order[] getOrders() {
        Order[] order = (Order[])orders.values().toArray();
        return order;
    }
    @Override
    public int itemsQuantity(String item) {
        int r = 0;
        for (var entry: orders.entrySet()){
            r += entry.getValue().itemQuantity(item);
        }
        return r;
    }
    @Override
    public int itemsQuantity(MenuItem item) {
        int r = 0;
        for (var entry: orders.entrySet()){
            r += entry.getValue().itemQuantity(item);
        }
        return r;
    }
    @Override
    public int ordersCostSummary() {
        int r = 0;
        for (var entry: orders.entrySet()){
            r += entry.getValue().costTotal();
        }
        return r;
    }
    @Override
    public int ordersQuantity() {
        return orders.size();
    }
    @Override
    public String toString() {
        return "TableOrdersManager [orders=" + orders + "]";
    }
}
