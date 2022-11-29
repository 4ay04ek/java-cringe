package objects;

public class Complex {
    protected int real, image;
    protected Complex() {};
    protected Complex(int real, int image){
        this.real = real;
        this.image = image;
    }
    @Override
    public String toString() {
        return "Complex [real=" + real + ", image=" + image + "]";
    }
    
}
