package objects;

public class Ball {
    public enum TYPE {
        TYPE_FOOTBALL,
        TYPE_BASKETBALL,
        TYPE_VOLLEYBALL,
        TYPE_CUSTOM
    }
    private TYPE t;
    private int diameter, weight;
    public Ball(){
        this.t = TYPE.TYPE_CUSTOM;
        this.diameter = 0;
        this.weight = 0;
    }
    public Ball(TYPE t){
        this.t = t;
        setTypeValues(this.t);
    }
    private void setTypeValues(TYPE t){
        switch (this.t){
            case TYPE_BASKETBALL:
                this.diameter = 75;
                this.weight = 600;
                break;
            case TYPE_FOOTBALL:
                this.diameter = 70;
                this.weight = 450;
                break;
            case TYPE_VOLLEYBALL:
                this.diameter = 66;
                this.weight = 270;
                break;
            default:
                this.diameter = 0;
                this.weight = 0;
        }
    }
    private TYPE calcType(){
        if (this.diameter == 75 && this.weight == 600) return TYPE.TYPE_BASKETBALL;
        if (this.diameter == 70 && this.weight == 450) return TYPE.TYPE_FOOTBALL;
        if (this.diameter == 66 && this.weight == 270) return TYPE.TYPE_VOLLEYBALL;
        return TYPE.TYPE_CUSTOM;
    }
    public void setType(TYPE t){
        this.t = t;
        setTypeValues(this.t);
    }
    public void setWeight(int w){
        this.weight = w;
        this.t = calcType();
    }
    public void setDiameter(int d){
        this.diameter = d;
        this.t = calcType();
    }
    public TYPE getType(){
        return this.t;
    }
    public int getDiameter(){
        return this.diameter;
    }
    public int getWeight(){
        return this.weight;
    }

    @Override
    public String toString(){
        return String.format("Ball { Type: %s, Diameter: %dsm, Weight: %dg }", this.t.toString(), this.diameter, this.weight);
    }
}
