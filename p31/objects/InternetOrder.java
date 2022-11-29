package objects;

public class InternetOrder implements Order {
    private class ListNode {
        protected ListNode next;
        protected MenuItem value;
    }
    private int size = 0;
    private Customer customer;
    private ListNode head;
    private ListNode tail;
    @Override
    public boolean add(MenuItem item) {
        size += 1;
        ListNode node = new ListNode();
        node.value = item;
        if (size == 1) {
            node.next = node;
            head = tail = node;
            return true;
        }
        head.next = node;
        node.next = tail;
        head = node;
        return true;
    }
    @Override
    public int costTotal() {
        int r = 0;
        ListNode node = tail;
        do {
            r += node.value.getCost();
            node = node.next;
        } while (node != tail);
        return r;
    }
    @Override
    public Customer getCustomer() {
        return customer;
    }
    @Override
    public MenuItem[] getItems() {
        MenuItem[] items = new MenuItem[size];
        int i = 0;
        ListNode node = tail;
        do {
            items[i] = node.value;
            i++;
            node = node.next;
        } while (node != tail);
        return items;
    }
    @Override
    public int itemQuantity(String itemName) {
        int r = 0;
        ListNode node = tail;
        do {
            r += node.value.getName() == itemName ? 1 : 0;
            node = node.next;
        } while (node != tail);
        return r;
    }
    @Override
    public int itemQuantity(MenuItem item) {
        int r = 0;
        ListNode node = tail;
        do {
            r += node.value == item ? 1 : 0;
            node = node.next;
        } while (node != tail);
        return r;
    }
    @Override
    public String[] itemsNames() {
        String[] items = new String[size];
        int i = 0;
        ListNode node = tail;
        do {
            items[i] = node.value.getName();
            i++;
            node = node.next;
        } while (node != tail);
        return items;
    }
    @Override
    public int itemsQuantity() {
        return size;
    }
    @Override
    public boolean remove(String itemName) {
        if (itemQuantity(itemName) == 0) return false;
        ListNode node = tail;
        do {
            if (node.next.value.getName() == itemName) {
                node.next = node.next.next;
                return true;
            }
            node = node.next;
        } while (node != tail);
        return true;
    }
    @Override
    public boolean remove(MenuItem item) {
        if (itemQuantity(item) == 0) return false;
        ListNode node = tail;
        do {
            if (node.next.value == item) {
                node.next = node.next.next;
                return true;
            }
            node = node.next;
        } while (node != tail);
        return true;
    }
    @Override
    public int removeAll(String itemName) {
        int k = itemQuantity(itemName);
        ListNode node = tail;
        do {
            if (node.next.value.getName() == itemName) node.next = node.next.next;
            else node = node.next;
        } while (itemQuantity(itemName) != 0);
        return k;
    }
    @Override
    public int removeAll(MenuItem item) {
        int k = itemQuantity(item);
        ListNode node = tail;
        do {
            if (node.next.value == item) node.next = node.next.next;
            else node = node.next;
        } while (itemQuantity(item) != 0);
        return k;
    }
    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        MenuItem[] new_items = getItems();
        boolean sorted = false;
        MenuItem temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < new_items.length - 1; i++) {
                if (new_items[i].getCost() > new_items[i+1].getCost()) {
                    temp = new_items[i];
                    new_items[i] = new_items[i+1];
                    new_items[i+1] = temp;
                    sorted = false;
                }
            }
        }
        return new_items;
    }
    
}
