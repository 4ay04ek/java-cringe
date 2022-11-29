package objects;

public class Variable {
    String name;
    float T = 0;
    public Variable(String p){
        this.name = p;
    }
    public void setValue(float p){
        this.T = p;
    }
    public float getNum(){
        return T;
    }
}