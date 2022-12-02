package objects;

public class Subtract extends Operation {
    public void operate(){
        R = T1 - T2;
    }

    public Subtract(Operation p1, Operation p2) {
        super(p1, p2);
    }

    public Subtract(Const p1, Operation p2) {
        super(p1, p2);
    }

    public Subtract(Operation p1, Const p2) {
        super(p1, p2);
    }

    public Subtract(Const p1, Const p2) {
        super(p1, p2);
    }

    public Subtract(Const p1, Variable p2) {
        super(p1, p2);
    }

    public Subtract(Variable p1, Const p2) {
        super(p1, p2);
    }

    public Subtract(Variable p1, Operation p2) {
        super(p1, p2);
    }

    public Subtract(Operation p1, Variable p2) {
        super(p1, p2);
    }

    public Subtract(Variable p1, Variable p2) {
        super(p1, p2);
    }
    
}
