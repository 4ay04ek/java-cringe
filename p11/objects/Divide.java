package objects;

public class Divide extends Operation {
    public void operate(){
        R = T1 / T2;
    }

    public Divide(Operation p1, Operation p2) {
        super(p1, p2);
    }

    public Divide(Const p1, Operation p2) {
        super(p1, p2);
    }

    public Divide(Operation p1, Const p2) {
        super(p1, p2);
    }

    public Divide(Const p1, Const p2) {
        super(p1, p2);
    }

    public Divide(Const p1, Variable p2) {
        super(p1, p2);
    }

    public Divide(Variable p1, Const p2) {
        super(p1, p2);
    }

    public Divide(Variable p1, Operation p2) {
        super(p1, p2);
    }

    public Divide(Operation p1, Variable p2) {
        super(p1, p2);
    }

    public Divide(Variable p1, Variable p2) {
        super(p1, p2);
    }

    
}
