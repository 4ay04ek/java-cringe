package objects;

public class Circle {
    private double radius;
    private Boolean filled;
    private String color;
    
    public Circle() {
        this.radius = 0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, Boolean filled, double radius) {
        this.color = color;
        this.filled = filled;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Boolean getFilled() {
        return filled;
    }

    public String getColor() {
        return color;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", filled=" + filled + ", color=" + color + "]";
    }   
}
