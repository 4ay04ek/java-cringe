package objects;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape(){
        this.color = null;
        this.filled = false;
    }
    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Boolean isFilled() {
        return filled;
    }
    public void setFilled(Boolean filled) {
        this.filled = filled; 
    }
    abstract public double getArea();
    abstract public double getPerimeter();

    @Override
    public String toString() {
        return "Shape [color=" + color + ", filled=" + filled + "]";
    }
}
