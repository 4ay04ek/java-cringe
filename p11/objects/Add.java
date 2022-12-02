package objects;

public class Add extends Operation {
    public void operate(){
        R = T1 + T2;
    }

    public Add(Operation p1, Operation p2) {
        super(p1, p2);
    }

    public Add(Const p1, Operation p2) {
        super(p1, p2);
    }

    public Add(Operation p1, Const p2) {
        super(p1, p2);
    }

    public Add(Const p1, Const p2) {
        super(p1, p2);
    }

    public Add(Const p1, Variable p2) {
        super(p1, p2);
    }

    public Add(Variable p1, Const p2) {
        super(p1, p2);
    }

    public Add(Variable p1, Operation p2) {
        super(p1, p2);
    }

    public Add(Operation p1, Variable p2) {
        super(p1, p2);
    }

    public Add(Variable p1, Variable p2) {
        super(p1, p2);
    }
}
