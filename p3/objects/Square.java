package objects;

public class Square extends Rectangle{
    public Square(){
        this.width = this.length = 0;
    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, Boolean filled){
        super(color, filled, side, side);
    }
    public void setSide(double side){
        this.width = this.length = side;
    }
    public double getSide(){
        return width;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
    }

    @Override
    public void setLength(double side) {
        this.length = side;
    }

    @Override
    public String toString() {
        return "Square [side=" + width + "]";
    }
}