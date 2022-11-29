package objects;

public abstract class Dish {
    protected String material;
    protected String type;
    protected double size;
    public double getSize() {
        return size;
    }
    public void setSize(double size) {
        this.size = size;
    }
    protected Dish(String material, String type, double size) {
        this.material = material;
        this.type = type;
        this.size = size;
    }
    @Override
    public String toString() {
        return "Dish [material=" + material + ", type=" + type + ", size=" + size + "]";
    }
}
