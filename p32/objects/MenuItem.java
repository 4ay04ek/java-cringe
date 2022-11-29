package objects;

public class MenuItem {
    private int cost;
    private String name, description;
    public MenuItem(int cost, String name, String description){
        this.cost = cost;
        this.name = name;
        this.description = description;
    }
    public int getCost() {
        return cost;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
}
