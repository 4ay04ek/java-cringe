package objects;

public class InternetOrderManager implements OrdersManager {
    private class QueueNode {
        protected QueueNode next, prev;
        protected InternetOrder value;
    }
    private QueueNode tail, head;
    private int size = 0;
    public boolean add(InternetOrder order){
        size += 1;
        QueueNode node = new QueueNode();
        node.value = order;
        if (size == 1) {
            node.next = node;
            tail = head = node;
            return true;
        }
        node.prev = head;
        head.next = node;
        node.next = tail;
        head = node;
        return true;
    }
    public Order remove(){
        Order toRemove = head.value;
        head = head.prev;
        return toRemove;
    }
    @Override
    public InternetOrder[] getOrders() {
        if (size == 0) return new InternetOrder[0];
        InternetOrder[] items = new InternetOrder[size];
        int i = 0;
        QueueNode node = tail;
        do {
            items[i] = node.value;
            i++;
            node = node.next;
        } while (node != tail);
        return items;
    }
    @Override
    public int itemsQuantity(String item) {
        int r = 0;
        QueueNode node = tail;
        do {
            r += node.value.itemQuantity(item);
            node = node.next;
        } while (node != tail);
        return r;
    }
    @Override
    public int itemsQuantity(MenuItem item) {
        int r = 0;
        QueueNode node = tail;
        do {
            r += node.value.itemQuantity(item);
            node = node.next;
        } while (node != tail);
        return r;
    }
    @Override
    public int ordersCostSummary() {
        int r = 0;
        QueueNode node = tail;
        do {
            r += node.value.costTotal();
            node = node.next;
        } while (node != tail);
        return r;
    }
    @Override
    public int ordersQuantity() {
        return size;
    }   
}
