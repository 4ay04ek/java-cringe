package objects;

import java.util.HashMap;

public class Order {
    private int size = 0;
    private HashMap<Dish, Integer> dishes;
    public void add(Dish dish) {
        if (dishes.containsKey(dish)) dishes.put(dish, dishes.get(dish) + 1);
        else dishes.put(dish, 1);
        size += 1;
    }
    public boolean remove(String dishName){
        for (var entry : dishes.entrySet()) {
            if (entry.getKey().getName() == dishName) {
                if (entry.getValue() > 1) dishes.put(entry.getKey(), entry.getValue() - 1);
                else dishes.remove(entry.getKey()); 
                return true;
            }
        }
        return false;
    }
    public int removeAll(String dishName) {
        for (var entry : dishes.entrySet()) {
            if (entry.getKey().getName() == dishName) {
                int count = entry.getValue();
                dishes.remove(entry.getKey()); 
                return count;
            }
        }
        return 0;
    }
    public int dishQuantity(){
        return size;
    }
    public int dishQuantity(String dishName){
        for (var entry : dishes.entrySet()) {
            if (entry.getKey().getName() == dishName) return entry.getValue();
        }
        return 0;
    }
    public HashMap<Dish, Integer> getDishes(){
        return dishes;
    }
    public double costTotal() {
        int r = 0;
        for (var entry : dishes.entrySet()) {
            r += entry.getKey().getCost() * entry.getValue();
        }
        return r;
    }
    public String[] dishesNames(){
        String[] names = new String[dishes.size()];
        int i = 0;
        for (var entry : dishes.entrySet()) {
            names[i] = entry.getKey().getName();
            i += 1;
        }
        return names;
    }
    public Dish[] sortedDishesByCost(){
        Dish[] dishs = new Dish[dishes.size()];
        int i = 0;
        for (var entry: dishes.entrySet()){
            dishs[i] = entry.getKey();
            i += 1;
        }
        return dishs;
    }
}
