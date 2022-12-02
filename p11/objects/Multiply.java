package objects;

public class Multiply extends Operation {
    public void operate(){
        R = T1 * T2;
    }

    public Multiply(Operation p1, Operation p2) {
        super(p1, p2);
    }

    public Multiply(Const p1, Operation p2) {
        super(p1, p2);
    }

    public Multiply(Operation p1, Const p2) {
        super(p1, p2);
    }

    public Multiply(Const p1, Const p2) {
        super(p1, p2);
    }

    public Multiply(Const p1, Variable p2) {
        super(p1, p2);
    }

    public Multiply(Variable p1, Const p2) {
        super(p1, p2);
    }

    public Multiply(Variable p1, Operation p2) {
        super(p1, p2);
    }

    public Multiply(Operation p1, Variable p2) {
        super(p1, p2);
    }

    public Multiply(Variable p1, Variable p2) {
        super(p1, p2);
    }
    
    
}
