package objects;

public class Dish {
    private double cost;
    private String name, description;
    public void setCost(double cost) {
        this.cost = cost;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getCost() {
        return cost;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    @Override
    public String toString() {
        return "\n\t\tDish [cost=" + cost + ", name=" + name + ", description=" + description + "]";
    }
    
}
