package objects;

public class TableOrder implements Order {
    private int size = 0;
    private Customer customer;
    private MenuItem[] items;
    @Override
    public boolean add(MenuItem item) {
        MenuItem[] new_items = new MenuItem[size + 1];
        for (int i = 0; i < size; i++){
            new_items[i] = items[i];
        }
        new_items[size - 1] = item;
        items = new_items; size++;
        return true;
    }
    @Override
    public int costTotal() {
        int r = 0;
        for (MenuItem menuItem : items) {
            r += menuItem.getCost();
        }
        return r;
    }
    @Override
    public Customer getCustomer() {
        return customer;
    }
    @Override
    public MenuItem[] getItems() {
        return items;
    }
    @Override
    public int itemQuantity(String itemName) {
        int r = 0;
        for (MenuItem menuItem : items) {
            r += menuItem.getName() == itemName ? 1 : 0;
        }
        return r;
    }
    @Override
    public int itemQuantity(MenuItem item) {
        int r = 0;
        for (MenuItem menuItem : items) {
            r += menuItem == item ? 1 : 0;
        }
        return r;
    }
    @Override
    public String[] itemsNames() {
        String[] names = new String[size]; int i = 0;
        for (MenuItem menuItem : items) {
            names[i] = menuItem.getName(); i++;
        }
        return names;
    }
    @Override
    public int itemsQuantity() {
        return size;
    }
    @Override
    public boolean remove(String itemName) {
        MenuItem[] new_items = new MenuItem[size - 1];
        int k = 0;
        for (int i = 0; i < size; i++){
            if (items[i].getName() == itemName) k = 1;
            else new_items[i] = items[i + k];
        }
        items = new_items;
        return k == 1;
    }
    @Override
    public boolean remove(MenuItem item) {
        MenuItem[] new_items = new MenuItem[size - 1];
        int k = 0;
        for (int i = 0; i < size; i++){
            if (items[i] == item) k += 1;
            else new_items[i] = items[i + k];
        }
        items = new_items;
        return k == 1;
    }
    @Override
    public int removeAll(String itemName) {
        int n = itemQuantity(itemName);
        MenuItem[] new_items = new MenuItem[size - n];
        int k = 0;
        for (int i = 0; i < size; i++){
            if (i + k == size) break;
            if (items[i].getName() == itemName) k += 1;
            else new_items[i] = items[i + k];
        }
        items = new_items;
        return n;
    }
    @Override
    public int removeAll(MenuItem item) {
        int n = itemQuantity(item);
        MenuItem[] new_items = new MenuItem[size - n];
        int k = 0;
        for (int i = 0; i < size; i++){
            if (i + k == size) break;
            if (items[i] == item) k += 1;
            else new_items[i] = items[i + k];
        }
        items = new_items;
        return n;
    }
    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        MenuItem[] new_items = items;
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
