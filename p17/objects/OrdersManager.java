package objects;

public interface OrdersManager {
    public int itemsQuantity(String item);
    public int itemsQuantity(MenuItem item);
    public Order[] getOrders();
    public int ordersCostSummary();
    public int ordersQuantity();
}
